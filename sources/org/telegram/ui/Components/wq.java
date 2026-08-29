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
public abstract class wq {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, tc tcVar) {
        tc tcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (tcVar == null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                tcVar2 = tc.a0(U);
            } else {
                tcVar2 = tcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            tcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        t9 t9Var = new t9(context);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.r(user);
        t9Var.e(user, e9Var);
        t9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(t9Var, i7.f6.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 20.0f);
        org.telegram.ui.b.i(R.string.CreateManagedBotTitle, textView, 17);
        TextView i12 = org.telegram.ui.th.i(linearLayout, textView, i7.f6.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.ui.b.m(i11, c6Var, i12, 1, 14.0f);
        i12.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var)));
        i12.setGravity(17);
        linearLayout.addView(i12, i7.f6.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, c6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24387b;
        e3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.g6.f23062d6;
        g3Var.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
        g3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(g3Var, i7.f6.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, c6Var);
        y8Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(y8Var, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, c6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.e3 e3Var2 = g3Var2.f24387b;
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
        linearLayout2.addView(textView2, i7.f6.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(e3Var2, i7.f6.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        g3Var2.addView(linearLayout2, i7.f6.c(-1.0f, -1));
        g3Var2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
        e3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = com.google.android.recaptcha.internal.a.m(str, 3, 0);
        }
        g3Var2.setText(str);
        linearLayout.addView(g3Var2, i7.f6.t(-1, -2, 55, 12, 0, 12, 0));
        e3Var.setOnEditorActionListener(new f1(g3Var2, 1));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, c6Var);
        y8Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(y8Var2, i7.f6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, i7.f6.n(-1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, i7.f6.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(o10, i7.f6.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        q6.useBackgroundTopPadding = false;
        q6.smoothKeyboardAnimationEnabled = true;
        q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var));
        q6.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        jh.r6 r6Var = new jh.r6(g3Var2, new int[]{-1}, i10, strArr, new String[1], o10, y8Var2, c6Var, iArr2);
        rq rqVar = new rq(strArr, r6Var, g3Var, iArr2, o10, z10, i10, user, iArr, zArr, callback, q6, c6Var, context);
        e3Var2.addTextChangedListener(new vq(r6Var));
        if (!TextUtils.isEmpty(str)) {
            r6Var.run();
        }
        e3Var2.setOnEditorActionListener(new f1(rqVar, 2));
        dVar.setOnClickListener(new d3(q6, 2));
        o10.setEnabled(false);
        o10.setOnClickListener(new h0(rqVar, 10));
        q6.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
        q6.show();
    }
}
