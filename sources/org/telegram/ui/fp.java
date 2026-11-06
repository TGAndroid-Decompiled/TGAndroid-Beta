package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fp implements DialogInterface.OnShowListener {
    public final int f45685a;
    public final View f45686b;

    public fp(int i7, View view) {
        this.f45685a = i7;
        this.f45686b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f45685a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f45686b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new sg((EditTextBoldCursor) this.f45686b, 1));
                return;
        }
    }
}
