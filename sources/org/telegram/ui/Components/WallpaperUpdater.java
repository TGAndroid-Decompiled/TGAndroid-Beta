package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.PhotoAlbumPickerActivity;

public class WallpaperUpdater {
    private String currentPicturePath;
    private File currentWallpaperPath;
    private WallpaperUpdaterDelegate delegate;
    private Activity parentActivity;
    private BaseFragment parentFragment;

    public interface WallpaperUpdaterDelegate {
        void didSelectWallpaper(File file, Bitmap bitmap, boolean z);

        void needOpenColorPicker();
    }

    public void cleanup() {
    }

    public WallpaperUpdater(Activity activity, BaseFragment baseFragment, WallpaperUpdaterDelegate wallpaperUpdaterDelegate) {
        this.parentActivity = activity;
        this.parentFragment = baseFragment;
        this.delegate = wallpaperUpdaterDelegate;
    }

    public void showAlert(final boolean z) {
        CharSequence[] charSequenceArr;
        int[] iArr;
        BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
        builder.setTitle(LocaleController.getString("ChoosePhoto", R.string.ChoosePhoto), true);
        if (z) {
            charSequenceArr = new CharSequence[]{LocaleController.getString("ChooseTakePhoto", R.string.ChooseTakePhoto), LocaleController.getString("SelectFromGallery", R.string.SelectFromGallery), LocaleController.getString("SelectColor", R.string.SelectColor), LocaleController.getString("Default", R.string.Default)};
            iArr = null;
        } else {
            charSequenceArr = new CharSequence[]{LocaleController.getString("ChooseTakePhoto", R.string.ChooseTakePhoto), LocaleController.getString("SelectFromGallery", R.string.SelectFromGallery)};
            iArr = new int[]{R.drawable.menu_camera, R.drawable.profile_photos};
        }
        builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                WallpaperUpdater.this.lambda$showAlert$0(z, dialogInterface, i);
            }
        });
        builder.show();
    }

    public void lambda$showAlert$0(boolean z, DialogInterface dialogInterface, int i) {
        try {
            if (i == 0) {
                try {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    File generatePicturePath = AndroidUtilities.generatePicturePath();
                    if (generatePicturePath != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.putExtra("output", FileProvider.getUriForFile(this.parentActivity, "org.telegram.messenger.web.provider", generatePicturePath));
                            intent.addFlags(2);
                            intent.addFlags(1);
                        } else {
                            intent.putExtra("output", Uri.fromFile(generatePicturePath));
                        }
                        this.currentPicturePath = generatePicturePath.getAbsolutePath();
                    }
                    this.parentActivity.startActivityForResult(intent, 10);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i == 1) {
                openGallery();
            } else if (!z) {
            } else {
                if (i == 2) {
                    this.delegate.needOpenColorPicker();
                } else if (i == 3) {
                    this.delegate.didSelectWallpaper(null, null, false);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void openGallery() {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.parentActivity.startActivityForResult(intent, 11);
        } else if (Build.VERSION.SDK_INT < 23 || baseFragment.getParentActivity() == null || this.parentFragment.getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(PhotoAlbumPickerActivity.SELECT_TYPE_WALLPAPER, false, false, null);
            photoAlbumPickerActivity.setAllowSearchImages(false);
            photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
                @Override
                public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i) {
                    WallpaperUpdater.this.didSelectPhotos(arrayList);
                }

                @Override
                public void startPhotoSelectActivity() {
                    try {
                        Intent intent2 = new Intent("android.intent.action.PICK");
                        intent2.setType("image/*");
                        WallpaperUpdater.this.parentActivity.startActivityForResult(intent2, 11);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            this.parentFragment.presentFragment(photoAlbumPickerActivity);
        } else {
            this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
        }
    }

    public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList) {
        try {
            if (!arrayList.isEmpty()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = arrayList.get(0);
                if (sendingMediaInfo.path != null) {
                    File directory = FileLoader.getDirectory(4);
                    this.currentWallpaperPath = new File(directory, Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.currentWallpaperPath));
                    this.delegate.didSelectWallpaper(this.currentWallpaperPath, loadBitmap, true);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public String getCurrentPicturePath() {
        return this.currentPicturePath;
    }

    public void setCurrentPicturePath(String str) {
        this.currentPicturePath = str;
    }

    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.WallpaperUpdater.onActivityResult(int, int, android.content.Intent):void");
    }
}
