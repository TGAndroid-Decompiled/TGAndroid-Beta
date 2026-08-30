package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class k9 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 f35593a;
    public final org.telegram.ui.Components.ei0 f35594b;
    public TLRPC.Chat f35595c;

    public k9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.f35594b = ei0Var;
        int ceil = (int) Math.ceil(ei0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f35593a = h6Var;
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
        addView(h6Var, k7.b6.c(-1.0f, -1));
        ei0Var.setText(string);
        ei0Var.setTextSize(1, 14.0f);
        ei0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        ei0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        ei0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        ei0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(ei0Var, k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
