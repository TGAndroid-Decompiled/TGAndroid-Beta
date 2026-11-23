package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hp implements DialogInterface.OnShowListener {
    public final int f48605a;
    public final View f48606b;

    public hp(int i7, View view) {
        this.f48605a = i7;
        this.f48606b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f48605a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f48606b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new qg((EditTextBoldCursor) this.f48606b, 1));
                return;
        }
    }
}
