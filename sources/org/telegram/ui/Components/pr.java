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
public abstract class pr {
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

    public static CharSequence d(int i10, String str, TreeSet treeSet, String str2, h2 h2Var, org.telegram.ui.ActionBar.u6 u6Var) {
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
                    return AndroidUtilities.replaceSingleLinkKey(formatString, org.telegram.ui.ActionBar.y6.gc, u6Var, h2Var);
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

    public static void e(Context context, int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var, wc wcVar) {
        Object replaceSingleLinkKey;
        wc wcVar2;
        String userName;
        if (!user.bot_can_manage_bots) {
            if (wcVar == null) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                wcVar2 = wc.b0(U);
            } else {
                wcVar2 = wcVar;
            }
            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user))) {
                userName = "@" + UserObject.getPublicUsername(user);
            } else {
                userName = UserObject.getUserName(user);
            }
            wcVar2.R(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var))).j();
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
        org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.wh.i(1, context, u6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        i11.customView = linearLayout;
        y9 y9Var = new y9(context);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(user);
        y9Var.f(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        linearLayout.addView(y9Var, kb1.x(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        textView.setTextSize(1, 20.0f);
        org.telegram.messenger.wh.k(R.string.CreateManagedBotTitle, textView, 17);
        linearLayout.addView(textView, kb1.x(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView2, i12, u6Var);
        textView2.setTextSize(1, 14.0f);
        String formatString = LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user));
        int i13 = org.telegram.ui.ActionBar.y6.gc;
        textView2.setText(AndroidUtilities.replaceSingleLinkBoldKey(formatString, i13, u6Var, null));
        textView2.setGravity(17);
        linearLayout.addView(textView2, kb1.x(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, u6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i14 = org.telegram.ui.ActionBar.y6.f23357d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        g3Var.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(g3Var, c02, N, null, u6Var);
        g3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(g3Var, kb1.x(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, u6Var);
        i9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        linearLayout.addView(i9Var, kb1.x(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 32, u6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.e3 e3Var2 = g3Var2.d;
        g3Var2.removeView(e3Var2);
        org.telegram.ui.ActionBar.f7.B(e3Var2, org.telegram.ui.ActionBar.y6.H6, u6Var);
        e3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.f7.V(textView3, i12, u6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout2.addView(textView3, kb1.o(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(e3Var2, kb1.t(0, -1, 119.0f, 1, 0, 0, 0, 0));
        g3Var2.addView(linearLayout2, kb1.g(-1.0f, -1));
        Drawable c03 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        g3Var2.setBackground(c03);
        org.telegram.ui.ActionBar.f7.k(g3Var2, c03, N2, null, u6Var);
        e3Var2.setImeOptions(6);
        e3Var2.setInputType(145);
        e3Var2.setSingleLine(true);
        String str2 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str2 != null) {
            str2 = str2.trim();
        }
        g3Var2.setText(str2);
        linearLayout.addView(g3Var2, kb1.x(-1, -2, 55, 12, 0, 12, 0));
        e3Var.setOnEditorActionListener(new d1(g3Var2, 2));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, u6Var);
        linearLayout.addView(i9Var2, kb1.x(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, kb1.r(-1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i12);
            dVar.setBackground(background);
            org.telegram.ui.ActionBar.f7.k(dVar, background, L, null, u6Var);
        }
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout3.addView(dVar, kb1.t(0, 48, 119.0f, 1, 0, 0, 5, 0));
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        f7.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout3.addView(f7, kb1.t(0, 48, 119.0f, 1, 5, 0, 0, 0));
        i11.useBackgroundTopPadding = false;
        i11.smoothKeyboardAnimationEnabled = true;
        i11.doNotOverlayNavigationBar = true;
        i11.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.f23300a7);
        i11.fixNavigationBar();
        new WeakReference(i11);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        h2 h2Var = new h2(i11, i10, 6);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            replaceSingleLinkKey = LocaleController.getString(R.string.CreateManagedBotUsernameInfo);
        } else {
            replaceSingleLinkKey = AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesInfo, b10), i13, u6Var, h2Var);
        }
        kg kgVar = new kg(i9Var2, replaceSingleLinkKey, u6Var, 5);
        ai.h1 h1Var = new ai.h1(iArr3, runnableArr, iArr2, i10, 22);
        so soVar = new so(4, g3Var2, treeSet);
        lr lrVar = new lr(zArr2, iArr, h1Var, strArr, f7, g3Var2, treeSet, kgVar, i9Var2, u6Var, iArr3, runnableArr, iArr2, i10, h2Var, i11);
        kgVar.run();
        mr mrVar = new mr(zArr2, iArr, g3Var2, treeSet, strArr, lrVar, g3Var, iArr4, h1Var, f7, z10, i10, user, zArr, callback, i11, h2Var, u6Var, i9Var2, context);
        e3Var2.addTextChangedListener(new nr(soVar, lrVar));
        soVar.run();
        if (!TextUtils.isEmpty(str2)) {
            lrVar.run();
        }
        e3Var2.setOnEditorActionListener(new d1(mrVar, 3));
        dVar.setOnClickListener(new g3(i11, 2));
        f7.setEnabled(false);
        f7.setOnClickListener(new f0(mrVar, 9));
        i11.setOnDismissListener(new hi.u4(zArr2, h1Var, zArr, callback, iArr, i10));
        i11.show();
    }
}
