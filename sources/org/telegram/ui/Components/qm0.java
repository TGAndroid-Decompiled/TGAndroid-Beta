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
import org.telegram.ui.ib1;
public abstract class qm0 extends HorizontalScrollView {
    public static final int f30421q0 = 0;
    public final z5 B;
    public final RectF C;
    public final float D;
    public final Paint E;
    public int F;
    public int G;
    public final GradientDrawable H;
    public final int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.g6 L;
    public final boolean M;
    public final SparseArray N;
    public final SparseArray O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public float W;
    public int f30422a;
    public float f30423a0;
    public pm0 f30424b;
    public final mm0 f30425b0;
    public final LinearLayout.LayoutParams f30426c;
    public boolean f30427c0;
    public final LinearLayout.LayoutParams d;
    public boolean f30428d0;
    public final ib1 f30429e;
    public ValueAnimator f30430e0;
    public om0 f30431f;
    public float f30432f0;
    public final float f30433g0;
    public HashMap h;
    public final float f30434h0;
    public float f30435i0;
    public int f30436j0;
    public final Paint f30437k0;
    public boolean f30438l0;
    public final z5 m0;
    public HashMap f30439n;
    public boolean f30440n0;
    public long f30441o0;
    public final mm0 f30442p0;
    public final SparseArray f30443r;
    public View f30444s;
    public float v;
    public boolean f30445w;
    public int f30446x;
    public int f30447y;

    public qm0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f30422a = 1;
        this.f30424b = pm0.f30125a;
        this.h = new HashMap();
        this.f30439n = new HashMap();
        this.f30443r = new SparseArray();
        pr prVar = pr.h;
        this.B = new z5(this, 350L, prVar);
        new RectF();
        new RectF();
        this.C = new RectF();
        this.F = 436207616;
        this.H = new GradientDrawable();
        this.I = AndroidUtilities.dp(33.0f);
        this.J = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.K = 0;
        this.N = new SparseArray();
        this.O = new SparseArray();
        this.f30425b0 = new mm0(this, 0);
        this.f30427c0 = false;
        this.f30433g0 = AndroidUtilities.dp(64.0f);
        this.f30434h0 = AndroidUtilities.dp(33.0f);
        this.f30436j0 = -1;
        this.f30437k0 = new Paint();
        this.f30438l0 = true;
        this.m0 = new z5(this, 350L, prVar);
        this.f30442p0 = new mm0(this, 1);
        this.L = g6Var;
        this.M = z4;
        this.D = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ib1 ib1Var = new ib1(this, context, 9);
        this.f30429e = ib1Var;
        ib1Var.setOrientation(0);
        ib1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ib1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f30426c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f30428d0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.f30446x;
        this.f30446x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f30439n.get(j10);
        boolean z4 = true;
        if (frameLayout != null) {
            g(j10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, k7.c6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new km0(this, 3));
            this.f30429e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30447y) {
            z4 = false;
        }
        frameLayout.setSelected(z4);
        this.h.put(j10, frameLayout);
        return frameLayout;
    }

    public final gx0 c(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.f30446x;
        this.f30446x = i11 + 1;
        gx0 gx0Var = (gx0) this.f30439n.get(j10);
        boolean z4 = true;
        if (gx0Var != null) {
            g(j10, gx0Var, i11);
        } else {
            gx0Var = new gx0(getContext(), 1);
            gx0Var.f27314f.setImageDrawable(drawable);
            gx0Var.setFocusable(true);
            gx0Var.setOnClickListener(new km0(this, 4));
            gx0Var.setExpanded(this.f30427c0);
            gx0Var.a(this.f30432f0);
            this.f30429e.addView(gx0Var, i11);
        }
        gx0Var.d = false;
        gx0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30447y) {
            z4 = false;
        }
        gx0Var.setSelected(z4);
        this.h.put(j10, gx0Var);
        return gx0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.V = false;
        AndroidUtilities.cancelRunOnUIThread(this.f30425b0);
    }

    public final void d(boolean z4) {
        this.f30439n = this.h;
        this.h = new HashMap();
        this.f30443r.clear();
        this.f30446x = 0;
        if (z4) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new nm0(this, 0));
            TransitionManager.beginDelayedTransition(this.f30429e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ib1 ib1Var;
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
        float f15 = this.f30434h0 - this.f30433g0;
        float f16 = (1.0f - this.f30432f0) * this.f30435i0;
        int i10 = 0;
        while (true) {
            ib1Var = this.f30429e;
            if (i10 >= ib1Var.getChildCount()) {
                break;
            }
            if (ib1Var.getChildAt(i10) instanceof gx0) {
                gx0 gx0Var = (gx0) ib1Var.getChildAt(i10);
                float f17 = gx0Var.f27320y;
                if (gx0Var.getLeft() != f17 && gx0Var.B) {
                    gx0Var.f27311b = f17 - gx0Var.getLeft();
                    ValueAnimator valueAnimator = gx0Var.f27319x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gx0Var.f27319x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(gx0Var.f27311b, 0.0f);
                    gx0Var.f27319x = ofFloat;
                    ofFloat.addUpdateListener(new ex0(gx0Var, this, 0));
                    gx0Var.f27319x.addListener(new fx0(0, gx0Var, this));
                    gx0Var.f27319x.start();
                }
                gx0Var.B = false;
                if (this.f30428d0) {
                    gx0Var.setTranslationX(e2.c.w(1.0f, this.f30432f0, i10 * f15, f16) + gx0Var.f27311b);
                } else {
                    gx0Var.setTranslationX(gx0Var.f27311b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f30428d0) {
            height = org.telegram.ui.yh.c(1.0f, this.f30432f0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f30438l0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.m0.d(f10, false);
        if (!isInEditMode() && this.f30446x != 0 && this.G >= 0) {
            z5 z5Var = this.B;
            float d10 = z5Var.d(this.f30447y, false);
            TimeInterpolator timeInterpolator = z5Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < ib1Var.getChildCount()) {
                view = ib1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < ib1Var.getChildCount()) {
                view2 = ib1Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = d10 - floor;
                f12 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30432f0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30432f0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof gx0) {
                    f13 = ((gx0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof gx0) {
                    f14 = ((gx0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30432f0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof gx0) {
                        textWidth = ((gx0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30432f0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof gx0) {
                            textWidth = ((gx0) view2).getTextWidth();
                        }
                    } else {
                        f12 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(z5Var.b());
            } else {
                b10 = z5Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f11)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(z5Var.b());
            } else {
                b11 = z5Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f11) + 0.9f) * dp;
            float interpolation = pr.f30185i.getInterpolation(this.f30432f0);
            float lerp = f19 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f11;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = lerp + lerp3;
            RectF rectF = this.C;
            rectF.set(f12 - lerp2, lerp - lerp3, f12 + lerp2, f21);
            boolean z4 = this.M;
            org.telegram.ui.ActionBar.g6 g6Var = this.L;
            Paint paint = this.f30437k0;
            if (z4) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f30446x != 0 && this.J > 0) {
            int i11 = this.F;
            Paint paint2 = this.E;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f18 - this.J, ib1Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.P && i10 >= 0) {
            ib1 ib1Var = this.f30429e;
            if (i10 < ib1Var.getChildCount()) {
                View childAt = ib1Var.getChildAt(i10);
                if (childAt instanceof gx0) {
                    gx0 gx0Var = (gx0) childAt;
                    if (gx0Var.f27310a == 0 && !gx0Var.d) {
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
        mm0 mm0Var = this.f30425b0;
        if (action == 0 && this.f30444s == null) {
            this.V = true;
            AndroidUtilities.runOnUIThread(mm0Var, 500L);
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
        }
        if (this.V && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.T);
            float f10 = this.D;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.U) > f10) {
                this.V = false;
                AndroidUtilities.cancelRunOnUIThread(mm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        mm0 mm0Var2 = this.f30442p0;
        ib1 ib1Var = this.f30429e;
        if (action2 == 2 && this.f30444s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i10 = this.R;
            if (ceil != i10) {
                if (ceil < i10) {
                    while (!e(ceil) && ceil != this.R) {
                        ceil++;
                    }
                } else {
                    while (!e(ceil) && ceil != this.R) {
                        ceil--;
                    }
                }
            }
            if (this.R != ceil && e(ceil)) {
                for (int i11 = 0; i11 < ib1Var.getChildCount(); i11++) {
                    if (i11 != this.R) {
                        gx0 gx0Var = (gx0) ib1Var.getChildAt(i11);
                        gx0Var.f27320y = gx0Var.getLeft();
                        gx0Var.B = true;
                        gx0Var.invalidate();
                    }
                }
                this.S += (ceil - this.R) * getTabSize();
                this.R = ceil;
                ib1Var.removeView(this.f30444s);
                ib1Var.addView(this.f30444s, this.R);
                invalidate();
            }
            this.f30423a0 = this.T - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f30444s.getMeasuredWidth() / 2.0f) {
                this.f30440n0 = false;
                if (this.f30441o0 <= 0) {
                    this.f30441o0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(mm0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f30444s.getMeasuredWidth() / 2.0f)) {
                this.f30440n0 = true;
                if (this.f30441o0 <= 0) {
                    this.f30441o0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(mm0Var2, 16L);
            } else {
                this.f30441o0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(mm0Var2);
            }
            ib1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f30441o0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(mm0Var2);
            AndroidUtilities.cancelRunOnUIThread(mm0Var);
            if (this.f30444s != null) {
                int i12 = this.Q;
                int i13 = this.R;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < ib1Var.getChildCount(); i14++) {
                        ib1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k70(this, 12));
                ofFloat.addListener(new pd0(this, 7));
                ofFloat.start();
            }
            this.V = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f30439n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f30443r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f30447y;
    }

    public float getExpandedOffset() {
        if (this.f30428d0) {
            return AndroidUtilities.dp(50.0f) * this.f30432f0;
        }
        return 0.0f;
    }

    public pm0 getType() {
        return this.f30424b;
    }

    public final void h() {
        HashMap hashMap = this.f30439n;
        ib1 ib1Var = this.f30429e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ib1Var.removeView((View) entry.getValue());
            }
            this.f30439n.clear();
        }
        SparseArray sparseArray = this.f30443r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ib1Var.indexOfChild(view) != keyAt) {
                ib1Var.removeView(view);
                ib1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z4) {
        float f11;
        if (this.f30427c0 != z4) {
            this.f30427c0 = z4;
            if (!z4) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f30430e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30430e0.cancel();
            }
            float f12 = this.f30432f0;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f30430e0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    qm0 qm0Var = qm0.this;
                    ib1 ib1Var = qm0Var.f30429e;
                    if (!z4) {
                        float childCount = qm0Var.f30434h0 * ib1Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (qm0Var.getScrollX() + f13) / (qm0Var.f30433g0 * ib1Var.getChildCount());
                        float measuredWidth = (childCount - qm0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        qm0Var.f30435i0 = (qm0Var.getScrollX() + f13) - f14;
                    }
                    qm0Var.f30432f0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ib1Var.getChildCount(); i10++) {
                        ib1Var.getChildAt(i10).invalidate();
                    }
                    ib1Var.invalidate();
                    qm0Var.p();
                }
            });
            this.f30430e0.addListener(new kh.r(this, z4, f10, 1));
            this.f30430e0.start();
            ib1 ib1Var = this.f30429e;
            if (z4) {
                this.f30428d0 = true;
                for (int i10 = 0; i10 < ib1Var.getChildCount(); i10++) {
                    View childAt = ib1Var.getChildAt(i10);
                    if (childAt instanceof gx0) {
                        ((gx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ib1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z4) {
                float childCount = this.f30433g0 * ib1Var.getChildCount() * ((getScrollX() + f10) / (this.f30434h0 * ib1Var.getChildCount()));
                this.f30435i0 = childCount - (getScrollX() + f10);
                this.f30436j0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f30447y;
        if (i12 != i10) {
            ib1 ib1Var = this.f30429e;
            View childAt = ib1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f30447y = i10;
            if (i10 >= ib1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z4 = true;
                if (i13 >= ib1Var.getChildCount()) {
                    break;
                }
                View childAt2 = ib1Var.getChildAt(i13);
                if (i13 != i10) {
                    z4 = false;
                }
                childAt2.setSelected(z4);
                i13++;
            }
            if (this.f30430e0 == null) {
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
        if (this.f30446x != 0) {
            ib1 ib1Var = this.f30429e;
            if (ib1Var.getChildAt(i10) != null) {
                int left = ib1Var.getChildAt(i10).getLeft();
                int i11 = this.I;
                if (i10 > 0) {
                    left -= i11;
                }
                int scrollX = getScrollX();
                if (left != this.K) {
                    if (left < scrollX) {
                        this.K = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                        int width = (i11 * 3) + (left - getWidth());
                        this.K = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i10) {
        if (i10 >= 0 && i10 < this.f30446x) {
            this.f30429e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm0.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        n();
        int i14 = this.f30436j0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.f30436j0 = -1;
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
        for (int i10 = 0; i10 < this.f30446x; i10++) {
            View childAt = this.f30429e.getChildAt(i10);
            if (this.f30445w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f30426c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f30447y = i10;
    }

    public void setDelegate(om0 om0Var) {
        this.f30431f = om0Var;
    }

    public void setDragEnabled(boolean z4) {
        this.P = z4;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f30422a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.G = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f30445w = z4;
        requestLayout();
    }

    public void setType(pm0 pm0Var) {
        if (pm0Var != null && this.f30424b != pm0Var) {
            this.f30424b = pm0Var;
            int ordinal = pm0Var.ordinal();
            GradientDrawable gradientDrawable = this.H;
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
        this.F = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.F = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.J != i10) {
            this.J = i10;
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
