package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lp0 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.aa0 f41229a;
    public final org.telegram.ui.Components.aa0 f41230b;
    public final np0 f41231c;

    public lp0(np0 np0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.f41231c = np0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        tp0 tp0Var = np0Var.f41856p0;
        org.telegram.ui.ActionBar.f7.i(i11, this, tp0Var.getResourceProvider());
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
        y9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(y9Var, org.telegram.ui.Components.kb1.x(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.y6.f23749y6;
        u6Var = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
        org.telegram.ui.Components.aa0 K = org.telegram.ui.Components.kb1.K(context2, 14.0f, i12, false, u6Var);
        this.f41229a = K;
        K.setGravity(17);
        if (np0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        K.setText(LocaleController.getString(i10));
        addView(K, org.telegram.ui.Components.kb1.x(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.y6.gc;
        u6Var2 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
        org.telegram.ui.Components.aa0 K2 = org.telegram.ui.Components.kb1.K(context3, 14.0f, i13, false, u6Var2);
        this.f41230b = K2;
        K2.setGravity(17);
        K2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new nj0(this, 13)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(K2, org.telegram.ui.Components.kb1.x(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        tp0 tp0Var = this.f41231c.f41856p0;
        setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
        this.f41229a.setTextColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23749y6));
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        int themedColor = tp0Var.getThemedColor(i10);
        org.telegram.ui.Components.aa0 aa0Var = this.f41230b;
        aa0Var.setTextColor(themedColor);
        aa0Var.setLinkTextColor(tp0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
