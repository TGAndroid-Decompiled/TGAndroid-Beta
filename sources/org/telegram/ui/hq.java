package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hq implements DialogInterface.OnShowListener {
    public final int f37163a;
    public final View f37164b;

    public hq(int i10, View view) {
        this.f37163a = i10;
        this.f37164b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37163a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f37164b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new hh(1, (EditTextBoldCursor) this.f37164b));
                return;
        }
    }
}
