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
public final class o30 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public final TextView[] f37834m1;
    public final TextView n1;
    public final k70 f37835o1;
    public final org.telegram.ui.an f37836p1;
    public final fh0 f37837q1;
    public final n30 f37838r1;
    public boolean f37839s1;
    public final ch0 f37840t1;
    public final TextView[] f37841u1;
    public final String f37842v1;

    public o30(Context context, String str, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f37834m1 = new TextView[2];
        this.f37841u1 = new TextView[2];
        fo foVar = new fo(this, 23);
        this.f29720w0 = false;
        this.f29718v0 = false;
        this.f37836p1 = anVar;
        this.f37842v1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        ch0 ch0Var = new ch0(2131624063, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.f37840t1 = ch0Var;
        ch0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f37837q1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ja.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, foVar);
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        org.telegram.messenger.i20.o(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, e6Var);
        frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        k70 k70Var = new k70(getContext());
        this.f37835o1 = k70Var;
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        k70Var.setBackColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G5, this.J0));
        frameLayout.addView(k70Var, c8.ja.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f37445a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, M2, e6Var);
        frameLayout2.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, c8.ja.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f37447c = imageView2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.j6.L(L2, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i12);
        imageView2.setBackground(L3);
        org.telegram.ui.ActionBar.q6.j(imageView2, L3, M3, null, e6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624062, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, c8.ja.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f37446b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.m(textView3, i12, e6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ja.t(-2, -2, 16, 10, 0, 0, 0));
        this.f37838r1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.hd.M0(2131749262, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new e0(this, 26));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, c8.ja.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f37834m1[i13] = new TextView(context);
            this.f37834m1[i13].setTextSize(1, 16.0f);
            this.f37834m1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(this.f37834m1[i13], org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            frameLayout.addView(this.f37834m1[i13], c8.ja.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f37841u1[i13] = new TextView(context);
            this.f37841u1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(this.f37841u1[i13], org.telegram.ui.ActionBar.j6.f29107r5, e6Var);
            this.f37841u1[i13].setGravity(1);
            frameLayout.addView(this.f37841u1[i13], c8.ja.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f37841u1[i13].setText(org.telegram.messenger.hd.M0(2131749247, null));
            } else {
                this.f37841u1[i13].setAlpha(0.0f);
                this.f37841u1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.f37834m1[i13].setAlpha(0.0f);
                this.f37834m1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.f37836p1 != null) {
            textView.setText(org.telegram.messenger.hd.M0(2131749246, null));
            org.telegram.messenger.vy B = this.f37836p1.getSendMessagesHelper().B(this.f37836p1.a());
            this.n1.setText(String.format("%d%%", Integer.valueOf(B.f27275l)));
            this.f37835o1.a(false, B.f27275l / 100.0f);
            this.f37834m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.f27272i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.f37841u1[1].setText(org.telegram.messenger.hd.M0(2131749261, null));
            this.f37834m1[1].setText(org.telegram.messenger.hd.M0(2131749260, null));
            this.f37836p1.getNotificationCenter().c(this, org.telegram.messenger.ns.f25587v1);
            return;
        }
        textView.setText(org.telegram.messenger.hd.M0(2131749236, null));
        org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) org.telegram.messenger.ez.C(this.f29679a).G.get(str);
        this.n1.setText(String.format("%d%%", Integer.valueOf(zyVar.f28038j)));
        this.f37835o1.a(false, zyVar.f28038j / 100.0f);
        this.f37834m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(zyVar.f28037i, false, false), org.telegram.messenger.g0.i0(zyVar.h, false, false)));
        this.f37841u1[1].setText(org.telegram.messenger.hd.M0(2131749241, null));
        this.f37834m1[1].setText(org.telegram.messenger.hd.M0(2131749240, null));
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25594w1);
    }

    public final void I0() {
        this.f37839s1 = true;
        this.f37837q1.setAutoRepeat(false);
        n30 n30Var = this.f37838r1;
        n30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f34421g);
        Property property = View.ALPHA;
        TextView textView = this.n1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.f37841u1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.f37834m1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.f37835o1, property, 0.0f), ObjectAnimator.ofFloat(n30Var.d, property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        n30Var.f37445a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n30Var.f37447c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n30Var.f37447c.d();
        animatorSet.start();
    }

    @Override
    public final void L() {
        super.L();
        org.telegram.ui.an anVar = this.f37836p1;
        if (anVar != null) {
            anVar.getNotificationCenter().n(this, org.telegram.messenger.ns.f25587v1);
        } else {
            org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25594w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25587v1;
        k70 k70Var = this.f37835o1;
        TextView[] textViewArr = this.f37834m1;
        TextView textView = this.n1;
        fh0 fh0Var = this.f37837q1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.an anVar = this.f37836p1;
            org.telegram.messenger.vy B = anVar.getSendMessagesHelper().B(anVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.f37839s1 && ((180 - fh0Var.getAnimatedDrawable().f33573b0) * 16.6d) + 3000.0d >= B.f27279p) {
                fh0Var.setAutoRepeat(false);
                this.f37839s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.f27275l)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.f27272i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            k70Var.a(true, B.f27275l / 100.0f);
        } else if (i7 == org.telegram.messenger.ns.f25594w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) org.telegram.messenger.ez.C(this.f29679a).G.get(this.f37842v1);
            if (zyVar == null) {
                I0();
                return;
            }
            if (!this.f37839s1 && ((180 - fh0Var.getAnimatedDrawable().f33573b0) * 16.6d) + 3000.0d >= zyVar.f28042n) {
                fh0Var.setAutoRepeat(false);
                this.f37839s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(zyVar.f28038j)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(zyVar.f28037i, false, false), org.telegram.messenger.g0.i0(zyVar.h, false, false)));
            k70Var.a(true, zyVar.f28038j / 100.0f);
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            k70 k70Var = this.f37835o1;
            if (k70Var != null) {
                k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
                k70Var.setBackColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
