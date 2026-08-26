package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoAlbumPickerActivity;
import org.telegram.ui.WallpapersListActivity;

public final class WallpaperUpdater {
    public String currentPicturePath;
    public File currentWallpaperPath;
    public final WallpaperUpdaterDelegate delegate;
    public final Activity parentActivity;
    public final WallpapersListActivity parentFragment;

    public interface WallpaperUpdaterDelegate {
        void didSelectWallpaper(File file, Bitmap bitmap, boolean z);

        void needOpenColorPicker();
    }

    public WallpaperUpdater(Activity activity, WallpapersListActivity wallpapersListActivity, WallpaperUpdaterDelegate wallpaperUpdaterDelegate) {
        this.parentActivity = activity;
        this.parentFragment = wallpapersListActivity;
        this.delegate = wallpaperUpdaterDelegate;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FileOutputStream fileOutputStream;
        if (i2 == -1) {
            WallpaperUpdaterDelegate wallpaperUpdaterDelegate = this.delegate;
            FileOutputStream fileOutputStream2 = null;
            if (i != 10) {
                if (i != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(null, intent.getData(), (float) realScreenSize.x, (float) realScreenSize.y, true);
                    bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(this.currentWallpaperPath));
                    wallpaperUpdaterDelegate.didSelectWallpaper(this.currentWallpaperPath, bitmapLoadBitmap, false);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            AndroidUtilities.addMediaToGallery(this.currentPicturePath);
            try {
                try {
                    this.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize2 = AndroidUtilities.getRealScreenSize();
                    Bitmap bitmapLoadBitmap2 = ImageLoader.loadBitmap(this.currentPicturePath, null, (float) realScreenSize2.x, (float) realScreenSize2.y, true);
                    fileOutputStream = new FileOutputStream(this.currentWallpaperPath);
                    try {
                        bitmapLoadBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        wallpaperUpdaterDelegate.didSelectWallpaper(this.currentWallpaperPath, bitmapLoadBitmap2, false);
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            FileLog.e(e);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.currentPicturePath = null;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e3) {
                                    FileLog.e(e3);
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
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            this.currentPicturePath = null;
        }
    }

    public final void openGallery() {
        WallpapersListActivity wallpapersListActivity = this.parentFragment;
        if (wallpapersListActivity == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.parentActivity.startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = wallpapersListActivity.getParentActivity();
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
        PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(2, false, false, null);
        photoAlbumPickerActivity.allowSearchImages = false;
        photoAlbumPickerActivity.delegate = new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
            @Override
            public final void didSelectPhotos(ArrayList arrayList) {
                WallpaperUpdater wallpaperUpdater = WallpaperUpdater.this;
                wallpaperUpdater.getClass();
                try {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
                    if (sendingMediaInfo.path != null) {
                        wallpaperUpdater.currentWallpaperPath = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                        Point realScreenSize = AndroidUtilities.getRealScreenSize();
                        Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                        bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(wallpaperUpdater.currentWallpaperPath));
                        wallpaperUpdater.delegate.didSelectWallpaper(wallpaperUpdater.currentWallpaperPath, bitmapLoadBitmap, true);
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }

            @Override
            public final void startPhotoSelectActivity() {
                try {
                    Intent intent2 = new Intent("android.intent.action.PICK");
                    intent2.setType("image/*");
                    WallpaperUpdater.this.parentActivity.startActivityForResult(intent2, 11);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        };
        wallpapersListActivity.presentFragment(photoAlbumPickerActivity);
    }
}
