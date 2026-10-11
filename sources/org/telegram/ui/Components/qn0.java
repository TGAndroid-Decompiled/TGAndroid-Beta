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
public abstract class qn0 extends HorizontalScrollView {
    public static final int f30185t0 = 0;
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
    public int f30186a;
    public float f30187a0;
    public pn0 f30188b;
    public boolean f30189b0;
    public final LinearLayout.LayoutParams f30190c;
    public float f30191c0;
    public final LinearLayout.LayoutParams d;
    public float f30192d0;
    public final cc1 f30193e;
    public final ln0 f30194e0;
    public on0 f30195f;
    public boolean f30196f0;
    public boolean f30197g0;
    public HashMap h;
    public ValueAnimator f30198h0;
    public float f30199i0;
    public final float f30200j0;
    public final float f30201k0;
    public float f30202l0;
    public int m0;
    public HashMap f30203n;
    public final Paint f30204n0;
    public boolean f30205o0;
    public final g6 f30206p0;
    public boolean f30207q0;
    public final SparseArray f30208r;
    public long f30209r0;
    public View f30210s;
    public final ln0 f30211s0;
    public float v;
    public boolean f30212w;
    public int f30213x;
    public int f30214y;

    public qn0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f30186a = 1;
        this.f30188b = pn0.f29775a;
        this.h = new HashMap();
        this.f30203n = new HashMap();
        this.f30208r = new SparseArray();
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
        this.f30194e0 = new ln0(this, 0);
        this.f30196f0 = false;
        this.f30200j0 = AndroidUtilities.dp(64.0f);
        this.f30201k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f30204n0 = new Paint();
        this.f30205o0 = true;
        this.f30206p0 = new g6(this, 350L, isVar);
        this.f30211s0 = new ln0(this, 1);
        this.O = d6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        cc1 cc1Var = new cc1(this, context, 8);
        this.f30193e = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(cc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f30190c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f30197g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f30213x;
        this.f30213x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f30203n.get(h);
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
            frameLayout.setOnClickListener(new jn0(this, 3));
            this.f30193e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30214y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(h, frameLayout);
        return frameLayout;
    }

    public final hy0 c(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f30213x;
        this.f30213x = i11 + 1;
        hy0 hy0Var = (hy0) this.f30203n.get(h);
        boolean z10 = true;
        if (hy0Var != null) {
            g(h, hy0Var, i11);
        } else {
            hy0Var = new hy0(getContext(), 1);
            hy0Var.f27098f.setImageDrawable(drawable);
            hy0Var.setFocusable(true);
            hy0Var.setOnClickListener(new jn0(this, 4));
            hy0Var.setExpanded(this.f30196f0);
            hy0Var.a(this.f30199i0);
            this.f30193e.addView(hy0Var, i11);
        }
        hy0Var.d = false;
        hy0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30214y) {
            z10 = false;
        }
        hy0Var.setSelected(z10);
        this.h.put(h, hy0Var);
        return hy0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f30189b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f30194e0);
    }

    public final void d(boolean z10) {
        this.f30203n = this.h;
        this.h = new HashMap();
        this.f30208r.clear();
        this.f30213x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new mn0(this, 0));
            TransitionManager.beginDelayedTransition(this.f30193e, autoTransition);
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
        float f14 = this.f30201k0 - this.f30200j0;
        float f15 = (1.0f - this.f30199i0) * this.f30202l0;
        int i10 = 0;
        while (true) {
            cc1Var = this.f30193e;
            if (i10 >= cc1Var.getChildCount()) {
                break;
            }
            if (cc1Var.getChildAt(i10) instanceof hy0) {
                hy0 hy0Var = (hy0) cc1Var.getChildAt(i10);
                float f16 = hy0Var.f27104y;
                if (hy0Var.getLeft() != f16 && hy0Var.E) {
                    hy0Var.f27095b = f16 - hy0Var.getLeft();
                    ValueAnimator valueAnimator = hy0Var.f27103x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        hy0Var.f27103x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(hy0Var.f27095b, 0.0f);
                    hy0Var.f27103x = ofFloat;
                    ofFloat.addUpdateListener(new gy0(hy0Var, this, 0));
                    hy0Var.f27103x.addListener(new wl0(3, hy0Var, this));
                    hy0Var.f27103x.start();
                }
                hy0Var.E = false;
                if (this.f30197g0) {
                    hy0Var.setTranslationX(com.google.android.gms.internal.vision.e2.y(1.0f, this.f30199i0, i10 * f14, f15) + hy0Var.f27095b);
                } else {
                    hy0Var.setTranslationX(hy0Var.f27095b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f30197g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f30199i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f30205o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f30206p0.d(f7, false);
        if (!isInEditMode() && this.f30213x != 0 && this.J >= 0) {
            g6 g6Var = this.E;
            float d10 = g6Var.d(this.f30214y, false);
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
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30199i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30199i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof hy0) {
                    f12 = ((hy0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof hy0) {
                    f13 = ((hy0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30199i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof hy0) {
                        textWidth = ((hy0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30199i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof hy0) {
                            textWidth = ((hy0) view2).getTextWidth();
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
            float interpolation = is.f27453i.getInterpolation(this.f30199i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.d6 d6Var = this.O;
            Paint paint = this.f30204n0;
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
        if (!isInEditMode() && this.f30213x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, cc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            cc1 cc1Var = this.f30193e;
            if (i10 < cc1Var.getChildCount()) {
                View childAt = cc1Var.getChildAt(i10);
                if (childAt instanceof hy0) {
                    hy0 hy0Var = (hy0) childAt;
                    if (hy0Var.f27094a == 0 && !hy0Var.d) {
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
        ln0 ln0Var = this.f30194e0;
        if (action == 0 && this.f30210s == null) {
            this.f30189b0 = true;
            AndroidUtilities.runOnUIThread(ln0Var, 500L);
            this.W = motionEvent.getX();
            this.f30187a0 = motionEvent.getY();
        }
        if (this.f30189b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f30187a0) > f7) {
                this.f30189b0 = false;
                AndroidUtilities.cancelRunOnUIThread(ln0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ln0 ln0Var2 = this.f30211s0;
        cc1 cc1Var = this.f30193e;
        if (action2 == 2 && this.f30210s != null) {
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
                        hy0 hy0Var = (hy0) cc1Var.getChildAt(i11);
                        hy0Var.f27104y = hy0Var.getLeft();
                        hy0Var.E = true;
                        hy0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                cc1Var.removeView(this.f30210s);
                cc1Var.addView(this.f30210s, this.U);
                invalidate();
            }
            this.f30192d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f30210s.getMeasuredWidth() / 2.0f) {
                this.f30207q0 = false;
                if (this.f30209r0 <= 0) {
                    this.f30209r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ln0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f30210s.getMeasuredWidth() / 2.0f)) {
                this.f30207q0 = true;
                if (this.f30209r0 <= 0) {
                    this.f30209r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ln0Var2, 16L);
            } else {
                this.f30209r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(ln0Var2);
            }
            cc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f30209r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(ln0Var2);
            AndroidUtilities.cancelRunOnUIThread(ln0Var);
            if (this.f30210s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < cc1Var.getChildCount(); i14++) {
                        cc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k80(this, 13));
                ofFloat.addListener(new wd0(this, 9));
                ofFloat.start();
            }
            this.f30189b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f30203n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f30208r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f30214y;
    }

    public float getExpandedOffset() {
        if (this.f30197g0) {
            return AndroidUtilities.dp(50.0f) * this.f30199i0;
        }
        return 0.0f;
    }

    public pn0 getType() {
        return this.f30188b;
    }

    public final void h() {
        HashMap hashMap = this.f30203n;
        cc1 cc1Var = this.f30193e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                cc1Var.removeView((View) entry.getValue());
            }
            this.f30203n.clear();
        }
        SparseArray sparseArray = this.f30208r;
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
        if (this.f30196f0 != z10) {
            this.f30196f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f30198h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30198h0.cancel();
            }
            float f11 = this.f30199i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30198h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    qn0 qn0Var = qn0.this;
                    cc1 cc1Var = qn0Var.f30193e;
                    if (!z10) {
                        float childCount = qn0Var.f30201k0 * cc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (qn0Var.getScrollX() + f12) / (qn0Var.f30200j0 * cc1Var.getChildCount());
                        float measuredWidth = (childCount - qn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        qn0Var.f30202l0 = (qn0Var.getScrollX() + f12) - f13;
                    }
                    qn0Var.f30199i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                        cc1Var.getChildAt(i10).invalidate();
                    }
                    cc1Var.invalidate();
                    qn0Var.p();
                }
            });
            this.f30198h0.addListener(new nn0(this, z10, f7, 0));
            this.f30198h0.start();
            cc1 cc1Var = this.f30193e;
            if (z10) {
                this.f30197g0 = true;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    View childAt = cc1Var.getChildAt(i10);
                    if (childAt instanceof hy0) {
                        ((hy0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                cc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f30200j0 * cc1Var.getChildCount() * ((getScrollX() + f7) / (this.f30201k0 * cc1Var.getChildCount()));
                this.f30202l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f30214y;
        if (i12 != i10) {
            cc1 cc1Var = this.f30193e;
            View childAt = cc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f30214y = i10;
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
            if (this.f30198h0 == null) {
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
        if (this.f30213x != 0) {
            cc1 cc1Var = this.f30193e;
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
        if (i10 >= 0 && i10 < this.f30213x) {
            this.f30193e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn0.n():void");
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
        for (int i10 = 0; i10 < this.f30213x; i10++) {
            View childAt = this.f30193e.getChildAt(i10);
            if (this.f30212w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f30190c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f30214y = i10;
    }

    public void setDelegate(on0 on0Var) {
        this.f30195f = on0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f30186a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f30212w = z10;
        requestLayout();
    }

    public void setType(pn0 pn0Var) {
        if (pn0Var != null && this.f30188b != pn0Var) {
            this.f30188b = pn0Var;
            int ordinal = pn0Var.ordinal();
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
