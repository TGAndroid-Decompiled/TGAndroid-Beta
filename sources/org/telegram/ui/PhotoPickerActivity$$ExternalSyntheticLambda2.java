package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.RecyclerListView;

public final class PhotoPickerActivity$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final PhotoPickerActivity f$0;

    public PhotoPickerActivity$$ExternalSyntheticLambda2(PhotoPickerActivity photoPickerActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = photoPickerActivity;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$createView$4(z, i, i2);
                break;
            default:
                this.f$0.lambda$createView$7(z, i, i2);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$0(alertDialog, i);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$createView$6(keyEvent);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$2(view, i);
    }
}
