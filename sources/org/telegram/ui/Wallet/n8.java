package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ep0;
import org.telegram.ui.f11;
public final class n8 implements View.OnClickListener {
    public final int f34950a;
    public final Object f34951b;
    public final org.telegram.ui.ActionBar.p6 f34952c;
    public final Object d;
    public final Object e;

    public n8(Object obj, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, Object obj2, int i10) {
        this.f34950a = i10;
        this.d = obj;
        this.f34952c = p6Var;
        this.e = runnable;
        this.f34951b = obj2;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        int i10 = this.f34950a;
        org.telegram.ui.ActionBar.p6 p6Var = this.f34952c;
        Object obj = this.f34951b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, p6Var);
                String L0 = cd.L0(2131743164, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131743165, null);
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.k(cd.L0(2131751599, null), new ep0(25, (Runnable) obj2, (org.telegram.ui.ActionBar.z2) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 1:
                vh.d dVar = (vh.d) obj3;
                dVar.setLoading(true);
                ((q20) obj2).a(new k4(dVar, (org.telegram.ui.ActionBar.z2) obj, p6Var, 1));
                return;
            case 2:
                w8 w8Var = (w8) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.p6 p6Var2 = w8Var.f35366a;
                if (!TextUtils.isEmpty(w8Var.f35372s) && w8Var.f35371r != null) {
                    org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                    LinearLayout linearLayout = new LinearLayout(w8Var.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                    TLRPC.User user = w8Var.f35371r;
                    if (user != null) {
                        String k10 = h20.k(user);
                        LinearLayout linearLayout2 = new LinearLayout(w8Var.getContext());
                        linearLayout2.setOrientation(0);
                        f7 = 4.0f;
                        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(w8Var.getContext());
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
                        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                        r8Var.r(w8Var.f35371r);
                        g9Var.e(w8Var.f35371r, r8Var);
                        linearLayout2.addView(g9Var, w7.b6.r(30, 30, 16));
                        TextView textView = new TextView(w8Var.getContext());
                        int i11 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(cd.a0(null, null, 2131742990, k10));
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        linearLayout2.addView(textView, w7.b6.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, w7.b6.r(-1, -2, 55));
                        p80 p80Var = new p80(w8Var.getContext(), null);
                        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
                        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
                        p80Var.setTextSize(1, 16.0f);
                        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        p80Var.setText(org.telegram.messenger.i0.T2(cd.a0(null, null, 2131743225, h20.p(w8Var.f35371r)), new k3(16, x1VarArr, runnable)));
                        linearLayout.addView(p80Var, w7.b6.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f7 = 4.0f;
                    }
                    FrameLayout frameLayout = new FrameLayout(w8Var.getContext());
                    frameLayout.setPadding(org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(f7), 0);
                    TextView textView2 = new TextView(w8Var.getContext());
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.G6, p6Var);
                    textView2.setText(k8.b0(w8Var.f35372s));
                    textView2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f));
                    textView2.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
                    int i12 = org.telegram.ui.ActionBar.t6.f20872a7;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var2);
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var2);
                    int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
                    org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(w02, org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.w0(i13, p6Var2)), 10, 10);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                    org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i12, i13);
                    textView2.setBackground(b02);
                    org.telegram.ui.ActionBar.a7.k(textView2, b02, N, q6, p6Var);
                    textView2.setGravity(17);
                    frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout, w7.b6.t(-1, -2, 55, 0, 14, 0, 0));
                    w7.e6.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new j1(w8Var, x1VarArr, runnable2, 3));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, w8Var.getContext(), p6Var);
                    alertDialog$Builder2.o(linearLayout);
                    alertDialog$Builder2.k(cd.L0(2131747847, null), null);
                    x1VarArr[0] = alertDialog$Builder2.p();
                    return;
                }
                return;
            default:
                vh.d dVar2 = (vh.d) obj3;
                f11 f11Var = (f11) obj2;
                z2 z2Var = (z2) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    f11Var.a(new m(dVar2, z2Var, p6Var, 9));
                    return;
                }
                return;
        }
    }

    public n8(vh.d dVar, q20 q20Var, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f34950a = i10;
        this.d = dVar;
        this.e = q20Var;
        this.f34951b = z2Var;
        this.f34952c = p6Var;
    }
}
