package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bp0 extends LinearLayout {
    public final org.telegram.ui.Components.x90 f35722a;
    public final org.telegram.ui.Components.x90 f35723b;
    public final dp0 f35724c;

    public bp0(dp0 dp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f35724c = dp0Var;
        setOrientation(1);
        jp0 jp0Var = dp0Var.f36261p0;
        setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.uj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.z5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f21374y6;
        d6Var = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
        org.telegram.ui.Components.x90 a2 = w7.d6.a(context2, 14.0f, i11, false, d6Var);
        this.f35722a = a2;
        a2.setGravity(17);
        if (dp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.f21045gc;
        d6Var2 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
        org.telegram.ui.Components.x90 a10 = w7.d6.a(context3, 14.0f, i12, false, d6Var2);
        this.f35723b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new ek0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        jp0 jp0Var = this.f35724c.f36261p0;
        setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        this.f35722a.setTextColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21374y6));
        int i10 = org.telegram.ui.ActionBar.h6.f21045gc;
        int themedColor = jp0Var.getThemedColor(i10);
        org.telegram.ui.Components.x90 x90Var = this.f35723b;
        x90Var.setTextColor(themedColor);
        x90Var.setLinkTextColor(jp0Var.getThemedColor(i10));
    }
}
