package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fp implements DialogInterface.OnShowListener {
    public final int f45680a;
    public final View f45681b;

    public fp(int i7, View view) {
        this.f45680a = i7;
        this.f45681b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f45680a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f45681b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new sg((EditTextBoldCursor) this.f45681b, 1));
                return;
        }
    }
}
