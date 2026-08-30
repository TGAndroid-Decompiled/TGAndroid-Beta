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
public abstract class ar {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z4, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, qc qcVar) {
        qc qcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (qcVar == null) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                qcVar2 = qc.a0(U);
            } else {
                qcVar2 = qcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            qcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        p9 p9Var = new p9(context);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.r(user);
        p9Var.e(user, z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(p9Var, k7.b6.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 20.0f);
        org.telegram.messenger.y3.r(R.string.CreateManagedBotTitle, textView, 17);
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView, k7.b6.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.ui.b.l(i11, f6Var, j10, 1, 14.0f);
        j10.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var)));
        j10.setGravity(17);
        linearLayout.addView(j10, k7.b6.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f21199b;
        g3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f19906d6;
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        i3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(i3Var, k7.b6.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, f6Var);
        a9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(a9Var, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, f6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f21199b;
        i3Var2.removeView(g3Var2);
        g3Var2.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        g3Var2.setRightText("bot");
        g3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, k7.b6.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(g3Var2, k7.b6.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        i3Var2.addView(linearLayout2, k7.b6.c(-1.0f, -1));
        i3Var2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        g3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = e2.c.j(str, 3, 0);
        }
        i3Var2.setText(str);
        linearLayout.addView(i3Var2, k7.b6.t(-1, -2, 55, 12, 0, 12, 0));
        g3Var.setOnEditorActionListener(new d1(i3Var2, 1));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, f6Var);
        a9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(a9Var2, k7.b6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, k7.b6.n(-1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, k7.b6.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        p10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(p10, k7.b6.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        o10.useBackgroundTopPadding = false;
        o10.smoothKeyboardAnimationEnabled = true;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, f6Var));
        o10.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        lh.s6 s6Var = new lh.s6(i3Var2, new int[]{-1}, i10, strArr, new String[1], p10, a9Var2, f6Var, iArr2);
        vq vqVar = new vq(strArr, s6Var, i3Var, iArr2, p10, z4, i10, user, iArr, zArr, callback, o10, f6Var, context);
        g3Var2.addTextChangedListener(new zq(s6Var));
        if (!TextUtils.isEmpty(str)) {
            s6Var.run();
        }
        g3Var2.setOnEditorActionListener(new d1(vqVar, 2));
        dVar.setOnClickListener(new a3(o10, 2));
        p10.setEnabled(false);
        p10.setOnClickListener(new g0(vqVar, 10));
        o10.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
        o10.show();
    }
}
