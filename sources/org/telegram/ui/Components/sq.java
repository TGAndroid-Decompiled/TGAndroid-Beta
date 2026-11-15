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
public abstract class sq {
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
                str2 = org.telegram.messenger.hd.a0(null, null, 2131751719, str2, s5);
            } else {
                str2 = org.telegram.messenger.hd.a0(null, null, 2131751721, str2, s5);
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

    public static CharSequence d(int i7, String str, TreeSet treeSet, String str2, a2 a2Var, org.telegram.ui.ActionBar.e6 e6Var) {
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
                    return org.telegram.messenger.hd.a0(null, null, 2131751725, Integer.valueOf(((org.telegram.messenger.j0) org.telegram.messenger.np.s1(i7).f25451y7.N.f15881b).f24498c), b(treeSet));
                case 1:
                    String c11 = c(str, treeSet);
                    if (c11 == null) {
                        a02 = org.telegram.messenger.hd.M0(2131751723, null);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751724, c11);
                    }
                    return org.telegram.messenger.g0.Q2(a02, org.telegram.ui.ActionBar.j6.Xc, e6Var, a2Var, false);
                case 2:
                    return org.telegram.messenger.hd.a0(null, null, 2131751722, b(treeSet));
                case 3:
                    return org.telegram.messenger.hd.M0(2131743656, null);
                case 4:
                case 5:
                    return org.telegram.messenger.hd.M0(2131743658, null);
                case 6:
                    return org.telegram.messenger.hd.M0(2131751728, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i7, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var, cc ccVar) {
        String str;
        hi.d dVar;
        boolean[] zArr;
        Object Q2;
        cc ccVar2;
        String p10;
        if (!user.bot_can_manage_bots) {
            if (ccVar == null) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T == null) {
                    z10Var.a(null);
                    return;
                }
                ccVar2 = cc.a0(T);
            } else {
                ccVar2 = ccVar;
            }
            if (!TextUtils.isEmpty(org.telegram.messenger.q10.n(user))) {
                p10 = "@" + org.telegram.messenger.q10.n(user);
            } else {
                p10 = org.telegram.messenger.q10.p(user);
            }
            ccVar2.Q(2131624012, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), org.telegram.messenger.hd.a0(null, null, 2131751730, p10))).j();
            z10Var.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashSet<String> hashSet = ((org.telegram.messenger.o0) org.telegram.messenger.np.s1(i7).f25451y7.f25852i0.f14544b).f25690c;
        if (hashSet != null) {
            for (String str2 : hashSet) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        k10.O = linearLayout;
        i9 i9Var = new i9(context);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.r(user);
        i9Var.f(user, t8Var);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        linearLayout.addView(i9Var, c8.ja.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        i5.c.w(textView, 1, 20.0f, null, 2131751731);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131751732, org.telegram.messenger.q10.p(user));
        int i11 = org.telegram.ui.ActionBar.j6.Xc;
        textView2.setText(org.telegram.messenger.g0.Q2(a02, i11, e6Var, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131751734, null), false, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(5);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        k3Var.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(k3Var, d02, M, null, e6Var);
        k3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(k3Var, c8.ja.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, e6Var);
        y8Var.setText(org.telegram.messenger.hd.M0(2131751733, null));
        linearLayout.addView(y8Var, c8.ja.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131751729, null), false, false, 32, e6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.d;
        k3Var2.removeView(i3Var2);
        org.telegram.ui.ActionBar.q6.A(i3Var2, org.telegram.ui.ActionBar.j6.H6, e6Var);
        i3Var2.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.q6.U(textView3, i10, e6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        linearLayout2.addView(textView3, c8.ja.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(i3Var2, c8.ja.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        k3Var2.addView(linearLayout2, c8.ja.c(-1.0f, -1));
        Drawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        k3Var2.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(k3Var2, d03, M2, null, e6Var);
        i3Var2.setImeOptions(6);
        i3Var2.setInputType(145);
        i3Var2.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        k3Var2.setText(str3);
        linearLayout.addView(k3Var2, c8.ja.t(-1, -2, 55, 12, 0, 12, 0));
        i3Var.setOnEditorActionListener(new q0(k3Var2, 2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, e6Var);
        linearLayout.addView(y8Var2, c8.ja.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, c8.ja.o(-1, -2));
        hi.d dVar2 = new hi.d(context, e6Var, true);
        dVar2.setRoundRadius(24);
        dVar2.e();
        dVar2.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        if (dVar2.getBackground() != null) {
            Drawable background = dVar2.getBackground();
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i10);
            dVar2.setBackground(background);
            str = null;
            org.telegram.ui.ActionBar.q6.j(dVar2, background, K, null, e6Var);
        } else {
            str = null;
        }
        dVar2.setText(org.telegram.messenger.hd.M0(2131752589, str));
        linearLayout3.addView(dVar2, c8.ja.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.setText(org.telegram.messenger.hd.M0(2131751741, null));
        linearLayout3.addView(g10, c8.ja.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        k10.U0 = false;
        k10.Q0 = true;
        k10.f29712r = true;
        k10.w0(org.telegram.ui.ActionBar.j6.f28792a7);
        k10.O();
        new WeakReference(k10);
        boolean[] zArr2 = new boolean[1];
        boolean[] zArr3 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        String str4 = str3;
        a2 a2Var = new a2(k10, i7, 8);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            Q2 = org.telegram.messenger.hd.M0(2131751726, null);
            dVar = dVar2;
            zArr = zArr2;
        } else {
            dVar = dVar2;
            zArr = zArr2;
            Q2 = org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131751720, b10), i11, e6Var, a2Var, false);
        }
        yf yfVar = new yf(y8Var2, Q2, e6Var, 5);
        ci.p0 p0Var = new ci.p0(iArr3, runnableArr, iArr2, i7, 22);
        od odVar = new od(25, k3Var2, treeSet);
        oq oqVar = new oq(zArr3, iArr, p0Var, strArr, g10, k3Var2, treeSet, yfVar, y8Var2, e6Var, iArr3, runnableArr, iArr2, i7, a2Var, k10);
        yfVar.run();
        hi.d dVar3 = dVar;
        boolean[] zArr4 = zArr;
        pq pqVar = new pq(zArr3, iArr, k3Var2, treeSet, strArr, oqVar, k3Var, iArr4, p0Var, g10, z10, i7, user, zArr4, z10Var, k10, a2Var, e6Var, y8Var2, context);
        i3Var2.addTextChangedListener(new qq(odVar, oqVar));
        odVar.run();
        if (!TextUtils.isEmpty(str4)) {
            oqVar.run();
        }
        i3Var2.setOnEditorActionListener(new q0(pqVar, 3));
        dVar3.setOnClickListener(new w2(k10, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new e0(pqVar, 10));
        k10.setOnDismissListener(new ki.d4(zArr3, p0Var, zArr4, z10Var, iArr, i7));
        k10.show();
    }
}
