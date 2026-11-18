package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k80;
import org.telegram.ui.aj0;
import org.telegram.ui.p51;
public final class w8 implements View.OnClickListener {
    public final int f45222a;
    public final Object f45223b;
    public final org.telegram.ui.ActionBar.i6 f45224c;
    public final Object d;
    public final Object f45225e;

    public w8(hi.d dVar, x10 x10Var, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f45222a = i7;
        this.d = dVar;
        this.f45225e = x10Var;
        this.f45223b = x2Var;
        this.f45224c = i6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f45222a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f45224c;
        Object obj = this.f45223b;
        Object obj2 = this.f45225e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, i6Var);
                String M0 = gd.M0(2131742900, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131742901, null);
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.k(gd.M0(2131751587, null), new aj0(28, (Runnable) obj2, (org.telegram.ui.ActionBar.x2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                hi.d dVar = (hi.d) obj3;
                dVar.setLoading(true);
                ((x10) obj2).a(new w4(dVar, (org.telegram.ui.ActionBar.x2) obj, i6Var, 1));
                return;
            case 2:
                g9 g9Var = (g9) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = g9Var.f44271a;
                if (!TextUtils.isEmpty(g9Var.f44278s) && g9Var.f44277r != null) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                    LinearLayout linearLayout = new LinearLayout(g9Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = g9Var.f44277r;
                    if (user != null) {
                        String l10 = o10.l(user);
                        f10 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(g9Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(g9Var.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                        b9Var.r(g9Var.f44277r);
                        q9Var.f(g9Var.f44277r, b9Var);
                        linearLayout2.addView(q9Var, c8.ma.r(30, 30, 16));
                        TextView textView = new TextView(g9Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(gd.a0(null, null, 2131742706, l10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ma.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ma.r(-1, -2, 55));
                        k80 k80Var = new k80(g9Var.getContext(), null);
                        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
                        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
                        k80Var.setTextSize(1, 16.0f);
                        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        k80Var.setText(org.telegram.messenger.g0.T2(gd.a0(null, null, 2131742961, o10.q(g9Var.f44277r)), new c5(11, u1VarArr, runnable)));
                        linearLayout.addView(k80Var, c8.ma.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(g9Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(g9Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    textView2.setText(u8.c0(g9Var.f44278s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.n6.f29337a7;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var2);
                    int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var2);
                    int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(w02, org.telegram.ui.ActionBar.n6.w(w03, org.telegram.ui.ActionBar.n6.w0(i12, i6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                    org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.u6.j(textView2, b02, M, p10, i6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.ra.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new r1(g9Var, u1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, g9Var.getContext(), i6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(gd.M0(2131747638, null), null);
                    u1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                hi.d dVar2 = (hi.d) obj3;
                p51 p51Var = (p51) obj2;
                e3 e3Var = (e3) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    p51Var.a(new o(dVar2, e3Var, i6Var, 10));
                    return;
                }
                return;
        }
    }

    public w8(Object obj, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, Object obj2, int i7) {
        this.f45222a = i7;
        this.d = obj;
        this.f45224c = i6Var;
        this.f45225e = runnable;
        this.f45223b = obj2;
    }
}
