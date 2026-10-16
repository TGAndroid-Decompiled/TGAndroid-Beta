package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class m9 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 f37937a;
    public final org.telegram.ui.Components.yi0 f37938b;
    public TLRPC.Chat f37939c;

    public m9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(context);
        this.f37938b = yi0Var;
        int ceil = (int) Math.ceil(yi0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.f37937a = i6Var;
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
        i6Var.f21011b0 = 0;
        i6Var.f21012c0 = -AndroidUtilities.dp(4.0f);
        addView(i6Var, w7.z5.d(-1.0f, -1));
        yi0Var.setText(string);
        yi0Var.setTextSize(1, 14.0f);
        yi0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        yi0Var.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        yi0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, x02));
        yi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(yi0Var, w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
