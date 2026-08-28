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
import org.telegram.ui.ta1;
public abstract class sl0 extends HorizontalScrollView {
    public static final int f32492p0 = 0;
    public final y5 A;
    public final RectF B;
    public final float C;
    public final Paint D;
    public int E;
    public int F;
    public final GradientDrawable G;
    public final int H;
    public int I;
    public int J;
    public final org.telegram.ui.ActionBar.b6 K;
    public final boolean L;
    public final SparseArray M;
    public final SparseArray N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int f32493a;
    public final ol0 f32494a0;
    public rl0 f32495b;
    public boolean f32496b0;
    public final LinearLayout.LayoutParams f32497c;
    public boolean f32498c0;
    public final LinearLayout.LayoutParams d;
    public ValueAnimator f32499d0;
    public final ta1 f32500e;
    public float f32501e0;
    public ql0 f32502f;
    public final float f32503f0;
    public final float f32504g0;
    public HashMap h;
    public float f32505h0;
    public int f32506i0;
    public final Paint f32507j0;
    public boolean f32508k0;
    public final y5 f32509l0;
    public boolean m0;
    public HashMap f32510n;
    public long f32511n0;
    public final ol0 f32512o0;
    public final SparseArray f32513r;
    public View f32514s;
    public float v;
    public boolean f32515w;
    public int f32516x;
    public int f32517y;

    public sl0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f32493a = 1;
        this.f32495b = rl0.f32195a;
        this.h = new HashMap();
        this.f32510n = new HashMap();
        this.f32513r = new SparseArray();
        gr grVar = gr.h;
        this.A = new y5(this, 350L, grVar);
        new RectF();
        new RectF();
        this.B = new RectF();
        this.E = 436207616;
        this.G = new GradientDrawable();
        this.H = AndroidUtilities.dp(33.0f);
        this.I = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.J = 0;
        this.M = new SparseArray();
        this.N = new SparseArray();
        this.f32494a0 = new ol0(this, 0);
        this.f32496b0 = false;
        this.f32503f0 = AndroidUtilities.dp(64.0f);
        this.f32504g0 = AndroidUtilities.dp(33.0f);
        this.f32506i0 = -1;
        this.f32507j0 = new Paint();
        this.f32508k0 = true;
        this.f32509l0 = new y5(this, 350L, grVar);
        this.f32512o0 = new ol0(this, 1);
        this.K = b6Var;
        this.L = z10;
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ta1 ta1Var = new ta1(this, context, 9);
        this.f32500e = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ta1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.D = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f32497c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f32498c0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final FrameLayout b(int i9, Drawable drawable) {
        String l10 = j3.r0.l(i9, "tab");
        int i10 = this.f32516x;
        this.f32516x = i10 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f32510n.get(l10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(l10, frameLayout, i10);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, g7.e6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ml0(this, 3));
            this.f32500e.addView(frameLayout, i10);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i10));
        if (i10 != this.f32517y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(l10, frameLayout);
        return frameLayout;
    }

    public final lw0 c(int i9, Drawable drawable) {
        String l10 = j3.r0.l(i9, "tab");
        int i10 = this.f32516x;
        this.f32516x = i10 + 1;
        lw0 lw0Var = (lw0) this.f32510n.get(l10);
        boolean z10 = true;
        if (lw0Var != null) {
            g(l10, lw0Var, i10);
        } else {
            lw0Var = new lw0(getContext(), 1);
            lw0Var.f30572f.setImageDrawable(drawable);
            lw0Var.setFocusable(true);
            lw0Var.setOnClickListener(new ml0(this, 4));
            lw0Var.setExpanded(this.f32496b0);
            lw0Var.a(this.f32501e0);
            this.f32500e.addView(lw0Var, i10);
        }
        lw0Var.d = false;
        lw0Var.setTag(R.id.index_tag, Integer.valueOf(i10));
        if (i10 != this.f32517y) {
            z10 = false;
        }
        lw0Var.setSelected(z10);
        this.h.put(l10, lw0Var);
        return lw0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.U = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32494a0);
    }

    public final void d(boolean z10) {
        this.f32510n = this.h;
        this.h = new HashMap();
        this.f32513r.clear();
        this.f32516x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new pl0(this, 0));
            TransitionManager.beginDelayedTransition(this.f32500e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ta1 ta1Var;
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
        float f15 = this.f32504g0 - this.f32503f0;
        float f16 = (1.0f - this.f32501e0) * this.f32505h0;
        int i9 = 0;
        while (true) {
            ta1Var = this.f32500e;
            if (i9 >= ta1Var.getChildCount()) {
                break;
            }
            if (ta1Var.getChildAt(i9) instanceof lw0) {
                lw0 lw0Var = (lw0) ta1Var.getChildAt(i9);
                float f17 = lw0Var.f30578y;
                if (lw0Var.getLeft() != f17 && lw0Var.A) {
                    lw0Var.f30569b = f17 - lw0Var.getLeft();
                    ValueAnimator valueAnimator = lw0Var.f30577x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        lw0Var.f30577x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(lw0Var.f30569b, 0.0f);
                    lw0Var.f30577x = ofFloat;
                    ofFloat.addUpdateListener(new kw0(lw0Var, this, 0));
                    lw0Var.f30577x.addListener(new su0(1, lw0Var, this));
                    lw0Var.f30577x.start();
                }
                lw0Var.A = false;
                if (this.f32498c0) {
                    lw0Var.setTranslationX(e2.c.z(1.0f, this.f32501e0, i9 * f15, f16) + lw0Var.f30569b);
                } else {
                    lw0Var.setTranslationX(lw0Var.f30569b);
                }
            }
            i9++;
        }
        float height = getHeight();
        if (this.f32498c0) {
            height = j3.r0.C(1.0f, this.f32501e0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f32508k0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f32509l0.d(f10, false);
        if (!isInEditMode() && this.f32516x != 0 && this.F >= 0) {
            y5 y5Var = this.A;
            float d9 = y5Var.d(this.f32517y, false);
            TimeInterpolator timeInterpolator = y5Var.h;
            double d10 = d9;
            int floor = (int) Math.floor(d10);
            int ceil = (int) Math.ceil(d10);
            View view2 = null;
            if (floor >= 0 && floor < ta1Var.getChildCount()) {
                view = ta1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < ta1Var.getChildCount()) {
                view2 = ta1Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = d9 - floor;
                f12 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f32501e0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f32501e0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof lw0) {
                    f13 = ((lw0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof lw0) {
                    f14 = ((lw0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f32501e0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof lw0) {
                        textWidth = ((lw0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f32501e0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof lw0) {
                            textWidth = ((lw0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(y5Var.b());
            } else {
                b10 = y5Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(y5Var.b());
            } else {
                b11 = y5Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * dp;
            float interpolation = gr.f28846i.getInterpolation(this.f32501e0);
            float lerp = f19 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f11;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = lerp + lerp3;
            RectF rectF = this.B;
            rectF.set(f12 - lerp2, lerp - lerp3, f12 + lerp2, f21);
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.b6 b6Var = this.K;
            Paint paint = this.f32507j0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f32516x != 0 && this.I > 0) {
            int i10 = this.E;
            Paint paint2 = this.D;
            paint2.setColor(i10);
            canvas2.drawRect(0.0f, f18 - this.I, ta1Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i9) {
        if (this.O && i9 >= 0) {
            ta1 ta1Var = this.f32500e;
            if (i9 < ta1Var.getChildCount()) {
                View childAt = ta1Var.getChildAt(i9);
                if (childAt instanceof lw0) {
                    lw0 lw0Var = (lw0) childAt;
                    if (lw0Var.f30568a == 0 && !lw0Var.d) {
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
        ol0 ol0Var = this.f32494a0;
        if (action == 0 && this.f32514s == null) {
            this.U = true;
            AndroidUtilities.runOnUIThread(ol0Var, 500L);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
        }
        if (this.U && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.S);
            float f10 = this.C;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.T) > f10) {
                this.U = false;
                AndroidUtilities.cancelRunOnUIThread(ol0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ol0 ol0Var2 = this.f32512o0;
        ta1 ta1Var = this.f32500e;
        if (action2 == 2 && this.f32514s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i9 = this.Q;
            if (ceil != i9) {
                if (ceil < i9) {
                    while (!e(ceil) && ceil != this.Q) {
                        ceil++;
                    }
                } else {
                    while (!e(ceil) && ceil != this.Q) {
                        ceil--;
                    }
                }
            }
            if (this.Q != ceil && e(ceil)) {
                for (int i10 = 0; i10 < ta1Var.getChildCount(); i10++) {
                    if (i10 != this.Q) {
                        lw0 lw0Var = (lw0) ta1Var.getChildAt(i10);
                        lw0Var.f30578y = lw0Var.getLeft();
                        lw0Var.A = true;
                        lw0Var.invalidate();
                    }
                }
                this.R += (ceil - this.Q) * getTabSize();
                this.Q = ceil;
                ta1Var.removeView(this.f32514s);
                ta1Var.addView(this.f32514s, this.Q);
                invalidate();
            }
            this.W = this.S - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f32514s.getMeasuredWidth() / 2.0f) {
                this.m0 = false;
                if (this.f32511n0 <= 0) {
                    this.f32511n0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ol0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f32514s.getMeasuredWidth() / 2.0f)) {
                this.m0 = true;
                if (this.f32511n0 <= 0) {
                    this.f32511n0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ol0Var2, 16L);
            } else {
                this.f32511n0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(ol0Var2);
            }
            ta1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f32511n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(ol0Var2);
            AndroidUtilities.cancelRunOnUIThread(ol0Var);
            if (this.f32514s != null) {
                int i11 = this.P;
                int i12 = this.Q;
                if (i11 != i12) {
                    o(i11, i12);
                    for (int i13 = 0; i13 < ta1Var.getChildCount(); i13++) {
                        ta1Var.getChildAt(i13).setTag(R.id.index_tag, Integer.valueOf(i13));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q60(this, 12));
                ofFloat.addListener(new r60(this, 14));
                ofFloat.start();
            }
            this.U = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i9) {
        HashMap hashMap = this.f32510n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f32513r.put(i9, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f32517y;
    }

    public float getExpandedOffset() {
        if (this.f32498c0) {
            return AndroidUtilities.dp(50.0f) * this.f32501e0;
        }
        return 0.0f;
    }

    public rl0 getType() {
        return this.f32495b;
    }

    public final void h() {
        HashMap hashMap = this.f32510n;
        ta1 ta1Var = this.f32500e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ta1Var.removeView((View) entry.getValue());
            }
            this.f32510n.clear();
        }
        SparseArray sparseArray = this.f32513r;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            int keyAt = sparseArray.keyAt(i9);
            View view = (View) sparseArray.valueAt(i9);
            if (ta1Var.indexOfChild(view) != keyAt) {
                ta1Var.removeView(view);
                ta1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z10) {
        float f11;
        if (this.f32496b0 != z10) {
            this.f32496b0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f32499d0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32499d0.cancel();
            }
            float f12 = this.f32501e0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f32499d0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    sl0 sl0Var = sl0.this;
                    ta1 ta1Var = sl0Var.f32500e;
                    if (!z10) {
                        float childCount = sl0Var.f32504g0 * ta1Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (sl0Var.getScrollX() + f13) / (sl0Var.f32503f0 * ta1Var.getChildCount());
                        float measuredWidth = (childCount - sl0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        sl0Var.f32505h0 = (sl0Var.getScrollX() + f13) - f14;
                    }
                    sl0Var.f32501e0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                        ta1Var.getChildAt(i9).invalidate();
                    }
                    ta1Var.invalidate();
                    sl0Var.p();
                }
            });
            this.f32499d0.addListener(new eh.t(this, z10, f10, 1));
            this.f32499d0.start();
            ta1 ta1Var = this.f32500e;
            if (z10) {
                this.f32498c0 = true;
                for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                    View childAt = ta1Var.getChildAt(i9);
                    if (childAt instanceof lw0) {
                        ((lw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ta1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f32503f0 * ta1Var.getChildCount() * ((getScrollX() + f10) / (this.f32504g0 * ta1Var.getChildCount()));
                this.f32505h0 = childCount - (getScrollX() + f10);
                this.f32506i0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i9, int i10) {
        int i11 = this.f32517y;
        if (i11 != i9) {
            ta1 ta1Var = this.f32500e;
            View childAt = ta1Var.getChildAt(i11);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f32517y = i9;
            if (i9 >= ta1Var.getChildCount()) {
                return;
            }
            int i12 = 0;
            while (true) {
                boolean z10 = true;
                if (i12 >= ta1Var.getChildCount()) {
                    break;
                }
                View childAt2 = ta1Var.getChildAt(i12);
                if (i12 != i9) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i12++;
            }
            if (this.f32499d0 == null) {
                if (i10 == i9 && i9 > 1) {
                    l(i9 - 1);
                } else {
                    l(i9);
                }
            }
            invalidate();
        }
    }

    public final void l(int i9) {
        if (this.f32516x != 0) {
            ta1 ta1Var = this.f32500e;
            if (ta1Var.getChildAt(i9) != null) {
                int left = ta1Var.getChildAt(i9).getLeft();
                int i10 = this.H;
                if (i9 > 0) {
                    left -= i10;
                }
                int scrollX = getScrollX();
                if (left != this.J) {
                    if (left < scrollX) {
                        this.J = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i10 > (getWidth() + scrollX) - (i10 * 2)) {
                        int width = (i10 * 3) + (left - getWidth());
                        this.J = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i9) {
        if (i9 >= 0 && i9 < this.f32516x) {
            this.f32500e.getChildAt(i9).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sl0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        n();
        int i13 = this.f32506i0;
        if (i13 >= 0) {
            scrollTo(i13, 0);
            this.f32506i0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
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
        for (int i9 = 0; i9 < this.f32516x; i9++) {
            View childAt = this.f32500e.getChildAt(i9);
            if (this.f32515w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f32497c);
            }
        }
    }

    public void setCurrentPosition(int i9) {
        this.f32517y = i9;
    }

    public void setDelegate(ql0 ql0Var) {
        this.f32502f = ql0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.O = z10;
    }

    public void setImageReceiversLayerNum(int i9) {
        this.f32493a = i9;
    }

    public void setIndicatorColor(int i9) {
        invalidate();
    }

    public void setIndicatorHeight(int i9) {
        this.F = i9;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f32515w = z10;
        requestLayout();
    }

    public void setType(rl0 rl0Var) {
        if (rl0Var != null && this.f32495b != rl0Var) {
            this.f32495b = rl0Var;
            int ordinal = rl0Var.ordinal();
            GradientDrawable gradientDrawable = this.G;
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

    public void setUnderlineColor(int i9) {
        this.E = i9;
        invalidate();
    }

    public void setUnderlineColorResource(int i9) {
        this.E = getResources().getColor(i9);
        invalidate();
    }

    public void setUnderlineHeight(int i9) {
        if (this.I != i9) {
            this.I = i9;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i9, int i10) {
    }
}
