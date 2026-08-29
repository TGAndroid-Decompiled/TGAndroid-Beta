package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gk extends org.telegram.ui.Components.hd {
    public final boolean f38604e;
    public final tn f38605f;

    public gk(tn tnVar, Context context, boolean z10) {
        super(context);
        this.f38605f = tnVar;
        this.f38604e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f38604e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23391ve;
        tn tnVar = this.f38605f;
        setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), 436207615 & tnVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(tnVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(tnVar.getThemedColor(i11));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.f38604e) {
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
