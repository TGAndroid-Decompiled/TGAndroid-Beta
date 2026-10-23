package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dp0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.y90 f36669a;
    public final org.telegram.ui.Components.y90 f36670b;
    public final fp0 f36671c;

    public dp0(fp0 fp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f36671c = fp0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
        lp0 lp0Var = fp0Var.f37402p0;
        org.telegram.ui.ActionBar.r6.i(i11, this, lp0Var.getResourceProvider());
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.z5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.k6.f21571y6;
        g6Var = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        org.telegram.ui.Components.y90 a2 = w7.d6.a(context2, 14.0f, i12, false, g6Var);
        this.f36669a = a2;
        a2.setGravity(17);
        if (fp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.k6.f21242gc;
        g6Var2 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        org.telegram.ui.Components.y90 a10 = w7.d6.a(context3, 14.0f, i13, false, g6Var2);
        this.f36670b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new oj0(this, 12)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        lp0 lp0Var = this.f36671c.f37402p0;
        setBackgroundColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        this.f36669a.setTextColor(lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21571y6));
        int i10 = org.telegram.ui.ActionBar.k6.f21242gc;
        int themedColor = lp0Var.getThemedColor(i10);
        org.telegram.ui.Components.y90 y90Var = this.f36670b;
        y90Var.setTextColor(themedColor);
        y90Var.setLinkTextColor(lp0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
