package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lq implements DialogInterface.OnShowListener {
    public final int f39830a;
    public final View f39831b;

    public lq(int i10, View view) {
        this.f39830a = i10;
        this.f39831b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39830a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f39831b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new oh(1, (EditTextBoldCursor) this.f39831b));
                return;
        }
    }
}
