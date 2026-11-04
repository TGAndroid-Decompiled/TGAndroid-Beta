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
public abstract class lq {
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            String s6 = a1.g.s(new StringBuilder("'"), (String) arrayList.get(i3), "'");
            if (i3 == 0) {
                str2 = s6;
            } else if (i3 == arrayList.size() - 1) {
                str2 = org.telegram.messenger.bd.a0(null, null, 2131751720, str2, s6);
            } else {
                str2 = org.telegram.messenger.bd.a0(null, null, 2131751722, str2, s6);
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

    public static CharSequence d(int i3, String str, TreeSet treeSet, String str2, o2 o2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String a02;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            upperCase.getClass();
            char c2 = 65535;
            switch (upperCase.hashCode()) {
                case -1970758171:
                    if (upperCase.equals("OWNER_USERNAMES_LIMIT_EXCEEDED")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1470066023:
                    if (upperCase.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1089285943:
                    if (upperCase.equals("ADDITIONAL_USERNAME_SUFFIX_MISSING")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 288843630:
                    if (upperCase.equals("USERNAME_INVALID")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 460390132:
                    if (upperCase.equals("USERNAME_PURCHASE_AVAILABLE")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 533175271:
                    if (upperCase.equals("USERNAME_OCCUPIED")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1110046033:
                    if (upperCase.equals("BOT_USERNAMES_LIMIT_EXCEEDED")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return org.telegram.messenger.bd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(i3).f23167x7.N.f13798b).f23620c), b(treeSet));
                case 1:
                    String c10 = c(str, treeSet);
                    if (c10 == null) {
                        a02 = org.telegram.messenger.bd.M0(2131751724, null);
                    } else {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131751725, c10);
                    }
                    return org.telegram.messenger.g0.Q2(a02, org.telegram.ui.ActionBar.k6.Uc, e6Var, o2Var, false);
                case 2:
                    return org.telegram.messenger.bd.a0(null, null, 2131751723, b(treeSet));
                case 3:
                    return org.telegram.messenger.bd.M0(2131743666, null);
                case 4:
                case 5:
                    return org.telegram.messenger.bd.M0(2131743668, null);
                case 6:
                    return org.telegram.messenger.bd.M0(2131751729, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i3, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var, fc fcVar) {
        String str;
        String str2;
        org.telegram.ui.Cells.i3 i3Var;
        CharSequence Q2;
        fc fcVar2;
        String p10;
        if (!user.bot_can_manage_bots) {
            if (fcVar == null) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    u10Var.a(null);
                    return;
                }
                fcVar2 = fc.a0(T);
            } else {
                fcVar2 = fcVar;
            }
            if (!TextUtils.isEmpty(org.telegram.messenger.l10.n(user))) {
                p10 = "@" + org.telegram.messenger.l10.n(user);
            } else {
                p10 = org.telegram.messenger.l10.p(user);
            }
            fcVar2.Q(2131624011, 36, org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), org.telegram.messenger.bd.a0(null, null, 2131751731, p10))).j();
            u10Var.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashSet<String> hashSet = ((org.telegram.messenger.o0) org.telegram.messenger.hp.s1(i3).f23167x7.f24660i0.f13688b).f24470c;
        if (hashSet != null) {
            for (String str3 : hashSet) {
                if (!TextUtils.isEmpty(str3)) {
                    treeSet.add(str3.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        l10.O = linearLayout;
        k9 k9Var = new k9(context);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        k9Var.e(user, u8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        linearLayout.addView(k9Var, b8.mf.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        k2.p1.u(textView, 1, 20.0f, null, 2131751732);
        textView.setGravity(17);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        String a02 = org.telegram.messenger.bd.a0(null, null, 2131751733, org.telegram.messenger.l10.p(user));
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        textView2.setText(org.telegram.messenger.g0.Q2(a02, i11, e6Var, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131751735, null), false, false, -1, e6Var);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var.d;
        i3Var2.setImeOptions(5);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        k3Var.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(k3Var, d02, N, null, e6Var);
        k3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(k3Var, b8.mf.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, e6Var);
        y8Var.setText(org.telegram.messenger.bd.M0(2131751734, null));
        linearLayout.addView(y8Var, b8.mf.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131751730, null), false, false, 32, e6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.i3 i3Var3 = k3Var2.d;
        k3Var2.removeView(i3Var3);
        org.telegram.ui.ActionBar.r6.B(i3Var3, org.telegram.ui.ActionBar.k6.H6, e6Var);
        i3Var3.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(63.0f), org.telegram.messenger.g0.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.r6.V(textView3, i10, e6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        linearLayout2.addView(textView3, b8.mf.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(i3Var3, b8.mf.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        k3Var2.addView(linearLayout2, b8.mf.c(-1.0f, -1));
        Drawable d03 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        k3Var2.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(k3Var2, d03, N2, null, e6Var);
        i3Var3.setImeOptions(6);
        i3Var3.setInputType(145);
        i3Var3.setSingleLine(true);
        String str4 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str4 != null) {
            str4 = str4.trim();
        }
        k3Var2.setText(str4);
        linearLayout.addView(k3Var2, b8.mf.t(-1, -2, 55, 12, 0, 12, 0));
        i3Var2.setOnEditorActionListener(new s0(k3Var2, 2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, e6Var);
        linearLayout.addView(y8Var2, b8.mf.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, b8.mf.o(-1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.1f, i10);
            dVar.setBackground(background);
            str = null;
            org.telegram.ui.ActionBar.r6.k(dVar, background, L2, null, e6Var);
        } else {
            str = null;
        }
        dVar.setText(org.telegram.messenger.bd.M0(2131752589, str));
        linearLayout3.addView(dVar, b8.mf.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(org.telegram.messenger.bd.M0(2131751742, null));
        linearLayout3.addView(h, b8.mf.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        l10.U0 = false;
        l10.Q0 = true;
        l10.f28613r = true;
        l10.w0(org.telegram.ui.ActionBar.k6.f27824a7);
        l10.N();
        new WeakReference(l10);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        o2 o2Var = new o2(l10, i3, 5);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            Q2 = org.telegram.messenger.bd.M0(2131751727, null);
            str2 = str4;
            i3Var = i3Var3;
        } else {
            str2 = str4;
            i3Var = i3Var3;
            Q2 = org.telegram.messenger.g0.Q2(org.telegram.messenger.bd.a0(null, null, 2131751721, b10), i11, e6Var, o2Var, false);
        }
        e7 e7Var = new e7(y8Var2, Q2, e6Var, 7);
        bi.q0 q0Var = new bi.q0(iArr3, runnableArr, iArr2, i3, 23);
        cl clVar = new cl(6, k3Var2, treeSet);
        hq hqVar = new hq(zArr2, iArr, q0Var, strArr, h, k3Var2, treeSet, e7Var, y8Var2, e6Var, iArr3, runnableArr, iArr2, i3, o2Var, l10);
        e7Var.run();
        org.telegram.ui.Cells.i3 i3Var4 = i3Var;
        iq iqVar = new iq(zArr2, iArr, k3Var2, treeSet, strArr, hqVar, k3Var, iArr4, q0Var, h, z10, i3, user, zArr, u10Var, l10, o2Var, e6Var, y8Var2, context);
        i3Var4.addTextChangedListener(new jq(clVar, hqVar));
        clVar.run();
        if (!TextUtils.isEmpty(str2)) {
            hqVar.run();
        }
        i3Var4.setOnEditorActionListener(new s0(iqVar, 3));
        dVar.setOnClickListener(new w2(l10, 2));
        h.setEnabled(false);
        h.setOnClickListener(new f0(iqVar, 9));
        l10.setOnDismissListener(new ii.i4(zArr2, q0Var, zArr, u10Var, iArr, i3));
        l10.show();
    }
}
