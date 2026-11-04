package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.s70;
import org.telegram.ui.e51;
import org.telegram.ui.ma1;
import org.telegram.ui.na1;
public final class h8 implements View.OnClickListener {
    public final int f42628a;
    public final Object f42629b;
    public final org.telegram.ui.ActionBar.e6 f42630c;
    public final Object d;
    public final Object f42631e;

    public h8(gi.d dVar, u10 u10Var, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.f42628a = i3;
        this.d = dVar;
        this.f42631e = u10Var;
        this.f42629b = t2Var;
        this.f42630c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i3 = this.f42628a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f42630c;
        Object obj = this.f42629b;
        Object obj2 = this.f42631e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, e6Var);
                String M0 = bd.M0(2131743148, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131743149, null);
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.k(bd.M0(2131751599, null), new na1(4, (Runnable) obj2, (org.telegram.ui.ActionBar.t2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                gi.d dVar = (gi.d) obj3;
                dVar.setLoading(true);
                ((u10) obj2).a(new i4(dVar, (org.telegram.ui.ActionBar.t2) obj, e6Var, 1));
                return;
            case 2:
                q8 q8Var = (q8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = q8Var.f43092a;
                if (!TextUtils.isEmpty(q8Var.f43099s) && q8Var.f43098r != null) {
                    org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                    LinearLayout linearLayout = new LinearLayout(q8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = q8Var.f43098r;
                    if (user != null) {
                        String k10 = l10.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(q8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f10 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(q8Var.getContext());
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var.r(q8Var.f43098r);
                        k9Var.e(q8Var.f43098r, u8Var);
                        linearLayout2.addView(k9Var, mf.r(30, 30, 16));
                        TextView textView = new TextView(q8Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(bd.a0(null, null, 2131742974, k10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, mf.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, mf.r(-1, -2, 55));
                        s70 s70Var = new s70(q8Var.getContext(), null);
                        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
                        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
                        s70Var.setTextSize(1, 16.0f);
                        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        s70Var.setText(org.telegram.messenger.g0.U2(bd.a0(null, null, 2131743209, l10.p(q8Var.f43098r)), new ma1(28, s1VarArr, runnable)));
                        linearLayout.addView(s70Var, mf.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(q8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(q8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, e6Var);
                    textView2.setText(e8.c0(q8Var.f43099s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.k6.f27824a7;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var2);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var2);
                    int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(w02, org.telegram.ui.ActionBar.k6.w(w03, org.telegram.ui.ActionBar.k6.w0(i12, e6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                    org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.r6.k(textView2, b02, N, q10, e6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, mf.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, mf.t(-1, -2, 55, 0, 14, 0, 0));
                    pf.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new h1(q8Var, s1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, q8Var.getContext(), e6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(bd.M0(2131747839, null), null);
                    s1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                gi.d dVar2 = (gi.d) obj3;
                e51 e51Var = (e51) obj2;
                y2 y2Var = (y2) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    e51Var.a(new m(dVar2, y2Var, e6Var, 9));
                    return;
                }
                return;
        }
    }

    public h8(Object obj, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, Object obj2, int i3) {
        this.f42628a = i3;
        this.d = obj;
        this.f42630c = e6Var;
        this.f42631e = runnable;
        this.f42629b = obj2;
    }
}
