package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.Map;
public abstract class rk0 extends HorizontalScrollView {
    public static final int f37671t0 = 0;
    public int D;
    public final w5 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.f6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f37672a;
    public float f37673a0;
    public qk0 f37674b;
    public boolean f37675b0;
    public final LinearLayout.LayoutParams f37676c;
    public float f37677c0;
    public final LinearLayout.LayoutParams d;
    public float f37678d0;
    public final org.telegram.ui.c61 f37679e;
    public final mk0 f37680e0;
    public pk0 f37681f;
    public boolean f37682f0;
    public boolean f37683g0;
    public HashMap h;
    public ValueAnimator f37684h0;
    public float f37685i0;
    public final float f37686j0;
    public final float f37687k0;
    public float f37688l0;
    public int m0;
    public HashMap f37689n;
    public final Paint f37690n0;
    public boolean f37691o0;
    public final w5 f37692p0;
    public boolean f37693q0;
    public final SparseArray f37694r;
    public long f37695r0;
    public View f37696s;
    public final mk0 f37697s0;
    public float f37698w;
    public boolean f37699x;
    public int f37700y;

    public rk0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f37672a = 1;
        this.f37674b = qk0.f37321a;
        this.h = new HashMap();
        this.f37689n = new HashMap();
        this.f37694r = new SparseArray();
        xq xqVar = xq.h;
        this.E = new w5(this, 350L, xqVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = org.telegram.messenger.g0.L(33.0f);
        this.M = org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.L(12.0f);
        org.telegram.messenger.g0.L(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.f37680e0 = new mk0(this, 0);
        this.f37682f0 = false;
        this.f37686j0 = org.telegram.messenger.g0.L(64.0f);
        this.f37687k0 = org.telegram.messenger.g0.L(33.0f);
        this.m0 = -1;
        this.f37690n0 = new Paint();
        this.f37691o0 = true;
        this.f37692p0 = new w5(this, 350L, xqVar);
        this.f37697s0 = new mk0(this, 1);
        this.O = f6Var;
        this.P = z9;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(13, context, this);
        this.f37679e = c61Var;
        c61Var.setOrientation(0);
        c61Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(c61Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f37676c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f37683g0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String j3 = jg.g.j(i7, "tab");
        int i10 = this.f37700y;
        this.f37700y = i10 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f37689n.get(j3);
        boolean z9 = true;
        if (frameLayout != null) {
            g(j3, frameLayout, i10);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new kk0(this, 3));
            this.f37679e.addView(frameLayout, i10);
        }
        frameLayout.setTag(2131296461, Integer.valueOf(i10));
        if (i10 != this.D) {
            z9 = false;
        }
        frameLayout.setSelected(z9);
        this.h.put(j3, frameLayout);
        return frameLayout;
    }

    public final fv0 c(int i7, Drawable drawable) {
        String j3 = jg.g.j(i7, "tab");
        int i10 = this.f37700y;
        this.f37700y = i10 + 1;
        fv0 fv0Var = (fv0) this.f37689n.get(j3);
        boolean z9 = true;
        if (fv0Var != null) {
            g(j3, fv0Var, i10);
        } else {
            fv0Var = new fv0(getContext(), 1);
            fv0Var.f33643f.setImageDrawable(drawable);
            fv0Var.setFocusable(true);
            fv0Var.setOnClickListener(new kk0(this, 4));
            fv0Var.setExpanded(this.f37682f0);
            fv0Var.a(this.f37685i0);
            this.f37679e.addView(fv0Var, i10);
        }
        fv0Var.d = false;
        fv0Var.setTag(2131296461, Integer.valueOf(i10));
        if (i10 != this.D) {
            z9 = false;
        }
        fv0Var.setSelected(z9);
        this.h.put(j3, fv0Var);
        return fv0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f37675b0 = false;
        org.telegram.messenger.g0.r(this.f37680e0);
    }

    public final void d(boolean z9) {
        this.f37689n = this.h;
        this.h = new HashMap();
        this.f37694r.clear();
        this.f37700y = 0;
        if (z9) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new nk0(this, 0));
            TransitionManager.beginDelayedTransition(this.f37679e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.c61 c61Var;
        float f10;
        Canvas canvas2;
        View view;
        float f11;
        float f12;
        float textWidth;
        float b10;
        float b11;
        float f13;
        float f14;
        float f15 = this.f37687k0 - this.f37686j0;
        float f16 = (1.0f - this.f37685i0) * this.f37688l0;
        int i7 = 0;
        while (true) {
            c61Var = this.f37679e;
            if (i7 >= c61Var.getChildCount()) {
                break;
            }
            if (c61Var.getChildAt(i7) instanceof fv0) {
                fv0 fv0Var = (fv0) c61Var.getChildAt(i7);
                float f17 = fv0Var.D;
                if (fv0Var.getLeft() != f17 && fv0Var.E) {
                    fv0Var.f33640b = f17 - fv0Var.getLeft();
                    ValueAnimator valueAnimator = fv0Var.f33649y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fv0Var.f33649y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fv0Var.f33640b, 0.0f);
                    fv0Var.f33649y = ofFloat;
                    ofFloat.addUpdateListener(new ev0(fv0Var, this, 0));
                    fv0Var.f33649y.addListener(new v50(5, fv0Var, this));
                    fv0Var.f33649y.start();
                }
                fv0Var.E = false;
                if (this.f37683g0) {
                    fv0Var.setTranslationX(com.google.android.recaptcha.internal.a.z(1.0f, this.f37685i0, i7 * f15, f16) + fv0Var.f33640b);
                } else {
                    fv0Var.setTranslationX(fv0Var.f33640b);
                }
            }
            i7++;
        }
        float height = getHeight();
        if (this.f37683g0) {
            height = com.google.android.recaptcha.internal.a.v(1.0f, this.f37685i0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f37691o0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f37692p0.e(false, f10);
        if (!isInEditMode() && this.f37700y != 0 && this.J >= 0) {
            w5 w5Var = this.E;
            float e11 = w5Var.e(false, this.D);
            TimeInterpolator timeInterpolator = w5Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < c61Var.getChildCount()) {
                view = c61Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < c61Var.getChildCount()) {
                view2 = c61Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = e11 - floor;
                f12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.f37685i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.g0.W1(this.f37685i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof fv0) {
                    f13 = ((fv0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof fv0) {
                    f14 = ((fv0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = org.telegram.messenger.g0.T1(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (org.telegram.messenger.g0.W1(this.f37685i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof fv0) {
                        textWidth = ((fv0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (org.telegram.messenger.g0.W1(this.f37685i0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof fv0) {
                            textWidth = ((fv0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(w5Var.b());
            } else {
                b10 = w5Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * L;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(w5Var.b());
            } else {
                b11 = w5Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * L;
            float interpolation = xq.f40347i.getInterpolation(this.f37685i0);
            float W1 = f19 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f11;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = W1 + T12;
            RectF rectF = this.F;
            rectF.set(f12 - T1, W1 - T12, f12 + T1, f21);
            boolean z9 = this.P;
            org.telegram.ui.ActionBar.f6 f6Var = this.O;
            Paint paint = this.f37690n0;
            if (z9) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f37700y != 0 && this.M > 0) {
            int i10 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.M, c61Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i7) {
        if (this.S && i7 >= 0) {
            org.telegram.ui.c61 c61Var = this.f37679e;
            if (i7 < c61Var.getChildCount()) {
                View childAt = c61Var.getChildAt(i7);
                if (childAt instanceof fv0) {
                    fv0 fv0Var = (fv0) childAt;
                    if (fv0Var.f33639a == 0 && !fv0Var.d) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mk0 mk0Var = this.f37680e0;
        if (action == 0 && this.f37696s == null) {
            this.f37675b0 = true;
            org.telegram.messenger.g0.i3(mk0Var, 500L);
            this.W = motionEvent.getX();
            this.f37673a0 = motionEvent.getY();
        }
        if (this.f37675b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f10 = this.G;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.f37673a0) > f10) {
                this.f37675b0 = false;
                org.telegram.messenger.g0.r(mk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        mk0 mk0Var2 = this.f37697s0;
        org.telegram.ui.c61 c61Var = this.f37679e;
        if (action2 == 2 && this.f37696s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i7 = this.U;
            if (ceil != i7) {
                if (ceil < i7) {
                    while (!e(ceil) && ceil != this.U) {
                        ceil++;
                    }
                } else {
                    while (!e(ceil) && ceil != this.U) {
                        ceil--;
                    }
                }
            }
            if (this.U != ceil && e(ceil)) {
                for (int i10 = 0; i10 < c61Var.getChildCount(); i10++) {
                    if (i10 != this.U) {
                        fv0 fv0Var = (fv0) c61Var.getChildAt(i10);
                        fv0Var.D = fv0Var.getLeft();
                        fv0Var.E = true;
                        fv0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                c61Var.removeView(this.f37696s);
                c61Var.addView(this.f37696s, this.U);
                invalidate();
            }
            this.f37678d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f37696s.getMeasuredWidth() / 2.0f) {
                this.f37693q0 = false;
                if (this.f37695r0 <= 0) {
                    this.f37695r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(mk0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f37696s.getMeasuredWidth() / 2.0f)) {
                this.f37693q0 = true;
                if (this.f37695r0 <= 0) {
                    this.f37695r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(mk0Var2, 16L);
            } else {
                this.f37695r0 = -1L;
                org.telegram.messenger.g0.r(mk0Var2);
            }
            c61Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f37695r0 = -1L;
            org.telegram.messenger.g0.r(mk0Var2);
            org.telegram.messenger.g0.r(mk0Var);
            if (this.f37696s != null) {
                int i11 = this.T;
                int i12 = this.U;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < c61Var.getChildCount(); i13++) {
                        c61Var.getChildAt(i13).setTag(2131296461, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c60(this, 11));
                ofFloat.addListener(new e60(this, 15));
                ofFloat.start();
            }
            this.f37675b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i7) {
        HashMap hashMap = this.f37689n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f37694r.put(i7, frameLayout);
    }

    public int getCurrentPosition() {
        return this.D;
    }

    public float getExpandedOffset() {
        if (this.f37683g0) {
            return org.telegram.messenger.g0.L(50.0f) * this.f37685i0;
        }
        return 0.0f;
    }

    public qk0 getType() {
        return this.f37674b;
    }

    public final void h() {
        HashMap hashMap = this.f37689n;
        org.telegram.ui.c61 c61Var = this.f37679e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                c61Var.removeView((View) entry.getValue());
            }
            this.f37689n.clear();
        }
        SparseArray sparseArray = this.f37694r;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            View view = (View) sparseArray.valueAt(i7);
            if (c61Var.indexOfChild(view) != keyAt) {
                c61Var.removeView(view);
                c61Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z9, final float f10) {
        float f11;
        if (this.f37682f0 != z9) {
            this.f37682f0 = z9;
            if (!z9) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f37684h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f37684h0.cancel();
            }
            float f12 = this.f37685i0;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f37684h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    rk0 rk0Var = rk0.this;
                    org.telegram.ui.c61 c61Var = rk0Var.f37679e;
                    if (!z9) {
                        float childCount = rk0Var.f37687k0 * c61Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (rk0Var.getScrollX() + f13) / (rk0Var.f37686j0 * c61Var.getChildCount());
                        float measuredWidth = (childCount - rk0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        rk0Var.f37688l0 = (rk0Var.getScrollX() + f13) - f14;
                    }
                    rk0Var.f37685i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i7 = 0; i7 < c61Var.getChildCount(); i7++) {
                        c61Var.getChildAt(i7).invalidate();
                    }
                    c61Var.invalidate();
                    rk0Var.p();
                }
            });
            this.f37684h0.addListener(new ok0(this, z9, f10, 0));
            this.f37684h0.start();
            org.telegram.ui.c61 c61Var = this.f37679e;
            if (z9) {
                this.f37683g0 = true;
                for (int i7 = 0; i7 < c61Var.getChildCount(); i7++) {
                    View childAt = c61Var.getChildAt(i7);
                    if (childAt instanceof fv0) {
                        ((fv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                }
                c61Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z9) {
                float childCount = this.f37686j0 * c61Var.getChildCount() * ((getScrollX() + f10) / (this.f37687k0 * c61Var.getChildCount()));
                this.f37688l0 = childCount - (getScrollX() + f10);
                this.m0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.D;
        if (i11 != i7) {
            org.telegram.ui.c61 c61Var = this.f37679e;
            View childAt = c61Var.getChildAt(i11);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.D = i7;
            if (i7 >= c61Var.getChildCount()) {
                return;
            }
            int i12 = 0;
            while (true) {
                boolean z9 = true;
                if (i12 >= c61Var.getChildCount()) {
                    break;
                }
                View childAt2 = c61Var.getChildAt(i12);
                if (i12 != i7) {
                    z9 = false;
                }
                childAt2.setSelected(z9);
                i12++;
            }
            if (this.f37684h0 == null) {
                if (i10 == i7 && i7 > 1) {
                    l(i7 - 1);
                } else {
                    l(i7);
                }
            }
            invalidate();
        }
    }

    public final void l(int i7) {
        if (this.f37700y != 0) {
            org.telegram.ui.c61 c61Var = this.f37679e;
            if (c61Var.getChildAt(i7) != null) {
                int left = c61Var.getChildAt(i7).getLeft();
                int i10 = this.L;
                if (i7 > 0) {
                    left -= i10;
                }
                int scrollX = getScrollX();
                if (left != this.N) {
                    if (left < scrollX) {
                        this.N = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                        int width = (i10 * 3) + (left - getWidth());
                        this.N = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i7) {
        if (i7 >= 0 && i7 < this.f37700y) {
            this.f37679e.getChildAt(i7).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        n();
        int i13 = this.m0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.m0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        n();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void q() {
        for (int i7 = 0; i7 < this.f37700y; i7++) {
            View childAt = this.f37679e.getChildAt(i7);
            if (this.f37699x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f37676c);
            }
        }
    }

    public void setCurrentPosition(int i7) {
        this.D = i7;
    }

    public void setDelegate(pk0 pk0Var) {
        this.f37681f = pk0Var;
    }

    public void setDragEnabled(boolean z9) {
        this.S = z9;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.f37672a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.J = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z9) {
        this.f37699x = z9;
        requestLayout();
    }

    public void setType(qk0 qk0Var) {
        if (qk0Var != null && this.f37674b != qk0Var) {
            this.f37674b = qk0Var;
            int ordinal = qk0Var.ordinal();
            GradientDrawable gradientDrawable = this.K;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    float N = org.telegram.messenger.g0.N(3.0f);
                    gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
                    return;
                }
                return;
            }
            gradientDrawable.setCornerRadius(0.0f);
        }
    }

    public void setUnderlineColor(int i7) {
        this.I = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.I = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        if (this.M != i7) {
            this.M = i7;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i7, int i10) {
    }
}
