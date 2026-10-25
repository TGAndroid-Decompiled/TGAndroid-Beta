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
public abstract class pn0 extends HorizontalScrollView {
    public static final int f31608t0 = 0;
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
    public int f31609a;
    public float f31610a0;
    public on0 f31611b;
    public boolean f31612b0;
    public final LinearLayout.LayoutParams f31613c;
    public float f31614c0;
    public final LinearLayout.LayoutParams d;
    public float f31615d0;
    public final org.telegram.ui.xa1 e;
    public final kn0 f31616e0;
    public nn0 f31617f;
    public boolean f31618f0;
    public boolean f31619g0;
    public HashMap h;
    public ValueAnimator f31620h0;
    public float f31621i0;
    public final float f31622j0;
    public final float f31623k0;
    public float f31624l0;
    public int m0;
    public HashMap f31625n;
    public final Paint f31626n0;
    public boolean f31627o0;
    public final h6 f31628p0;
    public boolean f31629q0;
    public final SparseArray f31630r;
    public long f31631r0;
    public View f31632s;
    public final kn0 f31633s0;
    public float v;
    public boolean f31634w;
    public int f31635x;
    public int f31636y;

    public pn0(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f31609a = 1;
        this.f31611b = on0.f31329a;
        this.h = new HashMap();
        this.f31625n = new HashMap();
        this.f31630r = new SparseArray();
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
        this.f31616e0 = new kn0(this, 0);
        this.f31618f0 = false;
        this.f31622j0 = AndroidUtilities.dp(64.0f);
        this.f31623k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f31626n0 = new Paint();
        this.f31627o0 = true;
        this.f31628p0 = new h6(this, 350L, dsVar);
        this.f31633s0 = new kn0(this, 1);
        this.O = u6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.xa1 xa1Var = new org.telegram.ui.xa1(this, context, 11);
        this.e = xa1Var;
        xa1Var.setOrientation(0);
        xa1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(xa1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f31613c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f31619g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = ic.a.i(i10, "tab");
        int i12 = this.f31635x;
        this.f31635x = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f31625n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, gb1.i(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new in0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31636y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final jy0 c(int i10, Drawable drawable) {
        String i11 = ic.a.i(i10, "tab");
        int i12 = this.f31635x;
        this.f31635x = i12 + 1;
        jy0 jy0Var = (jy0) this.f31625n.get(i11);
        boolean z10 = true;
        if (jy0Var != null) {
            g(i11, jy0Var, i12);
        } else {
            jy0Var = new jy0(getContext(), 1);
            jy0Var.f29737f.setImageDrawable(drawable);
            jy0Var.setFocusable(true);
            jy0Var.setOnClickListener(new in0(this, 4));
            jy0Var.setExpanded(this.f31618f0);
            jy0Var.a(this.f31621i0);
            this.e.addView(jy0Var, i12);
        }
        jy0Var.d = false;
        jy0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31636y) {
            z10 = false;
        }
        jy0Var.setSelected(z10);
        this.h.put(i11, jy0Var);
        return jy0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f31612b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31616e0);
    }

    public final void d(boolean z10) {
        this.f31625n = this.h;
        this.h = new HashMap();
        this.f31630r.clear();
        this.f31635x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new ln0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.xa1 xa1Var;
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
        float f14 = this.f31623k0 - this.f31622j0;
        float f15 = (1.0f - this.f31621i0) * this.f31624l0;
        int i10 = 0;
        while (true) {
            xa1Var = this.e;
            if (i10 >= xa1Var.getChildCount()) {
                break;
            }
            if (xa1Var.getChildAt(i10) instanceof jy0) {
                jy0 jy0Var = (jy0) xa1Var.getChildAt(i10);
                float f16 = jy0Var.f29743y;
                if (jy0Var.getLeft() != f16 && jy0Var.E) {
                    jy0Var.f29735b = f16 - jy0Var.getLeft();
                    ValueAnimator valueAnimator = jy0Var.f29742x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jy0Var.f29742x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(jy0Var.f29735b, 0.0f);
                    jy0Var.f29742x = ofFloat;
                    ofFloat.addUpdateListener(new iy0(0, jy0Var, this));
                    jy0Var.f29742x.addListener(new ll0(4, jy0Var, this));
                    jy0Var.f29742x.start();
                }
                jy0Var.E = false;
                if (this.f31619g0) {
                    jy0Var.setTranslationX(c3.h0.z(1.0f, this.f31621i0, i10 * f14, f15) + jy0Var.f29735b);
                } else {
                    jy0Var.setTranslationX(jy0Var.f29735b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f31619g0) {
            height = ic.a.d(1.0f, this.f31621i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f31627o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f31628p0.d(f7, false);
        if (!isInEditMode() && this.f31635x != 0 && this.J >= 0) {
            h6 h6Var = this.E;
            float d10 = h6Var.d(this.f31636y, false);
            TimeInterpolator timeInterpolator = h6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < xa1Var.getChildCount()) {
                view = xa1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < xa1Var.getChildCount()) {
                view2 = xa1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31621i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31621i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof jy0) {
                    f12 = ((jy0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof jy0) {
                    f13 = ((jy0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31621i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof jy0) {
                        textWidth = ((jy0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31621i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof jy0) {
                            textWidth = ((jy0) view2).getTextWidth();
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
            float interpolation = ds.f27586i.getInterpolation(this.f31621i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.u6 u6Var = this.O;
            Paint paint = this.f31626n0;
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
        if (!isInEditMode() && this.f31635x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, xa1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            org.telegram.ui.xa1 xa1Var = this.e;
            if (i10 < xa1Var.getChildCount()) {
                View childAt = xa1Var.getChildAt(i10);
                if (childAt instanceof jy0) {
                    jy0 jy0Var = (jy0) childAt;
                    if (jy0Var.f29734a == 0 && !jy0Var.d) {
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
        kn0 kn0Var = this.f31616e0;
        if (action == 0 && this.f31632s == null) {
            this.f31612b0 = true;
            AndroidUtilities.runOnUIThread(kn0Var, 500L);
            this.W = motionEvent.getX();
            this.f31610a0 = motionEvent.getY();
        }
        if (this.f31612b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f31610a0) > f7) {
                this.f31612b0 = false;
                AndroidUtilities.cancelRunOnUIThread(kn0Var);
            }
        }
        int action2 = motionEvent.getAction();
        kn0 kn0Var2 = this.f31633s0;
        org.telegram.ui.xa1 xa1Var = this.e;
        if (action2 == 2 && this.f31632s != null) {
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
                for (int i11 = 0; i11 < xa1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        jy0 jy0Var = (jy0) xa1Var.getChildAt(i11);
                        jy0Var.f29743y = jy0Var.getLeft();
                        jy0Var.E = true;
                        jy0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                xa1Var.removeView(this.f31632s);
                xa1Var.addView(this.f31632s, this.U);
                invalidate();
            }
            this.f31615d0 = this.W - motionEvent.getX();
            float x9 = motionEvent.getX();
            if (x9 < this.f31632s.getMeasuredWidth() / 2.0f) {
                this.f31629q0 = false;
                if (this.f31631r0 <= 0) {
                    this.f31631r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(kn0Var2, 16L);
            } else if (x9 > getMeasuredWidth() - (this.f31632s.getMeasuredWidth() / 2.0f)) {
                this.f31629q0 = true;
                if (this.f31631r0 <= 0) {
                    this.f31631r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(kn0Var2, 16L);
            } else {
                this.f31631r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(kn0Var2);
            }
            xa1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f31631r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(kn0Var2);
            AndroidUtilities.cancelRunOnUIThread(kn0Var);
            if (this.f31632s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < xa1Var.getChildCount(); i14++) {
                        xa1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e80(this, 13));
                ofFloat.addListener(new i10(this, 16));
                ofFloat.start();
            }
            this.f31612b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f31625n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f31630r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f31636y;
    }

    public float getExpandedOffset() {
        if (this.f31619g0) {
            return AndroidUtilities.dp(50.0f) * this.f31621i0;
        }
        return 0.0f;
    }

    public on0 getType() {
        return this.f31611b;
    }

    public final void h() {
        HashMap hashMap = this.f31625n;
        org.telegram.ui.xa1 xa1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                xa1Var.removeView((View) entry.getValue());
            }
            this.f31625n.clear();
        }
        SparseArray sparseArray = this.f31630r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (xa1Var.indexOfChild(view) != keyAt) {
                xa1Var.removeView(view);
                xa1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f31618f0 != z10) {
            this.f31618f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f31620h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31620h0.cancel();
            }
            float f11 = this.f31621i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f31620h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pn0 pn0Var = pn0.this;
                    org.telegram.ui.xa1 xa1Var = pn0Var.e;
                    if (!z10) {
                        float childCount = pn0Var.f31623k0 * xa1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (pn0Var.getScrollX() + f12) / (pn0Var.f31622j0 * xa1Var.getChildCount());
                        float measuredWidth = (childCount - pn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        pn0Var.f31624l0 = (pn0Var.getScrollX() + f12) - f13;
                    }
                    pn0Var.f31621i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < xa1Var.getChildCount(); i10++) {
                        xa1Var.getChildAt(i10).invalidate();
                    }
                    xa1Var.invalidate();
                    pn0Var.p();
                }
            });
            this.f31620h0.addListener(new mn0(this, z10, f7, 0));
            this.f31620h0.start();
            org.telegram.ui.xa1 xa1Var = this.e;
            if (z10) {
                this.f31619g0 = true;
                for (int i10 = 0; i10 < xa1Var.getChildCount(); i10++) {
                    View childAt = xa1Var.getChildAt(i10);
                    if (childAt instanceof jy0) {
                        ((jy0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                xa1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f31622j0 * xa1Var.getChildCount() * ((getScrollX() + f7) / (this.f31623k0 * xa1Var.getChildCount()));
                this.f31624l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f31636y;
        if (i12 != i10) {
            org.telegram.ui.xa1 xa1Var = this.e;
            View childAt = xa1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f31636y = i10;
            if (i10 >= xa1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= xa1Var.getChildCount()) {
                    break;
                }
                View childAt2 = xa1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f31620h0 == null) {
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
        if (this.f31635x != 0) {
            org.telegram.ui.xa1 xa1Var = this.e;
            if (xa1Var.getChildAt(i10) != null) {
                int left = xa1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f31635x) {
            this.e.getChildAt(i10).performClick();
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
        for (int i10 = 0; i10 < this.f31635x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f31634w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f31613c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f31636y = i10;
    }

    public void setDelegate(nn0 nn0Var) {
        this.f31617f = nn0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f31609a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f31634w = z10;
        requestLayout();
    }

    public void setType(on0 on0Var) {
        if (on0Var != null && this.f31611b != on0Var) {
            this.f31611b = on0Var;
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
