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
public abstract class ul0 extends HorizontalScrollView {
    public static final int f30963t0 = 0;
    public int D;
    public final t5 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.p6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f30964a;
    public float f30965a0;
    public tl0 f30966b;
    public boolean f30967b0;
    public final LinearLayout.LayoutParams f30968c;
    public float f30969c0;
    public final LinearLayout.LayoutParams d;
    public float f30970d0;
    public final org.telegram.ui.u71 e;
    public final ql0 f30971e0;
    public sl0 f30972f;
    public boolean f30973f0;
    public boolean f30974g0;
    public HashMap h;
    public ValueAnimator f30975h0;
    public float f30976i0;
    public final float f30977j0;
    public final float f30978k0;
    public float f30979l0;
    public int m0;
    public HashMap f30980n;
    public final Paint f30981n0;
    public boolean f30982o0;
    public final t5 f30983p0;
    public boolean f30984q0;
    public final SparseArray f30985r;
    public long f30986r0;
    public View f30987s;
    public final ql0 f30988s0;
    public float f30989w;
    public boolean f30990x;
    public int f30991y;

    public ul0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f30964a = 1;
        this.f30966b = tl0.f30651a;
        this.h = new HashMap();
        this.f30980n = new HashMap();
        this.f30985r = new SparseArray();
        gr grVar = gr.h;
        this.E = new t5(this, 350L, grVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = org.telegram.messenger.i0.L(33.0f);
        this.M = org.telegram.messenger.i0.L(2.0f);
        org.telegram.messenger.i0.L(12.0f);
        org.telegram.messenger.i0.L(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.f30971e0 = new ql0(this, 0);
        this.f30973f0 = false;
        this.f30977j0 = org.telegram.messenger.i0.L(64.0f);
        this.f30978k0 = org.telegram.messenger.i0.L(33.0f);
        this.m0 = -1;
        this.f30981n0 = new Paint();
        this.f30982o0 = true;
        this.f30983p0 = new t5(this, 350L, grVar);
        this.f30988s0 = new ql0(this, 1);
        this.O = p6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 9);
        this.e = u71Var;
        u71Var.setOrientation(0);
        u71Var.setPadding(org.telegram.messenger.i0.L(9.5f), 0, org.telegram.messenger.i0.L(9.5f), 0);
        addView(u71Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f30968c = new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f30974g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.f30991y;
        this.f30991y = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f30980n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.b6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ol0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(2131296461, Integer.valueOf(i12));
        if (i12 != this.D) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final jw0 c(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.f30991y;
        this.f30991y = i12 + 1;
        jw0 jw0Var = (jw0) this.f30980n.get(i11);
        boolean z10 = true;
        if (jw0Var != null) {
            g(i11, jw0Var, i12);
        } else {
            jw0Var = new jw0(getContext(), 1);
            jw0Var.f27500f.setImageDrawable(drawable);
            jw0Var.setFocusable(true);
            jw0Var.setOnClickListener(new ol0(this, 4));
            jw0Var.setExpanded(this.f30973f0);
            jw0Var.a(this.f30976i0);
            this.e.addView(jw0Var, i12);
        }
        jw0Var.d = false;
        jw0Var.setTag(2131296461, Integer.valueOf(i12));
        if (i12 != this.D) {
            z10 = false;
        }
        jw0Var.setSelected(z10);
        this.h.put(i11, jw0Var);
        return jw0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f30967b0 = false;
        org.telegram.messenger.i0.r(this.f30971e0);
    }

    public final void d(boolean z10) {
        this.f30980n = this.h;
        this.h = new HashMap();
        this.f30985r.clear();
        this.f30991y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new rl0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.u71 u71Var;
        float f7;
        Canvas canvas2;
        View view;
        float f10;
        float f11;
        float textWidth;
        float b10;
        float b11;
        float f12;
        float f13;
        float f14 = this.f30978k0 - this.f30977j0;
        float f15 = (1.0f - this.f30976i0) * this.f30979l0;
        int i10 = 0;
        while (true) {
            u71Var = this.e;
            if (i10 >= u71Var.getChildCount()) {
                break;
            }
            if (u71Var.getChildAt(i10) instanceof jw0) {
                jw0 jw0Var = (jw0) u71Var.getChildAt(i10);
                float f16 = jw0Var.D;
                if (jw0Var.getLeft() != f16 && jw0Var.E) {
                    jw0Var.f27498b = f16 - jw0Var.getLeft();
                    ValueAnimator valueAnimator = jw0Var.f27506y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jw0Var.f27506y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(jw0Var.f27498b, 0.0f);
                    jw0Var.f27506y = ofFloat;
                    ofFloat.addUpdateListener(new hw0(jw0Var, this, 0));
                    jw0Var.f27506y.addListener(new iw0(0, (Object) jw0Var, (Object) this));
                    jw0Var.f27506y.start();
                }
                jw0Var.E = false;
                if (this.f30974g0) {
                    jw0Var.setTranslationX(c3.i0.z(1.0f, this.f30976i0, i10 * f14, f15) + jw0Var.f27498b);
                } else {
                    jw0Var.setTranslationX(jw0Var.f27498b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f30974g0) {
            height = sc.e.z(1.0f, this.f30976i0, org.telegram.messenger.i0.L(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f30982o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.f30983p0.e(false, f7);
        if (!isInEditMode() && this.f30991y != 0 && this.J >= 0) {
            t5 t5Var = this.E;
            float e7 = t5Var.e(false, this.D);
            TimeInterpolator timeInterpolator = t5Var.h;
            double d = e7;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < u71Var.getChildCount()) {
                view = u71Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < u71Var.getChildCount()) {
                view2 = u71Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = e7 - floor;
                f11 = org.telegram.messenger.i0.T1((org.telegram.messenger.i0.W1(this.f30976i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.i0.W1(this.f30976i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof jw0) {
                    f12 = ((jw0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof jw0) {
                    f13 = ((jw0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = org.telegram.messenger.i0.T1(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (org.telegram.messenger.i0.W1(this.f30976i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof jw0) {
                        textWidth = ((jw0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (org.telegram.messenger.i0.W1(this.f30976i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof jw0) {
                            textWidth = ((jw0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float L = org.telegram.messenger.i0.L(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(t5Var.b());
            } else {
                b10 = t5Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * L;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(t5Var.b());
            } else {
                b11 = t5Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * L;
            float interpolation = gr.f26497i.getInterpolation(this.f30976i0);
            float W1 = f18 + org.telegram.messenger.i0.W1(interpolation, 0, org.telegram.messenger.i0.L(26.0f));
            float T1 = org.telegram.messenger.i0.T1(abs, textWidth + org.telegram.messenger.i0.L(10.0f), interpolation) / f10;
            float T12 = (org.telegram.messenger.i0.T1(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = W1 + T12;
            RectF rectF = this.F;
            rectF.set(f11 - T1, W1 - T12, f11 + T1, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.p6 p6Var = this.O;
            Paint paint = this.f30981n0;
            if (z10) {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f30991y != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, u71Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            org.telegram.ui.u71 u71Var = this.e;
            if (i10 < u71Var.getChildCount()) {
                View childAt = u71Var.getChildAt(i10);
                if (childAt instanceof jw0) {
                    jw0 jw0Var = (jw0) childAt;
                    if (jw0Var.f27497a == 0 && !jw0Var.d) {
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
        ql0 ql0Var = this.f30971e0;
        if (action == 0 && this.f30987s == null) {
            this.f30967b0 = true;
            org.telegram.messenger.i0.h3(ql0Var, 500L);
            this.W = motionEvent.getX();
            this.f30965a0 = motionEvent.getY();
        }
        if (this.f30967b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f30965a0) > f7) {
                this.f30967b0 = false;
                org.telegram.messenger.i0.r(ql0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ql0 ql0Var2 = this.f30988s0;
        org.telegram.ui.u71 u71Var = this.e;
        if (action2 == 2 && this.f30987s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i10 = this.U;
            if (ceil != i10) {
                if (ceil < i10) {
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
                for (int i11 = 0; i11 < u71Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        jw0 jw0Var = (jw0) u71Var.getChildAt(i11);
                        jw0Var.D = jw0Var.getLeft();
                        jw0Var.E = true;
                        jw0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                u71Var.removeView(this.f30987s);
                u71Var.addView(this.f30987s, this.U);
                invalidate();
            }
            this.f30970d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f30987s.getMeasuredWidth() / 2.0f) {
                this.f30984q0 = false;
                if (this.f30986r0 <= 0) {
                    this.f30986r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.i0.h3(ql0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f30987s.getMeasuredWidth() / 2.0f)) {
                this.f30984q0 = true;
                if (this.f30986r0 <= 0) {
                    this.f30986r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.i0.h3(ql0Var2, 16L);
            } else {
                this.f30986r0 = -1L;
                org.telegram.messenger.i0.r(ql0Var2);
            }
            u71Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f30986r0 = -1L;
            org.telegram.messenger.i0.r(ql0Var2);
            org.telegram.messenger.i0.r(ql0Var);
            if (this.f30987s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < u71Var.getChildCount(); i14++) {
                        u71Var.getChildAt(i14).setTag(2131296461, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 12));
                ofFloat.addListener(new t60(this, 15));
                ofFloat.start();
            }
            this.f30967b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f30980n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f30985r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.D;
    }

    public float getExpandedOffset() {
        if (this.f30974g0) {
            return org.telegram.messenger.i0.L(50.0f) * this.f30976i0;
        }
        return 0.0f;
    }

    public tl0 getType() {
        return this.f30966b;
    }

    public final void h() {
        HashMap hashMap = this.f30980n;
        org.telegram.ui.u71 u71Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                u71Var.removeView((View) entry.getValue());
            }
            this.f30980n.clear();
        }
        SparseArray sparseArray = this.f30985r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (u71Var.indexOfChild(view) != keyAt) {
                u71Var.removeView(view);
                u71Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f7) {
        float f10;
        if (this.f30973f0 != z10) {
            this.f30973f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f30975h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30975h0.cancel();
            }
            float f11 = this.f30976i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30975h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ul0 ul0Var = ul0.this;
                    org.telegram.ui.u71 u71Var = ul0Var.e;
                    if (!z10) {
                        float childCount = ul0Var.f30978k0 * u71Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (ul0Var.getScrollX() + f12) / (ul0Var.f30977j0 * u71Var.getChildCount());
                        float measuredWidth = (childCount - ul0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        ul0Var.f30979l0 = (ul0Var.getScrollX() + f12) - f13;
                    }
                    ul0Var.f30976i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                        u71Var.getChildAt(i10).invalidate();
                    }
                    u71Var.invalidate();
                    ul0Var.p();
                }
            });
            this.f30975h0.addListener(new oh.n(this, z10, f7, 1));
            this.f30975h0.start();
            org.telegram.ui.u71 u71Var = this.e;
            if (z10) {
                this.f30974g0 = true;
                for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                    View childAt = u71Var.getChildAt(i10);
                    if (childAt instanceof jw0) {
                        ((jw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.i0.L(64.0f);
                }
                u71Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.i0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f30977j0 * u71Var.getChildCount() * ((getScrollX() + f7) / (this.f30978k0 * u71Var.getChildCount()));
                this.f30979l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.D;
        if (i12 != i10) {
            org.telegram.ui.u71 u71Var = this.e;
            View childAt = u71Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.D = i10;
            if (i10 >= u71Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= u71Var.getChildCount()) {
                    break;
                }
                View childAt2 = u71Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f30975h0 == null) {
                if (i11 == i10 && i10 > 1) {
                    l(i10 - 1);
                } else {
                    l(i10);
                }
            }
            invalidate();
        }
    }

    public final void l(int i10) {
        if (this.f30991y != 0) {
            org.telegram.ui.u71 u71Var = this.e;
            if (u71Var.getChildAt(i10) != null) {
                int left = u71Var.getChildAt(i10).getLeft();
                int i11 = this.L;
                if (i10 > 0) {
                    left -= i11;
                }
                int scrollX = getScrollX();
                if (left != this.N) {
                    if (left < scrollX) {
                        this.N = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                        int width = (i11 * 3) + (left - getWidth());
                        this.N = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i10) {
        if (i10 >= 0 && i10 < this.f30991y) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ul0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
        int i14 = this.m0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.m0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
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
        for (int i10 = 0; i10 < this.f30991y; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f30990x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f30968c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.D = i10;
    }

    public void setDelegate(sl0 sl0Var) {
        this.f30972f = sl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f30964a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f30990x = z10;
        requestLayout();
    }

    public void setType(tl0 tl0Var) {
        if (tl0Var != null && this.f30966b != tl0Var) {
            this.f30966b = tl0Var;
            int ordinal = tl0Var.ordinal();
            GradientDrawable gradientDrawable = this.K;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    float N = org.telegram.messenger.i0.N(3.0f);
                    gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
                    return;
                }
                return;
            }
            gradientDrawable.setCornerRadius(0.0f);
        }
    }

    public void setUnderlineColor(int i10) {
        this.I = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.I = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.M != i10) {
            this.M = i10;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i10, int i11) {
    }
}
