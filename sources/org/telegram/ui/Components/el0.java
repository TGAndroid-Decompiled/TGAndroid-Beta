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
public abstract class el0 extends HorizontalScrollView {
    public static final int f34734u0 = 0;
    public int E;
    public final c6 F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final org.telegram.ui.ActionBar.i6 P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int f34735a;
    public float f34736a0;
    public dl0 f34737b;
    public float f34738b0;
    public final LinearLayout.LayoutParams f34739c;
    public boolean f34740c0;
    public final LinearLayout.LayoutParams d;
    public float f34741d0;
    public final org.telegram.ui.d61 f34742e;
    public float f34743e0;
    public cl0 f34744f;
    public final zk0 f34745f0;
    public boolean f34746g0;
    public HashMap h;
    public boolean f34747h0;
    public ValueAnimator f34748i0;
    public float f34749j0;
    public final float f34750k0;
    public final float f34751l0;
    public float m0;
    public HashMap f34752n;
    public int f34753n0;
    public final Paint f34754o0;
    public boolean f34755p0;
    public final c6 f34756q0;
    public final SparseArray f34757r;
    public boolean f34758r0;
    public View f34759s;
    public long f34760s0;
    public final zk0 f34761t0;
    public float f34762w;
    public boolean f34763x;
    public int f34764y;

    public el0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f34735a = 1;
        this.f34737b = dl0.f34464a;
        this.h = new HashMap();
        this.f34752n = new HashMap();
        this.f34757r = new SparseArray();
        lr lrVar = lr.h;
        this.F = new c6(this, 350L, lrVar);
        new RectF();
        new RectF();
        this.G = new RectF();
        this.J = 436207616;
        this.L = new GradientDrawable();
        this.M = org.telegram.messenger.g0.L(33.0f);
        this.N = org.telegram.messenger.g0.L(2.0f);
        org.telegram.messenger.g0.L(12.0f);
        org.telegram.messenger.g0.L(24.0f);
        this.O = 0;
        this.R = new SparseArray();
        this.S = new SparseArray();
        this.f34745f0 = new zk0(this, 0);
        this.f34746g0 = false;
        this.f34750k0 = org.telegram.messenger.g0.L(64.0f);
        this.f34751l0 = org.telegram.messenger.g0.L(33.0f);
        this.f34753n0 = -1;
        this.f34754o0 = new Paint();
        this.f34755p0 = true;
        this.f34756q0 = new c6(this, 350L, lrVar);
        this.f34761t0 = new zk0(this, 1);
        this.P = i6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(14, context, this);
        this.f34742e = d61Var;
        d61Var.setOrientation(0);
        d61Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(d61Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f34739c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f34747h0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f34764y;
        this.f34764y = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f34752n.get(i10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new xk0(this, 3));
            this.f34742e.addView(frameLayout, i11);
        }
        frameLayout.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final pv0 c(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f34764y;
        this.f34764y = i11 + 1;
        pv0 pv0Var = (pv0) this.f34752n.get(i10);
        boolean z10 = true;
        if (pv0Var != null) {
            g(i10, pv0Var, i11);
        } else {
            pv0Var = new pv0(getContext(), 1);
            pv0Var.f38572f.setImageDrawable(drawable);
            pv0Var.setFocusable(true);
            pv0Var.setOnClickListener(new xk0(this, 4));
            pv0Var.setExpanded(this.f34746g0);
            pv0Var.a(this.f34749j0);
            this.f34742e.addView(pv0Var, i11);
        }
        pv0Var.d = false;
        pv0Var.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        pv0Var.setSelected(z10);
        this.h.put(i10, pv0Var);
        return pv0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f34740c0 = false;
        org.telegram.messenger.g0.r(this.f34745f0);
    }

    public final void d(boolean z10) {
        this.f34752n = this.h;
        this.h = new HashMap();
        this.f34757r.clear();
        this.f34764y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new al0(this, 0));
            TransitionManager.beginDelayedTransition(this.f34742e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.d61 d61Var;
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
        float f15 = this.f34751l0 - this.f34750k0;
        float f16 = (1.0f - this.f34749j0) * this.m0;
        int i7 = 0;
        while (true) {
            d61Var = this.f34742e;
            if (i7 >= d61Var.getChildCount()) {
                break;
            }
            if (d61Var.getChildAt(i7) instanceof pv0) {
                pv0 pv0Var = (pv0) d61Var.getChildAt(i7);
                float f17 = pv0Var.E;
                if (pv0Var.getLeft() != f17 && pv0Var.F) {
                    pv0Var.f38569b = f17 - pv0Var.getLeft();
                    ValueAnimator valueAnimator = pv0Var.f38578y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pv0Var.f38578y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(pv0Var.f38569b, 0.0f);
                    pv0Var.f38578y = ofFloat;
                    ofFloat.addUpdateListener(new ov0(pv0Var, this, 0));
                    pv0Var.f38578y.addListener(new h60(5, pv0Var, this));
                    pv0Var.f38578y.start();
                }
                pv0Var.F = false;
                if (this.f34747h0) {
                    pv0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f34749j0, i7 * f15, f16) + pv0Var.f38569b);
                } else {
                    pv0Var.setTranslationX(pv0Var.f38569b);
                }
            }
            i7++;
        }
        float height = getHeight();
        if (this.f34747h0) {
            height = com.google.android.gms.internal.vision.e2.t(1.0f, this.f34749j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f34755p0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f34756q0.e(false, f10);
        if (!isInEditMode() && this.f34764y != 0 && this.K >= 0) {
            c6 c6Var = this.F;
            float e11 = c6Var.e(false, this.E);
            TimeInterpolator timeInterpolator = c6Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < d61Var.getChildCount()) {
                view = d61Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < d61Var.getChildCount()) {
                view2 = d61Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = e11 - floor;
                f12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.f34749j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.g0.W1(this.f34749j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof pv0) {
                    f13 = ((pv0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof pv0) {
                    f14 = ((pv0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = org.telegram.messenger.g0.T1(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (org.telegram.messenger.g0.W1(this.f34749j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof pv0) {
                        textWidth = ((pv0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (org.telegram.messenger.g0.W1(this.f34749j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof pv0) {
                            textWidth = ((pv0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b10 = c6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * L;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b11 = c6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * L;
            float interpolation = lr.f37210i.getInterpolation(this.f34749j0);
            float W1 = f19 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f11;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f12 - T1, W1 - T12, f12 + T1, f21);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.i6 i6Var = this.P;
            Paint paint = this.f34754o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f34764y != 0 && this.N > 0) {
            int i10 = this.J;
            Paint paint2 = this.I;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.N, d61Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i7) {
        if (this.T && i7 >= 0) {
            org.telegram.ui.d61 d61Var = this.f34742e;
            if (i7 < d61Var.getChildCount()) {
                View childAt = d61Var.getChildAt(i7);
                if (childAt instanceof pv0) {
                    pv0 pv0Var = (pv0) childAt;
                    if (pv0Var.f38568a == 0 && !pv0Var.d) {
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
        zk0 zk0Var = this.f34745f0;
        if (action == 0 && this.f34759s == null) {
            this.f34740c0 = true;
            org.telegram.messenger.g0.h3(zk0Var, 500L);
            this.f34736a0 = motionEvent.getX();
            this.f34738b0 = motionEvent.getY();
        }
        if (this.f34740c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f34736a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.f34738b0) > f10) {
                this.f34740c0 = false;
                org.telegram.messenger.g0.r(zk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        zk0 zk0Var2 = this.f34761t0;
        org.telegram.ui.d61 d61Var = this.f34742e;
        if (action2 == 2 && this.f34759s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i7 = this.V;
            if (ceil != i7) {
                if (ceil < i7) {
                    while (!e(ceil) && ceil != this.V) {
                        ceil++;
                    }
                } else {
                    while (!e(ceil) && ceil != this.V) {
                        ceil--;
                    }
                }
            }
            if (this.V != ceil && e(ceil)) {
                for (int i10 = 0; i10 < d61Var.getChildCount(); i10++) {
                    if (i10 != this.V) {
                        pv0 pv0Var = (pv0) d61Var.getChildAt(i10);
                        pv0Var.E = pv0Var.getLeft();
                        pv0Var.F = true;
                        pv0Var.invalidate();
                    }
                }
                this.W += (ceil - this.V) * getTabSize();
                this.V = ceil;
                d61Var.removeView(this.f34759s);
                d61Var.addView(this.f34759s, this.V);
                invalidate();
            }
            this.f34743e0 = this.f34736a0 - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f34759s.getMeasuredWidth() / 2.0f) {
                this.f34758r0 = false;
                if (this.f34760s0 <= 0) {
                    this.f34760s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.h3(zk0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f34759s.getMeasuredWidth() / 2.0f)) {
                this.f34758r0 = true;
                if (this.f34760s0 <= 0) {
                    this.f34760s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.h3(zk0Var2, 16L);
            } else {
                this.f34760s0 = -1L;
                org.telegram.messenger.g0.r(zk0Var2);
            }
            d61Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f34760s0 = -1L;
            org.telegram.messenger.g0.r(zk0Var2);
            org.telegram.messenger.g0.r(zk0Var);
            if (this.f34759s != null) {
                int i11 = this.U;
                int i12 = this.V;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
                        d61Var.getChildAt(i13).setTag(2131296461, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e60(this, 13));
                ofFloat.addListener(new q60(this, 15));
                ofFloat.start();
            }
            this.f34740c0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i7) {
        HashMap hashMap = this.f34752n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f34757r.put(i7, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.f34747h0) {
            return org.telegram.messenger.g0.L(50.0f) * this.f34749j0;
        }
        return 0.0f;
    }

    public dl0 getType() {
        return this.f34737b;
    }

    public final void h() {
        HashMap hashMap = this.f34752n;
        org.telegram.ui.d61 d61Var = this.f34742e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                d61Var.removeView((View) entry.getValue());
            }
            this.f34752n.clear();
        }
        SparseArray sparseArray = this.f34757r;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            View view = (View) sparseArray.valueAt(i7);
            if (d61Var.indexOfChild(view) != keyAt) {
                d61Var.removeView(view);
                d61Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f10) {
        float f11;
        if (this.f34746g0 != z10) {
            this.f34746g0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f34748i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f34748i0.cancel();
            }
            float f12 = this.f34749j0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f34748i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    el0 el0Var = el0.this;
                    org.telegram.ui.d61 d61Var = el0Var.f34742e;
                    if (!z10) {
                        float childCount = el0Var.f34751l0 * d61Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (el0Var.getScrollX() + f13) / (el0Var.f34750k0 * d61Var.getChildCount());
                        float measuredWidth = (childCount - el0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        el0Var.m0 = (el0Var.getScrollX() + f13) - f14;
                    }
                    el0Var.f34749j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                        d61Var.getChildAt(i7).invalidate();
                    }
                    d61Var.invalidate();
                    el0Var.p();
                }
            });
            this.f34748i0.addListener(new bl0(this, z10, f10, 0));
            this.f34748i0.start();
            org.telegram.ui.d61 d61Var = this.f34742e;
            if (z10) {
                this.f34747h0 = true;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    View childAt = d61Var.getChildAt(i7);
                    if (childAt instanceof pv0) {
                        ((pv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                }
                d61Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f34750k0 * d61Var.getChildCount() * ((getScrollX() + f10) / (this.f34751l0 * d61Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.f34753n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.E;
        if (i11 != i7) {
            org.telegram.ui.d61 d61Var = this.f34742e;
            View childAt = d61Var.getChildAt(i11);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.E = i7;
            if (i7 >= d61Var.getChildCount()) {
                return;
            }
            int i12 = 0;
            while (true) {
                boolean z10 = true;
                if (i12 >= d61Var.getChildCount()) {
                    break;
                }
                View childAt2 = d61Var.getChildAt(i12);
                if (i12 != i7) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i12++;
            }
            if (this.f34748i0 == null) {
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
        if (this.f34764y != 0) {
            org.telegram.ui.d61 d61Var = this.f34742e;
            if (d61Var.getChildAt(i7) != null) {
                int left = d61Var.getChildAt(i7).getLeft();
                int i10 = this.M;
                if (i7 > 0) {
                    left -= i10;
                }
                int scrollX = getScrollX();
                if (left != this.O) {
                    if (left < scrollX) {
                        this.O = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                        int width = (i10 * 3) + (left - getWidth());
                        this.O = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i7) {
        if (i7 >= 0 && i7 < this.f34764y) {
            this.f34742e.getChildAt(i7).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.el0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        n();
        int i13 = this.f34753n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.f34753n0 = -1;
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
        for (int i7 = 0; i7 < this.f34764y; i7++) {
            View childAt = this.f34742e.getChildAt(i7);
            if (this.f34763x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f34739c);
            }
        }
    }

    public void setCurrentPosition(int i7) {
        this.E = i7;
    }

    public void setDelegate(cl0 cl0Var) {
        this.f34744f = cl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.f34735a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.K = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f34763x = z10;
        requestLayout();
    }

    public void setType(dl0 dl0Var) {
        if (dl0Var != null && this.f34737b != dl0Var) {
            this.f34737b = dl0Var;
            int ordinal = dl0Var.ordinal();
            GradientDrawable gradientDrawable = this.L;
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
        this.J = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.J = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        if (this.N != i7) {
            this.N = i7;
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
