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
public abstract class wk0 extends HorizontalScrollView {
    public static final int f41375u0 = 0;
    public int E;
    public final u5 F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final org.telegram.ui.ActionBar.e6 P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int f41376a;
    public float f41377a0;
    public vk0 f41378b;
    public float f41379b0;
    public final LinearLayout.LayoutParams f41380c;
    public boolean f41381c0;
    public final LinearLayout.LayoutParams d;
    public float f41382d0;
    public final org.telegram.ui.z51 f41383e;
    public float f41384e0;
    public uk0 f41385f;
    public final rk0 f41386f0;
    public boolean f41387g0;
    public HashMap h;
    public boolean f41388h0;
    public ValueAnimator f41389i0;
    public float f41390j0;
    public final float f41391k0;
    public final float f41392l0;
    public float m0;
    public HashMap f41393n;
    public int f41394n0;
    public final Paint f41395o0;
    public boolean f41396p0;
    public final u5 f41397q0;
    public final SparseArray f41398r;
    public boolean f41399r0;
    public View f41400s;
    public long f41401s0;
    public final rk0 f41402t0;
    public float f41403w;
    public boolean f41404x;
    public int f41405y;

    public wk0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f41376a = 1;
        this.f41378b = vk0.f40458a;
        this.h = new HashMap();
        this.f41393n = new HashMap();
        this.f41398r = new SparseArray();
        er erVar = er.h;
        this.F = new u5(this, 350L, erVar);
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
        this.f41386f0 = new rk0(this, 0);
        this.f41387g0 = false;
        this.f41391k0 = org.telegram.messenger.g0.L(64.0f);
        this.f41392l0 = org.telegram.messenger.g0.L(33.0f);
        this.f41394n0 = -1;
        this.f41395o0 = new Paint();
        this.f41396p0 = true;
        this.f41397q0 = new u5(this, 350L, erVar);
        this.f41402t0 = new rk0(this, 1);
        this.P = e6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(15, context, this);
        this.f41383e = z51Var;
        z51Var.setOrientation(0);
        z51Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(z51Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f41380c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f41388h0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f41405y;
        this.f41405y = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f41393n.get(i10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.ja.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new pk0(this, 3));
            this.f41383e.addView(frameLayout, i11);
        }
        frameLayout.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final hv0 c(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f41405y;
        this.f41405y = i11 + 1;
        hv0 hv0Var = (hv0) this.f41393n.get(i10);
        boolean z10 = true;
        if (hv0Var != null) {
            g(i10, hv0Var, i11);
        } else {
            hv0Var = new hv0(getContext(), 1);
            hv0Var.f35347f.setImageDrawable(drawable);
            hv0Var.setFocusable(true);
            hv0Var.setOnClickListener(new pk0(this, 4));
            hv0Var.setExpanded(this.f41387g0);
            hv0Var.a(this.f41390j0);
            this.f41383e.addView(hv0Var, i11);
        }
        hv0Var.d = false;
        hv0Var.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        hv0Var.setSelected(z10);
        this.h.put(i10, hv0Var);
        return hv0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f41381c0 = false;
        org.telegram.messenger.g0.r(this.f41386f0);
    }

    public final void d(boolean z10) {
        this.f41393n = this.h;
        this.h = new HashMap();
        this.f41398r.clear();
        this.f41405y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new sk0(this, 0));
            TransitionManager.beginDelayedTransition(this.f41383e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.z51 z51Var;
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
        float f15 = this.f41392l0 - this.f41391k0;
        float f16 = (1.0f - this.f41390j0) * this.m0;
        int i7 = 0;
        while (true) {
            z51Var = this.f41383e;
            if (i7 >= z51Var.getChildCount()) {
                break;
            }
            if (z51Var.getChildAt(i7) instanceof hv0) {
                hv0 hv0Var = (hv0) z51Var.getChildAt(i7);
                float f17 = hv0Var.E;
                if (hv0Var.getLeft() != f17 && hv0Var.F) {
                    hv0Var.f35344b = f17 - hv0Var.getLeft();
                    ValueAnimator valueAnimator = hv0Var.f35353y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        hv0Var.f35353y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(hv0Var.f35344b, 0.0f);
                    hv0Var.f35353y = ofFloat;
                    ofFloat.addUpdateListener(new gv0(hv0Var, this, 0));
                    hv0Var.f35353y.addListener(new y50(5, hv0Var, this));
                    hv0Var.f35353y.start();
                }
                hv0Var.F = false;
                if (this.f41388h0) {
                    hv0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f41390j0, i7 * f15, f16) + hv0Var.f35344b);
                } else {
                    hv0Var.setTranslationX(hv0Var.f35344b);
                }
            }
            i7++;
        }
        float height = getHeight();
        if (this.f41388h0) {
            height = com.google.android.gms.internal.vision.e2.t(1.0f, this.f41390j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f41396p0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f41397q0.e(false, f10);
        if (!isInEditMode() && this.f41405y != 0 && this.K >= 0) {
            u5 u5Var = this.F;
            float e11 = u5Var.e(false, this.E);
            TimeInterpolator timeInterpolator = u5Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < z51Var.getChildCount()) {
                view = z51Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < z51Var.getChildCount()) {
                view2 = z51Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = e11 - floor;
                f12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.f41390j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.g0.W1(this.f41390j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof hv0) {
                    f13 = ((hv0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof hv0) {
                    f14 = ((hv0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = org.telegram.messenger.g0.T1(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (org.telegram.messenger.g0.W1(this.f41390j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof hv0) {
                        textWidth = ((hv0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (org.telegram.messenger.g0.W1(this.f41390j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof hv0) {
                            textWidth = ((hv0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(u5Var.b());
            } else {
                b10 = u5Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * L;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(u5Var.b());
            } else {
                b11 = u5Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * L;
            float interpolation = er.f34421i.getInterpolation(this.f41390j0);
            float W1 = f19 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f11;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f12 - T1, W1 - T12, f12 + T1, f21);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.e6 e6Var = this.P;
            Paint paint = this.f41395o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, e6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f41405y != 0 && this.N > 0) {
            int i10 = this.J;
            Paint paint2 = this.I;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.N, z51Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i7) {
        if (this.T && i7 >= 0) {
            org.telegram.ui.z51 z51Var = this.f41383e;
            if (i7 < z51Var.getChildCount()) {
                View childAt = z51Var.getChildAt(i7);
                if (childAt instanceof hv0) {
                    hv0 hv0Var = (hv0) childAt;
                    if (hv0Var.f35343a == 0 && !hv0Var.d) {
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
        rk0 rk0Var = this.f41386f0;
        if (action == 0 && this.f41400s == null) {
            this.f41381c0 = true;
            org.telegram.messenger.g0.i3(rk0Var, 500L);
            this.f41377a0 = motionEvent.getX();
            this.f41379b0 = motionEvent.getY();
        }
        if (this.f41381c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f41377a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.f41379b0) > f10) {
                this.f41381c0 = false;
                org.telegram.messenger.g0.r(rk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        rk0 rk0Var2 = this.f41402t0;
        org.telegram.ui.z51 z51Var = this.f41383e;
        if (action2 == 2 && this.f41400s != null) {
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
                for (int i10 = 0; i10 < z51Var.getChildCount(); i10++) {
                    if (i10 != this.V) {
                        hv0 hv0Var = (hv0) z51Var.getChildAt(i10);
                        hv0Var.E = hv0Var.getLeft();
                        hv0Var.F = true;
                        hv0Var.invalidate();
                    }
                }
                this.W += (ceil - this.V) * getTabSize();
                this.V = ceil;
                z51Var.removeView(this.f41400s);
                z51Var.addView(this.f41400s, this.V);
                invalidate();
            }
            this.f41384e0 = this.f41377a0 - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f41400s.getMeasuredWidth() / 2.0f) {
                this.f41399r0 = false;
                if (this.f41401s0 <= 0) {
                    this.f41401s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(rk0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f41400s.getMeasuredWidth() / 2.0f)) {
                this.f41399r0 = true;
                if (this.f41401s0 <= 0) {
                    this.f41401s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(rk0Var2, 16L);
            } else {
                this.f41401s0 = -1L;
                org.telegram.messenger.g0.r(rk0Var2);
            }
            z51Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f41401s0 = -1L;
            org.telegram.messenger.g0.r(rk0Var2);
            org.telegram.messenger.g0.r(rk0Var);
            if (this.f41400s != null) {
                int i11 = this.U;
                int i12 = this.V;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < z51Var.getChildCount(); i13++) {
                        z51Var.getChildAt(i13).setTag(2131296461, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f60(this, 11));
                ofFloat.addListener(new h60(this, 15));
                ofFloat.start();
            }
            this.f41381c0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i7) {
        HashMap hashMap = this.f41393n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f41398r.put(i7, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.f41388h0) {
            return org.telegram.messenger.g0.L(50.0f) * this.f41390j0;
        }
        return 0.0f;
    }

    public vk0 getType() {
        return this.f41378b;
    }

    public final void h() {
        HashMap hashMap = this.f41393n;
        org.telegram.ui.z51 z51Var = this.f41383e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                z51Var.removeView((View) entry.getValue());
            }
            this.f41393n.clear();
        }
        SparseArray sparseArray = this.f41398r;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            int keyAt = sparseArray.keyAt(i7);
            View view = (View) sparseArray.valueAt(i7);
            if (z51Var.indexOfChild(view) != keyAt) {
                z51Var.removeView(view);
                z51Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f10) {
        float f11;
        if (this.f41387g0 != z10) {
            this.f41387g0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f41389i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f41389i0.cancel();
            }
            float f12 = this.f41390j0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f41389i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    wk0 wk0Var = wk0.this;
                    org.telegram.ui.z51 z51Var = wk0Var.f41383e;
                    if (!z10) {
                        float childCount = wk0Var.f41392l0 * z51Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (wk0Var.getScrollX() + f13) / (wk0Var.f41391k0 * z51Var.getChildCount());
                        float measuredWidth = (childCount - wk0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        wk0Var.m0 = (wk0Var.getScrollX() + f13) - f14;
                    }
                    wk0Var.f41390j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i7 = 0; i7 < z51Var.getChildCount(); i7++) {
                        z51Var.getChildAt(i7).invalidate();
                    }
                    z51Var.invalidate();
                    wk0Var.p();
                }
            });
            this.f41389i0.addListener(new tk0(this, z10, f10, 0));
            this.f41389i0.start();
            org.telegram.ui.z51 z51Var = this.f41383e;
            if (z10) {
                this.f41388h0 = true;
                for (int i7 = 0; i7 < z51Var.getChildCount(); i7++) {
                    View childAt = z51Var.getChildAt(i7);
                    if (childAt instanceof hv0) {
                        ((hv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                }
                z51Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f41391k0 * z51Var.getChildCount() * ((getScrollX() + f10) / (this.f41392l0 * z51Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.f41394n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.E;
        if (i11 != i7) {
            org.telegram.ui.z51 z51Var = this.f41383e;
            View childAt = z51Var.getChildAt(i11);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.E = i7;
            if (i7 >= z51Var.getChildCount()) {
                return;
            }
            int i12 = 0;
            while (true) {
                boolean z10 = true;
                if (i12 >= z51Var.getChildCount()) {
                    break;
                }
                View childAt2 = z51Var.getChildAt(i12);
                if (i12 != i7) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i12++;
            }
            if (this.f41389i0 == null) {
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
        if (this.f41405y != 0) {
            org.telegram.ui.z51 z51Var = this.f41383e;
            if (z51Var.getChildAt(i7) != null) {
                int left = z51Var.getChildAt(i7).getLeft();
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
        if (i7 >= 0 && i7 < this.f41405y) {
            this.f41383e.getChildAt(i7).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.n():void");
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
        int i13 = this.f41394n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.f41394n0 = -1;
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
        for (int i7 = 0; i7 < this.f41405y; i7++) {
            View childAt = this.f41383e.getChildAt(i7);
            if (this.f41404x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f41380c);
            }
        }
    }

    public void setCurrentPosition(int i7) {
        this.E = i7;
    }

    public void setDelegate(uk0 uk0Var) {
        this.f41385f = uk0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.f41376a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.K = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f41404x = z10;
        requestLayout();
    }

    public void setType(vk0 vk0Var) {
        if (vk0Var != null && this.f41378b != vk0Var) {
            this.f41378b = vk0Var;
            int ordinal = vk0Var.ordinal();
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
