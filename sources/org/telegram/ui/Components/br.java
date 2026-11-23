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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public abstract class br {
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            String s5 = a8.p0.s(new StringBuilder("'"), (String) arrayList.get(i7), "'");
            if (i7 == 0) {
                str2 = s5;
            } else if (i7 == arrayList.size() - 1) {
                str2 = org.telegram.messenger.hd.a0(null, null, 2131751707, str2, s5);
            } else {
                str2 = org.telegram.messenger.hd.a0(null, null, 2131751709, str2, s5);
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

    public static CharSequence d(int i7, String str, TreeSet treeSet, String str2, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        String a02;
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
                    return org.telegram.messenger.hd.a0(null, null, 2131751713, Integer.valueOf(((org.telegram.messenger.j0) org.telegram.messenger.np.u1(i7).A7.S.f15495b).f24776c), b(treeSet));
                case 1:
                    String c11 = c(str, treeSet);
                    if (c11 == null) {
                        a02 = org.telegram.messenger.hd.N0(2131751711, null);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751712, c11);
                    }
                    return org.telegram.messenger.g0.Q2(a02, org.telegram.ui.ActionBar.m6.Xc, h6Var, iiVar, false);
                case 2:
                    return org.telegram.messenger.hd.a0(null, null, 2131751710, b(treeSet));
                case 3:
                    return org.telegram.messenger.hd.N0(2131743413, null);
                case 4:
                case 5:
                    return org.telegram.messenger.hd.N0(2131743415, null);
                case 6:
                    return org.telegram.messenger.hd.N0(2131751716, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i7, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, org.telegram.messenger.y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        String str;
        org.telegram.ui.Cells.j3 j3Var;
        hi.d dVar;
        Object Q2;
        lc lcVar2;
        String q10;
        if (!user.bot_can_manage_bots) {
            if (lcVar == null) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    y10Var.a(null);
                    return;
                }
                lcVar2 = lc.b0(T);
            } else {
                lcVar2 = lcVar;
            }
            if (!TextUtils.isEmpty(org.telegram.messenger.p10.o(user))) {
                q10 = "@" + org.telegram.messenger.p10.o(user);
            } else {
                q10 = org.telegram.messenger.p10.q(user);
            }
            lcVar2.Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), org.telegram.messenger.hd.a0(null, null, 2131751718, q10))).j();
            y10Var.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashSet<String> hashSet = ((org.telegram.messenger.o0) org.telegram.messenger.np.u1(i7).A7.f26201o0.f13993b).f26035c;
        if (hashSet != null) {
            for (String str2 : hashSet) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        j3.O = linearLayout;
        q9 q9Var = new q9(context);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.r(user);
        q9Var.f(user, b9Var);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        linearLayout.addView(q9Var, c8.na.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        i5.c.r(20.0f, 1, 2131751719, textView, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.na.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setTextSize(1, 14.0f);
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131751720, org.telegram.messenger.p10.q(user));
        int i11 = org.telegram.ui.ActionBar.m6.Xc;
        textView2.setText(org.telegram.messenger.g0.Q2(a02, i11, h6Var, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.na.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.hd.N0(2131751722, null), false, false, -1, h6Var);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var.d;
        j3Var2.setImeOptions(5);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.m6.f29347d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        l3Var.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(l3Var, d02, M, null, h6Var);
        l3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(l3Var, c8.na.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, h6Var);
        a9Var.setText(org.telegram.messenger.hd.N0(2131751721, null));
        linearLayout.addView(a9Var, c8.na.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.hd.N0(2131751717, null), false, false, 32, h6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.j3 j3Var3 = l3Var2.d;
        l3Var2.removeView(j3Var3);
        org.telegram.ui.ActionBar.t6.A(j3Var3, org.telegram.ui.ActionBar.m6.H6, h6Var);
        j3Var3.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.t6.U(textView3, i10, h6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        linearLayout2.addView(textView3, c8.na.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(j3Var3, c8.na.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        l3Var2.addView(linearLayout2, c8.na.c(-1.0f, -1));
        Drawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        l3Var2.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(l3Var2, d03, M2, null, h6Var);
        j3Var3.setImeOptions(6);
        j3Var3.setInputType(145);
        j3Var3.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        l3Var2.setText(str3);
        linearLayout.addView(l3Var2, c8.na.t(-1, -2, 55, 12, 0, 12, 0));
        j3Var2.setOnEditorActionListener(new h(l3Var2, 3));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, h6Var);
        linearLayout.addView(a9Var2, c8.na.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, c8.na.o(-1, -2));
        hi.d dVar2 = new hi.d(context, h6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        dVar2.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        if (dVar2.getBackground() != null) {
            Drawable background = dVar2.getBackground();
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i10);
            dVar2.setBackground(background);
            str = null;
            org.telegram.ui.ActionBar.t6.j(dVar2, background, K, null, h6Var);
        } else {
            str = null;
        }
        dVar2.setText(org.telegram.messenger.hd.N0(2131752577, str));
        linearLayout3.addView(dVar2, c8.na.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        hi.d g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        g10.setText(org.telegram.messenger.hd.N0(2131751729, null));
        linearLayout3.addView(g10, c8.na.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j3.U0 = false;
        j3.Q0 = true;
        j3.f30172r = true;
        j3.w0(org.telegram.ui.ActionBar.m6.f29290a7);
        j3.O();
        new WeakReference(j3);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        String str4 = str3;
        org.telegram.ui.ii iiVar = new org.telegram.ui.ii(j3, i7, 13);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            Q2 = org.telegram.messenger.hd.N0(2131751714, null);
            j3Var = j3Var3;
            dVar = dVar2;
        } else {
            j3Var = j3Var3;
            dVar = dVar2;
            Q2 = org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131751708, b10), i11, h6Var, iiVar, false);
        }
        g gVar = new g(a9Var2, Q2, h6Var, 9);
        ai.w0 w0Var = new ai.w0(iArr3, runnableArr, iArr2, i7, 24);
        og ogVar = new og(21, l3Var2, treeSet);
        xq xqVar = new xq(zArr2, iArr, w0Var, strArr, g10, l3Var2, treeSet, gVar, a9Var2, h6Var, iArr3, runnableArr, iArr2, i7, iiVar, j3);
        gVar.run();
        hi.d dVar3 = dVar;
        org.telegram.ui.Cells.j3 j3Var4 = j3Var;
        yq yqVar = new yq(zArr2, iArr, l3Var2, treeSet, strArr, xqVar, l3Var, iArr4, w0Var, g10, z10, i7, user, zArr, y10Var, j3, iiVar, h6Var, a9Var2, context);
        j3Var4.addTextChangedListener(new zq(ogVar, xqVar));
        ogVar.run();
        if (!TextUtils.isEmpty(str4)) {
            xqVar.run();
        }
        j3Var4.setOnEditorActionListener(new h(yqVar, 4));
        dVar3.setOnClickListener(new f3(j3, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new o0(yqVar, 10));
        j3.setOnDismissListener(new ki.x3(zArr2, w0Var, zArr, y10Var, iArr, i7));
        j3.show();
    }
}
