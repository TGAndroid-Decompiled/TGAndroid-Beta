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
import org.telegram.ui.cc1;
public abstract class pn0 extends HorizontalScrollView {
    public static final int f29898t0 = 0;
    public final g6 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.d6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f29899a;
    public float f29900a0;
    public on0 f29901b;
    public boolean f29902b0;
    public final LinearLayout.LayoutParams f29903c;
    public float f29904c0;
    public final LinearLayout.LayoutParams d;
    public float f29905d0;
    public final cc1 f29906e;
    public final kn0 f29907e0;
    public nn0 f29908f;
    public boolean f29909f0;
    public boolean f29910g0;
    public HashMap h;
    public ValueAnimator f29911h0;
    public float f29912i0;
    public final float f29913j0;
    public final float f29914k0;
    public float f29915l0;
    public int m0;
    public HashMap f29916n;
    public final Paint f29917n0;
    public boolean f29918o0;
    public final g6 f29919p0;
    public boolean f29920q0;
    public final SparseArray f29921r;
    public long f29922r0;
    public View f29923s;
    public final kn0 f29924s0;
    public float v;
    public boolean f29925w;
    public int f29926x;
    public int f29927y;

    public pn0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f29899a = 1;
        this.f29901b = on0.f29559a;
        this.h = new HashMap();
        this.f29916n = new HashMap();
        this.f29921r = new SparseArray();
        is isVar = is.h;
        this.E = new g6(this, 350L, isVar);
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
        this.f29907e0 = new kn0(this, 0);
        this.f29909f0 = false;
        this.f29913j0 = AndroidUtilities.dp(64.0f);
        this.f29914k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f29917n0 = new Paint();
        this.f29918o0 = true;
        this.f29919p0 = new g6(this, 350L, isVar);
        this.f29924s0 = new kn0(this, 1);
        this.O = d6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        cc1 cc1Var = new cc1(this, context, 8);
        this.f29906e = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(cc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f29903c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f29910g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f29926x;
        this.f29926x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f29916n.get(h);
        boolean z10 = true;
        if (frameLayout != null) {
            g(h, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new in0(this, 3));
            this.f29906e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f29927y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(h, frameLayout);
        return frameLayout;
    }

    public final gy0 c(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f29926x;
        this.f29926x = i11 + 1;
        gy0 gy0Var = (gy0) this.f29916n.get(h);
        boolean z10 = true;
        if (gy0Var != null) {
            g(h, gy0Var, i11);
        } else {
            gy0Var = new gy0(getContext(), 1);
            gy0Var.f26899f.setImageDrawable(drawable);
            gy0Var.setFocusable(true);
            gy0Var.setOnClickListener(new in0(this, 4));
            gy0Var.setExpanded(this.f29909f0);
            gy0Var.a(this.f29912i0);
            this.f29906e.addView(gy0Var, i11);
        }
        gy0Var.d = false;
        gy0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f29927y) {
            z10 = false;
        }
        gy0Var.setSelected(z10);
        this.h.put(h, gy0Var);
        return gy0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f29902b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29907e0);
    }

    public final void d(boolean z10) {
        this.f29916n = this.h;
        this.h = new HashMap();
        this.f29921r.clear();
        this.f29926x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new ln0(this, 0));
            TransitionManager.beginDelayedTransition(this.f29906e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        cc1 cc1Var;
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
        float f14 = this.f29914k0 - this.f29913j0;
        float f15 = (1.0f - this.f29912i0) * this.f29915l0;
        int i10 = 0;
        while (true) {
            cc1Var = this.f29906e;
            if (i10 >= cc1Var.getChildCount()) {
                break;
            }
            if (cc1Var.getChildAt(i10) instanceof gy0) {
                gy0 gy0Var = (gy0) cc1Var.getChildAt(i10);
                float f16 = gy0Var.f26905y;
                if (gy0Var.getLeft() != f16 && gy0Var.E) {
                    gy0Var.f26896b = f16 - gy0Var.getLeft();
                    ValueAnimator valueAnimator = gy0Var.f26904x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gy0Var.f26904x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(gy0Var.f26896b, 0.0f);
                    gy0Var.f26904x = ofFloat;
                    ofFloat.addUpdateListener(new fy0(gy0Var, this, 0));
                    gy0Var.f26904x.addListener(new vl0(3, gy0Var, this));
                    gy0Var.f26904x.start();
                }
                gy0Var.E = false;
                if (this.f29910g0) {
                    gy0Var.setTranslationX(com.google.android.gms.internal.vision.e2.y(1.0f, this.f29912i0, i10 * f14, f15) + gy0Var.f26896b);
                } else {
                    gy0Var.setTranslationX(gy0Var.f26896b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f29910g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f29912i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f29918o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f29919p0.d(f7, false);
        if (!isInEditMode() && this.f29926x != 0 && this.J >= 0) {
            g6 g6Var = this.E;
            float d10 = g6Var.d(this.f29927y, false);
            TimeInterpolator timeInterpolator = g6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < cc1Var.getChildCount()) {
                view = cc1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < cc1Var.getChildCount()) {
                view2 = cc1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29912i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29912i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof gy0) {
                    f12 = ((gy0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof gy0) {
                    f13 = ((gy0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29912i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof gy0) {
                        textWidth = ((gy0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29912i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof gy0) {
                            textWidth = ((gy0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(g6Var.b());
            } else {
                b10 = g6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(g6Var.b());
            } else {
                b11 = g6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = is.f27502i.getInterpolation(this.f29912i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.d6 d6Var = this.O;
            Paint paint = this.f29917n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, d6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f29926x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, cc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            cc1 cc1Var = this.f29906e;
            if (i10 < cc1Var.getChildCount()) {
                View childAt = cc1Var.getChildAt(i10);
                if (childAt instanceof gy0) {
                    gy0 gy0Var = (gy0) childAt;
                    if (gy0Var.f26895a == 0 && !gy0Var.d) {
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
        kn0 kn0Var = this.f29907e0;
        if (action == 0 && this.f29923s == null) {
            this.f29902b0 = true;
            AndroidUtilities.runOnUIThread(kn0Var, 500L);
            this.W = motionEvent.getX();
            this.f29900a0 = motionEvent.getY();
        }
        if (this.f29902b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f29900a0) > f7) {
                this.f29902b0 = false;
                AndroidUtilities.cancelRunOnUIThread(kn0Var);
            }
        }
        int action2 = motionEvent.getAction();
        kn0 kn0Var2 = this.f29924s0;
        cc1 cc1Var = this.f29906e;
        if (action2 == 2 && this.f29923s != null) {
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
                for (int i11 = 0; i11 < cc1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        gy0 gy0Var = (gy0) cc1Var.getChildAt(i11);
                        gy0Var.f26905y = gy0Var.getLeft();
                        gy0Var.E = true;
                        gy0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                cc1Var.removeView(this.f29923s);
                cc1Var.addView(this.f29923s, this.U);
                invalidate();
            }
            this.f29905d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f29923s.getMeasuredWidth() / 2.0f) {
                this.f29920q0 = false;
                if (this.f29922r0 <= 0) {
                    this.f29922r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(kn0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f29923s.getMeasuredWidth() / 2.0f)) {
                this.f29920q0 = true;
                if (this.f29922r0 <= 0) {
                    this.f29922r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(kn0Var2, 16L);
            } else {
                this.f29922r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(kn0Var2);
            }
            cc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f29922r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(kn0Var2);
            AndroidUtilities.cancelRunOnUIThread(kn0Var);
            if (this.f29923s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < cc1Var.getChildCount(); i14++) {
                        cc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new j80(this, 13));
                ofFloat.addListener(new vd0(this, 9));
                ofFloat.start();
            }
            this.f29902b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f29916n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f29921r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f29927y;
    }

    public float getExpandedOffset() {
        if (this.f29910g0) {
            return AndroidUtilities.dp(50.0f) * this.f29912i0;
        }
        return 0.0f;
    }

    public on0 getType() {
        return this.f29901b;
    }

    public final void h() {
        HashMap hashMap = this.f29916n;
        cc1 cc1Var = this.f29906e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                cc1Var.removeView((View) entry.getValue());
            }
            this.f29916n.clear();
        }
        SparseArray sparseArray = this.f29921r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (cc1Var.indexOfChild(view) != keyAt) {
                cc1Var.removeView(view);
                cc1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f29909f0 != z10) {
            this.f29909f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f29911h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f29911h0.cancel();
            }
            float f11 = this.f29912i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f29911h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pn0 pn0Var = pn0.this;
                    cc1 cc1Var = pn0Var.f29906e;
                    if (!z10) {
                        float childCount = pn0Var.f29914k0 * cc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (pn0Var.getScrollX() + f12) / (pn0Var.f29913j0 * cc1Var.getChildCount());
                        float measuredWidth = (childCount - pn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        pn0Var.f29915l0 = (pn0Var.getScrollX() + f12) - f13;
                    }
                    pn0Var.f29912i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                        cc1Var.getChildAt(i10).invalidate();
                    }
                    cc1Var.invalidate();
                    pn0Var.p();
                }
            });
            this.f29911h0.addListener(new mn0(this, z10, f7, 0));
            this.f29911h0.start();
            cc1 cc1Var = this.f29906e;
            if (z10) {
                this.f29910g0 = true;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    View childAt = cc1Var.getChildAt(i10);
                    if (childAt instanceof gy0) {
                        ((gy0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                cc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f29913j0 * cc1Var.getChildCount() * ((getScrollX() + f7) / (this.f29914k0 * cc1Var.getChildCount()));
                this.f29915l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f29927y;
        if (i12 != i10) {
            cc1 cc1Var = this.f29906e;
            View childAt = cc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f29927y = i10;
            if (i10 >= cc1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= cc1Var.getChildCount()) {
                    break;
                }
                View childAt2 = cc1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f29911h0 == null) {
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
        if (this.f29926x != 0) {
            cc1 cc1Var = this.f29906e;
            if (cc1Var.getChildAt(i10) != null) {
                int left = cc1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f29926x) {
            this.f29906e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn0.n():void");
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
        for (int i10 = 0; i10 < this.f29926x; i10++) {
            View childAt = this.f29906e.getChildAt(i10);
            if (this.f29925w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f29903c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f29927y = i10;
    }

    public void setDelegate(nn0 nn0Var) {
        this.f29908f = nn0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f29899a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f29925w = z10;
        requestLayout();
    }

    public void setType(on0 on0Var) {
        if (on0Var != null && this.f29901b != on0Var) {
            this.f29901b = on0Var;
            int ordinal = on0Var.ordinal();
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
