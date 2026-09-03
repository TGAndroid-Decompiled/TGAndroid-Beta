package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fp0 extends LinearLayout {
    public final org.telegram.ui.Components.f90 f34203a;
    public final org.telegram.ui.Components.f90 f34204b;
    public final hp0 f34205c;

    public fp0(hp0 hp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f34205c = hp0Var;
        setOrientation(1);
        np0 np0Var = hp0Var.m0;
        setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(p9Var, k7.b6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f20256y6;
        f6Var = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        org.telegram.ui.Components.f90 a2 = k7.f6.a(context2, 14.0f, i11, false, f6Var);
        this.f34203a = a2;
        a2.setGravity(17);
        if (hp0Var.f34731j0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, k7.b6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.f19941gc;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
        org.telegram.ui.Components.f90 a10 = k7.f6.a(context3, 14.0f, i12, false, f6Var2);
        this.f34204b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new gl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, k7.b6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        np0 np0Var = this.f34205c.m0;
        setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        this.f34203a.setTextColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20256y6));
        int i10 = org.telegram.ui.ActionBar.j6.f19941gc;
        int themedColor = np0Var.getThemedColor(i10);
        org.telegram.ui.Components.f90 f90Var = this.f34204b;
        f90Var.setTextColor(themedColor);
        f90Var.setLinkTextColor(np0Var.getThemedColor(i10));
    }
}
