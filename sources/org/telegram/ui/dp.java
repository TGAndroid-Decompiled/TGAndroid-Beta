package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dp implements DialogInterface.OnShowListener {
    public final int f44790a;
    public final View f44791b;

    public dp(int i3, View view) {
        this.f44790a = i3;
        this.f44791b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44790a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f44791b;
                int childCount = datePicker.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = datePicker.getChildAt(i3);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new og((EditTextBoldCursor) this.f44791b, 1));
                return;
        }
    }
}
