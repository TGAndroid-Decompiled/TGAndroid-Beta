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
public abstract class gl0 extends HorizontalScrollView {
    public static final int f35563u0 = 0;
    public int E;
    public final d6 F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final org.telegram.ui.ActionBar.h6 P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int f35564a;
    public float f35565a0;
    public fl0 f35566b;
    public float f35567b0;
    public final LinearLayout.LayoutParams f35568c;
    public boolean f35569c0;
    public final LinearLayout.LayoutParams d;
    public float f35570d0;
    public final org.telegram.ui.d61 f35571e;
    public float f35572e0;
    public el0 f35573f;
    public final bl0 f35574f0;
    public boolean f35575g0;
    public HashMap h;
    public boolean f35576h0;
    public ValueAnimator f35577i0;
    public float f35578j0;
    public final float f35579k0;
    public final float f35580l0;
    public float m0;
    public HashMap f35581n;
    public int f35582n0;
    public final Paint f35583o0;
    public boolean f35584p0;
    public final d6 f35585q0;
    public final SparseArray f35586r;
    public boolean f35587r0;
    public View f35588s;
    public long f35589s0;
    public final bl0 f35590t0;
    public float f35591w;
    public boolean f35592x;
    public int f35593y;

    public gl0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.f35564a = 1;
        this.f35566b = fl0.f35237a;
        this.h = new HashMap();
        this.f35581n = new HashMap();
        this.f35586r = new SparseArray();
        nr nrVar = nr.h;
        this.F = new d6(this, 350L, nrVar);
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
        this.f35574f0 = new bl0(this, 0);
        this.f35575g0 = false;
        this.f35579k0 = org.telegram.messenger.g0.L(64.0f);
        this.f35580l0 = org.telegram.messenger.g0.L(33.0f);
        this.f35582n0 = -1;
        this.f35583o0 = new Paint();
        this.f35584p0 = true;
        this.f35585q0 = new d6(this, 350L, nrVar);
        this.f35590t0 = new bl0(this, 1);
        this.P = h6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(14, context, this);
        this.f35571e = d61Var;
        d61Var.setOrientation(0);
        d61Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(d61Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f35568c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f35576h0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final FrameLayout b(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f35593y;
        this.f35593y = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f35581n.get(i10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, c8.na.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new zk0(this, 3));
            this.f35571e.addView(frameLayout, i11);
        }
        frameLayout.setTag(2131296463, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final sv0 c(int i7, Drawable drawable) {
        String i10 = i5.c.i(i7, "tab");
        int i11 = this.f35593y;
        this.f35593y = i11 + 1;
        sv0 sv0Var = (sv0) this.f35581n.get(i10);
        boolean z10 = true;
        if (sv0Var != null) {
            g(i10, sv0Var, i11);
        } else {
            sv0Var = new sv0(getContext(), 1);
            sv0Var.f39655f.setImageDrawable(drawable);
            sv0Var.setFocusable(true);
            sv0Var.setOnClickListener(new zk0(this, 4));
            sv0Var.setExpanded(this.f35575g0);
            sv0Var.a(this.f35578j0);
            this.f35571e.addView(sv0Var, i11);
        }
        sv0Var.d = false;
        sv0Var.setTag(2131296463, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        sv0Var.setSelected(z10);
        this.h.put(i10, sv0Var);
        return sv0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f35569c0 = false;
        org.telegram.messenger.g0.r(this.f35574f0);
    }

    public final void d(boolean z10) {
        this.f35581n = this.h;
        this.h = new HashMap();
        this.f35586r.clear();
        this.f35593y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new cl0(this, 0));
            TransitionManager.beginDelayedTransition(this.f35571e, autoTransition);
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
        float f15 = this.f35580l0 - this.f35579k0;
        float f16 = (1.0f - this.f35578j0) * this.m0;
        int i7 = 0;
        while (true) {
            d61Var = this.f35571e;
            if (i7 >= d61Var.getChildCount()) {
                break;
            }
            if (d61Var.getChildAt(i7) instanceof sv0) {
                sv0 sv0Var = (sv0) d61Var.getChildAt(i7);
                float f17 = sv0Var.E;
                if (sv0Var.getLeft() != f17 && sv0Var.F) {
                    sv0Var.f39652b = f17 - sv0Var.getLeft();
                    ValueAnimator valueAnimator = sv0Var.f39661y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        sv0Var.f39661y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(sv0Var.f39652b, 0.0f);
                    sv0Var.f39661y = ofFloat;
                    ofFloat.addUpdateListener(new rv0(sv0Var, this, 0));
                    sv0Var.f39661y.addListener(new h10(6, sv0Var, this));
                    sv0Var.f39661y.start();
                }
                sv0Var.F = false;
                if (this.f35576h0) {
                    sv0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f35578j0, i7 * f15, f16) + sv0Var.f39652b);
                } else {
                    sv0Var.setTranslationX(sv0Var.f39652b);
                }
            }
            i7++;
        }
        float height = getHeight();
        if (this.f35576h0) {
            height = com.google.android.gms.internal.vision.e2.t(1.0f, this.f35578j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f35584p0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f35585q0.e(false, f10);
        if (!isInEditMode() && this.f35593y != 0 && this.K >= 0) {
            d6 d6Var = this.F;
            float e11 = d6Var.e(false, this.E);
            TimeInterpolator timeInterpolator = d6Var.h;
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
                f12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.f35578j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.g0.W1(this.f35578j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof sv0) {
                    f13 = ((sv0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof sv0) {
                    f14 = ((sv0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = org.telegram.messenger.g0.T1(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (org.telegram.messenger.g0.W1(this.f35578j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof sv0) {
                        textWidth = ((sv0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (org.telegram.messenger.g0.W1(this.f35578j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof sv0) {
                            textWidth = ((sv0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float L = org.telegram.messenger.g0.L(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(d6Var.b());
            } else {
                b10 = d6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * L;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(d6Var.b());
            } else {
                b11 = d6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * L;
            float interpolation = nr.f37919i.getInterpolation(this.f35578j0);
            float W1 = f19 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f11;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f12 - T1, W1 - T12, f12 + T1, f21);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.h6 h6Var = this.P;
            Paint paint = this.f35583o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f35593y != 0 && this.N > 0) {
            int i10 = this.J;
            Paint paint2 = this.I;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.N, d61Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i7) {
        if (this.T && i7 >= 0) {
            org.telegram.ui.d61 d61Var = this.f35571e;
            if (i7 < d61Var.getChildCount()) {
                View childAt = d61Var.getChildAt(i7);
                if (childAt instanceof sv0) {
                    sv0 sv0Var = (sv0) childAt;
                    if (sv0Var.f39651a == 0 && !sv0Var.d) {
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
        bl0 bl0Var = this.f35574f0;
        if (action == 0 && this.f35588s == null) {
            this.f35569c0 = true;
            org.telegram.messenger.g0.h3(bl0Var, 500L);
            this.f35565a0 = motionEvent.getX();
            this.f35567b0 = motionEvent.getY();
        }
        if (this.f35569c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f35565a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.f35567b0) > f10) {
                this.f35569c0 = false;
                org.telegram.messenger.g0.r(bl0Var);
            }
        }
        int action2 = motionEvent.getAction();
        bl0 bl0Var2 = this.f35590t0;
        org.telegram.ui.d61 d61Var = this.f35571e;
        if (action2 == 2 && this.f35588s != null) {
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
                        sv0 sv0Var = (sv0) d61Var.getChildAt(i10);
                        sv0Var.E = sv0Var.getLeft();
                        sv0Var.F = true;
                        sv0Var.invalidate();
                    }
                }
                this.W += (ceil - this.V) * getTabSize();
                this.V = ceil;
                d61Var.removeView(this.f35588s);
                d61Var.addView(this.f35588s, this.V);
                invalidate();
            }
            this.f35572e0 = this.f35565a0 - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f35588s.getMeasuredWidth() / 2.0f) {
                this.f35587r0 = false;
                if (this.f35589s0 <= 0) {
                    this.f35589s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.h3(bl0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f35588s.getMeasuredWidth() / 2.0f)) {
                this.f35587r0 = true;
                if (this.f35589s0 <= 0) {
                    this.f35589s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.h3(bl0Var2, 16L);
            } else {
                this.f35589s0 = -1L;
                org.telegram.messenger.g0.r(bl0Var2);
            }
            d61Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f35589s0 = -1L;
            org.telegram.messenger.g0.r(bl0Var2);
            org.telegram.messenger.g0.r(bl0Var);
            if (this.f35588s != null) {
                int i11 = this.U;
                int i12 = this.V;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
                        d61Var.getChildAt(i13).setTag(2131296463, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h60(this, 13));
                ofFloat.addListener(new s60(this, 15));
                ofFloat.start();
            }
            this.f35569c0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i7) {
        HashMap hashMap = this.f35581n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f35586r.put(i7, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.f35576h0) {
            return org.telegram.messenger.g0.L(50.0f) * this.f35578j0;
        }
        return 0.0f;
    }

    public fl0 getType() {
        return this.f35566b;
    }

    public final void h() {
        HashMap hashMap = this.f35581n;
        org.telegram.ui.d61 d61Var = this.f35571e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                d61Var.removeView((View) entry.getValue());
            }
            this.f35581n.clear();
        }
        SparseArray sparseArray = this.f35586r;
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
        if (this.f35575g0 != z10) {
            this.f35575g0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f35577i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f35577i0.cancel();
            }
            float f12 = this.f35578j0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f35577i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    gl0 gl0Var = gl0.this;
                    org.telegram.ui.d61 d61Var = gl0Var.f35571e;
                    if (!z10) {
                        float childCount = gl0Var.f35580l0 * d61Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (gl0Var.getScrollX() + f13) / (gl0Var.f35579k0 * d61Var.getChildCount());
                        float measuredWidth = (childCount - gl0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        gl0Var.m0 = (gl0Var.getScrollX() + f13) - f14;
                    }
                    gl0Var.f35578j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                        d61Var.getChildAt(i7).invalidate();
                    }
                    d61Var.invalidate();
                    gl0Var.p();
                }
            });
            this.f35577i0.addListener(new dl0(this, z10, f10, 0));
            this.f35577i0.start();
            org.telegram.ui.d61 d61Var = this.f35571e;
            if (z10) {
                this.f35576h0 = true;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    View childAt = d61Var.getChildAt(i7);
                    if (childAt instanceof sv0) {
                        ((sv0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                }
                d61Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f35579k0 * d61Var.getChildCount() * ((getScrollX() + f10) / (this.f35580l0 * d61Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.f35582n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i7, int i10) {
        int i11 = this.E;
        if (i11 != i7) {
            org.telegram.ui.d61 d61Var = this.f35571e;
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
            if (this.f35577i0 == null) {
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
        if (this.f35593y != 0) {
            org.telegram.ui.d61 d61Var = this.f35571e;
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
        if (i7 >= 0 && i7 < this.f35593y) {
            this.f35571e.getChildAt(i7).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gl0.n():void");
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
        int i13 = this.f35582n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.f35582n0 = -1;
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
        for (int i7 = 0; i7 < this.f35593y; i7++) {
            View childAt = this.f35571e.getChildAt(i7);
            if (this.f35592x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f35568c);
            }
        }
    }

    public void setCurrentPosition(int i7) {
        this.E = i7;
    }

    public void setDelegate(el0 el0Var) {
        this.f35573f = el0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i7) {
        this.f35564a = i7;
    }

    public void setIndicatorColor(int i7) {
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.K = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f35592x = z10;
        requestLayout();
    }

    public void setType(fl0 fl0Var) {
        if (fl0Var != null && this.f35566b != fl0Var) {
            this.f35566b = fl0Var;
            int ordinal = fl0Var.ordinal();
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
