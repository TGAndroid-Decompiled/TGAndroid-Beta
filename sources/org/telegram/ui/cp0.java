package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cp0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.w90 f36382a;
    public final org.telegram.ui.Components.w90 f36383b;
    public final ep0 f36384c;

    public cp0(ep0 ep0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f36384c = ep0Var;
        setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        kp0 kp0Var = ep0Var.f36983p0;
        org.telegram.ui.ActionBar.r6.i(i11, this, kp0Var.getResourceProvider());
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getContext());
        u9Var.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(u9Var, w7.z5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i12 = org.telegram.ui.ActionBar.k6.f21572y6;
        g6Var = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
        org.telegram.ui.Components.w90 a2 = w7.d6.a(context2, 14.0f, i12, false, g6Var);
        this.f36382a = a2;
        a2.setGravity(17);
        if (ep0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i13 = org.telegram.ui.ActionBar.k6.f21243gc;
        g6Var2 = ((org.telegram.ui.ActionBar.o2) kp0Var).resourceProvider;
        org.telegram.ui.Components.w90 a10 = w7.d6.a(context3, 14.0f, i13, false, g6Var2);
        this.f36383b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new nj0(this, 12)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        kp0 kp0Var = this.f36384c.f36983p0;
        setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        this.f36382a.setTextColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21572y6));
        int i10 = org.telegram.ui.ActionBar.k6.f21243gc;
        int themedColor = kp0Var.getThemedColor(i10);
        org.telegram.ui.Components.w90 w90Var = this.f36383b;
        w90Var.setTextColor(themedColor);
        w90Var.setLinkTextColor(kp0Var.getThemedColor(i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
