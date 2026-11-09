package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x70;
import org.telegram.ui.nk0;
import org.telegram.ui.wb1;
public final class g8 implements View.OnClickListener {
    public final int f42517a;
    public final Object f42518b;
    public final org.telegram.ui.ActionBar.g6 f42519c;
    public final Object d;
    public final Object f42520e;

    public g8(fi.d dVar, c20 c20Var, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        this.f42517a = i7;
        this.d = dVar;
        this.f42520e = c20Var;
        this.f42518b = v2Var;
        this.f42519c = g6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f42517a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42519c;
        Object obj = this.f42518b;
        Object obj2 = this.f42520e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, g6Var);
                String M0 = id.M0(2131743138, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743139, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131751598, null), new nk0(26, (Runnable) obj2, (org.telegram.ui.ActionBar.v2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                fi.d dVar = (fi.d) obj3;
                dVar.setLoading(true);
                ((c20) obj2).a(new i4(dVar, (org.telegram.ui.ActionBar.v2) obj, g6Var, 1));
                return;
            case 2:
                p8 p8Var = (p8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = p8Var.f42990a;
                if (!TextUtils.isEmpty(p8Var.f42997s) && p8Var.f42996r != null) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                    LinearLayout linearLayout = new LinearLayout(p8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = p8Var.f42996r;
                    if (user != null) {
                        String k10 = t10.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(p8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f10 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(p8Var.getContext());
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                        w8Var.r(p8Var.f42996r);
                        l9Var.e(p8Var.f42996r, w8Var);
                        linearLayout2.addView(l9Var, c8.ha.r(30, 30, 16));
                        TextView textView = new TextView(p8Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.l6.G6;
                        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(id.a0(null, null, 2131742964, k10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ha.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 55));
                        x70 x70Var = new x70(p8Var.getContext(), null);
                        org.telegram.ui.ActionBar.s6.U(x70Var, i10, g6Var);
                        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var);
                        x70Var.setTextSize(1, 16.0f);
                        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        x70Var.setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131743199, t10.p(p8Var.f42996r)), new wb1(24, u1VarArr, runnable)));
                        linearLayout.addView(x70Var, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(p8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(p8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.G6, g6Var);
                    textView2.setText(d8.c0(p8Var.f42997s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.l6.f27809a7;
                    int w02 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var2);
                    int w03 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var2);
                    int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.l6.b0(w02, org.telegram.ui.ActionBar.l6.w(w03, org.telegram.ui.ActionBar.l6.w0(i12, g6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
                    org.telegram.ui.ActionBar.o6 p10 = org.telegram.ui.ActionBar.s6.p(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.s6.j(textView2, b02, M, p10, g6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.ka.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new i1(p8Var, u1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, p8Var.getContext(), g6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(id.M0(2131747831, null), null);
                    u1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                fi.d dVar2 = (fi.d) obj3;
                s sVar = (s) obj2;
                y2 y2Var = (y2) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    sVar.a(new m(dVar2, y2Var, g6Var, 9));
                    return;
                }
                return;
        }
    }

    public g8(Object obj, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable, Object obj2, int i7) {
        this.f42517a = i7;
        this.d = obj;
        this.f42519c = g6Var;
        this.f42520e = runnable;
        this.f42518b = obj2;
    }
}
