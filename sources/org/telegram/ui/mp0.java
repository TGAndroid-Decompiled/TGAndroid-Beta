package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mp0 extends LinearLayout {
    public final org.telegram.ui.Components.d90 f35370a;
    public final org.telegram.ui.Components.d90 f35371b;
    public final op0 f35372c;

    public mp0(op0 op0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f35372c = op0Var;
        setOrientation(1);
        up0 up0Var = op0Var.f35938p0;
        setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.yi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f19170y6;
        d6Var = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
        org.telegram.ui.Components.d90 a2 = w7.b6.a(context2, 14.0f, i11, false, d6Var);
        this.f35370a = a2;
        a2.setGravity(17);
        if (op0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
        org.telegram.ui.Components.d90 a10 = w7.b6.a(context3, 14.0f, i12, false, d6Var2);
        this.f35371b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new jl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        up0 up0Var = this.f35372c.f35938p0;
        setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        this.f35370a.setTextColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19170y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = up0Var.getThemedColor(i10);
        org.telegram.ui.Components.d90 d90Var = this.f35371b;
        d90Var.setTextColor(themedColor);
        d90Var.setLinkTextColor(up0Var.getThemedColor(i10));
    }
}
