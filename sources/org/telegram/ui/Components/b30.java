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
public class b30 extends FrameLayout {
    public final di.tb f33161a;
    public final ImageView f33162b;
    public View f33163c;
    public AnimatorSet d;
    public Runnable f33164e;
    public final int f33165f;
    public final boolean h;
    public float f33166n;
    public float f33167r;
    public int f33168s;
    public long f33169w;
    public boolean f33170x;

    public b30(Context context, int i7) {
        this(i7, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f33164e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f33164e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.f33170x;
        Property property = View.ALPHA;
        if (z10) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(er.f34419f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new z20(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        di.tb tbVar = this.f33161a;
        org.telegram.ui.ActionBar.q6.q(tbVar);
        ImageView imageView = this.f33162b;
        org.telegram.ui.ActionBar.q6.q(imageView);
        tbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f33165f;
        if (i7 != 7 && i7 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        tbVar.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f33163c != view && getTag() == null) {
            Runnable runnable = this.f33164e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f33164e = null;
            }
            d(view);
            this.f33163c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z10 = this.f33170x;
            Property property = View.ALPHA;
            if (z10) {
                ImageView imageView = this.f33162b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(er.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new z20(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b30.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f33166n;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.f33168s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.f33167r = f10;
        setTranslationY(f10 + this.f33166n);
    }

    public void setOverrideText(String str) {
        this.f33161a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.f33169w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f33161a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.f33170x = z10;
    }

    public b30(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f33169w = 2000L;
        this.f33165f = i7;
        this.h = z10;
        di.tb tbVar = new di.tb(context, 24);
        this.f33161a = tbVar;
        int i10 = org.telegram.ui.ActionBar.j6.f28914gg;
        org.telegram.ui.ActionBar.q6.U(tbVar, i10, e6Var);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setMaxLines(2);
        if (i7 == 7 || i7 == 8 || i7 == 9) {
            tbVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i7 == 4) {
            tbVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            tbVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i7 == 3) {
            tbVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.j6.hg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            tbVar.setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(tbVar, d02, M, null, e6Var);
            tbVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(tbVar, c8.ja.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            tbVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.j6.hg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
            tbVar.setBackground(d03);
            org.telegram.ui.ActionBar.q6.j(tbVar, d03, M2, null, e6Var);
            tbVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(tbVar, c8.ja.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            tbVar.setText(org.telegram.messenger.hd.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232788);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ja.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f33162b = imageView2;
        imageView2.setImageResource(z10 ? 2131232785 : 2131232784);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.hg, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.ja.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(a30 a30Var) {
    }
}
