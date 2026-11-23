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
public abstract class yq {
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
                str2 = org.telegram.messenger.gd.a0(null, null, 2131751707, str2, s5);
            } else {
                str2 = org.telegram.messenger.gd.a0(null, null, 2131751709, str2, s5);
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

    public static CharSequence d(int i7, String str, TreeSet treeSet, String str2, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.i6 i6Var) {
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
                    return org.telegram.messenger.gd.a0(null, null, 2131751713, Integer.valueOf(((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(i7).A7.S.f15482b).f24899c), b(treeSet));
                case 1:
                    String c11 = c(str, treeSet);
                    if (c11 == null) {
                        a02 = org.telegram.messenger.gd.N0(2131751711, null);
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751712, c11);
                    }
                    return org.telegram.messenger.g0.Q2(a02, org.telegram.ui.ActionBar.n6.Xc, i6Var, iiVar, false);
                case 2:
                    return org.telegram.messenger.gd.a0(null, null, 2131751710, b(treeSet));
                case 3:
                    return org.telegram.messenger.gd.N0(2131743409, null);
                case 4:
                case 5:
                    return org.telegram.messenger.gd.N0(2131743411, null);
                case 6:
                    return org.telegram.messenger.gd.N0(2131751716, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i7, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, org.telegram.messenger.w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var, kc kcVar) {
        String str;
        org.telegram.ui.Cells.j3 j3Var;
        hi.e eVar;
        Object Q2;
        kc kcVar2;
        String q10;
        if (!user.bot_can_manage_bots) {
            if (kcVar == null) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    w10Var.a(null);
                    return;
                }
                kcVar2 = kc.b0(T);
            } else {
                kcVar2 = kcVar;
            }
            if (!TextUtils.isEmpty(org.telegram.messenger.n10.o(user))) {
                q10 = "@" + org.telegram.messenger.n10.o(user);
            } else {
                q10 = org.telegram.messenger.n10.q(user);
            }
            kcVar2.Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), org.telegram.messenger.gd.a0(null, null, 2131751718, q10))).j();
            w10Var.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashSet<String> hashSet = ((org.telegram.messenger.o0) org.telegram.messenger.mp.u1(i7).A7.f26252o0.f17372b).f26112c;
        if (hashSet != null) {
            for (String str2 : hashSet) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        j3.O = linearLayout;
        p9 p9Var = new p9(context);
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        p9Var.f(user, a9Var);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        linearLayout.addView(p9Var, c8.na.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        i5.c.r(20.0f, 1, 2131751719, textView, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.na.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setTextSize(1, 14.0f);
        String a02 = org.telegram.messenger.gd.a0(null, null, 2131751720, org.telegram.messenger.n10.q(user));
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        textView2.setText(org.telegram.messenger.g0.Q2(a02, i11, i6Var, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.na.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131751722, null), false, false, -1, i6Var);
        org.telegram.ui.Cells.j3 j3Var2 = l3Var.d;
        j3Var2.setImeOptions(5);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.n6.f29451d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        l3Var.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(l3Var, d02, M, null, i6Var);
        l3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(l3Var, c8.na.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, i6Var);
        z8Var.setText(org.telegram.messenger.gd.N0(2131751721, null));
        linearLayout.addView(z8Var, c8.na.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.N0(2131751717, null), false, false, 32, i6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.j3 j3Var3 = l3Var2.d;
        l3Var2.removeView(j3Var3);
        org.telegram.ui.ActionBar.u6.A(j3Var3, org.telegram.ui.ActionBar.n6.H6, i6Var);
        j3Var3.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.u6.U(textView3, i10, i6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        linearLayout2.addView(textView3, c8.na.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(j3Var3, c8.na.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        l3Var2.addView(linearLayout2, c8.na.c(-1.0f, -1));
        Drawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        l3Var2.setBackground(d03);
        org.telegram.ui.ActionBar.u6.j(l3Var2, d03, M2, null, i6Var);
        j3Var3.setImeOptions(6);
        j3Var3.setInputType(145);
        j3Var3.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        l3Var2.setText(str3);
        linearLayout.addView(l3Var2, c8.na.t(-1, -2, 55, 12, 0, 12, 0));
        j3Var2.setOnEditorActionListener(new g(l3Var2, 3));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, i6Var);
        linearLayout.addView(z8Var2, c8.na.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, c8.na.o(-1, -2));
        hi.e eVar2 = new hi.e(context, i6Var, true);
        eVar2.setRoundRadius(24);
        eVar2.e();
        eVar2.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        if (eVar2.getBackground() != null) {
            Drawable background = eVar2.getBackground();
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i10);
            eVar2.setBackground(background);
            str = null;
            org.telegram.ui.ActionBar.u6.j(eVar2, background, K, null, i6Var);
        } else {
            str = null;
        }
        eVar2.setText(org.telegram.messenger.gd.N0(2131752577, str));
        linearLayout3.addView(eVar2, c8.na.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        g10.setText(org.telegram.messenger.gd.N0(2131751729, null));
        linearLayout3.addView(g10, c8.na.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j3.U0 = false;
        j3.Q0 = true;
        j3.f30256r = true;
        j3.w0(org.telegram.ui.ActionBar.n6.f29394a7);
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
            Q2 = org.telegram.messenger.gd.N0(2131751714, null);
            j3Var = j3Var3;
            eVar = eVar2;
        } else {
            j3Var = j3Var3;
            eVar = eVar2;
            Q2 = org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.a0(null, null, 2131751708, b10), i11, i6Var, iiVar, false);
        }
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(z8Var2, Q2, i6Var, 10);
        ai.x0 x0Var = new ai.x0(iArr3, runnableArr, iArr2, i7, 24);
        xd xdVar = new xd(25, l3Var2, treeSet);
        uq uqVar = new uq(zArr2, iArr, x0Var, strArr, g10, l3Var2, treeSet, faVar, z8Var2, i6Var, iArr3, runnableArr, iArr2, i7, iiVar, j3);
        faVar.run();
        hi.e eVar3 = eVar;
        org.telegram.ui.Cells.j3 j3Var4 = j3Var;
        vq vqVar = new vq(zArr2, iArr, l3Var2, treeSet, strArr, uqVar, l3Var, iArr4, x0Var, g10, z10, i7, user, zArr, w10Var, j3, iiVar, i6Var, z8Var2, context);
        j3Var4.addTextChangedListener(new wq(xdVar, uqVar));
        xdVar.run();
        if (!TextUtils.isEmpty(str4)) {
            uqVar.run();
        }
        j3Var4.setOnEditorActionListener(new g(vqVar, 4));
        eVar3.setOnClickListener(new e3(j3, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new n0(vqVar, 10));
        j3.setOnDismissListener(new ki.y3(zArr2, x0Var, zArr, w10Var, iArr, i7));
        j3.show();
    }
}
