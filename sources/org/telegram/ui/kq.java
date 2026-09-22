package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kq implements DialogInterface.OnShowListener {
    public final int f35234a;
    public final View f35235b;

    public kq(int i10, View view) {
        this.f35234a = i10;
        this.f35235b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35234a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f35235b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new jh(1, (EditTextBoldCursor) this.f35235b));
                return;
        }
    }
}
