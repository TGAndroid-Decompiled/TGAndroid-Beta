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
import org.telegram.ui.sa1;
public abstract class gn0 extends HorizontalScrollView {
    public static final int f26594t0 = 0;
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
    public final org.telegram.ui.ActionBar.d6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f26595a;
    public float f26596a0;
    public fn0 f26597b;
    public boolean f26598b0;
    public final LinearLayout.LayoutParams f26599c;
    public float f26600c0;
    public final LinearLayout.LayoutParams d;
    public float f26601d0;
    public final sa1 e;
    public final bn0 f26602e0;
    public en0 f26603f;
    public boolean f26604f0;
    public boolean f26605g0;
    public HashMap h;
    public ValueAnimator f26606h0;
    public float f26607i0;
    public final float f26608j0;
    public final float f26609k0;
    public float f26610l0;
    public int m0;
    public HashMap f26611n;
    public final Paint f26612n0;
    public boolean f26613o0;
    public final f6 f26614p0;
    public boolean f26615q0;
    public final SparseArray f26616r;
    public long f26617r0;
    public View f26618s;
    public final bn0 f26619s0;
    public float v;
    public boolean f26620w;
    public int f26621x;
    public int f26622y;

    public gn0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f26595a = 1;
        this.f26597b = fn0.f26274a;
        this.h = new HashMap();
        this.f26611n = new HashMap();
        this.f26616r = new SparseArray();
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
        this.f26602e0 = new bn0(this, 0);
        this.f26604f0 = false;
        this.f26608j0 = AndroidUtilities.dp(64.0f);
        this.f26609k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f26612n0 = new Paint();
        this.f26613o0 = true;
        this.f26614p0 = new f6(this, 350L, bsVar);
        this.f26619s0 = new bn0(this, 1);
        this.O = d6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        sa1 sa1Var = new sa1(this, context, 10);
        this.e = sa1Var;
        sa1Var.setOrientation(0);
        sa1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(sa1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f26599c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f26605g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String j10 = i0.a.j(i10, "tab");
        int i11 = this.f26621x;
        this.f26621x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f26611n.get(j10);
        boolean z10 = true;
        if (frameLayout != null) {
            g(j10, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new zm0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f26622y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(j10, frameLayout);
        return frameLayout;
    }

    public final wx0 c(int i10, Drawable drawable) {
        String j10 = i0.a.j(i10, "tab");
        int i11 = this.f26621x;
        this.f26621x = i11 + 1;
        wx0 wx0Var = (wx0) this.f26611n.get(j10);
        boolean z10 = true;
        if (wx0Var != null) {
            g(j10, wx0Var, i11);
        } else {
            wx0Var = new wx0(getContext(), 1);
            wx0Var.f32232f.setImageDrawable(drawable);
            wx0Var.setFocusable(true);
            wx0Var.setOnClickListener(new zm0(this, 4));
            wx0Var.setExpanded(this.f26604f0);
            wx0Var.a(this.f26607i0);
            this.e.addView(wx0Var, i11);
        }
        wx0Var.d = false;
        wx0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f26622y) {
            z10 = false;
        }
        wx0Var.setSelected(z10);
        this.h.put(j10, wx0Var);
        return wx0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f26598b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f26602e0);
    }

    public final void d(boolean z10) {
        this.f26611n = this.h;
        this.h = new HashMap();
        this.f26616r.clear();
        this.f26621x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new cn0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa1 sa1Var;
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
        float f14 = this.f26609k0 - this.f26608j0;
        float f15 = (1.0f - this.f26607i0) * this.f26610l0;
        int i10 = 0;
        while (true) {
            sa1Var = this.e;
            if (i10 >= sa1Var.getChildCount()) {
                break;
            }
            if (sa1Var.getChildAt(i10) instanceof wx0) {
                wx0 wx0Var = (wx0) sa1Var.getChildAt(i10);
                float f16 = wx0Var.f32238y;
                if (wx0Var.getLeft() != f16 && wx0Var.E) {
                    wx0Var.f32230b = f16 - wx0Var.getLeft();
                    ValueAnimator valueAnimator = wx0Var.f32237x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wx0Var.f32237x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(wx0Var.f32230b, 0.0f);
                    wx0Var.f32237x = ofFloat;
                    ofFloat.addUpdateListener(new vx0(wx0Var, this, 0));
                    wx0Var.f32237x.addListener(new ml0(4, wx0Var, this));
                    wx0Var.f32237x.start();
                }
                wx0Var.E = false;
                if (this.f26605g0) {
                    wx0Var.setTranslationX(com.google.android.gms.internal.cast.a6.x(1.0f, this.f26607i0, i10 * f14, f15) + wx0Var.f32230b);
                } else {
                    wx0Var.setTranslationX(wx0Var.f32230b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f26605g0) {
            height = com.google.android.gms.internal.cast.a6.D(1.0f, this.f26607i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f26613o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f26614p0.d(f7, false);
        if (!isInEditMode() && this.f26621x != 0 && this.J >= 0) {
            f6 f6Var = this.E;
            float d10 = f6Var.d(this.f26622y, false);
            TimeInterpolator timeInterpolator = f6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < sa1Var.getChildCount()) {
                view = sa1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < sa1Var.getChildCount()) {
                view2 = sa1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f26607i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f26607i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof wx0) {
                    f12 = ((wx0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof wx0) {
                    f13 = ((wx0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f26607i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof wx0) {
                        textWidth = ((wx0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f26607i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof wx0) {
                            textWidth = ((wx0) view2).getTextWidth();
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
            float interpolation = bs.f25032i.getInterpolation(this.f26607i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.d6 d6Var = this.O;
            Paint paint = this.f26612n0;
            if (z10) {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, d6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f26621x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, sa1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            sa1 sa1Var = this.e;
            if (i10 < sa1Var.getChildCount()) {
                View childAt = sa1Var.getChildAt(i10);
                if (childAt instanceof wx0) {
                    wx0 wx0Var = (wx0) childAt;
                    if (wx0Var.f32229a == 0 && !wx0Var.d) {
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
        bn0 bn0Var = this.f26602e0;
        if (action == 0 && this.f26618s == null) {
            this.f26598b0 = true;
            AndroidUtilities.runOnUIThread(bn0Var, 500L);
            this.W = motionEvent.getX();
            this.f26596a0 = motionEvent.getY();
        }
        if (this.f26598b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f26596a0) > f7) {
                this.f26598b0 = false;
                AndroidUtilities.cancelRunOnUIThread(bn0Var);
            }
        }
        int action2 = motionEvent.getAction();
        bn0 bn0Var2 = this.f26619s0;
        sa1 sa1Var = this.e;
        if (action2 == 2 && this.f26618s != null) {
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
                for (int i11 = 0; i11 < sa1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        wx0 wx0Var = (wx0) sa1Var.getChildAt(i11);
                        wx0Var.f32238y = wx0Var.getLeft();
                        wx0Var.E = true;
                        wx0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                sa1Var.removeView(this.f26618s);
                sa1Var.addView(this.f26618s, this.U);
                invalidate();
            }
            this.f26601d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f26618s.getMeasuredWidth() / 2.0f) {
                this.f26615q0 = false;
                if (this.f26617r0 <= 0) {
                    this.f26617r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(bn0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f26618s.getMeasuredWidth() / 2.0f)) {
                this.f26615q0 = true;
                if (this.f26617r0 <= 0) {
                    this.f26617r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(bn0Var2, 16L);
            } else {
                this.f26617r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(bn0Var2);
            }
            sa1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f26617r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(bn0Var2);
            AndroidUtilities.cancelRunOnUIThread(bn0Var);
            if (this.f26618s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < sa1Var.getChildCount(); i14++) {
                        sa1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b80(this, 13));
                ofFloat.addListener(new c80(this, 14));
                ofFloat.start();
            }
            this.f26598b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f26611n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f26616r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f26622y;
    }

    public float getExpandedOffset() {
        if (this.f26605g0) {
            return AndroidUtilities.dp(50.0f) * this.f26607i0;
        }
        return 0.0f;
    }

    public fn0 getType() {
        return this.f26597b;
    }

    public final void h() {
        HashMap hashMap = this.f26611n;
        sa1 sa1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                sa1Var.removeView((View) entry.getValue());
            }
            this.f26611n.clear();
        }
        SparseArray sparseArray = this.f26616r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (sa1Var.indexOfChild(view) != keyAt) {
                sa1Var.removeView(view);
                sa1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f26604f0 != z10) {
            this.f26604f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f26606h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26606h0.cancel();
            }
            float f11 = this.f26607i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f26606h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    gn0 gn0Var = gn0.this;
                    sa1 sa1Var = gn0Var.e;
                    if (!z10) {
                        float childCount = gn0Var.f26609k0 * sa1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (gn0Var.getScrollX() + f12) / (gn0Var.f26608j0 * sa1Var.getChildCount());
                        float measuredWidth = (childCount - gn0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        gn0Var.f26610l0 = (gn0Var.getScrollX() + f12) - f13;
                    }
                    gn0Var.f26607i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < sa1Var.getChildCount(); i10++) {
                        sa1Var.getChildAt(i10).invalidate();
                    }
                    sa1Var.invalidate();
                    gn0Var.p();
                }
            });
            this.f26606h0.addListener(new dn0(this, z10, f7, 0));
            this.f26606h0.start();
            sa1 sa1Var = this.e;
            if (z10) {
                this.f26605g0 = true;
                for (int i10 = 0; i10 < sa1Var.getChildCount(); i10++) {
                    View childAt = sa1Var.getChildAt(i10);
                    if (childAt instanceof wx0) {
                        ((wx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                sa1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f26608j0 * sa1Var.getChildCount() * ((getScrollX() + f7) / (this.f26609k0 * sa1Var.getChildCount()));
                this.f26610l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f26622y;
        if (i12 != i10) {
            sa1 sa1Var = this.e;
            View childAt = sa1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f26622y = i10;
            if (i10 >= sa1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= sa1Var.getChildCount()) {
                    break;
                }
                View childAt2 = sa1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f26606h0 == null) {
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
        if (this.f26621x != 0) {
            sa1 sa1Var = this.e;
            if (sa1Var.getChildAt(i10) != null) {
                int left = sa1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f26621x) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gn0.n():void");
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
        for (int i10 = 0; i10 < this.f26621x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f26620w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f26599c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f26622y = i10;
    }

    public void setDelegate(en0 en0Var) {
        this.f26603f = en0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f26595a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f26620w = z10;
        requestLayout();
    }

    public void setType(fn0 fn0Var) {
        if (fn0Var != null && this.f26597b != fn0Var) {
            this.f26597b = fn0Var;
            int ordinal = fn0Var.ordinal();
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
