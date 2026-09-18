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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.dc1;
public abstract class jm0 extends HorizontalScrollView {
    public static final int f25329t0 = 0;
    public final c6 E;
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
    public int f25330a;
    public float f25331a0;
    public im0 f25332b;
    public boolean f25333b0;
    public final LinearLayout.LayoutParams f25334c;
    public float f25335c0;
    public final LinearLayout.LayoutParams d;
    public float f25336d0;
    public final dc1 e;
    public final em0 f25337e0;
    public hm0 f25338f;
    public boolean f25339f0;
    public boolean f25340g0;
    public HashMap h;
    public ValueAnimator f25341h0;
    public float f25342i0;
    public final float f25343j0;
    public final float f25344k0;
    public float f25345l0;
    public int m0;
    public HashMap f25346n;
    public final Paint f25347n0;
    public boolean f25348o0;
    public final c6 f25349p0;
    public boolean f25350q0;
    public final SparseArray f25351r;
    public long f25352r0;
    public View f25353s;
    public final em0 f25354s0;
    public float v;
    public boolean f25355w;
    public int f25356x;
    public int f25357y;

    public jm0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f25330a = 1;
        this.f25332b = im0.f24963a;
        this.h = new HashMap();
        this.f25346n = new HashMap();
        this.f25351r = new SparseArray();
        qr qrVar = qr.h;
        this.E = new c6(this, 350L, qrVar);
        new RectF();
        new RectF();
        this.F = new RectF();
        this.I = 436207616;
        this.K = new GradientDrawable();
        this.L = AndroidUtilities.dp(33.0f);
        this.M = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.N = 0;
        this.Q = new SparseArray();
        this.R = new SparseArray();
        this.f25337e0 = new em0(this, 0);
        this.f25339f0 = false;
        this.f25343j0 = AndroidUtilities.dp(64.0f);
        this.f25344k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f25347n0 = new Paint();
        this.f25348o0 = true;
        this.f25349p0 = new c6(this, 350L, qrVar);
        this.f25354s0 = new em0(this, 1);
        this.O = f6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        dc1 dc1Var = new dc1(this, context, 8);
        this.e = dc1Var;
        dc1Var.setOrientation(0);
        dc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(dc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f25334c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f25340g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = hg.k0.i(i10, "tab");
        int i12 = this.f25356x;
        this.f25356x = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f25346n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new cm0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f25357y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final ex0 c(int i10, Drawable drawable) {
        String i11 = hg.k0.i(i10, "tab");
        int i12 = this.f25356x;
        this.f25356x = i12 + 1;
        ex0 ex0Var = (ex0) this.f25346n.get(i11);
        boolean z10 = true;
        if (ex0Var != null) {
            g(i11, ex0Var, i12);
        } else {
            ex0Var = new ex0(getContext(), 1);
            ex0Var.f23687f.setImageDrawable(drawable);
            ex0Var.setFocusable(true);
            ex0Var.setOnClickListener(new cm0(this, 4));
            ex0Var.setExpanded(this.f25339f0);
            ex0Var.a(this.f25342i0);
            this.e.addView(ex0Var, i12);
        }
        ex0Var.d = false;
        ex0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f25357y) {
            z10 = false;
        }
        ex0Var.setSelected(z10);
        this.h.put(i11, ex0Var);
        return ex0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f25333b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f25337e0);
    }

    public final void d(boolean z10) {
        this.f25346n = this.h;
        this.h = new HashMap();
        this.f25351r.clear();
        this.f25356x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new fm0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dc1 dc1Var;
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
        float f14 = this.f25344k0 - this.f25343j0;
        float f15 = (1.0f - this.f25342i0) * this.f25345l0;
        int i10 = 0;
        while (true) {
            dc1Var = this.e;
            if (i10 >= dc1Var.getChildCount()) {
                break;
            }
            if (dc1Var.getChildAt(i10) instanceof ex0) {
                ex0 ex0Var = (ex0) dc1Var.getChildAt(i10);
                float f16 = ex0Var.f23693y;
                if (ex0Var.getLeft() != f16 && ex0Var.E) {
                    ex0Var.f23685b = f16 - ex0Var.getLeft();
                    ValueAnimator valueAnimator = ex0Var.f23692x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ex0Var.f23692x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ex0Var.f23685b, 0.0f);
                    ex0Var.f23692x = ofFloat;
                    ofFloat.addUpdateListener(new dx0(ex0Var, this, 0));
                    ex0Var.f23692x.addListener(new qk0(3, ex0Var, this));
                    ex0Var.f23692x.start();
                }
                ex0Var.E = false;
                if (this.f25340g0) {
                    ex0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f25342i0, i10 * f14, f15) + ex0Var.f23685b);
                } else {
                    ex0Var.setTranslationX(ex0Var.f23685b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f25340g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f25342i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f25348o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f25349p0.d(f7, false);
        if (!isInEditMode() && this.f25356x != 0 && this.J >= 0) {
            c6 c6Var = this.E;
            float d10 = c6Var.d(this.f25357y, false);
            TimeInterpolator timeInterpolator = c6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < dc1Var.getChildCount()) {
                view = dc1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < dc1Var.getChildCount()) {
                view2 = dc1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25342i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25342i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof ex0) {
                    f12 = ((ex0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof ex0) {
                    f13 = ((ex0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25342i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof ex0) {
                        textWidth = ((ex0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25342i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof ex0) {
                            textWidth = ((ex0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b10 = c6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b11 = c6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = qr.f27385i.getInterpolation(this.f25342i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.f6 f6Var = this.O;
            Paint paint = this.f25347n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f25356x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, dc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            dc1 dc1Var = this.e;
            if (i10 < dc1Var.getChildCount()) {
                View childAt = dc1Var.getChildAt(i10);
                if (childAt instanceof ex0) {
                    ex0 ex0Var = (ex0) childAt;
                    if (ex0Var.f23684a == 0 && !ex0Var.d) {
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
        em0 em0Var = this.f25337e0;
        if (action == 0 && this.f25353s == null) {
            this.f25333b0 = true;
            AndroidUtilities.runOnUIThread(em0Var, 500L);
            this.W = motionEvent.getX();
            this.f25331a0 = motionEvent.getY();
        }
        if (this.f25333b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f25331a0) > f7) {
                this.f25333b0 = false;
                AndroidUtilities.cancelRunOnUIThread(em0Var);
            }
        }
        int action2 = motionEvent.getAction();
        em0 em0Var2 = this.f25354s0;
        dc1 dc1Var = this.e;
        if (action2 == 2 && this.f25353s != null) {
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
                for (int i11 = 0; i11 < dc1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        ex0 ex0Var = (ex0) dc1Var.getChildAt(i11);
                        ex0Var.f23693y = ex0Var.getLeft();
                        ex0Var.E = true;
                        ex0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                dc1Var.removeView(this.f25353s);
                dc1Var.addView(this.f25353s, this.U);
                invalidate();
            }
            this.f25336d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f25353s.getMeasuredWidth() / 2.0f) {
                this.f25350q0 = false;
                if (this.f25352r0 <= 0) {
                    this.f25352r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(em0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f25353s.getMeasuredWidth() / 2.0f)) {
                this.f25350q0 = true;
                if (this.f25352r0 <= 0) {
                    this.f25352r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(em0Var2, 16L);
            } else {
                this.f25352r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(em0Var2);
            }
            dc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f25352r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(em0Var2);
            AndroidUtilities.cancelRunOnUIThread(em0Var);
            if (this.f25353s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < dc1Var.getChildCount(); i14++) {
                        dc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h70(this, 12));
                ofFloat.addListener(new jd0(this, 8));
                ofFloat.start();
            }
            this.f25333b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f25346n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f25351r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f25357y;
    }

    public float getExpandedOffset() {
        if (this.f25340g0) {
            return AndroidUtilities.dp(50.0f) * this.f25342i0;
        }
        return 0.0f;
    }

    public im0 getType() {
        return this.f25332b;
    }

    public final void h() {
        HashMap hashMap = this.f25346n;
        dc1 dc1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                dc1Var.removeView((View) entry.getValue());
            }
            this.f25346n.clear();
        }
        SparseArray sparseArray = this.f25351r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (dc1Var.indexOfChild(view) != keyAt) {
                dc1Var.removeView(view);
                dc1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f25339f0 != z10) {
            this.f25339f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f25341h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25341h0.cancel();
            }
            float f11 = this.f25342i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f25341h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    jm0 jm0Var = jm0.this;
                    dc1 dc1Var = jm0Var.e;
                    if (!z10) {
                        float childCount = jm0Var.f25344k0 * dc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (jm0Var.getScrollX() + f12) / (jm0Var.f25343j0 * dc1Var.getChildCount());
                        float measuredWidth = (childCount - jm0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        jm0Var.f25345l0 = (jm0Var.getScrollX() + f12) - f13;
                    }
                    jm0Var.f25342i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                        dc1Var.getChildAt(i10).invalidate();
                    }
                    dc1Var.invalidate();
                    jm0Var.p();
                }
            });
            this.f25341h0.addListener(new gm0(this, z10, f7, 0));
            this.f25341h0.start();
            dc1 dc1Var = this.e;
            if (z10) {
                this.f25340g0 = true;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    View childAt = dc1Var.getChildAt(i10);
                    if (childAt instanceof ex0) {
                        ((ex0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                dc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f25343j0 * dc1Var.getChildCount() * ((getScrollX() + f7) / (this.f25344k0 * dc1Var.getChildCount()));
                this.f25345l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f25357y;
        if (i12 != i10) {
            dc1 dc1Var = this.e;
            View childAt = dc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f25357y = i10;
            if (i10 >= dc1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= dc1Var.getChildCount()) {
                    break;
                }
                View childAt2 = dc1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f25341h0 == null) {
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
        if (this.f25356x != 0) {
            dc1 dc1Var = this.e;
            if (dc1Var.getChildAt(i10) != null) {
                int left = dc1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f25356x) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm0.n():void");
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
        for (int i10 = 0; i10 < this.f25356x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f25355w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f25334c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f25357y = i10;
    }

    public void setDelegate(hm0 hm0Var) {
        this.f25338f = hm0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f25330a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f25355w = z10;
        requestLayout();
    }

    public void setType(im0 im0Var) {
        if (im0Var != null && this.f25332b != im0Var) {
            this.f25332b = im0Var;
            int ordinal = im0Var.ordinal();
            GradientDrawable gradientDrawable = this.K;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    float dpf2 = AndroidUtilities.dpf2(3.0f);
                    gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, 0.0f, 0.0f, 0.0f, 0.0f});
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
