package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mk extends org.telegram.ui.Components.pd {
    public final boolean f38662e;
    public final yn f38663f;

    public mk(yn ynVar, Context context, boolean z10) {
        super(context);
        this.f38663f = ynVar;
        this.f38662e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f38662e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = org.telegram.ui.ActionBar.i6.f21160ve;
        yn ynVar = this.f38663f;
        setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(19.0f), 436207615 & ynVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(ynVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(ynVar.getThemedColor(i11));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.f38662e) {
            TextView textView = getTextView();
            if (z10) {
                i10 = AndroidUtilities.dp(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
