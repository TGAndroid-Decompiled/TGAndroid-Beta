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
public final class w30 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public final TextView[] f41498m1;
    public final TextView n1;
    public final u70 f41499o1;
    public final org.telegram.ui.bn f41500p1;
    public final qh0 f41501q1;
    public final v30 f41502r1;
    public boolean f41503s1;
    public final nh0 f41504t1;
    public final TextView[] f41505u1;
    public final String f41506v1;

    public w30(Context context, String str, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.f41498m1 = new TextView[2];
        this.f41505u1 = new TextView[2];
        lo loVar = new lo(this, 23);
        this.f30264w0 = false;
        this.f30262v0 = false;
        this.f41500p1 = bnVar;
        this.f41506v1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.m10.p(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        nh0 nh0Var = new nh0(2131624063, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.f41504t1 = nh0Var;
        nh0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f41501q1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.na.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, loVar);
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        org.telegram.messenger.m10.p(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, i6Var);
        frameLayout.addView(textView2, c8.na.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        u70 u70Var = new u70(getContext());
        this.f41499o1 = u70Var;
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        u70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i10, this.J0));
        u70Var.setBackColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G5, this.J0));
        frameLayout.addView(u70Var, c8.na.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f40551a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Hi;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, M2, i6Var);
        frameLayout2.addView(view, c8.na.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, c8.na.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f40553c = imageView2;
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
        linearLayout.addView((View) imageView2, c8.na.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f40552b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.f3.l(textView3, i12, i6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.na.t(-2, -2, 16, 10, 0, 0, 0));
        this.f41502r1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.gd.N0(2131749069, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new n0(this, 27));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, c8.na.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f41498m1[i13] = new TextView(context);
            this.f41498m1[i13].setTextSize(1, 16.0f);
            this.f41498m1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(this.f41498m1[i13], org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
            frameLayout.addView(this.f41498m1[i13], c8.na.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f41505u1[i13] = new TextView(context);
            this.f41505u1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(this.f41505u1[i13], org.telegram.ui.ActionBar.n6.f29709r5, i6Var);
            this.f41505u1[i13].setGravity(1);
            frameLayout.addView(this.f41505u1[i13], c8.na.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f41505u1[i13].setText(org.telegram.messenger.gd.N0(2131749054, null));
            } else {
                this.f41505u1[i13].setAlpha(0.0f);
                this.f41505u1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.f41498m1[i13].setAlpha(0.0f);
                this.f41498m1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.f41500p1 != null) {
            textView.setText(org.telegram.messenger.gd.N0(2131749053, null));
            org.telegram.messenger.qy B = this.f41500p1.getSendMessagesHelper().B(this.f41500p1.a());
            this.n1.setText(String.format("%d%%", Integer.valueOf(B.f26604l)));
            this.f41499o1.a(false, B.f26604l / 100.0f);
            this.f41498m1[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(B.f26601i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.f41505u1[1].setText(org.telegram.messenger.gd.N0(2131749068, null));
            this.f41498m1[1].setText(org.telegram.messenger.gd.N0(2131749067, null));
            this.f41500p1.getNotificationCenter().c(this, org.telegram.messenger.ks.f25304v1);
            return;
        }
        textView.setText(org.telegram.messenger.gd.N0(2131749043, null));
        org.telegram.messenger.uy uyVar = (org.telegram.messenger.uy) org.telegram.messenger.zy.C(this.f30223a).G.get(str);
        this.n1.setText(String.format("%d%%", Integer.valueOf(uyVar.f27397j)));
        this.f41499o1.a(false, uyVar.f27397j / 100.0f);
        this.f41498m1[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(uyVar.f27396i, false, false), org.telegram.messenger.g0.i0(uyVar.h, false, false)));
        this.f41505u1[1].setText(org.telegram.messenger.gd.N0(2131749048, null));
        this.f41498m1[1].setText(org.telegram.messenger.gd.N0(2131749047, null));
        org.telegram.messenger.ks.f(this.f30223a).c(this, org.telegram.messenger.ks.f25311w1);
    }

    public final void J0() {
        this.f41503s1 = true;
        this.f41501q1.setAutoRepeat(false);
        v30 v30Var = this.f41502r1;
        v30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(kr.f36859g);
        Property property = View.ALPHA;
        TextView textView = this.n1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.f41505u1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.f41498m1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.f41499o1, property, 0.0f), ObjectAnimator.ofFloat(v30Var.d, property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        v30Var.f40551a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        v30Var.f40553c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        v30Var.f40553c.d();
        animatorSet.start();
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.bn bnVar = this.f41500p1;
        if (bnVar != null) {
            bnVar.getNotificationCenter().n(this, org.telegram.messenger.ks.f25304v1);
        } else {
            org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.f25311w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25304v1;
        u70 u70Var = this.f41499o1;
        TextView[] textViewArr = this.f41498m1;
        TextView textView = this.n1;
        qh0 qh0Var = this.f41501q1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.bn bnVar = this.f41500p1;
            org.telegram.messenger.qy B = bnVar.getSendMessagesHelper().B(bnVar.a());
            if (B == null) {
                J0();
                return;
            }
            if (!this.f41503s1 && ((180 - qh0Var.getAnimatedDrawable().f37801b0) * 16.6d) + 3000.0d >= B.f26608p) {
                qh0Var.setAutoRepeat(false);
                this.f41503s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f26604l)));
            textViewArr[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(B.f26601i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            u70Var.a(true, B.f26604l / 100.0f);
        } else if (i7 == org.telegram.messenger.ks.f25311w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.uy uyVar = (org.telegram.messenger.uy) org.telegram.messenger.zy.C(this.f30223a).G.get(this.f41506v1);
            if (uyVar == null) {
                J0();
                return;
            }
            if (!this.f41503s1 && ((180 - qh0Var.getAnimatedDrawable().f37801b0) * 16.6d) + 3000.0d >= uyVar.f27401n) {
                qh0Var.setAutoRepeat(false);
                this.f41503s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(uyVar.f27397j)));
            textViewArr[0].setText(org.telegram.messenger.gd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(uyVar.f27396i, false, false), org.telegram.messenger.g0.i0(uyVar.h, false, false)));
            u70Var.a(true, uyVar.f27397j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            u70 u70Var = this.f41499o1;
            if (u70Var != null) {
                u70Var.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0));
                u70Var.setBackColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
