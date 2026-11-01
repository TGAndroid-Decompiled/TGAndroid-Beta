package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class d40 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs {
    public final TextView[] f25357i1;
    public final TextView f25358j1;
    public final a80 f25359k1;
    public final org.telegram.ui.un l1;
    public final fi0 f25360m1;
    public final c40 f25361n1;
    public boolean f25362o1;
    public final ci0 f25363p1;
    public final TextView[] f25364q1;
    public final String f25365r1;

    public d40(Context context, String str, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.f25357i1 = new TextView[2];
        this.f25364q1 = new TextView[2];
        ho hoVar = new ho(this, 24);
        this.f21618v0 = false;
        this.f21617u0 = false;
        this.l1 = unVar;
        this.f25365r1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.a30.n(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        ci0 ci0Var = new ci0(2131624061, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), false, null);
        this.f25363p1 = ci0Var;
        ci0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f25360m1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624062, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.b6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, hoVar);
        TextView textView2 = new TextView(context);
        this.f25358j1 = textView2;
        org.telegram.messenger.a30.n(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
        frameLayout.addView(textView2, w7.b6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        a80 a80Var = new a80(getContext());
        this.f25359k1 = a80Var;
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        a80Var.setBackColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G5, this.I0));
        frameLayout.addView(a80Var, w7.b6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f25000a = view;
        int L = org.telegram.messenger.i0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, N2, p6Var);
        frameLayout2.addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.b6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f25002c = imageView2;
        int L2 = org.telegram.messenger.i0.L(20.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(L2, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i13);
        imageView2.setBackground(L3);
        org.telegram.ui.ActionBar.a7.k(imageView2, L3, N3, null, p6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624060, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.b6.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f25001b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.m5.m(textView3, i13, p6Var, 1, 14.0f);
        linearLayout.addView(textView3, w7.b6.t(-2, -2, 16, 10, 0, 0, 0));
        this.f25361n1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.dd.L0(2131749271, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new h0(this, 25));
        view.setPivotY(org.telegram.messenger.i0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, w7.b6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.f25357i1[i14] = new TextView(context);
            this.f25357i1[i14].setTextSize(1, 16.0f);
            this.f25357i1[i14].setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(this.f25357i1[i14], org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
            frameLayout.addView(this.f25357i1[i14], w7.b6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f25364q1[i14] = new TextView(context);
            this.f25364q1[i14].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(this.f25364q1[i14], org.telegram.ui.ActionBar.t6.f21186r5, p6Var);
            this.f25364q1[i14].setGravity(1);
            frameLayout.addView(this.f25364q1[i14], w7.b6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.f25364q1[i14].setText(org.telegram.messenger.dd.L0(2131749256, null));
            } else {
                this.f25364q1[i14].setAlpha(0.0f);
                this.f25364q1[i14].setTranslationY(org.telegram.messenger.i0.L(10.0f));
                this.f25357i1[i14].setAlpha(0.0f);
                this.f25357i1[i14].setTranslationY(org.telegram.messenger.i0.L(10.0f));
            }
        }
        if (this.l1 != null) {
            textView.setText(org.telegram.messenger.dd.L0(2131749255, null));
            org.telegram.messenger.iz B = this.l1.getSendMessagesHelper().B(this.l1.a());
            this.f25358j1.setText(String.format("%d%%", Integer.valueOf(B.f16382l)));
            this.f25359k1.a(false, B.f16382l / 100.0f);
            this.f25357i1[0].setText(org.telegram.messenger.dd.a0("ImportCount", null, 2131749272, org.telegram.messenger.i0.i0(B.f16379i, false, false), org.telegram.messenger.i0.i0(B.h, false, false)));
            this.f25364q1[1].setText(org.telegram.messenger.dd.L0(2131749270, null));
            this.f25357i1[1].setText(org.telegram.messenger.dd.L0(2131749269, null));
            this.l1.getNotificationCenter().c(this, org.telegram.messenger.at.f14801v1);
            return;
        }
        textView.setText(org.telegram.messenger.dd.L0(2131749245, null));
        org.telegram.messenger.mz mzVar = (org.telegram.messenger.mz) org.telegram.messenger.rz.C(this.f21584a).F.get(str);
        this.f25358j1.setText(String.format("%d%%", Integer.valueOf(mzVar.f17227j)));
        this.f25359k1.a(false, mzVar.f17227j / 100.0f);
        this.f25357i1[0].setText(org.telegram.messenger.dd.a0("ImportCount", null, 2131749272, org.telegram.messenger.i0.i0(mzVar.f17226i, false, false), org.telegram.messenger.i0.i0(mzVar.h, false, false)));
        this.f25364q1[1].setText(org.telegram.messenger.dd.L0(2131749250, null));
        this.f25357i1[1].setText(org.telegram.messenger.dd.L0(2131749249, null));
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.f14808w1);
    }

    public final void I0() {
        this.f25362o1 = true;
        this.f25360m1.setAutoRepeat(false);
        c40 c40Var = this.f25361n1;
        c40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f26524g);
        Property property = View.ALPHA;
        TextView textView = this.f25358j1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.i0.L(10.0f));
        TextView[] textViewArr = this.f25364q1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.i0.L(10.0f));
        TextView[] textViewArr2 = this.f25357i1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.i0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.f25359k1, property, 0.0f), ObjectAnimator.ofFloat(c40Var.d, property2, org.telegram.messenger.i0.L(8.0f), 0.0f));
        c40Var.f25000a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        c40Var.f25002c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        c40Var.f25002c.d();
        animatorSet.start();
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.un unVar = this.l1;
        if (unVar != null) {
            unVar.getNotificationCenter().n(this, org.telegram.messenger.at.f14801v1);
        } else {
            org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14808w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14801v1;
        a80 a80Var = this.f25359k1;
        TextView[] textViewArr = this.f25357i1;
        TextView textView = this.f25358j1;
        fi0 fi0Var = this.f25360m1;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.un unVar = this.l1;
            org.telegram.messenger.iz B = unVar.getSendMessagesHelper().B(unVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.f25362o1 && ((180 - fi0Var.getAnimatedDrawable().f25131a0) * 16.6d) + 3000.0d >= B.f16386p) {
                fi0Var.setAutoRepeat(false);
                this.f25362o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f16382l)));
            textViewArr[0].setText(org.telegram.messenger.dd.a0("ImportCount", null, 2131749272, org.telegram.messenger.i0.i0(B.f16379i, false, false), org.telegram.messenger.i0.i0(B.h, false, false)));
            a80Var.a(true, B.f16382l / 100.0f);
        } else if (i10 == org.telegram.messenger.at.f14808w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.mz mzVar = (org.telegram.messenger.mz) org.telegram.messenger.rz.C(this.f21584a).F.get(this.f25365r1);
            if (mzVar == null) {
                I0();
                return;
            }
            if (!this.f25362o1 && ((180 - fi0Var.getAnimatedDrawable().f25131a0) * 16.6d) + 3000.0d >= mzVar.f17231n) {
                fi0Var.setAutoRepeat(false);
                this.f25362o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(mzVar.f17227j)));
            textViewArr[0].setText(org.telegram.messenger.dd.a0("ImportCount", null, 2131749272, org.telegram.messenger.i0.i0(mzVar.f17226i, false, false), org.telegram.messenger.i0.i0(mzVar.h, false, false)));
            a80Var.a(true, mzVar.f17227j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            a80 a80Var = this.f25359k1;
            if (a80Var != null) {
                a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0));
                a80Var.setBackColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G5, this.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
