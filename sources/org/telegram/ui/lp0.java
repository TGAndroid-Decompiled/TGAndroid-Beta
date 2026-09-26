package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lp0 extends LinearLayout {
    public final org.telegram.ui.Components.n90 f35395a;
    public final org.telegram.ui.Components.n90 f35396b;
    public final np0 f35397c;

    public lp0(np0 np0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f35397c = np0Var;
        setOrientation(1);
        tp0 tp0Var = np0Var.f35955p0;
        setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f19442y6;
        d6Var = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
        org.telegram.ui.Components.n90 a2 = w7.c6.a(context2, 14.0f, i11, false, d6Var);
        this.f35395a = a2;
        a2.setGravity(17);
        if (np0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
        org.telegram.ui.Components.n90 a10 = w7.c6.a(context3, 14.0f, i12, false, d6Var2);
        this.f35396b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new il0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        tp0 tp0Var = this.f35397c.f35955p0;
        setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
        this.f35395a.setTextColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19442y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = tp0Var.getThemedColor(i10);
        org.telegram.ui.Components.n90 n90Var = this.f35396b;
        n90Var.setTextColor(themedColor);
        n90Var.setLinkTextColor(tp0Var.getThemedColor(i10));
    }
}
