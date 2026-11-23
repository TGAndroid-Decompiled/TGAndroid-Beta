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
public class j30 extends FrameLayout {
    public final di.xb f36248a;
    public final ImageView f36249b;
    public View f36250c;
    public AnimatorSet d;
    public Runnable f36251e;
    public final int f36252f;
    public final boolean h;
    public float f36253n;
    public float f36254r;
    public int f36255s;
    public long f36256w;
    public boolean f36257x;

    public j30(Context context, int i7) {
        this(i7, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f36251e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f36251e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.f36257x;
        Property property = View.ALPHA;
        if (z10) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(kr.f36858f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new h30(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        di.xb xbVar = this.f36248a;
        org.telegram.ui.ActionBar.u6.q(xbVar);
        ImageView imageView = this.f36249b;
        org.telegram.ui.ActionBar.u6.q(imageView);
        xbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f36252f;
        if (i7 != 7 && i7 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        xbVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f36250c != view && getTag() == null) {
            Runnable runnable = this.f36251e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f36251e = null;
            }
            d(view);
            this.f36250c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z10 = this.f36257x;
            Property property = View.ALPHA;
            if (z10) {
                ImageView imageView = this.f36249b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(kr.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new h30(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f36253n;
    }

    public org.telegram.ui.Cells.r1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.f36255s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.f36254r = f10;
        setTranslationY(f10 + this.f36253n);
    }

    public void setOverrideText(String str) {
        this.f36248a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.f36256w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f36248a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.f36257x = z10;
    }

    public j30(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f36256w = 2000L;
        this.f36252f = i7;
        this.h = z10;
        di.xb xbVar = new di.xb(context, 24);
        this.f36248a = xbVar;
        int i10 = org.telegram.ui.ActionBar.n6.f29516gg;
        org.telegram.ui.ActionBar.u6.U(xbVar, i10, i6Var);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setMaxLines(2);
        if (i7 == 7 || i7 == 8 || i7 == 9) {
            xbVar.setMaxWidth(org.telegram.messenger.g0.L(310.0f));
        } else if (i7 == 4) {
            xbVar.setMaxWidth(org.telegram.messenger.g0.L(280.0f));
        } else {
            xbVar.setMaxWidth(org.telegram.messenger.g0.L(250.0f));
        }
        if (i7 == 3) {
            xbVar.setGravity(19);
            int L = org.telegram.messenger.g0.L(5.0f);
            int i11 = org.telegram.ui.ActionBar.n6.hg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            xbVar.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(xbVar, d02, M, null, i6Var);
            xbVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(xbVar, c8.na.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            xbVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.n6.hg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
            xbVar.setBackground(d03);
            org.telegram.ui.ActionBar.u6.j(xbVar, d03, M2, null, i6Var);
            xbVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(xbVar, c8.na.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            xbVar.setText(org.telegram.messenger.gd.N0(2131753759, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232792);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.na.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f36249b = imageView2;
        imageView2.setImageResource(z10 ? 2131232789 : 2131232788);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.hg, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.na.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(i30 i30Var) {
    }
}
