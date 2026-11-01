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
public abstract class vq {
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
            String r10 = a1.g.r(new StringBuilder("'"), (String) arrayList.get(i10), "'");
            if (i10 == 0) {
                str2 = r10;
            } else if (i10 == arrayList.size() - 1) {
                str2 = org.telegram.messenger.dd.a0(null, null, 2131751720, str2, r10);
            } else {
                str2 = org.telegram.messenger.dd.a0(null, null, 2131751722, str2, r10);
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

    public static CharSequence d(int i10, String str, TreeSet treeSet, String str2, qq qqVar, org.telegram.ui.ActionBar.p6 p6Var) {
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
                    return org.telegram.messenger.dd.a0(null, null, 2131751726, Integer.valueOf(((org.telegram.messenger.l0) org.telegram.messenger.wp.r1(i10).f19300y7.N.f10701a).f16855c), b(treeSet));
                case 1:
                    String c11 = c(str, treeSet);
                    if (c11 == null) {
                        a02 = org.telegram.messenger.dd.L0(2131751724, null);
                    } else {
                        a02 = org.telegram.messenger.dd.a0(null, null, 2131751725, c11);
                    }
                    return org.telegram.messenger.i0.P2(a02, org.telegram.ui.ActionBar.t6.Uc, p6Var, qqVar, false);
                case 2:
                    return org.telegram.messenger.dd.a0(null, null, 2131751723, b(treeSet));
                case 3:
                    return org.telegram.messenger.dd.L0(2131743682, null);
                case 4:
                case 5:
                    return org.telegram.messenger.dd.L0(2131743684, null);
                case 6:
                    return org.telegram.messenger.dd.L0(2131751729, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var, cc ccVar) {
        String str;
        org.telegram.ui.Cells.k3 k3Var;
        CharSequence P2;
        cc ccVar2;
        String p5;
        if (!user.bot_can_manage_bots) {
            if (ccVar == null) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T == null) {
                    r20Var.a(null);
                    return;
                }
                ccVar2 = cc.a0(T);
            } else {
                ccVar2 = ccVar;
            }
            if (!TextUtils.isEmpty(org.telegram.messenger.i20.n(user))) {
                p5 = "@" + org.telegram.messenger.i20.n(user);
            } else {
                p5 = org.telegram.messenger.i20.p(user);
            }
            ccVar2.Q(2131624011, 36, org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.dd.a0(null, null, 2131751731, p5))).j();
            r20Var.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        HashSet<String> hashSet = ((org.telegram.messenger.r0) org.telegram.messenger.wp.r1(i10).f19300y7.f18031i0.f10701a).f17875c;
        if (hashSet != null) {
            for (String str2 : hashSet) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        k10.N = linearLayout;
        g9 g9Var = new g9(context);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(user);
        g9Var.e(user, r8Var);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(40.0f));
        linearLayout.addView(g9Var, w7.b6.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        sc.e.u(textView, 1, 20.0f, null, 2131751732);
        textView.setGravity(17);
        linearLayout.addView(textView, w7.b6.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setTextSize(1, 14.0f);
        String a02 = org.telegram.messenger.dd.a0(null, null, 2131751733, org.telegram.messenger.i20.p(user));
        int i12 = org.telegram.ui.ActionBar.t6.Uc;
        textView2.setText(org.telegram.messenger.i0.P2(a02, i12, p6Var, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131751735, null), false, false, -1, p6Var);
        org.telegram.ui.Cells.k3 k3Var2 = m3Var.d;
        k3Var2.setImeOptions(5);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        m3Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(m3Var, d02, N, null, p6Var);
        m3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(m3Var, w7.b6.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, p6Var);
        b9Var.setText(org.telegram.messenger.dd.L0(2131751734, null));
        linearLayout.addView(b9Var, w7.b6.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131751730, null), false, false, 32, p6Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.k3 k3Var3 = m3Var2.d;
        m3Var2.removeView(k3Var3);
        org.telegram.ui.ActionBar.a7.B(k3Var3, org.telegram.ui.ActionBar.t6.H6, p6Var);
        k3Var3.setPadding(0, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(63.0f), org.telegram.messenger.i0.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.a7.V(textView3, i11, p6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f));
        linearLayout2.addView(textView3, w7.b6.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout2.addView(k3Var3, w7.b6.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        m3Var2.addView(linearLayout2, w7.b6.c(-1.0f, -1));
        Drawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        m3Var2.setBackground(d03);
        org.telegram.ui.ActionBar.a7.k(m3Var2, d03, N2, null, p6Var);
        k3Var3.setImeOptions(6);
        k3Var3.setInputType(145);
        k3Var3.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        m3Var2.setText(str3);
        linearLayout.addView(m3Var2, w7.b6.t(-1, -2, 55, 12, 0, 12, 0));
        k3Var2.setOnEditorActionListener(new t0(m3Var2, 2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, p6Var);
        linearLayout.addView(b9Var2, w7.b6.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        linearLayout3.setClipToPadding(false);
        linearLayout.addView(linearLayout3, w7.b6.o(-1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.1f, i11);
            dVar.setBackground(background);
            str = null;
            org.telegram.ui.ActionBar.a7.k(dVar, background, L2, null, p6Var);
        } else {
            str = null;
        }
        dVar.setText(org.telegram.messenger.dd.L0(2131752589, str));
        linearLayout3.addView(dVar, w7.b6.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        vh.d i14 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        i14.setText(org.telegram.messenger.dd.L0(2131751742, null));
        linearLayout3.addView(i14, w7.b6.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        k10.T0 = false;
        k10.P0 = true;
        k10.f21612r = true;
        k10.w0(org.telegram.ui.ActionBar.t6.f20873a7);
        k10.O();
        new WeakReference(k10);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        String str4 = str3;
        qq qqVar = new qq(k10, i10, 0);
        String b10 = b(treeSet);
        if (TextUtils.isEmpty(b10)) {
            P2 = org.telegram.messenger.dd.L0(2131751727, null);
            k3Var = k3Var3;
        } else {
            k3Var = k3Var3;
            P2 = org.telegram.messenger.i0.P2(org.telegram.messenger.dd.a0(null, null, 2131751721, b10), i12, p6Var, qqVar, false);
        }
        jg jgVar = new jg(b9Var2, P2, p6Var, 3);
        ag.g3 g3Var = new ag.g3(iArr3, runnableArr, iArr2, i10, 17);
        cd cdVar = new cd(25, m3Var2, treeSet);
        rq rqVar = new rq(zArr2, iArr, g3Var, strArr, i14, m3Var2, treeSet, jgVar, b9Var2, p6Var, iArr3, runnableArr, iArr2, i10, qqVar, k10);
        jgVar.run();
        org.telegram.ui.Cells.k3 k3Var4 = k3Var;
        sq sqVar = new sq(zArr2, iArr, m3Var2, treeSet, strArr, rqVar, m3Var, iArr4, g3Var, i14, z10, i10, user, zArr, r20Var, k10, qqVar, p6Var, b9Var2, context);
        k3Var4.addTextChangedListener(new tq(cdVar, rqVar));
        cdVar.run();
        if (!TextUtils.isEmpty(str4)) {
            rqVar.run();
        }
        k3Var4.setOnEditorActionListener(new t0(sqVar, 3));
        dVar.setOnClickListener(new y2(k10, 2));
        i14.setEnabled(false);
        i14.setOnClickListener(new h0(sqVar, 8));
        k10.setOnDismissListener(new pq(zArr2, g3Var, zArr, r20Var, iArr, i10));
        k10.show();
    }
}
