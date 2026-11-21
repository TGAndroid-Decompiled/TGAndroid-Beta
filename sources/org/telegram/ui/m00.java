package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public abstract class m00 {
    public static void a(Activity activity, int i7, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        int i11;
        String str2;
        String b10;
        String str3;
        String str4;
        org.telegram.ui.Components.mp0 mp0Var;
        int i12;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) activity, h6Var, false);
        w2Var.Q(org.telegram.ui.ActionBar.m6.f29451h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
        linearLayout.addView(frameLayout, c8.ma.t(80, 80, 1, 0, 16, 0, 16));
        ?? imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (i7 == 0) {
            i10 = 70;
        } else {
            i10 = 78;
        }
        if (i7 == 0) {
            i11 = 2131624031;
        } else {
            i11 = 2131624030;
        }
        imageView.f(i11, i10, i10, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i7 == 0) {
            imageView.setScaleX(0.86f);
            imageView.setScaleY(0.86f);
        } else {
            imageView.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        }
        frameLayout.addView((View) imageView, c8.ma.r(-1, -1, 17));
        String str5 = "";
        if (tLObject instanceof TLRPC.User) {
            str2 = org.telegram.messenger.o10.q((TLRPC.User) tLObject);
        } else if (!(tLObject instanceof TLRPC.Chat)) {
            str2 = "";
        } else {
            str2 = ((TLRPC.Chat) tLObject).title;
        }
        String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i7 == 0) {
            String a02 = org.telegram.messenger.gd.a0(null, null, 2131750495, p5.c.k("@", str));
            String Q = org.telegram.messenger.gd.Q(tL_collectibleInfo.purchase_date);
            if (!TextUtils.isEmpty(f10)) {
                str5 = a8.p0.p("(", f10, ")");
            }
            str3 = org.telegram.messenger.gd.a0(null, null, 2131750497, Q, f11, str5);
            b10 = p5.c.m(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).X2, "/", str, new StringBuilder());
            str4 = a02;
        } else if (i7 == 1) {
            pf.b c10 = pf.b.c();
            String a03 = org.telegram.messenger.gd.a0(null, null, 2131750499, c10.b("+" + str));
            String Q2 = org.telegram.messenger.gd.Q((long) tL_collectibleInfo.purchase_date);
            if (!TextUtils.isEmpty(f10)) {
                str5 = a8.p0.p("(", f10, ")");
            }
            String a04 = org.telegram.messenger.gd.a0(null, null, 2131750500, Q2, f11, str5);
            pf.b c11 = pf.b.c();
            b10 = c11.b("+" + str);
            str3 = a04;
            str4 = a03;
        } else {
            return;
        }
        if (b10 != null) {
            mp0Var = new org.telegram.ui.Components.mp0(b10, i7, w2Var, h6Var);
        } else {
            mp0Var = null;
        }
        SpannableStringBuilder T2 = org.telegram.messenger.g0.T2(str4, mp0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131231956, 0);
        nqVar.d = false;
        nqVar.F = org.telegram.messenger.g0.L(13.0f);
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(str3), spannableString, "TON");
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(activity, null);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.m6.f29486j5;
        org.telegram.ui.ActionBar.t6.U(m80Var, i14, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.f29578o6, h6Var);
        m80Var.setTextSize(1, 16.0f);
        m80Var.setText(T2);
        linearLayout.addView(m80Var, c8.ma.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L3 = org.telegram.messenger.g0.L(28.0f);
        int L4 = org.telegram.messenger.g0.L(28.0f);
        int i15 = org.telegram.ui.ActionBar.m6.Ti;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L3, L4, org.telegram.ui.ActionBar.m6.w0(i15, h6Var));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
        frameLayout2.setBackground(e02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, e02, M2, null, h6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        q9Var.f(tLObject, b9Var);
        frameLayout2.addView(q9Var, c8.ma.e(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i14, h6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, c8.ma.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, c8.ma.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView2, i14, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(K2);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 1, 32, 0, 32, 19));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        eVar.i(org.telegram.messenger.gd.N0(2131750496, null), false, true);
        eVar.setOnClickListener(new org.telegram.ui.Components.q31(16, activity, tL_collectibleInfo));
        linearLayout.addView(eVar, c8.ma.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (mp0Var != null) {
            hi.e eVar2 = new hi.e(activity, h6Var, true);
            eVar2.setRoundRadius(24);
            eVar2.e();
            if (i7 == 0) {
                i12 = 2131750498;
            } else {
                i12 = 2131750501;
            }
            eVar2.i(org.telegram.messenger.gd.N0(i12, null), false, true);
            eVar2.setOnClickListener(new org.telegram.ui.Components.q31(17, mp0Var, w2Var));
            linearLayout.addView(eVar2, c8.ma.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        w2Var.O = linearLayout;
        w2Var.show();
    }
}
