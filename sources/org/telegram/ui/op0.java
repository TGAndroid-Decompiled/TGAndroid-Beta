package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class op0 extends LinearLayout {
    public final org.telegram.ui.Components.q90 f39271a;
    public final org.telegram.ui.Components.q90 f39272b;
    public final qp0 f39273c;

    public op0(qp0 qp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f39273c = qp0Var;
        setOrientation(1);
        wp0 wp0Var = qp0Var.f39849p0;
        setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.kj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.z5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.i6.f21214y6;
        d6Var = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context2, 14.0f, i11, false, d6Var);
        this.f39271a = a2;
        a2.setGravity(17);
        if (qp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context3, 14.0f, i12, false, d6Var2);
        this.f39272b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new nl0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        wp0 wp0Var = this.f39273c.f39849p0;
        setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        this.f39271a.setTextColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21214y6));
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        int themedColor = wp0Var.getThemedColor(i10);
        org.telegram.ui.Components.q90 q90Var = this.f39272b;
        q90Var.setTextColor(themedColor);
        q90Var.setLinkTextColor(wp0Var.getThemedColor(i10));
    }
}
