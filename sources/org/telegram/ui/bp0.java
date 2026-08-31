package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bp0 extends LinearLayout {
    public final org.telegram.ui.Components.g90 f35574a;
    public final org.telegram.ui.Components.g90 f35575b;
    public final dp0 f35576c;

    public bp0(dp0 dp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f35576c = dp0Var;
        setOrientation(1);
        ip0 ip0Var = dp0Var.f36282g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(p9Var, k7.c6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.k6.f22036y6;
        g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        org.telegram.ui.Components.g90 a2 = k7.g6.a(context2, 14.0f, i11, false, g6Var);
        this.f35574a = a2;
        a2.setGravity(17);
        if (dp0Var.f36277d0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, k7.c6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.k6.f21720gc;
        g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        org.telegram.ui.Components.g90 a10 = k7.g6.a(context3, 14.0f, i12, false, g6Var2);
        this.f35575b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new gl0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, k7.c6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        ip0 ip0Var = this.f35576c.f36282g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        this.f35574a.setTextColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f22036y6));
        int i10 = org.telegram.ui.ActionBar.k6.f21720gc;
        int themedColor = ip0Var.getThemedColor(i10);
        org.telegram.ui.Components.g90 g90Var = this.f35575b;
        g90Var.setTextColor(themedColor);
        g90Var.setLinkTextColor(ip0Var.getThemedColor(i10));
    }
}
