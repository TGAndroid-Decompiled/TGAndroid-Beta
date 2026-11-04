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
public class u20 extends FrameLayout {
    public final ci.ec f38617a;
    public final ImageView f38618b;
    public View f38619c;
    public AnimatorSet d;
    public Runnable f38620e;
    public final int f38621f;
    public final boolean h;
    public float f38622n;
    public float f38623r;
    public int f38624s;
    public long f38625w;
    public boolean f38626x;

    public u20(Context context, int i3) {
        this(i3, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f38620e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f38620e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.f38626x;
        Property property = View.ALPHA;
        if (z10) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(xq.f40452f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new s20(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        ci.ec ecVar = this.f38617a;
        org.telegram.ui.ActionBar.r6.r(ecVar);
        ImageView imageView = this.f38618b;
        org.telegram.ui.ActionBar.r6.r(imageView);
        ecVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i3 = this.f38621f;
        if (i3 != 7 && i3 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        ecVar.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f38619c != view && getTag() == null) {
            Runnable runnable = this.f38620e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f38620e = null;
            }
            d(view);
            this.f38619c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z10 = this.f38626x;
            Property property = View.ALPHA;
            if (z10) {
                ImageView imageView = this.f38618b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(xq.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new s20(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u20.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f38622n;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }

    public void setBottomOffset(int i3) {
        this.f38624s = i3;
    }

    public void setExtraTranslationY(float f10) {
        this.f38623r = f10;
        setTranslationY(f10 + this.f38622n);
    }

    public void setOverrideText(String str) {
        this.f38617a.setText(str);
    }

    public void setShowingDuration(long j10) {
        this.f38625w = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f38617a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.f38626x = z10;
    }

    public u20(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f38625w = 2000L;
        this.f38621f = i3;
        this.h = z10;
        ci.ec ecVar = new ci.ec(context, 24);
        this.f38617a = ecVar;
        int i10 = org.telegram.ui.ActionBar.k6.f27888dg;
        org.telegram.ui.ActionBar.r6.V(ecVar, i10, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setMaxLines(2);
        if (i3 == 7 || i3 == 8 || i3 == 9) {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i3 == 4) {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            ecVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i3 == 3) {
            ecVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.k6.f27907eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            ecVar.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(ecVar, d02, N, null, e6Var);
            ecVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(ecVar, b8.mf.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            ecVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.k6.f27907eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            ecVar.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(ecVar, d03, N2, null, e6Var);
            ecVar.setPadding(org.telegram.messenger.g0.L(i3 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(ecVar, b8.mf.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i3 == 0) {
            ecVar.setText(org.telegram.messenger.bd.M0(2131753762, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232785);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, b8.mf.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f38618b = imageView2;
        imageView2.setImageResource(z10 ? 2131232782 : 2131232781);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f27907eg, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, b8.mf.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(t20 t20Var) {
    }
}
