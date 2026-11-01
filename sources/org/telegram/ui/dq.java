package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dq implements DialogInterface.OnShowListener {
    public final int f36652a;
    public final View f36653b;

    public dq(int i10, View view) {
        this.f36652a = i10;
        this.f36653b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36652a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f36653b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new yg((EditTextBoldCursor) this.f36653b, 1));
                return;
        }
    }
}
