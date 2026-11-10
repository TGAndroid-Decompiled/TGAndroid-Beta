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
public final class l30 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public final TextView[] l1;
    public final TextView f35521m1;
    public final h70 n1;
    public final org.telegram.ui.cn f35522o1;
    public final ch0 f35523p1;
    public final k30 f35524q1;
    public boolean f35525r1;
    public final zg0 f35526s1;
    public final TextView[] f35527t1;
    public final String f35528u1;

    public l30(Context context, String str, org.telegram.ui.cn cnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.l1 = new TextView[2];
        this.f35527t1 = new TextView[2];
        gp gpVar = new gp(this, 21);
        this.f28707v0 = false;
        this.f28706u0 = false;
        this.f35522o1 = cnVar;
        this.f35528u1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        zg0 zg0Var = new zg0(2131624062, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.f35526s1 = zg0Var;
        zg0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f35523p1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624063, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ha.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, gpVar);
        TextView textView2 = new TextView(context);
        this.f35521m1 = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        h70 h70Var = new h70(getContext());
        this.n1 = h70Var;
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        h70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        h70Var.setBackColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G5, this.I0));
        frameLayout.addView(h70Var, c8.ha.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f35159a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Ei;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, M2, h6Var);
        frameLayout2.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, c8.ha.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f35161c = imageView2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.m6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.m6.L(L2, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView2.setBackground(L3);
        org.telegram.ui.ActionBar.t6.j(imageView2, L3, M3, null, h6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624061, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, c8.ha.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f35160b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, i12, h6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        this.f35524q1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.id.M0(2131749262, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new g0(this, 25));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, c8.ha.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.l1[i13] = new TextView(context);
            this.l1[i13].setTextSize(1, 16.0f);
            this.l1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(this.l1[i13], org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
            frameLayout.addView(this.l1[i13], c8.ha.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f35527t1[i13] = new TextView(context);
            this.f35527t1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(this.f35527t1[i13], org.telegram.ui.ActionBar.m6.f28148r5, h6Var);
            this.f35527t1[i13].setGravity(1);
            frameLayout.addView(this.f35527t1[i13], c8.ha.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f35527t1[i13].setText(org.telegram.messenger.id.M0(2131749247, null));
            } else {
                this.f35527t1[i13].setAlpha(0.0f);
                this.f35527t1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.l1[i13].setAlpha(0.0f);
                this.l1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.f35522o1 != null) {
            textView.setText(org.telegram.messenger.id.M0(2131749246, null));
            org.telegram.messenger.xy B = this.f35522o1.getSendMessagesHelper().B(this.f35522o1.a());
            this.f35521m1.setText(String.format("%d%%", Integer.valueOf(B.f26557l)));
            this.n1.a(false, B.f26557l / 100.0f);
            this.l1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.f26554i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.f35527t1[1].setText(org.telegram.messenger.id.M0(2131749261, null));
            this.l1[1].setText(org.telegram.messenger.id.M0(2131749260, null));
            this.f35522o1.getNotificationCenter().c(this, org.telegram.messenger.qs.f25095v1);
            return;
        }
        textView.setText(org.telegram.messenger.id.M0(2131749236, null));
        org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.f28669a).F.get(str);
        this.f35521m1.setText(String.format("%d%%", Integer.valueOf(bzVar.f21763j)));
        this.n1.a(false, bzVar.f21763j / 100.0f);
        this.l1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(bzVar.f21762i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
        this.f35527t1[1].setText(org.telegram.messenger.id.M0(2131749241, null));
        this.l1[1].setText(org.telegram.messenger.id.M0(2131749240, null));
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25102w1);
    }

    public final void I0() {
        this.f35525r1 = true;
        this.f35523p1.setAutoRepeat(false);
        k30 k30Var = this.f35524q1;
        k30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(wq.f40047g);
        Property property = View.ALPHA;
        TextView textView = this.f35521m1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.f35527t1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.l1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.n1, property, 0.0f), ObjectAnimator.ofFloat(k30Var.d, property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        k30Var.f35159a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.f35161c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.f35161c.d();
        animatorSet.start();
    }

    @Override
    public final void K() {
        super.K();
        org.telegram.ui.cn cnVar = this.f35522o1;
        if (cnVar != null) {
            cnVar.getNotificationCenter().n(this, org.telegram.messenger.qs.f25095v1);
        } else {
            org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25102w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25095v1;
        h70 h70Var = this.n1;
        TextView[] textViewArr = this.l1;
        TextView textView = this.f35521m1;
        ch0 ch0Var = this.f35523p1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.cn cnVar = this.f35522o1;
            org.telegram.messenger.xy B = cnVar.getSendMessagesHelper().B(cnVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.f35525r1 && ((180 - ch0Var.getAnimatedDrawable().f40962a0) * 16.6d) + 3000.0d >= B.f26561p) {
                ch0Var.setAutoRepeat(false);
                this.f35525r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f26557l)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.f26554i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            h70Var.a(true, B.f26557l / 100.0f);
        } else if (i7 == org.telegram.messenger.qs.f25102w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.f28669a).F.get(this.f35528u1);
            if (bzVar == null) {
                I0();
                return;
            }
            if (!this.f35525r1 && ((180 - ch0Var.getAnimatedDrawable().f40962a0) * 16.6d) + 3000.0d >= bzVar.f21767n) {
                ch0Var.setAutoRepeat(false);
                this.f35525r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(bzVar.f21763j)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(bzVar.f21762i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
            h70Var.a(true, bzVar.f21763j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            h70 h70Var = this.n1;
            if (h70Var != null) {
                h70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0));
                h70Var.setBackColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G5, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
