package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.AlertsCreator;

public final class PhotoAlbumPickerActivity$$ExternalSyntheticLambda0 implements AlertsCreator.ScheduleDatePickerDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final PhotoAlbumPickerActivity f$0;

    public PhotoAlbumPickerActivity$$ExternalSyntheticLambda0(PhotoAlbumPickerActivity photoAlbumPickerActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = photoAlbumPickerActivity;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$2(z, i, i2);
                break;
            default:
                this.f$0.lambda$createView$5(z, i, i2);
                break;
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$createView$4(keyEvent);
    }
}
