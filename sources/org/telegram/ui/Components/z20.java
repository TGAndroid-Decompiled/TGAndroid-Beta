package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class z20 extends FrameLayout {
    public final bi.md f40871a;
    public final ImageView f40872b;
    public View f40873c;
    public AnimatorSet d;
    public Runnable f40874e;
    public final int f40875f;
    public final boolean h;
    public float f40876n;
    public float f40877r;
    public int f40878s;
    public long f40879w;
    public boolean f40880x;

    public z20(Context context, int i7) {
        this(i7, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f40874e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f40874e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z9 = this.f40880x;
        Property property = View.ALPHA;
        if (z9) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(xq.f40458f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new x20(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        bi.md mdVar = this.f40871a;
        org.telegram.ui.ActionBar.s6.q(mdVar);
        ImageView imageView = this.f40872b;
        org.telegram.ui.ActionBar.s6.q(imageView);
        mdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f40875f;
        if (i7 != 7 && i7 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        mdVar.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f40873c != view && getTag() == null) {
            Runnable runnable = this.f40874e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f40874e = null;
            }
            d(view);
            this.f40873c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z9 = this.f40880x;
            Property property = View.ALPHA;
            if (z9) {
                ImageView imageView = this.f40872b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(xq.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new x20(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z20.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f40876n;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.f40878s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.f40877r = f10;
        setTranslationY(f10 + this.f40876n);
    }

    public void setOverrideText(String str) {
        this.f40871a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.f40879w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f40871a.setText(charSequence);
    }

    public void setUseScale(boolean z9) {
        this.f40880x = z9;
    }

    public z20(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        this.f40879w = 2000L;
        this.f40875f = i7;
        this.h = z9;
        bi.md mdVar = new bi.md(context, 24);
        this.f40871a = mdVar;
        int i10 = org.telegram.ui.ActionBar.l6.f27874dg;
        org.telegram.ui.ActionBar.s6.U(mdVar, i10, g6Var);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setMaxLines(2);
        if (i7 == 7 || i7 == 8 || i7 == 9) {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i7 == 4) {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            mdVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i7 == 3) {
            mdVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.l6.f27893eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            mdVar.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(mdVar, d02, M, null, g6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(mdVar, c8.ha.d(-2, 30.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        } else {
            mdVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.l6.f27893eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.l6.d0(L2, org.telegram.ui.ActionBar.l6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i12);
            mdVar.setBackground(d03);
            org.telegram.ui.ActionBar.s6.j(mdVar, d03, M2, null, g6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(mdVar, c8.ha.d(-2, -2.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            mdVar.setText(org.telegram.messenger.id.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232787);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ha.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f40872b = imageView2;
        imageView2.setImageResource(z9 ? 2131232784 : 2131232783);
        org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.f27893eg, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ha.d(14, 6.0f, (z9 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(y20 y20Var) {
    }
}
