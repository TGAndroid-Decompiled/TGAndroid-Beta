package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public abstract class vr {
    public static boolean a(String str, String str2) {
        if (str.length() >= str2.length() && str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public static String b(TreeSet treeSet) {
        ArrayList arrayList = new ArrayList(treeSet.size());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!"gay".equalsIgnoreCase(str)) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        String str2 = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String t10 = a1.g.t(new StringBuilder("'"), (String) arrayList.get(i10), "'");
            if (i10 == 0) {
                str2 = t10;
            } else if (i10 == arrayList.size() - 1) {
                str2 = LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesOr, str2, t10);
            } else {
                str2 = LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesComma, str2, t10);
            }
        }
        return str2;
    }

    public static String c(String str, TreeSet treeSet) {
        String str2 = null;
        if (a(str, "bot")) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!TextUtils.isEmpty(str3) && a(str, str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        return str2;
    }

    public static CharSequence d(int i10, String str, TreeSet treeSet, String str2, nd ndVar, org.telegram.ui.ActionBar.c6 c6Var) {
        String formatString;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            upperCase.getClass();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -1970758171:
                    if (upperCase.equals("OWNER_USERNAMES_LIMIT_EXCEEDED")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1470066023:
                    if (upperCase.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1089285943:
                    if (upperCase.equals("ADDITIONAL_USERNAME_SUFFIX_MISSING")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 288843630:
                    if (upperCase.equals("USERNAME_INVALID")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 460390132:
                    if (upperCase.equals("USERNAME_PURCHASE_AVAILABLE")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 533175271:
                    if (upperCase.equals("USERNAME_OCCUPIED")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1110046033:
                    if (upperCase.equals("BOT_USERNAMES_LIMIT_EXCEEDED")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return LocaleController.formatString(R.string.CreateManagedBotUsernameOwnerLimit, Integer.valueOf(AppGlobalConfig.getInstance(i10).botAdditionalUsernamesLimit.get()), b(treeSet));
                case 1:
                    String c11 = c(str, treeSet);
                    if (c11 == null) {
                        formatString = LocaleController.getString(R.string.CreateManagedBotUsernamePremiumRequiredGeneric);
                    } else {
                        formatString = LocaleController.formatString(R.string.CreateManagedBotUsernamePremiumRequired, c11);
                    }
                    return AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var), ndVar);
                case 2:
                    return LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixMissing, b(treeSet));
                case 3:
                    return LocaleController.getString(R.string.UsernameInvalid);
                case 4:
                case 5:
                    return LocaleController.getString(R.string.UsernameInUse);
                case 6:
                    return LocaleController.getString(R.string.CreateManagedBotUsernameBotLimit);
                default:
                    return null;
            }
        }
        return null;
    }

    public static void e(Context context, int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, zc zcVar) {
        Object replaceSingleLink;
        zc zcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (zcVar == null) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                zcVar2 = zc.a0(U);
            } else {
                zcVar2 = zcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            zcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, c6Var))).j();
            callback.run(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        Set<String> set = AppGlobalConfig.getInstance(i10).botAllowedSuffixes.get();
        if (set != null) {
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    treeSet.add(str.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.e3 i11 = org.telegram.messenger.am.i(1, context, c6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        y9 y9Var = new y9(context);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.r(user);
        y9Var.e(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(y9Var, w7.w5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.am.o(i12, c6Var, textView, 1, 20.0f);
        org.telegram.messenger.am.m(R.string.CreateManagedBotTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.t(-1, -2, 55, 16, 0, 16, 5), context);
        org.telegram.messenger.am.o(i12, c6Var, h, 1, 14.0f);
        String formatString = LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user));
        int i13 = org.telegram.ui.ActionBar.h6.gc;
        h.setText(AndroidUtilities.replaceSingleLinkBold(formatString, org.telegram.ui.ActionBar.h6.w0(i13, c6Var)));
        h.setGravity(17);
        linearLayout.addView(h, w7.w5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, c6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22081b;
        h3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i14 = org.telegram.ui.ActionBar.h6.f20560d6;
        j3Var.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.w0(i14, c6Var)));
        j3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(j3Var, w7.w5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, c6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(e9Var, w7.w5.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 32, c6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f22081b;
        j3Var2.removeView(h3Var2);
        h3Var2.setHintColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, c6Var));
        h3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 17.0f);
        textView2.setText("@");
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        textView2.setGravity(17);
        textView2.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView2, w7.w5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(h3Var2, w7.w5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        j3Var2.addView(linearLayout2, w7.w5.d(-1.0f, -1));
        j3Var2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(i14, c6Var)));
        h3Var2.setImeOptions(6);
        h3Var2.setInputType(145);
        h3Var2.setSingleLine(true);
        String str2 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str2 != null) {
            str2 = str2.trim();
        }
        j3Var2.setText(str2);
        linearLayout.addView(j3Var2, w7.w5.t(-1, -2, 55, 12, 0, 12, 0));
        h3Var.setOnEditorActionListener(new e1(j3Var2, 2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, c6Var);
        linearLayout.addView(e9Var2, w7.w5.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        String str3 = str2;
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.w5.n(-1, -2));
        ci.d dVar = new ci.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        dVar.d();
        dVar.setColor(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var)));
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.w5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        f7.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(f7, w7.w5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        i11.useBackgroundTopPadding = false;
        i11.smoothKeyboardAnimationEnabled = true;
        i11.doNotOverlayNavigationBar = true;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20504a7, c6Var));
        i11.fixNavigationBar();
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        nd ndVar = new nd(i11, i10, 3);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            replaceSingleLink = LocaleController.getString(R.string.CreateManagedBotUsernameInfo);
        } else {
            replaceSingleLink = AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesInfo, b10), org.telegram.ui.ActionBar.h6.w0(i13, c6Var), ndVar);
        }
        org.telegram.tgnet.h hVar = new org.telegram.tgnet.h(e9Var2, replaceSingleLink, c6Var, 17);
        ai.d9 d9Var = new ai.d9(iArr3, runnableArr, iArr2, i10, 18);
        md mdVar = new md(27, j3Var2, treeSet);
        sr srVar = new sr(zArr2, iArr, d9Var, strArr, f7, j3Var2, treeSet, hVar, e9Var2, c6Var, iArr3, runnableArr, iArr2, i10, ndVar, i11);
        hVar.run();
        tr trVar = new tr(zArr2, iArr, j3Var2, treeSet, strArr, srVar, j3Var, iArr4, d9Var, f7, z10, i10, user, zArr, callback, i11, ndVar, c6Var, e9Var2, context);
        h3Var2.addTextChangedListener(new ur(mdVar, srVar));
        mdVar.run();
        if (!TextUtils.isEmpty(str3)) {
            srVar.run();
        }
        h3Var2.setOnEditorActionListener(new e1(trVar, 3));
        dVar.setOnClickListener(new g3(i11, 2));
        f7.setEnabled(false);
        f7.setOnClickListener(new f0(trVar, 9));
        i11.setOnDismissListener(new ei.v4(zArr2, d9Var, zArr, callback, iArr, i10));
        i11.show();
    }
}
