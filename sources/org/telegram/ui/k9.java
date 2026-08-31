package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class k9 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 f38306a;
    public final org.telegram.ui.Components.gi0 f38307b;
    public TLRPC.Chat f38308c;

    public k9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context);
        this.f38307b = gi0Var;
        int ceil = (int) Math.ceil(gi0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f38306a = h6Var;
        h6Var.J0 = true;
        h6Var.B0 = true;
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(44.0f) + ceil;
        } else {
            i10 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(44.0f) + ceil;
        }
        h6Var.setPadding(i10, 0, dp, 0);
        h6Var.V = 0;
        h6Var.W = -AndroidUtilities.dp(4.0f);
        addView(h6Var, k7.c6.c(-1.0f, -1));
        gi0Var.setText(string);
        gi0Var.setTextSize(1, 14.0f);
        gi0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        gi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hl, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        gi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, w02));
        gi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(gi0Var, k7.c6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
