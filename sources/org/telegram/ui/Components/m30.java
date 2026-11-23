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
public class m30 extends FrameLayout {
    public final di.xb f37352a;
    public final ImageView f37353b;
    public View f37354c;
    public AnimatorSet d;
    public Runnable f37355e;
    public final int f37356f;
    public final boolean h;
    public float f37357n;
    public float f37358r;
    public int f37359s;
    public long f37360w;
    public boolean f37361x;

    public m30(Context context, int i7) {
        this(i7, context, null, false);
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.f37355e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f37355e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z10 = this.f37361x;
        Property property = View.ALPHA;
        if (z10) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(nr.f37917f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new k30(this, 1));
        this.d.start();
    }

    public final void b() {
        float f10;
        di.xb xbVar = this.f37352a;
        org.telegram.ui.ActionBar.t6.q(xbVar);
        ImageView imageView = this.f37353b;
        org.telegram.ui.ActionBar.t6.q(imageView);
        xbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i7 = this.f37356f;
        if (i7 != 7 && i7 != 8) {
            f10 = 3.0f;
        } else {
            f10 = 6.0f;
        }
        xbVar.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(f10), -366530760));
    }

    public final void c(View view) {
        if (this.f37354c != view && getTag() == null) {
            Runnable runnable = this.f37355e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f37355e = null;
            }
            d(view);
            this.f37354c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z10 = this.f37361x;
            Property property = View.ALPHA;
            if (z10) {
                ImageView imageView = this.f37353b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(nr.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new k30(this, 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m30.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.f37357n;
    }

    public org.telegram.ui.Cells.r1 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setBottomOffset(int i7) {
        this.f37359s = i7;
    }

    public void setExtraTranslationY(float f10) {
        this.f37358r = f10;
        setTranslationY(f10 + this.f37357n);
    }

    public void setOverrideText(String str) {
        this.f37352a.setText(str);
    }

    public void setShowingDuration(long j3) {
        this.f37360w = j3;
    }

    public void setText(CharSequence charSequence) {
        this.f37352a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.f37361x = z10;
    }

    public m30(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.f37360w = 2000L;
        this.f37356f = i7;
        this.h = z10;
        di.xb xbVar = new di.xb(context, 24);
        this.f37352a = xbVar;
        int i10 = org.telegram.ui.ActionBar.m6.f29412gg;
        org.telegram.ui.ActionBar.t6.U(xbVar, i10, h6Var);
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
            int i11 = org.telegram.ui.ActionBar.m6.hg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            xbVar.setBackground(d02);
            org.telegram.ui.ActionBar.t6.j(xbVar, d02, M, null, h6Var);
            xbVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            addView(xbVar, c8.na.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            xbVar.setGravity(51);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int i12 = org.telegram.ui.ActionBar.m6.hg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
            xbVar.setBackground(d03);
            org.telegram.ui.ActionBar.t6.j(xbVar, d03, M2, null, h6Var);
            xbVar.setPadding(org.telegram.messenger.g0.L(i7 == 0 ? 54.0f : 12.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f));
            addView(xbVar, c8.na.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i7 == 0) {
            xbVar.setText(org.telegram.messenger.hd.N0(2131753759, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232789);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.na.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f37353b = imageView2;
        imageView2.setImageResource(z10 ? 2131232786 : 2131232785);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.hg, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, c8.na.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(l30 l30Var) {
    }
}
