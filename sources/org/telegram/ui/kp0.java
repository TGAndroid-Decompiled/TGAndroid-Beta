package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kp0 extends LinearLayout {
    public final org.telegram.ui.Components.q90 f35208a;
    public final org.telegram.ui.Components.q90 f35209b;
    public final mp0 f35210c;

    public kp0(mp0 mp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f35210c = mp0Var;
        setOrientation(1);
        sp0 sp0Var = mp0Var.f35751p0;
        setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.lj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f19459y6;
        d6Var = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
        org.telegram.ui.Components.q90 a2 = w7.c6.a(context2, 14.0f, i11, false, d6Var);
        this.f35208a = a2;
        a2.setGravity(17);
        if (mp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
        org.telegram.ui.Components.q90 a10 = w7.c6.a(context3, 14.0f, i12, false, d6Var2);
        this.f35209b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new il0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        sp0 sp0Var = this.f35210c.f35751p0;
        setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
        this.f35208a.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19459y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = sp0Var.getThemedColor(i10);
        org.telegram.ui.Components.q90 q90Var = this.f35209b;
        q90Var.setTextColor(themedColor);
        q90Var.setLinkTextColor(sp0Var.getThemedColor(i10));
    }
}
