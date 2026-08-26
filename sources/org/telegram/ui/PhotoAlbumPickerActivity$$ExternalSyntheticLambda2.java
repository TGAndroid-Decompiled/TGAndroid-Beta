package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.AlertsCreator;

public final class PhotoAlbumPickerActivity$$ExternalSyntheticLambda2 implements AlertsCreator.ScheduleDatePickerDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final PhotoAlbumPickerActivity f$0;

    public PhotoAlbumPickerActivity$$ExternalSyntheticLambda2(PhotoAlbumPickerActivity photoAlbumPickerActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = photoAlbumPickerActivity;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                PhotoAlbumPickerActivity photoAlbumPickerActivity = this.f$0;
                photoAlbumPickerActivity.sendSelectedPhotos(photoAlbumPickerActivity.selectedPhotosOrder, photoAlbumPickerActivity.selectedPhotos);
                photoAlbumPickerActivity.finishFragment();
                break;
            default:
                PhotoAlbumPickerActivity photoAlbumPickerActivity2 = this.f$0;
                photoAlbumPickerActivity2.sendSelectedPhotos(photoAlbumPickerActivity2.selectedPhotosOrder, photoAlbumPickerActivity2.selectedPhotos);
                photoAlbumPickerActivity2.finishFragment();
                break;
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        PhotoAlbumPickerActivity photoAlbumPickerActivity = this.f$0;
        photoAlbumPickerActivity.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = photoAlbumPickerActivity.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            photoAlbumPickerActivity.sendPopupWindow.dismiss(true);
        }
    }
}
