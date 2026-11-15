package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gp implements DialogInterface.OnShowListener {
    public final int f47490a;
    public final View f47491b;

    public gp(int i7, View view) {
        this.f47490a = i7;
        this.f47491b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f47490a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f47491b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new og((EditTextBoldCursor) this.f47491b, 1));
                return;
        }
    }
}
