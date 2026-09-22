package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iq implements DialogInterface.OnShowListener {
    public final int f34693a;
    public final View f34694b;

    public iq(int i10, View view) {
        this.f34693a = i10;
        this.f34694b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f34693a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f34694b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new ph(1, (EditTextBoldCursor) this.f34694b));
                return;
        }
    }
}
