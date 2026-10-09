package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i9 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 f38542a;
    public final org.telegram.ui.Components.cj0 f38543b;
    public TLRPC.Chat f38544c;

    public i9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(context);
        this.f38543b = cj0Var;
        int ceil = (int) Math.ceil(cj0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f38542a = i6Var;
        i6Var.M0 = true;
        i6Var.E0 = true;
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
        i6Var.setPadding(i10, 0, dp, 0);
        i6Var.f22244b0 = 0;
        i6Var.f22245c0 = -AndroidUtilities.dp(4.0f);
        addView(i6Var, w7.x5.d(-1.0f, -1));
        cj0Var.setText(string);
        cj0Var.setTextSize(1, 14.0f);
        cj0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        cj0Var.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hl, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        cj0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, x02));
        cj0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(cj0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
