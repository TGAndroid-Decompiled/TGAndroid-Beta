package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qk extends org.telegram.ui.Components.rd {
    public final boolean f41136e;
    public final zn f41137f;

    public qk(zn znVar, Context context, boolean z10) {
        super(context);
        this.f41137f = znVar;
        this.f41136e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f41136e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = i10;
        int i12 = org.telegram.ui.ActionBar.i6.f21135ve;
        zn znVar = this.f41137f;
        setBackground(org.telegram.ui.ActionBar.i6.X(AndroidUtilities.dp(19.0f), 436207615 & znVar.getThemedColor(i12), i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(znVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(znVar.getThemedColor(i12));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.f41136e) {
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
