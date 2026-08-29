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
import org.telegram.ui.ua1;
public abstract class fm0 extends HorizontalScrollView {
    public static final int f28482p0 = 0;
    public final d6 A;
    public final RectF B;
    public final float C;
    public final Paint D;
    public int E;
    public int F;
    public final GradientDrawable G;
    public final int H;
    public int I;
    public int J;
    public final org.telegram.ui.ActionBar.c6 K;
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
    public int f28483a;
    public final bm0 f28484a0;
    public em0 f28485b;
    public boolean f28486b0;
    public final LinearLayout.LayoutParams f28487c;
    public boolean f28488c0;
    public final LinearLayout.LayoutParams d;
    public ValueAnimator f28489d0;
    public final ua1 f28490e;
    public float f28491e0;
    public dm0 f28492f;
    public final float f28493f0;
    public final float f28494g0;
    public HashMap h;
    public float f28495h0;
    public int f28496i0;
    public final Paint f28497j0;
    public boolean f28498k0;
    public final d6 f28499l0;
    public boolean m0;
    public HashMap f28500n;
    public long f28501n0;
    public final bm0 f28502o0;
    public final SparseArray f28503r;
    public View f28504s;
    public float v;
    public boolean f28505w;
    public int f28506x;
    public int f28507y;

    public fm0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f28483a = 1;
        this.f28485b = em0.f28113a;
        this.h = new HashMap();
        this.f28500n = new HashMap();
        this.f28503r = new SparseArray();
        jr jrVar = jr.h;
        this.A = new d6(this, 350L, jrVar);
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
        this.f28484a0 = new bm0(this, 0);
        this.f28486b0 = false;
        this.f28493f0 = AndroidUtilities.dp(64.0f);
        this.f28494g0 = AndroidUtilities.dp(33.0f);
        this.f28496i0 = -1;
        this.f28497j0 = new Paint();
        this.f28498k0 = true;
        this.f28499l0 = new d6(this, 350L, jrVar);
        this.f28502o0 = new bm0(this, 1);
        this.K = c6Var;
        this.L = z10;
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ua1 ua1Var = new ua1(this, context, 10);
        this.f28490e = ua1Var;
        ua1Var.setOrientation(0);
        ua1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ua1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.D = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f28487c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f9;
        if (this.f28488c0) {
            f9 = 64.0f;
        } else {
            f9 = 33.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String k9 = j7.l1.k(i10, "tab");
        int i11 = this.f28506x;
        this.f28506x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f28500n.get(k9);
        boolean z10 = true;
        if (frameLayout != null) {
            g(k9, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, i7.f6.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new zl0(this, 3));
            this.f28490e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f28507y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(k9, frameLayout);
        return frameLayout;
    }

    public final vw0 c(int i10, Drawable drawable) {
        String k9 = j7.l1.k(i10, "tab");
        int i11 = this.f28506x;
        this.f28506x = i11 + 1;
        vw0 vw0Var = (vw0) this.f28500n.get(k9);
        boolean z10 = true;
        if (vw0Var != null) {
            g(k9, vw0Var, i11);
        } else {
            vw0Var = new vw0(getContext(), 1);
            vw0Var.f34198f.setImageDrawable(drawable);
            vw0Var.setFocusable(true);
            vw0Var.setOnClickListener(new zl0(this, 4));
            vw0Var.setExpanded(this.f28486b0);
            vw0Var.a(this.f28491e0);
            this.f28490e.addView(vw0Var, i11);
        }
        vw0Var.d = false;
        vw0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f28507y) {
            z10 = false;
        }
        vw0Var.setSelected(z10);
        this.h.put(k9, vw0Var);
        return vw0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.U = false;
        AndroidUtilities.cancelRunOnUIThread(this.f28484a0);
    }

    public final void d(boolean z10) {
        this.f28500n = this.h;
        this.h = new HashMap();
        this.f28503r.clear();
        this.f28506x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new cm0(this, 0));
            TransitionManager.beginDelayedTransition(this.f28490e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ua1 ua1Var;
        float f9;
        Canvas canvas2;
        View view;
        float f10;
        float f11;
        float textWidth;
        float b10;
        float b11;
        float f12;
        float f13;
        float f14 = this.f28494g0 - this.f28493f0;
        float f15 = (1.0f - this.f28491e0) * this.f28495h0;
        int i10 = 0;
        while (true) {
            ua1Var = this.f28490e;
            if (i10 >= ua1Var.getChildCount()) {
                break;
            }
            if (ua1Var.getChildAt(i10) instanceof vw0) {
                vw0 vw0Var = (vw0) ua1Var.getChildAt(i10);
                float f16 = vw0Var.f34204y;
                if (vw0Var.getLeft() != f16 && vw0Var.A) {
                    vw0Var.f34195b = f16 - vw0Var.getLeft();
                    ValueAnimator valueAnimator = vw0Var.f34203x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vw0Var.f34203x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(vw0Var.f34195b, 0.0f);
                    vw0Var.f34203x = ofFloat;
                    ofFloat.addUpdateListener(new uw0(vw0Var, this, 0));
                    vw0Var.f34203x.addListener(new ok0(4, vw0Var, this));
                    vw0Var.f34203x.start();
                }
                vw0Var.A = false;
                if (this.f28488c0) {
                    vw0Var.setTranslationX(com.google.android.recaptcha.internal.a.z(1.0f, this.f28491e0, i10 * f14, f15) + vw0Var.f34195b);
                } else {
                    vw0Var.setTranslationX(vw0Var.f34195b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f28488c0) {
            height = org.telegram.ui.th.b(1.0f, this.f28491e0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f28498k0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.f28499l0.d(f9, false);
        if (!isInEditMode() && this.f28506x != 0 && this.F >= 0) {
            d6 d6Var = this.A;
            float d10 = d6Var.d(this.f28507y, false);
            TimeInterpolator timeInterpolator = d6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < ua1Var.getChildCount()) {
                view = ua1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < ua1Var.getChildCount()) {
                view2 = ua1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28491e0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28491e0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof vw0) {
                    f12 = ((vw0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof vw0) {
                    f13 = ((vw0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28491e0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof vw0) {
                        textWidth = ((vw0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f28491e0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof vw0) {
                            textWidth = ((vw0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(d6Var.b());
            } else {
                b10 = d6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(d6Var.b());
            } else {
                b11 = d6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = jr.f29802i.getInterpolation(this.f28491e0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.B;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.c6 c6Var = this.K;
            Paint paint = this.f28497j0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f28506x != 0 && this.I > 0) {
            int i11 = this.E;
            Paint paint2 = this.D;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.I, ua1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.O && i10 >= 0) {
            ua1 ua1Var = this.f28490e;
            if (i10 < ua1Var.getChildCount()) {
                View childAt = ua1Var.getChildAt(i10);
                if (childAt instanceof vw0) {
                    vw0 vw0Var = (vw0) childAt;
                    if (vw0Var.f34194a == 0 && !vw0Var.d) {
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
        bm0 bm0Var = this.f28484a0;
        if (action == 0 && this.f28504s == null) {
            this.U = true;
            AndroidUtilities.runOnUIThread(bm0Var, 500L);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
        }
        if (this.U && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.S);
            float f9 = this.C;
            if (abs > f9 || Math.abs(motionEvent.getY() - this.T) > f9) {
                this.U = false;
                AndroidUtilities.cancelRunOnUIThread(bm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        bm0 bm0Var2 = this.f28502o0;
        ua1 ua1Var = this.f28490e;
        if (action2 == 2 && this.f28504s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i10 = this.Q;
            if (ceil != i10) {
                if (ceil < i10) {
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
                for (int i11 = 0; i11 < ua1Var.getChildCount(); i11++) {
                    if (i11 != this.Q) {
                        vw0 vw0Var = (vw0) ua1Var.getChildAt(i11);
                        vw0Var.f34204y = vw0Var.getLeft();
                        vw0Var.A = true;
                        vw0Var.invalidate();
                    }
                }
                this.R += (ceil - this.Q) * getTabSize();
                this.Q = ceil;
                ua1Var.removeView(this.f28504s);
                ua1Var.addView(this.f28504s, this.Q);
                invalidate();
            }
            this.W = this.S - motionEvent.getX();
            float x4 = motionEvent.getX();
            if (x4 < this.f28504s.getMeasuredWidth() / 2.0f) {
                this.m0 = false;
                if (this.f28501n0 <= 0) {
                    this.f28501n0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(bm0Var2, 16L);
            } else if (x4 > getMeasuredWidth() - (this.f28504s.getMeasuredWidth() / 2.0f)) {
                this.m0 = true;
                if (this.f28501n0 <= 0) {
                    this.f28501n0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(bm0Var2, 16L);
            } else {
                this.f28501n0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(bm0Var2);
            }
            ua1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f28501n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(bm0Var2);
            AndroidUtilities.cancelRunOnUIThread(bm0Var);
            if (this.f28504s != null) {
                int i12 = this.P;
                int i13 = this.Q;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < ua1Var.getChildCount(); i14++) {
                        ua1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d70(this, 12));
                ofFloat.addListener(new zz(this, 16));
                ofFloat.start();
            }
            this.U = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f28500n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f28503r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f28507y;
    }

    public float getExpandedOffset() {
        if (this.f28488c0) {
            return AndroidUtilities.dp(50.0f) * this.f28491e0;
        }
        return 0.0f;
    }

    public em0 getType() {
        return this.f28485b;
    }

    public final void h() {
        HashMap hashMap = this.f28500n;
        ua1 ua1Var = this.f28490e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ua1Var.removeView((View) entry.getValue());
            }
            this.f28500n.clear();
        }
        SparseArray sparseArray = this.f28503r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ua1Var.indexOfChild(view) != keyAt) {
                ua1Var.removeView(view);
                ua1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f9, final boolean z10) {
        float f10;
        if (this.f28486b0 != z10) {
            this.f28486b0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f28489d0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f28489d0.cancel();
            }
            float f11 = this.f28491e0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f28489d0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    fm0 fm0Var = fm0.this;
                    ua1 ua1Var = fm0Var.f28490e;
                    if (!z10) {
                        float childCount = fm0Var.f28494g0 * ua1Var.getChildCount();
                        float f12 = f9;
                        float scrollX = (fm0Var.getScrollX() + f12) / (fm0Var.f28493f0 * ua1Var.getChildCount());
                        float measuredWidth = (childCount - fm0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        fm0Var.f28495h0 = (fm0Var.getScrollX() + f12) - f13;
                    }
                    fm0Var.f28491e0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ua1Var.getChildCount(); i10++) {
                        ua1Var.getChildAt(i10).invalidate();
                    }
                    ua1Var.invalidate();
                    fm0Var.p();
                }
            });
            this.f28489d0.addListener(new hh.r(this, z10, f9, 1));
            this.f28489d0.start();
            ua1 ua1Var = this.f28490e;
            if (z10) {
                this.f28488c0 = true;
                for (int i10 = 0; i10 < ua1Var.getChildCount(); i10++) {
                    View childAt = ua1Var.getChildAt(i10);
                    if (childAt instanceof vw0) {
                        ((vw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ua1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f28493f0 * ua1Var.getChildCount() * ((getScrollX() + f9) / (this.f28494g0 * ua1Var.getChildCount()));
                this.f28495h0 = childCount - (getScrollX() + f9);
                this.f28496i0 = (int) (childCount - f9);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f28507y;
        if (i12 != i10) {
            ua1 ua1Var = this.f28490e;
            View childAt = ua1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f28507y = i10;
            if (i10 >= ua1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= ua1Var.getChildCount()) {
                    break;
                }
                View childAt2 = ua1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f28489d0 == null) {
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
        if (this.f28506x != 0) {
            ua1 ua1Var = this.f28490e;
            if (ua1Var.getChildAt(i10) != null) {
                int left = ua1Var.getChildAt(i10).getLeft();
                int i11 = this.H;
                if (i10 > 0) {
                    left -= i11;
                }
                int scrollX = getScrollX();
                if (left != this.J) {
                    if (left < scrollX) {
                        this.J = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i11 > (getWidth() + scrollX) - (i11 * 2)) {
                        int width = (i11 * 3) + (left - getWidth());
                        this.J = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i10) {
        if (i10 >= 0 && i10 < this.f28506x) {
            this.f28490e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fm0.n():void");
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
        int i14 = this.f28496i0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.f28496i0 = -1;
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
        for (int i10 = 0; i10 < this.f28506x; i10++) {
            View childAt = this.f28490e.getChildAt(i10);
            if (this.f28505w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f28487c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f28507y = i10;
    }

    public void setDelegate(dm0 dm0Var) {
        this.f28492f = dm0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.O = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f28483a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f28505w = z10;
        requestLayout();
    }

    public void setType(em0 em0Var) {
        if (em0Var != null && this.f28485b != em0Var) {
            this.f28485b = em0Var;
            int ordinal = em0Var.ordinal();
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

    public void setUnderlineColor(int i10) {
        this.E = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.E = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
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
