package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dk extends org.telegram.ui.Components.dd {
    public final boolean f37555e;
    public final qn f37556f;

    public dk(qn qnVar, Context context, boolean z10) {
        super(context);
        this.f37556f = qnVar;
        this.f37555e = z10;
    }

    @Override
    public final void d() {
        int i9;
        if (this.f37555e) {
            i9 = AndroidUtilities.dp(4.0f);
        } else {
            i9 = 0;
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23324ve;
        qn qnVar = this.f37556f;
        setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(19.0f), 436207615 & qnVar.getThemedColor(i10), i9, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(qnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(qnVar.getThemedColor(i10));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i9;
        super.setEditButton(z10);
        if (this.f37555e) {
            TextView textView = getTextView();
            if (z10) {
                i9 = AndroidUtilities.dp(116.0f);
            } else {
                i9 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i9);
        }
    }
}
