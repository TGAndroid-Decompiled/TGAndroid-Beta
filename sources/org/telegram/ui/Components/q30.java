package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class q30 extends FrameLayout {
    public int D;
    public long E;
    public final org.telegram.ui.ActionBar.p6 F;
    public boolean G;
    public boolean H;
    public final ag.j3 f29518a;
    public ImageView f29519b;
    public final ImageView f29520c;
    public org.telegram.ui.Cells.q1 d;
    public View e;
    public AnimatorSet f29521f;
    public Runnable h;
    public final int f29522n;
    public final boolean f29523r;
    public String f29524s;
    public int f29525w;
    public float f29526x;
    public float f29527y;

    public q30(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        float f7;
        float f10;
        this.f29518a.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(8.0f));
        this.H = true;
        ImageView imageView = new ImageView(getContext());
        this.f29519b = imageView;
        imageView.setImageResource(2131232234);
        this.f29519b.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f29519b;
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.f20939dg, 125);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i10 = h.f21452a;
        float f11 = h.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.F;
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 1, f11, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.a7.O(imageView2, 5, i10, -1, 1, f11, p6Var, Q, porterDuffColorFilter).h = mode;
        ImageView imageView3 = this.f29519b;
        boolean z10 = this.f29523r;
        if (z10) {
            f7 = 3.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView3, w7.b6.d(34, 34.0f, 21, 0.0f, f7, 0.0f, f10));
        setOnClickListener(new h0(this, 24));
    }

    public final void b(boolean z10) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.h = null;
        }
        AnimatorSet animatorSet = this.f29521f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29521f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29521f = animatorSet2;
            boolean z11 = this.G;
            Property property = View.ALPHA;
            if (z11) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
                this.f29521f.setDuration(150L);
                this.f29521f.setInterpolator(gr.f26495f);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
                this.f29521f.setDuration(300L);
            }
            this.f29521f.addListener(new o30(this, 2));
            this.f29521f.start();
            return;
        }
        setVisibility(4);
        this.e = null;
        this.d = null;
        this.f29521f = null;
    }

    public int c() {
        return 0;
    }

    public final void d() {
        float f7;
        ag.j3 j3Var = this.f29518a;
        org.telegram.ui.ActionBar.a7.r(j3Var);
        ImageView imageView = this.f29520c;
        org.telegram.ui.ActionBar.a7.r(imageView);
        j3Var.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f29522n;
        if (i10 != 7 && i10 != 8) {
            f7 = 3.0f;
        } else {
            f7 = 6.0f;
        }
        j3Var.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(f7), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.q1 r21, java.lang.Integer r22, int r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q30.e(org.telegram.ui.Cells.q1, java.lang.Integer, int, int, boolean):boolean");
    }

    public final void f(View view, boolean z10) {
        if (this.e != view && getTag() == null) {
            Runnable runnable = this.h;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.h = null;
            }
            g(view);
            this.e = view;
            AnimatorSet animatorSet = this.f29521f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29521f = null;
            }
            setTag(1);
            setVisibility(0);
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f29521f = animatorSet2;
                boolean z11 = this.G;
                Property property = View.ALPHA;
                if (z11) {
                    ImageView imageView = this.f29520c;
                    setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                    setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                    this.f29521f.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                    this.f29521f.setDuration(350L);
                    this.f29521f.setInterpolator(gr.h);
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                    this.f29521f.setDuration(300L);
                }
                this.f29521f.addListener(new o30(this, 1));
                this.f29521f.start();
                return;
            }
            setAlpha(1.0f);
        } else if (getTag() != null) {
            g(view);
        }
    }

    public final void g(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q30.g(android.view.View):void");
    }

    public float getBaseTranslationY() {
        return this.f29526x;
    }

    public org.telegram.ui.Cells.q1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.D = i10;
    }

    public void setExtraTranslationY(float f7) {
        this.f29527y = f7;
        setTranslationY(f7 + this.f29526x);
    }

    public void setOverrideText(String str) {
        this.f29524s = str;
        this.f29518a.setText(str);
        org.telegram.ui.Cells.q1 q1Var = this.d;
        if (q1Var != null) {
            this.d = null;
            e(q1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.E = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f29518a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.G = z10;
    }

    public q30(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        this(2, activity, p6Var, false);
    }

    public q30(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.E = 2000L;
        this.F = p6Var;
        this.f29522n = i10;
        this.f29523r = z10;
        ag.j3 j3Var = new ag.j3(context, 21);
        this.f29518a = j3Var;
        int i11 = org.telegram.ui.ActionBar.t6.f20939dg;
        org.telegram.ui.ActionBar.a7.V(j3Var, i11, p6Var);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(310.0f));
        } else if (i10 == 4) {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(280.0f));
        } else {
            j3Var.setMaxWidth(org.telegram.messenger.i0.L(250.0f));
        }
        if (i10 == 3) {
            j3Var.setGravity(19);
            int L = org.telegram.messenger.i0.L(5.0f);
            int i12 = org.telegram.ui.ActionBar.t6.f20956eg;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            j3Var.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(j3Var, d02, N, null, p6Var);
            j3Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            addView(j3Var, w7.b6.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            j3Var.setGravity(51);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int i13 = org.telegram.ui.ActionBar.t6.f20956eg;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
            j3Var.setBackground(d03);
            org.telegram.ui.ActionBar.a7.k(j3Var, d03, N2, null, p6Var);
            j3Var.setPadding(org.telegram.messenger.i0.L(i10 == 0 ? 54.0f : 12.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(10.0f));
            addView(j3Var, w7.b6.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            j3Var.setText(org.telegram.messenger.cd.L0(2131753762, null));
            ImageView imageView = new ImageView(context);
            this.f29519b = imageView;
            imageView.setImageResource(2131232784);
            this.f29519b.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.a7.t(this.f29519b, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            addView(this.f29519b, w7.b6.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f29520c = imageView2;
        imageView2.setImageResource(z10 ? 2131232781 : 2131232780);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.f20956eg, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, w7.b6.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(p30 p30Var) {
    }
}
