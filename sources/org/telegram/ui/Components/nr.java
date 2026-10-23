package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
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
public abstract class nr {
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
            String s10 = a1.g.s(new StringBuilder("'"), (String) arrayList.get(i10), "'");
            if (i10 == 0) {
                str2 = s10;
            } else if (i10 == arrayList.size() - 1) {
                str2 = LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesOr, str2, s10);
            } else {
                str2 = LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesComma, str2, s10);
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

    public static CharSequence d(int i10, String str, TreeSet treeSet, String str2, d2 d2Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
                    return AndroidUtilities.replaceSingleLinkKey(formatString, org.telegram.ui.ActionBar.k6.f21242gc, g6Var, d2Var);
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

    public static void e(Context context, int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, xc xcVar) {
        Object replaceSingleLinkKey;
        xc xcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (xcVar == null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
            xcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var))).j();
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
        org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, context, g6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.r(user);
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(w9Var, w7.z5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 20.0f);
        org.telegram.messenger.sl.m(R.string.CreateManagedBotTitle, textView, 17);
        linearLayout.addView(textView, w7.z5.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setTextSize(1, 14.0f);
        String formatString = LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user));
        int i12 = org.telegram.ui.ActionBar.k6.f21242gc;
        textView2.setText(AndroidUtilities.replaceSingleLinkBoldKey(formatString, i12, g6Var, null));
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, g6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f21183d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        h3Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(h3Var, c02, O, null, g6Var);
        h3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(h3Var, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, g6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(e9Var, w7.z5.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 32, g6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.f3 f3Var2 = h3Var2.d;
        h3Var2.removeView(f3Var2);
        org.telegram.ui.ActionBar.r6.C(f3Var2, org.telegram.ui.ActionBar.k6.H6, g6Var);
        f3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.r6.W(textView3, i11, g6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView3, w7.z5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(f3Var2, w7.z5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        h3Var2.addView(linearLayout2, w7.z5.c(-1.0f, -1));
        Drawable c03 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        h3Var2.setBackground(c03);
        org.telegram.ui.ActionBar.r6.k(h3Var2, c03, O2, null, g6Var);
        f3Var2.setImeOptions(6);
        f3Var2.setInputType(145);
        f3Var2.setSingleLine(true);
        String str2 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str2 != null) {
            str2 = str2.trim();
        }
        h3Var2.setText(str2);
        linearLayout.addView(h3Var2, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        f3Var.setOnEditorActionListener(new d1(h3Var2, 2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, g6Var);
        linearLayout.addView(e9Var2, w7.z5.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.z5.n(-1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i11);
            dVar.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(dVar, background, M, null, g6Var);
        }
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, w7.z5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        g10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(g10, w7.z5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j10.useBackgroundTopPadding = false;
        j10.smoothKeyboardAnimationEnabled = true;
        j10.doNotOverlayNavigationBar = true;
        j10.setBackgroundColorKey(org.telegram.ui.ActionBar.k6.f21125a7);
        j10.fixNavigationBar();
        new WeakReference(j10);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        d2 d2Var = new d2(j10, i10, 6);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            replaceSingleLinkKey = LocaleController.getString(R.string.CreateManagedBotUsernameInfo);
        } else {
            replaceSingleLinkKey = AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesInfo, b10), i12, g6Var, d2Var);
        }
        lg lgVar = new lg(e9Var2, replaceSingleLinkKey, g6Var, 4);
        ai.db dbVar = new ai.db(iArr3, runnableArr, iArr2, i10, 20);
        ee eeVar = new ee(24, h3Var2, treeSet);
        jr jrVar = new jr(zArr2, iArr, dbVar, strArr, g10, h3Var2, treeSet, lgVar, e9Var2, g6Var, iArr3, runnableArr, iArr2, i10, d2Var, j10);
        lgVar.run();
        kr krVar = new kr(zArr2, iArr, h3Var2, treeSet, strArr, jrVar, h3Var, iArr4, dbVar, g10, z10, i10, user, zArr, callback, j10, d2Var, g6Var, e9Var2, context);
        f3Var2.addTextChangedListener(new lr(eeVar, jrVar));
        eeVar.run();
        if (!TextUtils.isEmpty(str2)) {
            jrVar.run();
        }
        f3Var2.setOnEditorActionListener(new d1(krVar, 3));
        dVar.setOnClickListener(new e3(j10, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new f0(krVar, 9));
        j10.setOnDismissListener(new gi.l4(zArr2, dbVar, zArr, callback, iArr, i10));
        j10.show();
    }
}
