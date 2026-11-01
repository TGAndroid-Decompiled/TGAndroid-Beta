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
public abstract class vl0 extends HorizontalScrollView {
    public static final int f31315t0 = 0;
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
    public int f31316a;
    public float f31317a0;
    public ul0 f31318b;
    public boolean f31319b0;
    public final LinearLayout.LayoutParams f31320c;
    public float f31321c0;
    public final LinearLayout.LayoutParams d;
    public float f31322d0;
    public final org.telegram.ui.s71 e;
    public final rl0 f31323e0;
    public tl0 f31324f;
    public boolean f31325f0;
    public boolean f31326g0;
    public HashMap h;
    public ValueAnimator f31327h0;
    public float f31328i0;
    public final float f31329j0;
    public final float f31330k0;
    public float f31331l0;
    public int m0;
    public HashMap f31332n;
    public final Paint f31333n0;
    public boolean f31334o0;
    public final t5 f31335p0;
    public boolean f31336q0;
    public final SparseArray f31337r;
    public long f31338r0;
    public View f31339s;
    public final rl0 f31340s0;
    public float f31341w;
    public boolean f31342x;
    public int f31343y;

    public vl0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f31316a = 1;
        this.f31318b = ul0.f31036a;
        this.h = new HashMap();
        this.f31332n = new HashMap();
        this.f31337r = new SparseArray();
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
        this.f31323e0 = new rl0(this, 0);
        this.f31325f0 = false;
        this.f31329j0 = org.telegram.messenger.i0.L(64.0f);
        this.f31330k0 = org.telegram.messenger.i0.L(33.0f);
        this.m0 = -1;
        this.f31333n0 = new Paint();
        this.f31334o0 = true;
        this.f31335p0 = new t5(this, 350L, grVar);
        this.f31340s0 = new rl0(this, 1);
        this.O = p6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.s71 s71Var = new org.telegram.ui.s71(this, context, 9);
        this.e = s71Var;
        s71Var.setOrientation(0);
        s71Var.setPadding(org.telegram.messenger.i0.L(9.5f), 0, org.telegram.messenger.i0.L(9.5f), 0);
        addView(s71Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f31320c = new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f31326g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.f31343y;
        this.f31343y = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f31332n.get(i11);
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
            frameLayout.setOnClickListener(new pl0(this, 3));
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

    public final kw0 c(int i10, Drawable drawable) {
        String i11 = i0.a.i(i10, "tab");
        int i12 = this.f31343y;
        this.f31343y = i12 + 1;
        kw0 kw0Var = (kw0) this.f31332n.get(i11);
        boolean z10 = true;
        if (kw0Var != null) {
            g(i11, kw0Var, i12);
        } else {
            kw0Var = new kw0(getContext(), 1);
            kw0Var.f27967f.setImageDrawable(drawable);
            kw0Var.setFocusable(true);
            kw0Var.setOnClickListener(new pl0(this, 4));
            kw0Var.setExpanded(this.f31325f0);
            kw0Var.a(this.f31328i0);
            this.e.addView(kw0Var, i12);
        }
        kw0Var.d = false;
        kw0Var.setTag(2131296461, Integer.valueOf(i12));
        if (i12 != this.D) {
            z10 = false;
        }
        kw0Var.setSelected(z10);
        this.h.put(i11, kw0Var);
        return kw0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f31319b0 = false;
        org.telegram.messenger.i0.r(this.f31323e0);
    }

    public final void d(boolean z10) {
        this.f31332n = this.h;
        this.h = new HashMap();
        this.f31337r.clear();
        this.f31343y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new sl0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.s71 s71Var;
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
        float f14 = this.f31330k0 - this.f31329j0;
        float f15 = (1.0f - this.f31328i0) * this.f31331l0;
        int i10 = 0;
        while (true) {
            s71Var = this.e;
            if (i10 >= s71Var.getChildCount()) {
                break;
            }
            if (s71Var.getChildAt(i10) instanceof kw0) {
                kw0 kw0Var = (kw0) s71Var.getChildAt(i10);
                float f16 = kw0Var.D;
                if (kw0Var.getLeft() != f16 && kw0Var.E) {
                    kw0Var.f27965b = f16 - kw0Var.getLeft();
                    ValueAnimator valueAnimator = kw0Var.f27973y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        kw0Var.f27973y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kw0Var.f27965b, 0.0f);
                    kw0Var.f27973y = ofFloat;
                    ofFloat.addUpdateListener(new iw0(kw0Var, this, 0));
                    kw0Var.f27973y.addListener(new jw0(0, (Object) kw0Var, (Object) this));
                    kw0Var.f27973y.start();
                }
                kw0Var.E = false;
                if (this.f31326g0) {
                    kw0Var.setTranslationX(c3.i0.z(1.0f, this.f31328i0, i10 * f14, f15) + kw0Var.f27965b);
                } else {
                    kw0Var.setTranslationX(kw0Var.f27965b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f31326g0) {
            height = sc.e.z(1.0f, this.f31328i0, org.telegram.messenger.i0.L(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f31334o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.f31335p0.e(false, f7);
        if (!isInEditMode() && this.f31343y != 0 && this.J >= 0) {
            t5 t5Var = this.E;
            float e7 = t5Var.e(false, this.D);
            TimeInterpolator timeInterpolator = t5Var.h;
            double d = e7;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < s71Var.getChildCount()) {
                view = s71Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < s71Var.getChildCount()) {
                view2 = s71Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = e7 - floor;
                f11 = org.telegram.messenger.i0.T1((org.telegram.messenger.i0.W1(this.f31328i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.i0.W1(this.f31328i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof kw0) {
                    f12 = ((kw0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof kw0) {
                    f13 = ((kw0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = org.telegram.messenger.i0.T1(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (org.telegram.messenger.i0.W1(this.f31328i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof kw0) {
                        textWidth = ((kw0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (org.telegram.messenger.i0.W1(this.f31328i0, org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof kw0) {
                            textWidth = ((kw0) view2).getTextWidth();
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
            float interpolation = gr.f26525i.getInterpolation(this.f31328i0);
            float W1 = f18 + org.telegram.messenger.i0.W1(interpolation, 0, org.telegram.messenger.i0.L(26.0f));
            float T1 = org.telegram.messenger.i0.T1(abs, textWidth + org.telegram.messenger.i0.L(10.0f), interpolation) / f10;
            float T12 = (org.telegram.messenger.i0.T1(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = W1 + T12;
            RectF rectF = this.F;
            rectF.set(f11 - T1, W1 - T12, f11 + T1, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.p6 p6Var = this.O;
            Paint paint = this.f31333n0;
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
        if (!isInEditMode() && this.f31343y != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, s71Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            org.telegram.ui.s71 s71Var = this.e;
            if (i10 < s71Var.getChildCount()) {
                View childAt = s71Var.getChildAt(i10);
                if (childAt instanceof kw0) {
                    kw0 kw0Var = (kw0) childAt;
                    if (kw0Var.f27964a == 0 && !kw0Var.d) {
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
        rl0 rl0Var = this.f31323e0;
        if (action == 0 && this.f31339s == null) {
            this.f31319b0 = true;
            org.telegram.messenger.i0.h3(rl0Var, 500L);
            this.W = motionEvent.getX();
            this.f31317a0 = motionEvent.getY();
        }
        if (this.f31319b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f31317a0) > f7) {
                this.f31319b0 = false;
                org.telegram.messenger.i0.r(rl0Var);
            }
        }
        int action2 = motionEvent.getAction();
        rl0 rl0Var2 = this.f31340s0;
        org.telegram.ui.s71 s71Var = this.e;
        if (action2 == 2 && this.f31339s != null) {
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
                for (int i11 = 0; i11 < s71Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        kw0 kw0Var = (kw0) s71Var.getChildAt(i11);
                        kw0Var.D = kw0Var.getLeft();
                        kw0Var.E = true;
                        kw0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                s71Var.removeView(this.f31339s);
                s71Var.addView(this.f31339s, this.U);
                invalidate();
            }
            this.f31322d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f31339s.getMeasuredWidth() / 2.0f) {
                this.f31336q0 = false;
                if (this.f31338r0 <= 0) {
                    this.f31338r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.i0.h3(rl0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f31339s.getMeasuredWidth() / 2.0f)) {
                this.f31336q0 = true;
                if (this.f31338r0 <= 0) {
                    this.f31338r0 = System.currentTimeMillis();
                }
                org.telegram.messenger.i0.h3(rl0Var2, 16L);
            } else {
                this.f31338r0 = -1L;
                org.telegram.messenger.i0.r(rl0Var2);
            }
            s71Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f31338r0 = -1L;
            org.telegram.messenger.i0.r(rl0Var2);
            org.telegram.messenger.i0.r(rl0Var);
            if (this.f31339s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < s71Var.getChildCount(); i14++) {
                        s71Var.getChildAt(i14).setTag(2131296461, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 12));
                ofFloat.addListener(new t60(this, 15));
                ofFloat.start();
            }
            this.f31319b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f31332n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f31337r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.D;
    }

    public float getExpandedOffset() {
        if (this.f31326g0) {
            return org.telegram.messenger.i0.L(50.0f) * this.f31328i0;
        }
        return 0.0f;
    }

    public ul0 getType() {
        return this.f31318b;
    }

    public final void h() {
        HashMap hashMap = this.f31332n;
        org.telegram.ui.s71 s71Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                s71Var.removeView((View) entry.getValue());
            }
            this.f31332n.clear();
        }
        SparseArray sparseArray = this.f31337r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (s71Var.indexOfChild(view) != keyAt) {
                s71Var.removeView(view);
                s71Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f7) {
        float f10;
        if (this.f31325f0 != z10) {
            this.f31325f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f31327h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31327h0.cancel();
            }
            float f11 = this.f31328i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f31327h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vl0 vl0Var = vl0.this;
                    org.telegram.ui.s71 s71Var = vl0Var.e;
                    if (!z10) {
                        float childCount = vl0Var.f31330k0 * s71Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (vl0Var.getScrollX() + f12) / (vl0Var.f31329j0 * s71Var.getChildCount());
                        float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        vl0Var.f31331l0 = (vl0Var.getScrollX() + f12) - f13;
                    }
                    vl0Var.f31328i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < s71Var.getChildCount(); i10++) {
                        s71Var.getChildAt(i10).invalidate();
                    }
                    s71Var.invalidate();
                    vl0Var.p();
                }
            });
            this.f31327h0.addListener(new oh.n(this, z10, f7, 1));
            this.f31327h0.start();
            org.telegram.ui.s71 s71Var = this.e;
            if (z10) {
                this.f31326g0 = true;
                for (int i10 = 0; i10 < s71Var.getChildCount(); i10++) {
                    View childAt = s71Var.getChildAt(i10);
                    if (childAt instanceof kw0) {
                        ((kw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.i0.L(64.0f);
                }
                s71Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.i0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f31329j0 * s71Var.getChildCount() * ((getScrollX() + f7) / (this.f31330k0 * s71Var.getChildCount()));
                this.f31331l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.D;
        if (i12 != i10) {
            org.telegram.ui.s71 s71Var = this.e;
            View childAt = s71Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.D = i10;
            if (i10 >= s71Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= s71Var.getChildCount()) {
                    break;
                }
                View childAt2 = s71Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f31327h0 == null) {
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
        if (this.f31343y != 0) {
            org.telegram.ui.s71 s71Var = this.e;
            if (s71Var.getChildAt(i10) != null) {
                int left = s71Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f31343y) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vl0.n():void");
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
        for (int i10 = 0; i10 < this.f31343y; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f31342x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f31320c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.D = i10;
    }

    public void setDelegate(tl0 tl0Var) {
        this.f31324f = tl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f31316a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f31342x = z10;
        requestLayout();
    }

    public void setType(ul0 ul0Var) {
        if (ul0Var != null && this.f31318b != ul0Var) {
            this.f31318b = ul0Var;
            int ordinal = ul0Var.ordinal();
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
