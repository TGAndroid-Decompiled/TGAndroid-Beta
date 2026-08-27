package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

public final class fk extends org.telegram.ui.Components.ad {

    public final boolean f38149e;

    public final rn f38150f;

    public fk(rn rnVar, Context context, boolean z10) {
        super(context);
        this.f38150f = rnVar;
        this.f38149e = z10;
    }

    @Override
    public final void d() {
        int iDp = this.f38149e ? AndroidUtilities.dp(4.0f) : 0;
        int i10 = org.telegram.ui.ActionBar.g6.f23381ve;
        rn rnVar = this.f38150f;
        setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), 436207615 & rnVar.getThemedColor(i10), iDp, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(rnVar.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(rnVar.getThemedColor(i10));
    }

    @Override
    public final void setEditButton(boolean z10) {
        super.setEditButton(z10);
        if (this.f38149e) {
            getTextView().setMaxWidth(z10 ? AndroidUtilities.dp(116.0f) : Integer.MAX_VALUE);
        }
    }
}
