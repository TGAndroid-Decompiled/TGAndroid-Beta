package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fq implements DialogInterface.OnShowListener {
    public final int f33739a;
    public final View f33740b;

    public fq(int i10, View view) {
        this.f33739a = i10;
        this.f33740b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33739a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f33740b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh(1, (EditTextBoldCursor) this.f33740b));
                return;
        }
    }
}
