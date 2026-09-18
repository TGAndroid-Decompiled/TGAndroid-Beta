package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kq implements DialogInterface.OnShowListener {
    public final int f35356a;
    public final View f35357b;

    public kq(int i10, View view) {
        this.f35356a = i10;
        this.f35357b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35356a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f35357b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh(1, (EditTextBoldCursor) this.f35357b));
                return;
        }
    }
}
