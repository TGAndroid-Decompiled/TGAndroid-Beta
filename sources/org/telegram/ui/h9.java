package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h9 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 f38717a;
    public final org.telegram.ui.Components.jh0 f38718b;
    public TLRPC.Chat f38719c;

    public h9(Context context) {
        super(context);
        int i9;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(context);
        this.f38718b = jh0Var;
        int ceil = (int) Math.ceil(jh0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f38717a = h6Var;
        h6Var.I0 = true;
        h6Var.A0 = true;
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(44.0f) + ceil;
        } else {
            i9 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(44.0f) + ceil;
        }
        h6Var.setPadding(i9, 0, dp, 0);
        h6Var.U = 0;
        h6Var.V = -AndroidUtilities.dp(4.0f);
        addView(h6Var, g7.e6.c(-1.0f, -1));
        jh0Var.setText(string);
        jh0Var.setTextSize(1, 14.0f);
        jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{16.0f}, w02));
        jh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
