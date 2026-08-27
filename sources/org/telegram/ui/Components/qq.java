package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

public abstract class qq {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, mc mcVar) {
        mc mcVarA0;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (mcVar == null) {
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU == null) {
                    callback.run(null);
                    return;
                }
                mcVarA0 = mc.a0(n2VarU);
            } else {
                mcVarA0 = mcVar;
            }
            if (TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = UserObject.getUserName(user);
            } else {
                userName = "@" + UserObject.getPublicUsername(user);
            }
            mcVarA0.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        e3VarO.customView = linearLayout;
        n9 n9Var = new n9(context);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(user);
        n9Var.e(user, y8Var);
        n9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(n9Var, h7.z5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.rl.l(i11, c6Var, textView, 1, 20.0f);
        org.telegram.messenger.rl.i(R.string.CreateManagedBotTitle, textView, 17);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.rl.l(i11, c6Var, textViewI, 1, 14.0f);
        textViewI.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var)));
        textViewI.setGravity(17);
        linearLayout.addView(textViewI, h7.z5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, c6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24370b;
        e3Var.setImeOptions(5);
        int iDp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        g3Var.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        g3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(g3Var, h7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, c6Var);
        x8Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(x8Var, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, c6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.e3 e3Var2 = g3Var2.f24370b;
        g3Var2.removeView(e3Var2);
        e3Var2.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        e3Var2.setRightText("bot");
        e3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, h7.z5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(e3Var2, h7.z5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        g3Var2.addView(linearLayout2, h7.z5.c(-1.0f, -1));
        g3Var2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        e3Var2.setImeOptions(6);
        String strN = tL_requestPeerTypeCreateBot.suggested_username;
        if (strN != null) {
            strN = strN.trim();
        }
        if (strN != null && strN.toLowerCase().endsWith("bot")) {
            strN = com.google.android.recaptcha.internal.a.n(strN, 3, 0);
        }
        g3Var2.setText(strN);
        linearLayout.addView(g3Var2, h7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        e3Var.setOnEditorActionListener(new c1(g3Var2, 1));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, c6Var);
        x8Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(x8Var2, h7.z5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, h7.z5.n(-1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, h7.z5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        dVarG.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(dVarG, h7.z5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        e3VarO.useBackgroundTopPadding = false;
        e3VarO.smoothKeyboardAnimationEnabled = true;
        e3VarO.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6Var));
        e3VarO.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        hh.t6 t6Var = new hh.t6(g3Var2, new int[]{-1}, i10, strArr, new String[1], dVarG, x8Var2, c6Var, iArr2);
        lq lqVar = new lq(strArr, t6Var, g3Var, iArr2, dVarG, z10, i10, user, iArr, zArr, callback, e3VarO, c6Var, context);
        e3Var2.addTextChangedListener(new pq(t6Var));
        if (!TextUtils.isEmpty(strN)) {
            t6Var.run();
        }
        e3Var2.setOnEditorActionListener(new c1(lqVar, 2));
        dVar.setOnClickListener(new z2(e3VarO, 2));
        dVarG.setEnabled(false);
        dVarG.setOnClickListener(new f0(lqVar, 10));
        e3VarO.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(null);
                    }
                }
                int[] iArr3 = iArr;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i10).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
            }
        });
        e3VarO.show();
    }
}
