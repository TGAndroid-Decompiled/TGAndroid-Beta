package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m80;
import org.telegram.ui.aj0;
import org.telegram.ui.p51;
public final class w8 implements View.OnClickListener {
    public final int f45232a;
    public final Object f45233b;
    public final org.telegram.ui.ActionBar.h6 f45234c;
    public final Object d;
    public final Object f45235e;

    public w8(hi.d dVar, y10 y10Var, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.f45232a = i7;
        this.d = dVar;
        this.f45235e = y10Var;
        this.f45233b = w2Var;
        this.f45234c = h6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f45232a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f45234c;
        Object obj = this.f45233b;
        Object obj2 = this.f45235e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, h6Var);
                String N0 = hd.N0(2131742894, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131742895, null);
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.k(hd.N0(2131751586, null), new aj0(28, (Runnable) obj2, (org.telegram.ui.ActionBar.w2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                hi.d dVar = (hi.d) obj3;
                dVar.setLoading(true);
                ((y10) obj2).a(new w4(dVar, (org.telegram.ui.ActionBar.w2) obj, h6Var, 1));
                return;
            case 2:
                g9 g9Var = (g9) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = g9Var.f44281a;
                if (!TextUtils.isEmpty(g9Var.f44288s) && g9Var.f44287r != null) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                    LinearLayout linearLayout = new LinearLayout(g9Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = g9Var.f44287r;
                    if (user != null) {
                        String l10 = p10.l(user);
                        f10 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(g9Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(g9Var.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                        b9Var.r(g9Var.f44287r);
                        q9Var.f(g9Var.f44287r, b9Var);
                        linearLayout2.addView(q9Var, c8.na.r(30, 30, 16));
                        TextView textView = new TextView(g9Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(hd.a0(null, null, 2131742700, l10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.na.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.na.r(-1, -2, 55));
                        m80 m80Var = new m80(g9Var.getContext(), null);
                        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
                        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
                        m80Var.setTextSize(1, 16.0f);
                        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        m80Var.setText(org.telegram.messenger.g0.T2(hd.a0(null, null, 2131742955, p10.q(g9Var.f44287r)), new c5(11, t1VarArr, runnable)));
                        linearLayout.addView(m80Var, c8.na.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(g9Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(g9Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    textView2.setText(u8.c0(g9Var.f44288s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.m6.f29290a7;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var2);
                    int w03 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var2);
                    int i12 = org.telegram.ui.ActionBar.m6.f29439i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(w02, org.telegram.ui.ActionBar.m6.w(w03, org.telegram.ui.ActionBar.m6.w0(i12, h6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                    org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.t6.j(textView2, b02, M, p10, h6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.na.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.na.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.sa.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new r1(g9Var, t1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, g9Var.getContext(), h6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(hd.N0(2131747637, null), null);
                    t1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                hi.d dVar2 = (hi.d) obj3;
                p51 p51Var = (p51) obj2;
                e3 e3Var = (e3) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    p51Var.a(new o(dVar2, e3Var, h6Var, 10));
                    return;
                }
                return;
        }
    }

    public w8(Object obj, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, Object obj2, int i7) {
        this.f45232a = i7;
        this.d = obj;
        this.f45234c = h6Var;
        this.f45235e = runnable;
        this.f45233b = obj2;
    }
}
