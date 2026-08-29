package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g9 extends FrameLayout {
    public final org.telegram.ui.Cells.f6 f38489a;
    public final org.telegram.ui.Components.th0 f38490b;
    public TLRPC.Chat f38491c;

    public g9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.th0 th0Var = new org.telegram.ui.Components.th0(context);
        this.f38490b = th0Var;
        int ceil = (int) Math.ceil(th0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.f38489a = f6Var;
        f6Var.I0 = true;
        f6Var.A0 = true;
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
        f6Var.setPadding(i10, 0, dp, 0);
        f6Var.U = 0;
        f6Var.V = -AndroidUtilities.dp(4.0f);
        addView(f6Var, i7.f6.c(-1.0f, -1));
        th0Var.setText(string);
        th0Var.setTextSize(1, 14.0f);
        th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, w02));
        th0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(th0Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
