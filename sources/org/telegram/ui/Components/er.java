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
public abstract class er {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var, xc xcVar) {
        xc xcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (xcVar == null) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                xcVar2 = xc.a0(U);
            } else {
                xcVar2 = xcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            xcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.e3 j3 = org.telegram.messenger.ok.j(1, context, d6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        j3.customView = linearLayout;
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(w9Var, w7.y5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.ok.n(i11, d6Var, textView, 1, 20.0f);
        org.telegram.messenger.ok.l(R.string.CreateManagedBotTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.ok.n(i11, d6Var, h, 1, 14.0f);
        h.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var)));
        h.setGravity(17);
        linearLayout.addView(h, w7.y5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, d6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f20491b;
        h3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f19059d6;
        j3Var.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)));
        j3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(j3Var, w7.y5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, d6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(e9Var, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, d6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f20491b;
        j3Var2.removeView(h3Var2);
        h3Var2.setHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        h3Var2.setRightText("bot");
        h3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, w7.y5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(h3Var2, w7.y5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        j3Var2.addView(linearLayout2, w7.y5.c(-1.0f, -1));
        j3Var2.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.v0(i12, d6Var)));
        h3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = com.google.android.gms.internal.vision.e2.i(3, 0, str);
        }
        j3Var2.setText(str);
        linearLayout.addView(j3Var2, w7.y5.t(-1, -2, 55, 12, 0, 12, 0));
        h3Var.setOnEditorActionListener(new e1(j3Var2, 1));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, d6Var);
        e9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(e9Var2, w7.y5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.y5.n(-1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.y5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        g10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(g10, w7.y5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j3.useBackgroundTopPadding = false;
        j3.smoothKeyboardAnimationEnabled = true;
        j3.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, d6Var));
        j3.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        org.telegram.messenger.jb jbVar = new org.telegram.messenger.jb(j3Var2, new int[]{-1}, i10, strArr, new String[1], g10, e9Var2, d6Var, iArr2);
        zq zqVar = new zq(strArr, jbVar, j3Var, iArr2, g10, z10, i10, user, iArr, zArr, callback, j3, d6Var, context);
        h3Var2.addTextChangedListener(new dr(jbVar));
        if (!TextUtils.isEmpty(str)) {
            jbVar.run();
        }
        h3Var2.setOnEditorActionListener(new e1(zqVar, 2));
        dVar.setOnClickListener(new e3(j3, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new f0(zqVar, 10));
        j3.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
        j3.show();
    }
}
