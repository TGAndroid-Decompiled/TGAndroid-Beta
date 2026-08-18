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
import org.telegram.messenger.ApplicationLoader;
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
    private File picturePath = null;

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
        builder.setTitle(LocaleController.getString(R.string.ChoosePhoto), true);
        if (z) {
            charSequenceArr = new CharSequence[]{LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
            iArr = null;
        } else {
            charSequenceArr = new CharSequence[]{LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery)};
            iArr = new int[]{R.drawable.msg_camera, R.drawable.msg_photos};
        }
        builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.lambda$showAlert$0(z, dialogInterface, i);
            }
        });
        builder.show();
    }

    public void lambda$showAlert$0(boolean z, DialogInterface dialogInterface, int i) {
        try {
            if (i != 0) {
                if (i == 1) {
                    openGallery();
                    return;
                }
                if (z) {
                    if (i == 2) {
                        this.delegate.needOpenColorPicker();
                        return;
                    } else {
                        if (i == 3) {
                            this.delegate.didSelectWallpaper(null, null, false);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
                if (fileGeneratePicturePath != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.putExtra("output", FileProvider.getUriForFile(this.parentActivity, ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                    }
                    this.currentPicturePath = fileGeneratePicturePath.getAbsolutePath();
                }
                this.parentActivity.startActivityForResult(intent, 10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void openGallery() {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            Activity parentActivity = baseFragment.getParentActivity();
            if (parentActivity != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (i >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(PhotoAlbumPickerActivity.SELECT_TYPE_WALLPAPER, false, false, null);
            photoAlbumPickerActivity.setAllowSearchImages(false);
            photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
                @Override
                public void didSelectPhotos(ArrayList arrayList, boolean z, int i2) {
                    WallpaperUpdater.this.didSelectPhotos(arrayList);
                }

                @Override
                public void startPhotoSelectActivity() {
                    try {
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("image/*");
                        WallpaperUpdater.this.parentActivity.startActivityForResult(intent, 11);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            this.parentFragment.presentFragment(photoAlbumPickerActivity);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        this.parentActivity.startActivityForResult(intent, 11);
    }

    public void didSelectPhotos(ArrayList arrayList) {
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                this.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.currentWallpaperPath));
                this.delegate.didSelectWallpaper(this.currentWallpaperPath, bitmapLoadBitmap, true);
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

    public void onActivityResult(int i, int i2, Intent intent) {
        FileOutputStream fileOutputStream;
        if (i2 == -1) {
            FileOutputStream fileOutputStream2 = null;
            if (i == 10) {
                AndroidUtilities.addMediaToGallery(this.currentPicturePath);
                try {
                    this.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(this.currentPicturePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    fileOutputStream = new FileOutputStream(this.currentWallpaperPath);
                    try {
                        bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        this.delegate.didSelectWallpaper(this.currentWallpaperPath, bitmapLoadBitmap, false);
                    } catch (Exception e) {
                        e = e;
                        try {
                            FileLog.e(e);
                            if (fileOutputStream != null) {
                            }
                            this.currentPicturePath = null;
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
                try {
                    fileOutputStream.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                this.currentPicturePath = null;
                return;
            }
            if (i != 11 || intent == null || intent.getData() == null) {
                return;
            }
            try {
                this.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize2 = AndroidUtilities.getRealScreenSize();
                Bitmap bitmapLoadBitmap2 = ImageLoader.loadBitmap(null, intent.getData(), (float) realScreenSize2.x, (float) realScreenSize2.y, true);
                bitmapLoadBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.currentWallpaperPath));
                this.delegate.didSelectWallpaper(this.currentWallpaperPath, bitmapLoadBitmap2, false);
            } catch (Exception e5) {
                FileLog.e(e5);
            }
        }
    }
}
