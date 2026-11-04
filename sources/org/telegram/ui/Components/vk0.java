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
public abstract class vk0 extends HorizontalScrollView {
    public static final int f39144u0 = 0;
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
    public int f39145a;
    public float f39146a0;
    public uk0 f39147b;
    public float f39148b0;
    public final LinearLayout.LayoutParams f39149c;
    public boolean f39150c0;
    public final LinearLayout.LayoutParams d;
    public float f39151d0;
    public final org.telegram.ui.s51 f39152e;
    public float f39153e0;
    public tk0 f39154f;
    public final qk0 f39155f0;
    public boolean f39156g0;
    public HashMap h;
    public boolean f39157h0;
    public ValueAnimator f39158i0;
    public float f39159j0;
    public final float f39160k0;
    public final float f39161l0;
    public float m0;
    public HashMap f39162n;
    public int f39163n0;
    public final Paint f39164o0;
    public boolean f39165p0;
    public final u5 f39166q0;
    public final SparseArray f39167r;
    public boolean f39168r0;
    public View f39169s;
    public long f39170s0;
    public final qk0 f39171t0;
    public float f39172w;
    public boolean f39173x;
    public int f39174y;

    public vk0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f39145a = 1;
        this.f39147b = uk0.f38811a;
        this.h = new HashMap();
        this.f39162n = new HashMap();
        this.f39167r = new SparseArray();
        xq xqVar = xq.h;
        this.F = new u5(this, 350L, xqVar);
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
        this.f39155f0 = new qk0(this, 0);
        this.f39156g0 = false;
        this.f39160k0 = org.telegram.messenger.g0.L(64.0f);
        this.f39161l0 = org.telegram.messenger.g0.L(33.0f);
        this.f39163n0 = -1;
        this.f39164o0 = new Paint();
        this.f39165p0 = true;
        this.f39166q0 = new u5(this, 350L, xqVar);
        this.f39171t0 = new qk0(this, 1);
        this.P = e6Var;
        this.Q = z10;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(14, context, this);
        this.f39152e = s51Var;
        s51Var.setOrientation(0);
        s51Var.setPadding(org.telegram.messenger.g0.L(9.5f), 0, org.telegram.messenger.g0.L(9.5f), 0);
        addView(s51Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f39149c = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f39157h0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final FrameLayout b(int i3, Drawable drawable) {
        String i10 = k2.p1.i(i3, "tab");
        int i11 = this.f39174y;
        this.f39174y = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f39162n.get(i10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, b8.mf.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ok0(this, 3));
            this.f39152e.addView(frameLayout, i11);
        }
        frameLayout.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i10, frameLayout);
        return frameLayout;
    }

    public final ev0 c(int i3, Drawable drawable) {
        String i10 = k2.p1.i(i3, "tab");
        int i11 = this.f39174y;
        this.f39174y = i11 + 1;
        ev0 ev0Var = (ev0) this.f39162n.get(i10);
        boolean z10 = true;
        if (ev0Var != null) {
            g(i10, ev0Var, i11);
        } else {
            ev0Var = new ev0(getContext(), 1);
            ev0Var.f33472f.setImageDrawable(drawable);
            ev0Var.setFocusable(true);
            ev0Var.setOnClickListener(new ok0(this, 4));
            ev0Var.setExpanded(this.f39156g0);
            ev0Var.a(this.f39159j0);
            this.f39152e.addView(ev0Var, i11);
        }
        ev0Var.d = false;
        ev0Var.setTag(2131296461, Integer.valueOf(i11));
        if (i11 != this.E) {
            z10 = false;
        }
        ev0Var.setSelected(z10);
        this.h.put(i10, ev0Var);
        return ev0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f39150c0 = false;
        org.telegram.messenger.g0.r(this.f39155f0);
    }

    public final void d(boolean z10) {
        this.f39162n = this.h;
        this.h = new HashMap();
        this.f39167r.clear();
        this.f39174y = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new rk0(this, 0));
            TransitionManager.beginDelayedTransition(this.f39152e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.s51 s51Var;
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
        float f15 = this.f39161l0 - this.f39160k0;
        float f16 = (1.0f - this.f39159j0) * this.m0;
        int i3 = 0;
        while (true) {
            s51Var = this.f39152e;
            if (i3 >= s51Var.getChildCount()) {
                break;
            }
            if (s51Var.getChildAt(i3) instanceof ev0) {
                ev0 ev0Var = (ev0) s51Var.getChildAt(i3);
                float f17 = ev0Var.E;
                if (ev0Var.getLeft() != f17 && ev0Var.F) {
                    ev0Var.f33469b = f17 - ev0Var.getLeft();
                    ValueAnimator valueAnimator = ev0Var.f33478y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ev0Var.f33478y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ev0Var.f33469b, 0.0f);
                    ev0Var.f33478y = ofFloat;
                    ofFloat.addUpdateListener(new dv0(ev0Var, this, 0));
                    ev0Var.f33478y.addListener(new ri0(4, ev0Var, this));
                    ev0Var.f33478y.start();
                }
                ev0Var.F = false;
                if (this.f39157h0) {
                    ev0Var.setTranslationX(com.google.android.recaptcha.internal.a.y(1.0f, this.f39159j0, i3 * f15, f16) + ev0Var.f33469b);
                } else {
                    ev0Var.setTranslationX(ev0Var.f33469b);
                }
            }
            i3++;
        }
        float height = getHeight();
        if (this.f39157h0) {
            height = a1.g.D(1.0f, this.f39159j0, org.telegram.messenger.g0.L(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f39165p0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f39166q0.e(false, f10);
        if (!isInEditMode() && this.f39174y != 0 && this.K >= 0) {
            u5 u5Var = this.F;
            float e11 = u5Var.e(false, this.E);
            TimeInterpolator timeInterpolator = u5Var.h;
            double d = e11;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view2 = null;
            if (floor >= 0 && floor < s51Var.getChildCount()) {
                view = s51Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < s51Var.getChildCount()) {
                view2 = s51Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = e11 - floor;
                f12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.W1(this.f39159j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft(), (org.telegram.messenger.g0.W1(this.f39159j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof ev0) {
                    f13 = ((ev0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof ev0) {
                    f14 = ((ev0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = org.telegram.messenger.g0.T1(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (org.telegram.messenger.g0.W1(this.f39159j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof ev0) {
                        textWidth = ((ev0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (org.telegram.messenger.g0.W1(this.f39159j0, org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(64.0f)) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof ev0) {
                            textWidth = ((ev0) view2).getTextWidth();
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
            float interpolation = xq.f40454i.getInterpolation(this.f39159j0);
            float W1 = f19 + org.telegram.messenger.g0.W1(interpolation, 0, org.telegram.messenger.g0.L(26.0f));
            float T1 = org.telegram.messenger.g0.T1(abs, textWidth + org.telegram.messenger.g0.L(10.0f), interpolation) / f11;
            float T12 = (org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = W1 + T12;
            RectF rectF = this.G;
            rectF.set(f12 - T1, W1 - T12, f12 + T1, f21);
            boolean z10 = this.Q;
            org.telegram.ui.ActionBar.e6 e6Var = this.P;
            Paint paint = this.f39164o0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * e10));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f39174y != 0 && this.N > 0) {
            int i10 = this.J;
            Paint paint2 = this.I;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.N, s51Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i3) {
        if (this.T && i3 >= 0) {
            org.telegram.ui.s51 s51Var = this.f39152e;
            if (i3 < s51Var.getChildCount()) {
                View childAt = s51Var.getChildAt(i3);
                if (childAt instanceof ev0) {
                    ev0 ev0Var = (ev0) childAt;
                    if (ev0Var.f33468a == 0 && !ev0Var.d) {
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
        qk0 qk0Var = this.f39155f0;
        if (action == 0 && this.f39169s == null) {
            this.f39150c0 = true;
            org.telegram.messenger.g0.i3(qk0Var, 500L);
            this.f39146a0 = motionEvent.getX();
            this.f39148b0 = motionEvent.getY();
        }
        if (this.f39150c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f39146a0);
            float f10 = this.H;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.f39148b0) > f10) {
                this.f39150c0 = false;
                org.telegram.messenger.g0.r(qk0Var);
            }
        }
        int action2 = motionEvent.getAction();
        qk0 qk0Var2 = this.f39171t0;
        org.telegram.ui.s51 s51Var = this.f39152e;
        if (action2 == 2 && this.f39169s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i3 = this.V;
            if (ceil != i3) {
                if (ceil < i3) {
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
                for (int i10 = 0; i10 < s51Var.getChildCount(); i10++) {
                    if (i10 != this.V) {
                        ev0 ev0Var = (ev0) s51Var.getChildAt(i10);
                        ev0Var.E = ev0Var.getLeft();
                        ev0Var.F = true;
                        ev0Var.invalidate();
                    }
                }
                this.W += (ceil - this.V) * getTabSize();
                this.V = ceil;
                s51Var.removeView(this.f39169s);
                s51Var.addView(this.f39169s, this.V);
                invalidate();
            }
            this.f39153e0 = this.f39146a0 - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f39169s.getMeasuredWidth() / 2.0f) {
                this.f39168r0 = false;
                if (this.f39170s0 <= 0) {
                    this.f39170s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(qk0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f39169s.getMeasuredWidth() / 2.0f)) {
                this.f39168r0 = true;
                if (this.f39170s0 <= 0) {
                    this.f39170s0 = System.currentTimeMillis();
                }
                org.telegram.messenger.g0.i3(qk0Var2, 16L);
            } else {
                this.f39170s0 = -1L;
                org.telegram.messenger.g0.r(qk0Var2);
            }
            s51Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f39170s0 = -1L;
            org.telegram.messenger.g0.r(qk0Var2);
            org.telegram.messenger.g0.r(qk0Var);
            if (this.f39169s != null) {
                int i11 = this.U;
                int i12 = this.V;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < s51Var.getChildCount(); i13++) {
                        s51Var.getChildAt(i13).setTag(2131296461, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y50(this, 12));
                ofFloat.addListener(new a60(this, 15));
                ofFloat.start();
            }
            this.f39150c0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i3) {
        HashMap hashMap = this.f39162n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f39167r.put(i3, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.f39157h0) {
            return org.telegram.messenger.g0.L(50.0f) * this.f39159j0;
        }
        return 0.0f;
    }

    public uk0 getType() {
        return this.f39147b;
    }

    public final void h() {
        HashMap hashMap = this.f39162n;
        org.telegram.ui.s51 s51Var = this.f39152e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                s51Var.removeView((View) entry.getValue());
            }
            this.f39162n.clear();
        }
        SparseArray sparseArray = this.f39167r;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            View view = (View) sparseArray.valueAt(i3);
            if (s51Var.indexOfChild(view) != keyAt) {
                s51Var.removeView(view);
                s51Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z10, final float f10) {
        float f11;
        if (this.f39156g0 != z10) {
            this.f39156g0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f39158i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f39158i0.cancel();
            }
            float f12 = this.f39159j0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f39158i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vk0 vk0Var = vk0.this;
                    org.telegram.ui.s51 s51Var = vk0Var.f39152e;
                    if (!z10) {
                        float childCount = vk0Var.f39161l0 * s51Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (vk0Var.getScrollX() + f13) / (vk0Var.f39160k0 * s51Var.getChildCount());
                        float measuredWidth = (childCount - vk0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        vk0Var.m0 = (vk0Var.getScrollX() + f13) - f14;
                    }
                    vk0Var.f39159j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i3 = 0; i3 < s51Var.getChildCount(); i3++) {
                        s51Var.getChildAt(i3).invalidate();
                    }
                    s51Var.invalidate();
                    vk0Var.p();
                }
            });
            this.f39158i0.addListener(new sk0(this, z10, f10, 0));
            this.f39158i0.start();
            org.telegram.ui.s51 s51Var = this.f39152e;
            if (z10) {
                this.f39157h0 = true;
                for (int i3 = 0; i3 < s51Var.getChildCount(); i3++) {
                    View childAt = s51Var.getChildAt(i3);
                    if (childAt instanceof ev0) {
                        ((ev0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = org.telegram.messenger.g0.L(64.0f);
                }
                s51Var.requestLayout();
                getLayoutParams().height = org.telegram.messenger.g0.L(86.0f);
            }
            if (z10) {
                float childCount = this.f39160k0 * s51Var.getChildCount() * ((getScrollX() + f10) / (this.f39161l0 * s51Var.getChildCount()));
                this.m0 = childCount - (getScrollX() + f10);
                this.f39163n0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i3, int i10) {
        int i11 = this.E;
        if (i11 != i3) {
            org.telegram.ui.s51 s51Var = this.f39152e;
            View childAt = s51Var.getChildAt(i11);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.E = i3;
            if (i3 >= s51Var.getChildCount()) {
                return;
            }
            int i12 = 0;
            while (true) {
                boolean z10 = true;
                if (i12 >= s51Var.getChildCount()) {
                    break;
                }
                View childAt2 = s51Var.getChildAt(i12);
                if (i12 != i3) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i12++;
            }
            if (this.f39158i0 == null) {
                if (i10 == i3 && i3 > 1) {
                    l(i3 - 1);
                } else {
                    l(i3);
                }
            }
            invalidate();
        }
    }

    public final void l(int i3) {
        if (this.f39174y != 0) {
            org.telegram.ui.s51 s51Var = this.f39152e;
            if (s51Var.getChildAt(i3) != null) {
                int left = s51Var.getChildAt(i3).getLeft();
                int i10 = this.M;
                if (i3 > 0) {
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

    public final void m(int i3) {
        if (i3 >= 0 && i3 < this.f39174y) {
            this.f39152e.getChildAt(i3).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vk0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        n();
        int i13 = this.f39163n0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.f39163n0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
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
        for (int i3 = 0; i3 < this.f39174y; i3++) {
            View childAt = this.f39152e.getChildAt(i3);
            if (this.f39173x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f39149c);
            }
        }
    }

    public void setCurrentPosition(int i3) {
        this.E = i3;
    }

    public void setDelegate(tk0 tk0Var) {
        this.f39154f = tk0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.T = z10;
    }

    public void setImageReceiversLayerNum(int i3) {
        this.f39145a = i3;
    }

    public void setIndicatorColor(int i3) {
        invalidate();
    }

    public void setIndicatorHeight(int i3) {
        this.K = i3;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f39173x = z10;
        requestLayout();
    }

    public void setType(uk0 uk0Var) {
        if (uk0Var != null && this.f39147b != uk0Var) {
            this.f39147b = uk0Var;
            int ordinal = uk0Var.ordinal();
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

    public void setUnderlineColor(int i3) {
        this.J = i3;
        invalidate();
    }

    public void setUnderlineColorResource(int i3) {
        this.J = getResources().getColor(i3);
        invalidate();
    }

    public void setUnderlineHeight(int i3) {
        if (this.N != i3) {
            this.N = i3;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i3, int i10) {
    }
}
