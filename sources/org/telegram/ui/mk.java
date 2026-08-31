package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mk extends org.telegram.ui.Components.ed {
    public final boolean f39167e;
    public final xn f39168f;

    public mk(xn xnVar, Context context, boolean z4) {
        super(context);
        this.f39168f = xnVar;
        this.f39167e = z4;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f39167e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21987ve;
        xn xnVar = this.f39168f;
        setBackground(org.telegram.ui.ActionBar.k6.W(AndroidUtilities.dp(19.0f), 436207615 & xnVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(xnVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(xnVar.getThemedColor(i11));
    }

    @Override
    public final void setEditButton(boolean z4) {
        int i10;
        super.setEditButton(z4);
        if (this.f39167e) {
            TextView textView = getTextView();
            if (z4) {
                i10 = AndroidUtilities.dp(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
