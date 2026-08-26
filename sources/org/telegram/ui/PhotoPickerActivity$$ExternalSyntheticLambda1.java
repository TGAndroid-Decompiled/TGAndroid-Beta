package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.RecyclerViewItemRangeSelector;

public final class PhotoPickerActivity$$ExternalSyntheticLambda1 implements AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener, ActionBarPopupWindow.OnDispatchKeyEventListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PhotoPickerActivity f$0;

    public PhotoPickerActivity$$ExternalSyntheticLambda1(PhotoPickerActivity photoPickerActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = photoPickerActivity;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.sendSelectedPhotos(i, z);
                break;
            default:
                this.f$0.sendSelectedPhotos(i, z);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        PhotoPickerActivity photoPickerActivity = this.f$0;
        PhotoPickerActivity.PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate = photoPickerActivity.searchDelegate;
        if (photoPickerActivitySearchDelegate != null) {
            photoPickerActivitySearchDelegate.shouldClearRecentSearch();
        } else {
            photoPickerActivity.clearRecentSearch();
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        PhotoPickerActivity photoPickerActivity = this.f$0;
        photoPickerActivity.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = photoPickerActivity.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            photoPickerActivity.sendPopupWindow.dismiss(true);
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        PhotoPickerActivity photoPickerActivity = this.f$0;
        if (photoPickerActivity.listSort) {
            photoPickerActivity.onListItemClick(view, photoPickerActivity.selectedAlbum.photos.get(i));
            return true;
        }
        if (!(view instanceof PhotoAttachPhotoCell)) {
            return false;
        }
        PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
        RecyclerViewItemRangeSelector recyclerViewItemRangeSelector = photoPickerActivity.itemRangeSelector;
        boolean zIsChecked = true ^ photoAttachPhotoCell.isChecked();
        photoPickerActivity.shouldSelect = zIsChecked;
        recyclerViewItemRangeSelector.setIsActive(photoAttachPhotoCell, i, zIsChecked);
        return false;
    }
}
