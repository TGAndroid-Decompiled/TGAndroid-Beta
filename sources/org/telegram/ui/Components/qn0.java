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
public abstract class qn0 extends HorizontalScrollView {
    public static final int f31946t0 = 0;
    public final h6 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.u6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f31947a;
    public float f31948a0;
    public pn0 f31949b;
    public boolean f31950b0;
    public final LinearLayout.LayoutParams f31951c;
    public float f31952c0;
    public final LinearLayout.LayoutParams d;
    public float f31953d0;
    public final org.telegram.ui.za1 e;
    public final ln0 f31954e0;
    public on0 f31955f;
    public boolean f31956f0;
    public boolean f31957g0;
    public HashMap h;
    public ValueAnimator f31958h0;
    public float f31959i0;
    public final float f31960j0;
    public final float f31961k0;
    public float f31962l0;
    public int m0;
    public HashMap f31963n;
    public final Paint f31964n0;
    public boolean f31965o0;
    public final h6 f31966p0;
    public boolean f31967q0;
    public final SparseArray f31968r;
    public long f31969r0;
    public View f31970s;
    public final ln0 f31971s0;
    public float v;
    public boolean f31972w;
    public int f31973x;
    public int f31974y;

    public qn0(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f31947a = 1;
        this.f31949b = pn0.f31646a;
        this.h = new HashMap();
        this.f31963n = new HashMap();
        this.f31968r = new SparseArray();
        ds dsVar = ds.h;
        this.E = new h6(this, 350L, dsVar);
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
        this.f31954e0 = new ln0(this, 0);
        this.f31956f0 = false;
        this.f31960j0 = AndroidUtilities.dp(64.0f);
        this.f31961k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f31964n0 = new Paint();
        this.f31965o0 = true;
        this.f31966p0 = new h6(this, 350L, dsVar);
        this.f31971s0 = new ln0(this, 1);
        this.O = u6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(this, context, 11);
        this.e = za1Var;
        za1Var.setOrientation(0);
        za1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(za1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f31951c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f31957g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = ic.a.i(i10, "tab");
        int i12 = this.f31973x;
        this.f31973x = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f31963n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, kb1.i(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new jn0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31974y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final ky0 c(int i10, Drawable drawable) {
        String i11 = ic.a.i(i10, "tab");
        int i12 = this.f31973x;
        this.f31973x = i12 + 1;
        ky0 ky0Var = (ky0) this.f31963n.get(i11);
        boolean z10 = true;
        if (ky0Var != null) {
            g(i11, ky0Var, i12);
        } else {
            ky0Var = new ky0(getContext(), 1);
            ky0Var.f30054f.setImageDrawable(drawable);
            ky0Var.setFocusable(true);
            ky0Var.setOnClickListener(new jn0(this, 4));
            ky0Var.setExpanded(this.f31956f0);
            ky0Var.a(this.f31959i0);
            this.e.addView(ky0Var, i12);
        }
        ky0Var.d = false;
        ky0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31974y) {
            z10 = false;
        }
        ky0Var.setSelected(z10);
        this.h.put(i11, ky0Var);
        return ky0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f31950b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31954e0);
    }

    public final void d(boolean z10) {
        this.f31963n = this.h;
        this.h = new HashMap();
        this.f31968r.clear();
        this.f31973x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new mn0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.za1 za1Var;
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
        float f14 = this.f31961k0 - this.f31960j0;
        float f15 = (1.0f - this.f31959i0) * this.f31962l0;
        int i10 = 0;
        while (true) {
            za1Var = this.e;
            if (i10 >= za1Var.getChildCount()) {
                break;
            }
            if (za1Var.getChildAt(i10) instanceof ky0) {
                ky0 ky0Var = (ky0) za1Var.getChildAt(i10);
                float f16 = ky0Var.f30060y;
                if (ky0Var.getLeft() != f16 && ky0Var.E) {
                    ky0Var.f30052b = f16 - ky0Var.getLeft();
                    ValueAnimator valueAnimator = ky0Var.f30059x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ky0Var.f30059x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ky0Var.f30052b, 0.0f);
                    ky0Var.f30059x = ofFloat;
                    ofFloat.addUpdateListener(new jy0(0, ky0Var, this));
                    ky0Var.f30059x.addListener(new ml0(4, ky0Var, this));
                    ky0Var.f30059x.start();
                }
                ky0Var.E = false;
                if (this.f31957g0) {
                    ky0Var.setTranslationX(c3.h0.z(1.0f, this.f31959i0, i10 * f14, f15) + ky0Var.f30052b);
                } else {
                    ky0Var.setTranslationX(ky0Var.f30052b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f31957g0) {
            height = ic.a.d(1.0f, this.f31959i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f31965o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f31966p0.d(f7, false);
        if (!isInEditMode() && this.f31973x != 0 && this.J >= 0) {
            h6 h6Var = this.E;
            float d10 = h6Var.d(this.f31974y, false);
            TimeInterpolator timeInterpolator = h6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < za1Var.getChildCount()) {
                view = za1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < za1Var.getChildCount()) {
                view2 = za1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31959i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31959i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof ky0) {
                    f12 = ((ky0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof ky0) {
                    f13 = ((ky0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31959i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof ky0) {
                        textWidth = ((ky0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31959i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof ky0) {
                            textWidth = ((ky0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(h6Var.b());
            } else {
                b10 = h6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(h6Var.b());
            } else {
                b11 = h6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = ds.f27532i.getInterpolation(this.f31959i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.u6 u6Var = this.O;
            Paint paint = this.f31964n0;
            if (z10) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f31973x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, za1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            org.telegram.ui.za1 za1Var = this.e;
            if (i10 < za1Var.getChildCount()) {
                View childAt = za1Var.getChildAt(i10);
                if (childAt instanceof ky0) {
                    ky0 ky0Var = (ky0) childAt;
                    if (ky0Var.f30051a == 0 && !ky0Var.d) {
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
        ln0 ln0Var = this.f31954e0;
        if (action == 0 && this.f31970s == null) {
            this.f31950b0 = true;
            AndroidUtilities.runOnUIThread(ln0Var, 500L);
            this.W = motionEvent.getX();
            this.f31948a0 = motionEvent.getY();
        }
        if (this.f31950b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f31948a0) > f7) {
                this.f31950b0 = false;
                AndroidUtilities.cancelRunOnUIThread(ln0Var);
            }
        }
        int action2 = motionEvent.getAction();
        ln0 ln0Var2 = this.f31971s0;
        org.telegram.ui.za1 za1Var = this.e;
        if (action2 == 2 && this.f31970s != null) {
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
                for (int i11 = 0; i11 < za1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        ky0 ky0Var = (ky0) za1Var.getChildAt(i11);
                        ky0Var.f30060y = ky0Var.getLeft();
                        ky0Var.E = true;
                        ky0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                za1Var.removeView(this.f31970s);
                za1Var.addView(this.f31970s, this.U);
                invalidate();
            }
            this.f31953d0 = this.W - motionEvent.getX();
            float x9 = motionEvent.getX();
            if (x9 < this.f31970s.getMeasuredWidth() / 2.0f) {
                this.f31967q0 = false;
                if (this.f31969r0 <= 0) {
                    this.f31969r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ln0Var2, 16L);
            } else if (x9 > getMeasuredWidth() - (this.f31970s.getMeasuredWidth() / 2.0f)) {
                this.f31967q0 = true;
                if (this.f31969r0 <= 0) {
                    this.f31969r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(ln0Var2, 16L);
            } else {
                this.f31969r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(ln0Var2);
            }
            za1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f31969r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(ln0Var2);
            AndroidUtilities.cancelRunOnUIThread(ln0Var);
            if (this.f31970s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < za1Var.getChildCount(); i14++) {
                        za1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f80(this, 13));
                ofFloat.addListener(new i10(this, 16));
                ofFloat.start();
            }
            this.f31950b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f31963n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f31968r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f31974y;
    }

    public float getExpandedOffset() {
        if (this.f31957g0) {
            return AndroidUtilities.dp(50.0f) * this.f31959i0;
        }
        return 0.0f;
    }

    public pn0 getType() {
        return this.f31949b;
    }

    public final void h() {
        HashMap hashMap = this.f31963n;
        org.telegram.ui.za1 za1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                za1Var.removeView((View) entry.getValue());
            }
            this.f31963n.clear();
        }
        SparseArray sparseArray = this.f31968r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (za1Var.indexOfChild(view) != keyAt) {
                za1Var.removeView(view);
                za1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f31956f0 != z10) {
            this.f31956f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f31958h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31958h0.cancel();
            }
            float f11 = this.f31959i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f31958h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    qn0 qn0Var = qn0.this;
                    org.telegram.ui.za1 za1Var = qn0Var.e;
                    if (!z10) {
                        float childCount = qn0Var.f31961k0 * za1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (qn0Var.getScrollX() + f12) / (qn0Var.f31960j0 * za1Var.getChildCount());
                        float measuredWidth = (childCount - qn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        qn0Var.f31962l0 = (qn0Var.getScrollX() + f12) - f13;
                    }
                    qn0Var.f31959i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < za1Var.getChildCount(); i10++) {
                        za1Var.getChildAt(i10).invalidate();
                    }
                    za1Var.invalidate();
                    qn0Var.p();
                }
            });
            this.f31958h0.addListener(new nn0(this, z10, f7, 0));
            this.f31958h0.start();
            org.telegram.ui.za1 za1Var = this.e;
            if (z10) {
                this.f31957g0 = true;
                for (int i10 = 0; i10 < za1Var.getChildCount(); i10++) {
                    View childAt = za1Var.getChildAt(i10);
                    if (childAt instanceof ky0) {
                        ((ky0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                za1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f31960j0 * za1Var.getChildCount() * ((getScrollX() + f7) / (this.f31961k0 * za1Var.getChildCount()));
                this.f31962l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f31974y;
        if (i12 != i10) {
            org.telegram.ui.za1 za1Var = this.e;
            View childAt = za1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f31974y = i10;
            if (i10 >= za1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= za1Var.getChildCount()) {
                    break;
                }
                View childAt2 = za1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f31958h0 == null) {
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
        if (this.f31973x != 0) {
            org.telegram.ui.za1 za1Var = this.e;
            if (za1Var.getChildAt(i10) != null) {
                int left = za1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f31973x) {
            this.e.getChildAt(i10).performClick();
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
        for (int i10 = 0; i10 < this.f31973x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f31972w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f31951c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f31974y = i10;
    }

    public void setDelegate(on0 on0Var) {
        this.f31955f = on0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f31947a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f31972w = z10;
        requestLayout();
    }

    public void setType(pn0 pn0Var) {
        if (pn0Var != null && this.f31949b != pn0Var) {
            this.f31949b = pn0Var;
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
