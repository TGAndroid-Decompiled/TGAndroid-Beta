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
public class y20 extends FrameLayout {
    public final bi.md f40496a;
    public final ImageView f40497b;
    public View f40498c;
    public AnimatorSet d;
    public Runnable f40499e;
    public final int f40500f;
    public final boolean h;
    public float f40501n;
    public float f40502r;
    public int f40503s;
    public long f40504w;
    public boolean f40505x;

    public y20(Context context, int i7) {
        this(i7, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f40499e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f40499e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z9 = this.f40505x;
        Property property = View.ALPHA;
        if (z9) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(xq.f40329f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new w20(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        bi.md mdVar = this.f40496a;
        org.telegram.ui.ActionBar.r6.r(mdVar);
        ImageView imageView = this.f40497b;
        org.telegram.ui.ActionBar.r6.r(imageView);
        mdVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f40500f;
        if (i7 != 7 && i7 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        mdVar.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f40498c != view && getTag() == null) {
            Runnable runnable = this.f40499e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f40499e = null;
            }
            d(view);
            this.f40498c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z9 = this.f40505x;
            Property property = View.ALPHA;
            if (z9) {
                ImageView imageView = this.f40497b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(xq.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new w20(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y20.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f40501n;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.f40503s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.f40502r = f10;
        setTranslationY(f10 + this.f40501n);
    }

    public void setOverrideText(String str) {
        this.f40496a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.f40504w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f40496a.setText(charSequence);
    }

    public void setUseScale(boolean z9) {
        this.f40505x = z9;
    }

    public y20(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f40504w = 2000L;
        this.f40500f = i7;
        this.h = z9;
        bi.md mdVar = new bi.md(context, 24);
        this.f40496a = mdVar;
        int i10 = org.telegram.ui.ActionBar.k6.f27857dg;
        org.telegram.ui.ActionBar.r6.V(mdVar, i10, f6Var);
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
            int i11 = org.telegram.ui.ActionBar.k6.f27876eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            mdVar.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(mdVar, d02, N, null, f6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(mdVar, c8.ha.d(-2, 30.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        } else {
            mdVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.k6.f27876eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            mdVar.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(mdVar, d03, N2, null, f6Var);
            mdVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(mdVar, c8.ha.d(-2, -2.0f, 51, 0.0f, z9 ? 6.0f : 0.0f, 0.0f, z9 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            mdVar.setText(org.telegram.messenger.hd.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232787);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ha.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f40497b = imageView2;
        imageView2.setImageResource(z9 ? 2131232784 : 2131232783);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f27876eg, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ha.d(14, 6.0f, (z9 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(x20 x20Var) {
    }
}
