package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iq implements DialogInterface.OnShowListener {
    public final int f38802a;
    public final View f38803b;

    public iq(int i10, View view) {
        this.f38802a = i10;
        this.f38803b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38802a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f38803b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(1, (EditTextBoldCursor) this.f38803b));
                return;
        }
    }
}
