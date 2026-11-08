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
import org.telegram.ui.Components.w70;
import org.telegram.ui.lk0;
public final class h8 implements View.OnClickListener {
    public final int f42598a;
    public final Object f42599b;
    public final org.telegram.ui.ActionBar.f6 f42600c;
    public final Object d;
    public final Object f42601e;

    public h8(fi.d dVar, c20 c20Var, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f42598a = i7;
        this.d = dVar;
        this.f42601e = c20Var;
        this.f42599b = v2Var;
        this.f42600c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        int i7 = this.f42598a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f42600c;
        Object obj = this.f42599b;
        Object obj2 = this.f42601e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, f6Var);
                String M0 = id.M0(2131743141, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743142, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131751599, null), new lk0(26, (Runnable) obj2, (org.telegram.ui.ActionBar.v2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                fi.d dVar = (fi.d) obj3;
                dVar.setLoading(true);
                ((c20) obj2).a(new j4(dVar, (org.telegram.ui.ActionBar.v2) obj, f6Var, 1));
                return;
            case 2:
                q8 q8Var = (q8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = q8Var.f43072a;
                if (!TextUtils.isEmpty(q8Var.f43079s) && q8Var.f43078r != null) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                    LinearLayout linearLayout = new LinearLayout(q8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    TLRPC.User user = q8Var.f43078r;
                    if (user != null) {
                        String k10 = t10.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(q8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f10 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(q8Var.getContext());
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                        w8Var.r(q8Var.f43078r);
                        l9Var.e(q8Var.f43078r, w8Var);
                        linearLayout2.addView(l9Var, c8.ha.r(30, 30, 16));
                        TextView textView = new TextView(q8Var.getContext());
                        int i10 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(id.a0(null, null, 2131742967, k10));
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        linearLayout2.addView(textView, c8.ha.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 55));
                        w70 w70Var = new w70(q8Var.getContext(), null);
                        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
                        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
                        w70Var.setTextSize(1, 16.0f);
                        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        w70Var.setText(org.telegram.messenger.g0.U2(id.a0(null, null, 2131743202, t10.p(q8Var.f43078r)), new n(23, u1VarArr, runnable)));
                        linearLayout.addView(w70Var, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f10 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(q8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    TextView textView2 = new TextView(q8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, f6Var);
                    textView2.setText(e8.c0(q8Var.f43079s));
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                    int i11 = org.telegram.ui.ActionBar.k6.f27796a7;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var2);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var2);
                    int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(w02, org.telegram.ui.ActionBar.k6.w(w03, org.telegram.ui.ActionBar.k6.w0(i12, f6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                    org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i11, i12);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.r6.k(textView2, b02, N, q10, f6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 55, 0, 14, 0, 0));
                    c8.ka.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new j1(q8Var, u1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, q8Var.getContext(), f6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(id.M0(2131747832, null), null);
                    u1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                fi.d dVar2 = (fi.d) obj3;
                t tVar = (t) obj2;
                z2 z2Var = (z2) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    tVar.a(new m(dVar2, z2Var, f6Var, 9));
                    return;
                }
                return;
        }
    }

    public h8(Object obj, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, Object obj2, int i7) {
        this.f42598a = i7;
        this.d = obj;
        this.f42600c = f6Var;
        this.f42601e = runnable;
        this.f42599b = obj2;
    }
}
