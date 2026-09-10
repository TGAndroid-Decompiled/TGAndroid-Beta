package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class j9 extends FrameLayout {
    public final org.telegram.ui.Cells.j6 f34055a;
    public final org.telegram.ui.Components.hi0 f34056b;
    public TLRPC.Chat f34057c;

    public j9(Context context) {
        super(context);
        int i10;
        int dp;
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(context);
        this.f34056b = hi0Var;
        int ceil = (int) Math.ceil(hi0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f34055a = j6Var;
        j6Var.M0 = true;
        j6Var.E0 = true;
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
        j6Var.setPadding(i10, 0, dp, 0);
        j6Var.f19358b0 = 0;
        j6Var.f19359c0 = -AndroidUtilities.dp(4.0f);
        addView(j6Var, w7.a6.c(-1.0f, -1));
        hi0Var.setText(string);
        hi0Var.setTextSize(1, 14.0f);
        hi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        hi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(hi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
