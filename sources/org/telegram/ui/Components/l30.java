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
public final class l30 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public final TextView[] f35513i1;
    public final TextView f35514j1;
    public final h70 f35515k1;
    public final org.telegram.ui.an l1;
    public final ch0 f35516m1;
    public final k30 n1;
    public boolean f35517o1;
    public final zg0 f35518p1;
    public final TextView[] f35519q1;
    public final String f35520r1;

    public l30(Context context, String str, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f35513i1 = new TextView[2];
        this.f35519q1 = new TextView[2];
        gp gpVar = new gp(this, 21);
        this.f28651v0 = false;
        this.f28650u0 = false;
        this.l1 = anVar;
        this.f35520r1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        zg0 zg0Var = new zg0(2131624062, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.f35518p1 = zg0Var;
        zg0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f35516m1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624063, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ha.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, gpVar);
        TextView textView2 = new TextView(context);
        this.f35514j1 = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, f6Var);
        frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        h70 h70Var = new h70(getContext());
        this.f35515k1 = h70Var;
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        h70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.I0));
        frameLayout.addView(h70Var, c8.ha.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f35181a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, f6Var);
        frameLayout2.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, c8.ha.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f35183c = imageView2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
        imageView2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(imageView2, L3, N3, null, f6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624061, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, c8.ha.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f35182b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, i12, f6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        this.n1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.id.M0(2131749263, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new h0(this, 25));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, c8.ha.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f35513i1[i13] = new TextView(context);
            this.f35513i1[i13].setTextSize(1, 16.0f);
            this.f35513i1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(this.f35513i1[i13], org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
            frameLayout.addView(this.f35513i1[i13], c8.ha.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f35519q1[i13] = new TextView(context);
            this.f35519q1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(this.f35519q1[i13], org.telegram.ui.ActionBar.k6.f28110r5, f6Var);
            this.f35519q1[i13].setGravity(1);
            frameLayout.addView(this.f35519q1[i13], c8.ha.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f35519q1[i13].setText(org.telegram.messenger.id.M0(2131749248, null));
            } else {
                this.f35519q1[i13].setAlpha(0.0f);
                this.f35519q1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.f35513i1[i13].setAlpha(0.0f);
                this.f35513i1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.l1 != null) {
            textView.setText(org.telegram.messenger.id.M0(2131749247, null));
            org.telegram.messenger.xy B = this.l1.getSendMessagesHelper().B(this.l1.a());
            this.f35514j1.setText(String.format("%d%%", Integer.valueOf(B.f26553l)));
            this.f35515k1.a(false, B.f26553l / 100.0f);
            this.f35513i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(B.f26550i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.f35519q1[1].setText(org.telegram.messenger.id.M0(2131749262, null));
            this.f35513i1[1].setText(org.telegram.messenger.id.M0(2131749261, null));
            this.l1.getNotificationCenter().c(this, org.telegram.messenger.qs.f25091v1);
            return;
        }
        textView.setText(org.telegram.messenger.id.M0(2131749237, null));
        org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.f28616a).F.get(str);
        this.f35514j1.setText(String.format("%d%%", Integer.valueOf(bzVar.f21758j)));
        this.f35515k1.a(false, bzVar.f21758j / 100.0f);
        this.f35513i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(bzVar.f21757i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
        this.f35519q1[1].setText(org.telegram.messenger.id.M0(2131749242, null));
        this.f35513i1[1].setText(org.telegram.messenger.id.M0(2131749241, null));
        org.telegram.messenger.qs.f(this.f28616a).c(this, org.telegram.messenger.qs.f25098w1);
    }

    public final void I0() {
        this.f35517o1 = true;
        this.f35516m1.setAutoRepeat(false);
        k30 k30Var = this.n1;
        k30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(xq.f40367g);
        Property property = View.ALPHA;
        TextView textView = this.f35514j1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.f35519q1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.f35513i1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.f35515k1, property, 0.0f), ObjectAnimator.ofFloat(k30Var.d, property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        k30Var.f35181a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.f35183c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.f35183c.d();
        animatorSet.start();
    }

    @Override
    public final void K() {
        super.K();
        org.telegram.ui.an anVar = this.l1;
        if (anVar != null) {
            anVar.getNotificationCenter().n(this, org.telegram.messenger.qs.f25091v1);
        } else {
            org.telegram.messenger.qs.f(this.f28616a).n(this, org.telegram.messenger.qs.f25098w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25091v1;
        h70 h70Var = this.f35515k1;
        TextView[] textViewArr = this.f35513i1;
        TextView textView = this.f35514j1;
        ch0 ch0Var = this.f35516m1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.an anVar = this.l1;
            org.telegram.messenger.xy B = anVar.getSendMessagesHelper().B(anVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.f35517o1 && ((180 - ch0Var.getAnimatedDrawable().f40989a0) * 16.6d) + 3000.0d >= B.f26557p) {
                ch0Var.setAutoRepeat(false);
                this.f35517o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f26553l)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(B.f26550i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            h70Var.a(true, B.f26553l / 100.0f);
        } else if (i7 == org.telegram.messenger.qs.f25098w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.f28616a).F.get(this.f35520r1);
            if (bzVar == null) {
                I0();
                return;
            }
            if (!this.f35517o1 && ((180 - ch0Var.getAnimatedDrawable().f40989a0) * 16.6d) + 3000.0d >= bzVar.f21762n) {
                ch0Var.setAutoRepeat(false);
                this.f35517o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(bzVar.f21758j)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(bzVar.f21757i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
            h70Var.a(true, bzVar.f21758j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            h70 h70Var = this.f35515k1;
            if (h70Var != null) {
                h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
                h70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
