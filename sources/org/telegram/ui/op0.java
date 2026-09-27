package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class op0 extends LinearLayout {
    public final org.telegram.ui.Components.p90 f36236a;
    public final org.telegram.ui.Components.p90 f36237b;
    public final qp0 f36238c;

    public op0(qp0 qp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f36238c = qp0Var;
        setOrientation(1);
        wp0 wp0Var = qp0Var.f36807p0;
        setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.kj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.i6.f19442y6;
        e6Var = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
        org.telegram.ui.Components.p90 a2 = w7.c6.a(context2, 14.0f, i11, false, e6Var);
        this.f36236a = a2;
        a2.setGravity(17);
        if (qp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        e6Var2 = ((org.telegram.ui.ActionBar.o2) wp0Var).resourceProvider;
        org.telegram.ui.Components.p90 a10 = w7.c6.a(context3, 14.0f, i12, false, e6Var2);
        this.f36237b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new ml0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        wp0 wp0Var = this.f36238c.f36807p0;
        setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        this.f36236a.setTextColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19442y6));
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        int themedColor = wp0Var.getThemedColor(i10);
        org.telegram.ui.Components.p90 p90Var = this.f36237b;
        p90Var.setTextColor(themedColor);
        p90Var.setLinkTextColor(wp0Var.getThemedColor(i10));
    }
}
