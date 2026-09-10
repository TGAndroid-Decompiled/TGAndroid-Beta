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
public abstract class ir {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, wc wcVar) {
        wc wcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (wcVar == null) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                wcVar2 = wc.a0(U);
            } else {
                wcVar2 = wcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            wcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.h3 i11 = org.telegram.messenger.em.i(1, context, f6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        w9 w9Var = new w9(context);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(user);
        w9Var.e(user, g9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(w9Var, w7.a6.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.em.n(i12, f6Var, textView, 1, 20.0f);
        org.telegram.messenger.em.k(R.string.CreateManagedBotTitle, textView, 17);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.em.n(i12, f6Var, g10, 1, 14.0f);
        g10.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var)));
        g10.setGravity(17);
        linearLayout.addView(g10, w7.a6.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
        g3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f17928d6;
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        i3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(i3Var, w7.a6.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, f6Var);
        f9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(f9Var, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, f6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f19293b;
        i3Var2.removeView(g3Var2);
        g3Var2.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        g3Var2.setRightText("bot");
        g3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, w7.a6.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(g3Var2, w7.a6.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        i3Var2.addView(linearLayout2, w7.a6.c(-1.0f, -1));
        i3Var2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        g3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = com.google.android.gms.internal.vision.e2.h(3, 0, str);
        }
        i3Var2.setText(str);
        linearLayout.addView(i3Var2, w7.a6.t(-1, -2, 55, 12, 0, 12, 0));
        g3Var.setOnEditorActionListener(new g1(i3Var2, 1));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, f6Var);
        f9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(f9Var2, w7.a6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.a6.n(-1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.a6.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        bi.d g11 = org.telegram.messenger.em.g(24, context, f6Var, true);
        g11.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(g11, w7.a6.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        i11.useBackgroundTopPadding = false;
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var));
        i11.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        org.telegram.messenger.qb qbVar = new org.telegram.messenger.qb(i3Var2, new int[]{-1}, i10, strArr, new String[1], g11, f9Var2, f6Var, iArr2);
        dr drVar = new dr(strArr, qbVar, i3Var, iArr2, g11, z10, i10, user, iArr, zArr, callback, i11, f6Var, context);
        g3Var2.addTextChangedListener(new hr(qbVar));
        if (!TextUtils.isEmpty(str)) {
            qbVar.run();
        }
        g3Var2.setOnEditorActionListener(new g1(drVar, 2));
        dVar.setOnClickListener(new d3(i11, 2));
        g11.setEnabled(false);
        g11.setOnClickListener(new h0(drVar, 10));
        i11.setOnDismissListener(new DialogInterface.OnDismissListener() {
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
        i11.show();
    }
}
