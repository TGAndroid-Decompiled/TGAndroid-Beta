package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jk extends org.telegram.ui.Components.nd {
    public final boolean e;
    public final sn f38223f;

    public jk(sn snVar, Context context, boolean z10) {
        super(context);
        this.f38223f = snVar;
        this.e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = i10;
        int i12 = org.telegram.ui.ActionBar.h6.f21327ve;
        sn snVar = this.f38223f;
        setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), 436207615 & snVar.getThemedColor(i12), i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(snVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(snVar.getThemedColor(i12));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.e) {
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
