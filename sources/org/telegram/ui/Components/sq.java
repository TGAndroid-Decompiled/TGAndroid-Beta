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
public abstract class sq {
    public static void a(Context context, final int i9, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var, oc ocVar) {
        oc ocVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (ocVar == null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                ocVar2 = oc.a0(U);
            } else {
                ocVar2 = ocVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            ocVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        o9 o9Var = new o9(context);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(user);
        o9Var.e(user, z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(o9Var, g7.e6.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.messenger.ll.n(i10, b6Var, textView, 1, 20.0f);
        org.telegram.messenger.ll.l(R.string.CreateManagedBotTitle, textView, 17);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.ll.n(i10, b6Var, h, 1, 14.0f);
        h.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var)));
        h.setGravity(17);
        linearLayout.addView(h, g7.e6.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, b6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
        h3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
        j3Var.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        j3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(j3Var, g7.e6.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, b6Var);
        b9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(b9Var, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, b6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f24544b;
        j3Var2.removeView(h3Var2);
        h3Var2.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        h3Var2.setRightText("bot");
        h3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, g7.e6.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(h3Var2, g7.e6.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        j3Var2.addView(linearLayout2, g7.e6.c(-1.0f, -1));
        j3Var2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        h3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = e2.c.m(str, 3, 0);
        }
        j3Var2.setText(str);
        linearLayout.addView(j3Var2, g7.e6.t(-1, -2, 55, 12, 0, 12, 0));
        h3Var.setOnEditorActionListener(new c1(j3Var2, 1));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, b6Var);
        b9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(b9Var2, g7.e6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, g7.e6.n(-1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, g7.e6.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        kh.d i12 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        i12.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(i12, g7.e6.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j10.useBackgroundTopPadding = false;
        j10.smoothKeyboardAnimationEnabled = true;
        j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var));
        j10.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        gh.u6 u6Var = new gh.u6(j3Var2, new int[]{-1}, i9, strArr, new String[1], i12, b9Var2, b6Var, iArr2);
        nq nqVar = new nq(strArr, u6Var, j3Var, iArr2, i12, z10, i9, user, iArr, zArr, callback, j10, b6Var, context);
        h3Var2.addTextChangedListener(new rq(u6Var));
        if (!TextUtils.isEmpty(str)) {
            u6Var.run();
        }
        h3Var2.setOnEditorActionListener(new c1(nqVar, 2));
        dVar.setOnClickListener(new z2(j10, 2));
        i12.setEnabled(false);
        i12.setOnClickListener(new f0(nqVar, 10));
        j10.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
                    ConnectionsManager.getInstance(i9).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
            }
        });
        j10.show();
    }
}
