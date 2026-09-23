package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gq implements DialogInterface.OnShowListener {
    public final int f33634a;
    public final View f33635b;

    public gq(int i10, View view) {
        this.f33634a = i10;
        this.f33635b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33634a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f33635b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new hh(1, (EditTextBoldCursor) this.f33635b));
                return;
        }
    }
}
