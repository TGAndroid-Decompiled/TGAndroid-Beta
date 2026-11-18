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
public final class w30 extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public final TextView[] f41549m1;
    public final TextView n1;
    public final v70 f41550o1;
    public final org.telegram.ui.bn f41551p1;
    public final ph0 f41552q1;
    public final v30 f41553r1;
    public boolean f41554s1;
    public final mh0 f41555t1;
    public final TextView[] f41556u1;
    public final String f41557v1;

    public w30(Context context, String str, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.f41549m1 = new TextView[2];
        this.f41556u1 = new TextView[2];
        mo moVar = new mo(this, 23);
        this.f30228w0 = false;
        this.f30226v0 = false;
        this.f41551p1 = bnVar;
        this.f41557v1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        mh0 mh0Var = new mh0(2131624063, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.f41555t1 = mh0Var;
        mh0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f41552q1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ma.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, moVar);
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        org.telegram.messenger.n10.p(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, i6Var);
        frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        v70 v70Var = new v70(getContext());
        this.f41550o1 = v70Var;
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        v70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        v70Var.setBackColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G5, this.J0));
        frameLayout.addView(v70Var, c8.ma.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f40487a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Hi;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, M2, i6Var);
        frameLayout2.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, c8.ma.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f40489c = imageView2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Ji;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.n6.L(L2, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i12);
        imageView2.setBackground(L3);
        org.telegram.ui.ActionBar.u6.j(imageView2, L3, M3, null, i6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624062, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, c8.ma.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f40488b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.f3.l(textView3, i12, i6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ma.t(-2, -2, 16, 10, 0, 0, 0));
        this.f41553r1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.gd.M0(2131749070, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new n0(this, 27));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, c8.ma.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f41549m1[i13] = new TextView(context);
            this.f41549m1[i13].setTextSize(1, 16.0f);
            this.f41549m1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(this.f41549m1[i13], org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
            frameLayout.addView(this.f41549m1[i13], c8.ma.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f41556u1[i13] = new TextView(context);
            this.f41556u1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(this.f41556u1[i13], org.telegram.ui.ActionBar.n6.f29652r5, i6Var);
            this.f41556u1[i13].setGravity(1);
            frameLayout.addView(this.f41556u1[i13], c8.ma.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f41556u1[i13].setText(org.telegram.messenger.gd.M0(2131749055, null));
            } else {
                this.f41556u1[i13].setAlpha(0.0f);
                this.f41556u1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.f41549m1[i13].setAlpha(0.0f);
                this.f41549m1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.f41551p1 != null) {
            textView.setText(org.telegram.messenger.gd.M0(2131749054, null));
            org.telegram.messenger.qy B = this.f41551p1.getSendMessagesHelper().B(this.f41551p1.a());
            this.n1.setText(String.format("%d%%", Integer.valueOf(B.f26492l)));
            this.f41550o1.a(false, B.f26492l / 100.0f);
            this.f41549m1[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749071, org.telegram.messenger.g0.i0(B.f26489i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.f41556u1[1].setText(org.telegram.messenger.gd.M0(2131749069, null));
            this.f41549m1[1].setText(org.telegram.messenger.gd.M0(2131749068, null));
            this.f41551p1.getNotificationCenter().c(this, org.telegram.messenger.ks.f25205v1);
            return;
        }
        textView.setText(org.telegram.messenger.gd.M0(2131749044, null));
        org.telegram.messenger.uy uyVar = (org.telegram.messenger.uy) org.telegram.messenger.zy.C(this.f30187a).G.get(str);
        this.n1.setText(String.format("%d%%", Integer.valueOf(uyVar.f27293j)));
        this.f41550o1.a(false, uyVar.f27293j / 100.0f);
        this.f41549m1[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749071, org.telegram.messenger.g0.i0(uyVar.f27292i, false, false), org.telegram.messenger.g0.i0(uyVar.h, false, false)));
        this.f41556u1[1].setText(org.telegram.messenger.gd.M0(2131749049, null));
        this.f41549m1[1].setText(org.telegram.messenger.gd.M0(2131749048, null));
        org.telegram.messenger.ks.f(this.f30187a).c(this, org.telegram.messenger.ks.f25212w1);
    }

    public final void J0() {
        this.f41554s1 = true;
        this.f41552q1.setAutoRepeat(false);
        v30 v30Var = this.f41553r1;
        v30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(lr.f37209g);
        Property property = View.ALPHA;
        TextView textView = this.n1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.f41556u1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.f41549m1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.f41550o1, property, 0.0f), ObjectAnimator.ofFloat(v30Var.d, property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        v30Var.f40487a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        v30Var.f40489c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        v30Var.f40489c.d();
        animatorSet.start();
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.bn bnVar = this.f41551p1;
        if (bnVar != null) {
            bnVar.getNotificationCenter().n(this, org.telegram.messenger.ks.f25205v1);
        } else {
            org.telegram.messenger.ks.f(this.f30187a).n(this, org.telegram.messenger.ks.f25212w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25205v1;
        v70 v70Var = this.f41550o1;
        TextView[] textViewArr = this.f41549m1;
        TextView textView = this.n1;
        ph0 ph0Var = this.f41552q1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.bn bnVar = this.f41551p1;
            org.telegram.messenger.qy B = bnVar.getSendMessagesHelper().B(bnVar.a());
            if (B == null) {
                J0();
                return;
            }
            if (!this.f41554s1 && ((180 - ph0Var.getAnimatedDrawable().f37482b0) * 16.6d) + 3000.0d >= B.f26496p) {
                ph0Var.setAutoRepeat(false);
                this.f41554s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f26492l)));
            textViewArr[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749071, org.telegram.messenger.g0.i0(B.f26489i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            v70Var.a(true, B.f26492l / 100.0f);
        } else if (i7 == org.telegram.messenger.ks.f25212w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.uy uyVar = (org.telegram.messenger.uy) org.telegram.messenger.zy.C(this.f30187a).G.get(this.f41557v1);
            if (uyVar == null) {
                J0();
                return;
            }
            if (!this.f41554s1 && ((180 - ph0Var.getAnimatedDrawable().f37482b0) * 16.6d) + 3000.0d >= uyVar.f27297n) {
                ph0Var.setAutoRepeat(false);
                this.f41554s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(uyVar.f27293j)));
            textViewArr[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749071, org.telegram.messenger.g0.i0(uyVar.f27292i, false, false), org.telegram.messenger.g0.i0(uyVar.h, false, false)));
            v70Var.a(true, uyVar.f27293j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            v70 v70Var = this.f41550o1;
            if (v70Var != null) {
                v70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0));
                v70Var.setBackColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
