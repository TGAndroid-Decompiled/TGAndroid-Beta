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
public abstract class br {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, yc ycVar) {
        yc ycVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (ycVar == null) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                ycVar2 = yc.a0(U);
            } else {
                ycVar2 = ycVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            ycVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var))).j();
            callback.run(null);
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.vl.i(1, context, f6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        x9 x9Var = new x9(context);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.r(user);
        x9Var.e(user, i9Var);
        x9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(x9Var, w7.x5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.vl.n(i12, f6Var, textView, 1, 20.0f);
        org.telegram.messenger.vl.k(R.string.CreateManagedBotTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.vl.n(i12, f6Var, h, 1, 14.0f);
        h.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var)));
        h.setGravity(17);
        linearLayout.addView(h, w7.x5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22074b;
        g3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f20663d6;
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        i3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(i3Var, w7.x5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, f6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(e9Var, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, f6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f22074b;
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
        linearLayout2.addView(textView2, w7.x5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(g3Var2, w7.x5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        i3Var2.addView(linearLayout2, w7.x5.c(-1.0f, -1));
        i3Var2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
        g3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str.toLowerCase().endsWith("bot")) {
            str = com.google.android.gms.internal.vision.e2.i(3, 0, str);
        }
        i3Var2.setText(str);
        linearLayout.addView(i3Var2, w7.x5.t(-1, -2, 55, 12, 0, 12, 0));
        g3Var.setOnEditorActionListener(new f1(i3Var2, 1));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, f6Var);
        e9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(e9Var2, w7.x5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.x5.n(-1, -2));
        di.d dVar = new di.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.x5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        di.d g10 = org.telegram.messenger.vl.g(24, context, f6Var, true);
        g10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(g10, w7.x5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        i11.useBackgroundTopPadding = false;
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, f6Var));
        i11.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        org.telegram.messenger.ib ibVar = new org.telegram.messenger.ib(i3Var2, new int[]{-1}, i10, strArr, new String[1], g10, e9Var2, f6Var, iArr2);
        wq wqVar = new wq(strArr, ibVar, i3Var, iArr2, g10, z10, i10, user, iArr, zArr, callback, i11, f6Var, context);
        g3Var2.addTextChangedListener(new ar(ibVar));
        if (!TextUtils.isEmpty(str)) {
            ibVar.run();
        }
        g3Var2.setOnEditorActionListener(new f1(wqVar, 2));
        dVar.setOnClickListener(new e3(i11, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new g0(wqVar, 10));
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
