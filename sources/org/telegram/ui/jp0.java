package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jp0 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.z90 f40711a;
    public final org.telegram.ui.Components.z90 f40712b;
    public final lp0 f40713c;

    public jp0(lp0 lp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.f40713c = lp0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
        rp0 rp0Var = lp0Var.f41330p0;
        org.telegram.ui.ActionBar.f7.i(i11, this, rp0Var.getResourceProvider());
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
        y9Var.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(y9Var, org.telegram.ui.Components.gb1.x(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.y6.f23746y6;
        u6Var = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        org.telegram.ui.Components.z90 K = org.telegram.ui.Components.gb1.K(context2, 14.0f, i12, false, u6Var);
        this.f40711a = K;
        K.setGravity(17);
        if (lp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        K.setText(LocaleController.getString(i10));
        addView(K, org.telegram.ui.Components.gb1.x(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.y6.gc;
        u6Var2 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        org.telegram.ui.Components.z90 K2 = org.telegram.ui.Components.gb1.K(context3, 14.0f, i13, false, u6Var2);
        this.f40712b = K2;
        K2.setGravity(17);
        K2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new lj0(this, 13)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(K2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        rp0 rp0Var = this.f40713c.f41330p0;
        setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
        this.f40711a.setTextColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23746y6));
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        int themedColor = rp0Var.getThemedColor(i10);
        org.telegram.ui.Components.z90 z90Var = this.f40712b;
        z90Var.setTextColor(themedColor);
        z90Var.setLinkTextColor(rp0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
