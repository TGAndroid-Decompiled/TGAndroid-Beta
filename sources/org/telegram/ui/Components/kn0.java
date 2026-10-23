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
import org.telegram.ui.va1;
public abstract class kn0 extends HorizontalScrollView {
    public static final int f28067t0 = 0;
    public final f6 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.g6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f28068a;
    public float f28069a0;
    public jn0 f28070b;
    public boolean f28071b0;
    public final LinearLayout.LayoutParams f28072c;
    public float f28073c0;
    public final LinearLayout.LayoutParams d;
    public float f28074d0;
    public final va1 e;
    public final fn0 f28075e0;
    public in0 f28076f;
    public boolean f28077f0;
    public boolean f28078g0;
    public HashMap h;
    public ValueAnimator f28079h0;
    public float f28080i0;
    public final float f28081j0;
    public final float f28082k0;
    public float f28083l0;
    public int m0;
    public HashMap f28084n;
    public final Paint f28085n0;
    public boolean f28086o0;
    public final f6 f28087p0;
    public boolean f28088q0;
    public final SparseArray f28089r;
    public long f28090r0;
    public View f28091s;
    public final fn0 f28092s0;
    public float v;
    public boolean f28093w;
    public int f28094x;
    public int f28095y;

    public kn0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.f28068a = 1;
        this.f28070b = jn0.f27717a;
        this.h = new HashMap();
        this.f28084n = new HashMap();
        this.f28089r = new SparseArray();
        bs bsVar = bs.h;
        this.E = new f6(this, 350L, bsVar);
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
        this.f28075e0 = new fn0(this, 0);
        this.f28077f0 = false;
        this.f28081j0 = AndroidUtilities.dp(64.0f);
        this.f28082k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f28085n0 = new Paint();
        this.f28086o0 = true;
        this.f28087p0 = new f6(this, 350L, bsVar);
        this.f28092s0 = new fn0(this, 1);
        this.O = g6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        va1 va1Var = new va1(this, context, 10);
        this.e = va1Var;
        va1Var.setOrientation(0);
        va1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(va1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f28072c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f28078g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String k10 = i2.o1.k(i10, "tab");
        int i11 = this.f28094x;
        this.f28094x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f28084n.get(k10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(k10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new dn0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f28095y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(k10, frameLayout);
        return frameLayout;
    }

    public final by0 c(int i10, Drawable drawable) {
        String k10 = i2.o1.k(i10, "tab");
        int i11 = this.f28094x;
        this.f28094x = i11 + 1;
        by0 by0Var = (by0) this.f28084n.get(k10);
        boolean z10 = true;
        if (by0Var != null) {
            g(k10, by0Var, i11);
        } else {
            by0Var = new by0(getContext(), 1);
            by0Var.f25168f.setImageDrawable(drawable);
            by0Var.setFocusable(true);
            by0Var.setOnClickListener(new dn0(this, 4));
            by0Var.setExpanded(this.f28077f0);
            by0Var.a(this.f28080i0);
            this.e.addView(by0Var, i11);
        }
        by0Var.d = false;
        by0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f28095y) {
            z10 = false;
        }
        by0Var.setSelected(z10);
        this.h.put(k10, by0Var);
        return by0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f28071b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f28075e0);
    }

    public final void d(boolean z10) {
        this.f28084n = this.h;
        this.h = new HashMap();
        this.f28089r.clear();
        this.f28094x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new gn0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        va1 va1Var;
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
        float f14 = this.f28082k0 - this.f28081j0;
        float f15 = (1.0f - this.f28080i0) * this.f28083l0;
        int i10 = 0;
        while (true) {
            va1Var = this.e;
            if (i10 >= va1Var.getChildCount()) {
                break;
            }
            if (va1Var.getChildAt(i10) instanceof by0) {
                by0 by0Var = (by0) va1Var.getChildAt(i10);
                float f16 = by0Var.f25174y;
                if (by0Var.getLeft() != f16 && by0Var.E) {
                    by0Var.f25166b = f16 - by0Var.getLeft();
                    ValueAnimator valueAnimator = by0Var.f25173x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        by0Var.f25173x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(by0Var.f25166b, 0.0f);
                    by0Var.f25173x = ofFloat;
                    ofFloat.addUpdateListener(new ay0(by0Var, this, 0));
                    by0Var.f25173x.addListener(new ql0(4, by0Var, this));
                    by0Var.f25173x.start();
                }
                by0Var.E = false;
                if (this.f28078g0) {
                    by0Var.setTranslationX(com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f28080i0, i10 * f14, f15) + by0Var.f25166b);
                } else {
                    by0Var.setTranslationX(by0Var.f25166b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f28078g0) {
            height = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f28080i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f28086o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f28087p0.d(f7, false);
        if (!isInEditMode() && this.f28094x != 0 && this.J >= 0) {
            f6 f6Var = this.E;
            float d10 = f6Var.d(this.f28095y, false);
            TimeInterpolator timeInterpolator = f6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < va1Var.getChildCount()) {
                view = va1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < va1Var.getChildCount()) {
                view2 = va1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28080i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28080i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof by0) {
                    f12 = ((by0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof by0) {
                    f13 = ((by0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28080i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof by0) {
                        textWidth = ((by0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28080i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof by0) {
                            textWidth = ((by0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(f6Var.b());
            } else {
                b10 = f6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(f6Var.b());
            } else {
                b11 = f6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = bs.f25135i.getInterpolation(this.f28080i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.g6 g6Var = this.O;
            Paint paint = this.f28085n0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, g6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f28094x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, va1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            va1 va1Var = this.e;
            if (i10 < va1Var.getChildCount()) {
                View childAt = va1Var.getChildAt(i10);
                if (childAt instanceof by0) {
                    by0 by0Var = (by0) childAt;
                    if (by0Var.f25165a == 0 && !by0Var.d) {
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
        fn0 fn0Var = this.f28075e0;
        if (action == 0 && this.f28091s == null) {
            this.f28071b0 = true;
            AndroidUtilities.runOnUIThread(fn0Var, 500L);
            this.W = motionEvent.getX();
            this.f28069a0 = motionEvent.getY();
        }
        if (this.f28071b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f28069a0) > f7) {
                this.f28071b0 = false;
                AndroidUtilities.cancelRunOnUIThread(fn0Var);
            }
        }
        int action2 = motionEvent.getAction();
        fn0 fn0Var2 = this.f28092s0;
        va1 va1Var = this.e;
        if (action2 == 2 && this.f28091s != null) {
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
                for (int i11 = 0; i11 < va1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        by0 by0Var = (by0) va1Var.getChildAt(i11);
                        by0Var.f25174y = by0Var.getLeft();
                        by0Var.E = true;
                        by0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                va1Var.removeView(this.f28091s);
                va1Var.addView(this.f28091s, this.U);
                invalidate();
            }
            this.f28074d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f28091s.getMeasuredWidth() / 2.0f) {
                this.f28088q0 = false;
                if (this.f28090r0 <= 0) {
                    this.f28090r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(fn0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f28091s.getMeasuredWidth() / 2.0f)) {
                this.f28088q0 = true;
                if (this.f28090r0 <= 0) {
                    this.f28090r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(fn0Var2, 16L);
            } else {
                this.f28090r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(fn0Var2);
            }
            va1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f28090r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(fn0Var2);
            AndroidUtilities.cancelRunOnUIThread(fn0Var);
            if (this.f28091s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < va1Var.getChildCount(); i14++) {
                        va1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d80(this, 13));
                ofFloat.addListener(new i60(this, 15));
                ofFloat.start();
            }
            this.f28071b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f28084n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f28089r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f28095y;
    }

    public float getExpandedOffset() {
        if (this.f28078g0) {
            return AndroidUtilities.dp(50.0f) * this.f28080i0;
        }
        return 0.0f;
    }

    public jn0 getType() {
        return this.f28070b;
    }

    public final void h() {
        HashMap hashMap = this.f28084n;
        va1 va1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                va1Var.removeView((View) entry.getValue());
            }
            this.f28084n.clear();
        }
        SparseArray sparseArray = this.f28089r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (va1Var.indexOfChild(view) != keyAt) {
                va1Var.removeView(view);
                va1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f28077f0 != z10) {
            this.f28077f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f28079h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f28079h0.cancel();
            }
            float f11 = this.f28080i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f28079h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    kn0 kn0Var = kn0.this;
                    va1 va1Var = kn0Var.e;
                    if (!z10) {
                        float childCount = kn0Var.f28082k0 * va1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (kn0Var.getScrollX() + f12) / (kn0Var.f28081j0 * va1Var.getChildCount());
                        float measuredWidth = (childCount - kn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        kn0Var.f28083l0 = (kn0Var.getScrollX() + f12) - f13;
                    }
                    kn0Var.f28080i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < va1Var.getChildCount(); i10++) {
                        va1Var.getChildAt(i10).invalidate();
                    }
                    va1Var.invalidate();
                    kn0Var.p();
                }
            });
            this.f28079h0.addListener(new hn0(this, z10, f7, 0));
            this.f28079h0.start();
            va1 va1Var = this.e;
            if (z10) {
                this.f28078g0 = true;
                for (int i10 = 0; i10 < va1Var.getChildCount(); i10++) {
                    View childAt = va1Var.getChildAt(i10);
                    if (childAt instanceof by0) {
                        ((by0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                va1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f28081j0 * va1Var.getChildCount() * ((getScrollX() + f7) / (this.f28082k0 * va1Var.getChildCount()));
                this.f28083l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f28095y;
        if (i12 != i10) {
            va1 va1Var = this.e;
            View childAt = va1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f28095y = i10;
            if (i10 >= va1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= va1Var.getChildCount()) {
                    break;
                }
                View childAt2 = va1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f28079h0 == null) {
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
        if (this.f28094x != 0) {
            va1 va1Var = this.e;
            if (va1Var.getChildAt(i10) != null) {
                int left = va1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f28094x) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn0.n():void");
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
        for (int i10 = 0; i10 < this.f28094x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f28093w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f28072c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f28095y = i10;
    }

    public void setDelegate(in0 in0Var) {
        this.f28076f = in0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f28068a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f28093w = z10;
        requestLayout();
    }

    public void setType(jn0 jn0Var) {
        if (jn0Var != null && this.f28070b != jn0Var) {
            this.f28070b = jn0Var;
            int ordinal = jn0Var.ordinal();
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
