package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public abstract class fr {
    public static void a(Context context, final int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, final Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var, yc ycVar) {
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
            ycVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, d6Var))).j();
            callback.run(null);
            return;
        }
        Set<String> set = AppGlobalConfig.getInstance(i10).botAllowedSuffixes.get();
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, d6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(w9Var, w7.z5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.messenger.bi.m(i12, d6Var, textView, 1, 20.0f);
        org.telegram.messenger.bi.k(R.string.CreateManagedBotTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.z5.t(-1, -2, 55, 16, 0, 16, 8), context);
        org.telegram.messenger.bi.m(i12, d6Var, h, 1, 14.0f);
        h.setText(AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user)), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var)));
        h.setGravity(17);
        linearLayout.addView(h, w7.z5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, d6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22315b;
        h3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.i6.f20827d6;
        j3Var.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.v0(i13, d6Var)));
        j3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(j3Var, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, d6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(e9Var, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 29, d6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f22315b;
        j3Var2.removeView(h3Var2);
        h3Var2.setHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
        h3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, w7.z5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(h3Var2, w7.z5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        j3Var2.addView(linearLayout2, w7.z5.c(-1.0f, -1));
        j3Var2.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.v0(i13, d6Var)));
        h3Var2.setImeOptions(6);
        String str = tL_requestPeerTypeCreateBot.suggested_username;
        if (str != null) {
            str = str.trim();
        }
        for (String str2 : set) {
            if (str != null && str.toLowerCase().endsWith(str2)) {
                str = str.substring(0, str.length() - str2.length());
            }
        }
        j3Var2.setText(str);
        linearLayout.addView(j3Var2, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        h3Var.setOnEditorActionListener(new e1(j3Var2, 1));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, d6Var);
        e9Var2.setText(LocaleController.getString(R.string.CreateManagedBotUsernameInfo));
        linearLayout.addView(e9Var2, w7.z5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.z5.n(-1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.z5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(f7, w7.z5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        i11.useBackgroundTopPadding = false;
        i11.smoothKeyboardAnimationEnabled = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, d6Var));
        i11.fixNavigationBar();
        final boolean[] zArr = new boolean[1];
        String[] strArr = new String[1];
        final int[] iArr = {-1};
        int[] iArr2 = {4};
        be beVar = new be(21, j3Var2, set);
        org.telegram.messenger.fe feVar = new org.telegram.messenger.fe(j3Var2, set, new int[]{-1}, i10, strArr, new String[1], f7, e9Var2, d6Var, iArr2);
        ar arVar = new ar(strArr, feVar, j3Var, iArr2, f7, z10, i10, user, iArr, zArr, callback, i11, d6Var, context);
        h3Var2.addTextChangedListener(new er(beVar, feVar));
        beVar.run();
        if (!TextUtils.isEmpty(str)) {
            feVar.run();
        }
        h3Var2.setOnEditorActionListener(new e1(arVar, 2));
        dVar.setOnClickListener(new e3(i11, 2));
        f7.setEnabled(false);
        f7.setOnClickListener(new f0(arVar, 10));
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
