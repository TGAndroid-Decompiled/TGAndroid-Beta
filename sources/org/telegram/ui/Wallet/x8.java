package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j80;
import org.telegram.ui.a31;
import org.telegram.ui.yi0;
public final class x8 implements View.OnClickListener {
    public final int f45394a;
    public final Object f45395b;
    public final org.telegram.ui.ActionBar.i6 f45396c;
    public final Object d;
    public final Object f45397e;

    public x8(hi.e eVar, w10 w10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f45394a = i7;
        this.d = eVar;
        this.f45397e = w10Var;
        this.f45395b = w2Var;
        this.f45396c = i6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f45394a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f45396c;
        Object obj = this.f45395b;
        Object obj2 = this.f45397e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, i6Var);
                String N0 = gd.N0(2131742887, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742888, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131751586, null), new yi0(28, (Runnable) obj2, (org.telegram.ui.ActionBar.w2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                hi.e eVar = (hi.e) obj3;
                eVar.setLoading(true);
                ((w10) obj2).a(new x4(eVar, (org.telegram.ui.ActionBar.w2) obj, i6Var, 1));
                return;
            case 2:
                h9 h9Var = (h9) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = h9Var.f44443a;
                if (!TextUtils.isEmpty(h9Var.f44450s) && h9Var.f44449r != null) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                    LinearLayout linearLayout = new LinearLayout(h9Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = h9Var.f44449r;
                    if (user != null) {
                        String l10 = n10.l(user);
                        f10 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(h9Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(h9Var.getContext());
                        p9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                        a9Var.r(h9Var.f44449r);
                        p9Var.f(h9Var.f44449r, a9Var);
                        linearLayout2.addView(p9Var, c8.na.r(30, 30, 16));
                        TextView textView = new TextView(h9Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(gd.a0(null, null, 2131742693, l10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.na.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.na.r(-1, -2, 55));
                        j80 j80Var = new j80(h9Var.getContext(), null);
                        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
                        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
                        j80Var.setTextSize(1, 16.0f);
                        j80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        j80Var.setText(org.telegram.messenger.g0.T2(gd.a0(null, null, 2131742948, n10.q(h9Var.f44449r)), new r(17, t1VarArr, runnable)));
                        linearLayout.addView(j80Var, c8.na.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(h9Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(h9Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    textView2.setText(v8.c0(h9Var.f44450s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.n6.f29394a7;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var2);
                    int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var2);
                    int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(w02, org.telegram.ui.ActionBar.n6.w(w03, org.telegram.ui.ActionBar.n6.w0(i12, i6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                    org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.u6.j(textView2, b02, M, p10, i6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.na.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.na.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.sa.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new s1(h9Var, t1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, h9Var.getContext(), i6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(gd.N0(2131747637, null), null);
                    t1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                hi.e eVar2 = (hi.e) obj3;
                a31 a31Var = (a31) obj2;
                f3 f3Var = (f3) obj;
                if (!eVar2.R) {
                    eVar2.setLoading(true);
                    a31Var.a(new o(eVar2, f3Var, i6Var, 10));
                    return;
                }
                return;
        }
    }

    public x8(Object obj, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, Object obj2, int i7) {
        this.f45394a = i7;
        this.d = obj;
        this.f45396c = i6Var;
        this.f45397e = runnable;
        this.f45395b = obj2;
    }
}
