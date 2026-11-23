package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hp implements DialogInterface.OnShowListener {
    public final int f48472a;
    public final View f48473b;

    public hp(int i7, View view) {
        this.f48472a = i7;
        this.f48473b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48472a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f48473b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new qg((EditTextBoldCursor) this.f48473b, 1));
                return;
        }
    }
}
