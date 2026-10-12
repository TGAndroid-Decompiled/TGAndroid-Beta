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
import org.telegram.ui.fc1;
public abstract class un0 extends HorizontalScrollView {
    public static final int f31198t0 = 0;
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
    public final org.telegram.ui.ActionBar.c6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f31199a;
    public float f31200a0;
    public tn0 f31201b;
    public boolean f31202b0;
    public final LinearLayout.LayoutParams f31203c;
    public float f31204c0;
    public final LinearLayout.LayoutParams d;
    public float f31205d0;
    public final fc1 f31206e;
    public final pn0 f31207e0;
    public sn0 f31208f;
    public boolean f31209f0;
    public boolean f31210g0;
    public HashMap h;
    public ValueAnimator f31211h0;
    public float f31212i0;
    public final float f31213j0;
    public final float f31214k0;
    public float f31215l0;
    public int m0;
    public HashMap f31216n;
    public final Paint f31217n0;
    public boolean f31218o0;
    public final g6 f31219p0;
    public boolean f31220q0;
    public final SparseArray f31221r;
    public long f31222r0;
    public View f31223s;
    public final pn0 f31224s0;
    public float v;
    public boolean f31225w;
    public int f31226x;
    public int f31227y;

    public un0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f31199a = 1;
        this.f31201b = tn0.f30902a;
        this.h = new HashMap();
        this.f31216n = new HashMap();
        this.f31221r = new SparseArray();
        js jsVar = js.h;
        this.E = new g6(this, 350L, jsVar);
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
        this.f31207e0 = new pn0(this, 0);
        this.f31209f0 = false;
        this.f31213j0 = AndroidUtilities.dp(64.0f);
        this.f31214k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f31217n0 = new Paint();
        this.f31218o0 = true;
        this.f31219p0 = new g6(this, 350L, jsVar);
        this.f31224s0 = new pn0(this, 1);
        this.O = c6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        fc1 fc1Var = new fc1(this, context, 8);
        this.f31206e = fc1Var;
        fc1Var.setOrientation(0);
        fc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(fc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f31203c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f31210g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = hg.c.i(i10, "tab");
        int i12 = this.f31226x;
        this.f31226x = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f31216n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.w5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new nn0(this, 3));
            this.f31206e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31227y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final ly0 c(int i10, Drawable drawable) {
        String i11 = hg.c.i(i10, "tab");
        int i12 = this.f31226x;
        this.f31226x = i12 + 1;
        ly0 ly0Var = (ly0) this.f31216n.get(i11);
        boolean z10 = true;
        if (ly0Var != null) {
            g(i11, ly0Var, i12);
        } else {
            ly0Var = new ly0(getContext(), 1);
            ly0Var.f28310f.setImageDrawable(drawable);
            ly0Var.setFocusable(true);
            ly0Var.setOnClickListener(new nn0(this, 4));
            ly0Var.setExpanded(this.f31209f0);
            ly0Var.a(this.f31212i0);
            this.f31206e.addView(ly0Var, i12);
        }
        ly0Var.d = false;
        ly0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f31227y) {
            z10 = false;
        }
        ly0Var.setSelected(z10);
        this.h.put(i11, ly0Var);
        return ly0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f31202b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31207e0);
    }

    public final void d(boolean z10) {
        this.f31216n = this.h;
        this.h = new HashMap();
        this.f31221r.clear();
        this.f31226x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new qn0(this, 0));
            TransitionManager.beginDelayedTransition(this.f31206e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fc1 fc1Var;
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
        float f14 = this.f31214k0 - this.f31213j0;
        float f15 = (1.0f - this.f31212i0) * this.f31215l0;
        int i10 = 0;
        while (true) {
            fc1Var = this.f31206e;
            if (i10 >= fc1Var.getChildCount()) {
                break;
            }
            if (fc1Var.getChildAt(i10) instanceof ly0) {
                ly0 ly0Var = (ly0) fc1Var.getChildAt(i10);
                float f16 = ly0Var.f28316y;
                if (ly0Var.getLeft() != f16 && ly0Var.E) {
                    ly0Var.f28307b = f16 - ly0Var.getLeft();
                    ValueAnimator valueAnimator = ly0Var.f28315x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ly0Var.f28315x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ly0Var.f28307b, 0.0f);
                    ly0Var.f28315x = ofFloat;
                    ofFloat.addUpdateListener(new ky0(ly0Var, this, 0));
                    ly0Var.f28315x.addListener(new am0(3, ly0Var, this));
                    ly0Var.f28315x.start();
                }
                ly0Var.E = false;
                if (this.f31210g0) {
                    ly0Var.setTranslationX(com.google.android.gms.internal.vision.e2.y(1.0f, this.f31212i0, i10 * f14, f15) + ly0Var.f28307b);
                } else {
                    ly0Var.setTranslationX(ly0Var.f28307b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f31210g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f31212i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f31218o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f31219p0.d(f7, false);
        if (!isInEditMode() && this.f31226x != 0 && this.J >= 0) {
            g6 g6Var = this.E;
            float d10 = g6Var.d(this.f31227y, false);
            TimeInterpolator timeInterpolator = g6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < fc1Var.getChildCount()) {
                view = fc1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < fc1Var.getChildCount()) {
                view2 = fc1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31212i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31212i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof ly0) {
                    f12 = ((ly0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof ly0) {
                    f13 = ((ly0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31212i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof ly0) {
                        textWidth = ((ly0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f31212i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof ly0) {
                            textWidth = ((ly0) view2).getTextWidth();
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
            float interpolation = js.f27636i.getInterpolation(this.f31212i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.c6 c6Var = this.O;
            Paint paint = this.f31217n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, c6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Me, c6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f31226x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, fc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            fc1 fc1Var = this.f31206e;
            if (i10 < fc1Var.getChildCount()) {
                View childAt = fc1Var.getChildAt(i10);
                if (childAt instanceof ly0) {
                    ly0 ly0Var = (ly0) childAt;
                    if (ly0Var.f28306a == 0 && !ly0Var.d) {
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
        pn0 pn0Var = this.f31207e0;
        if (action == 0 && this.f31223s == null) {
            this.f31202b0 = true;
            AndroidUtilities.runOnUIThread(pn0Var, 500L);
            this.W = motionEvent.getX();
            this.f31200a0 = motionEvent.getY();
        }
        if (this.f31202b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f31200a0) > f7) {
                this.f31202b0 = false;
                AndroidUtilities.cancelRunOnUIThread(pn0Var);
            }
        }
        int action2 = motionEvent.getAction();
        pn0 pn0Var2 = this.f31224s0;
        fc1 fc1Var = this.f31206e;
        if (action2 == 2 && this.f31223s != null) {
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
                for (int i11 = 0; i11 < fc1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        ly0 ly0Var = (ly0) fc1Var.getChildAt(i11);
                        ly0Var.f28316y = ly0Var.getLeft();
                        ly0Var.E = true;
                        ly0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                fc1Var.removeView(this.f31223s);
                fc1Var.addView(this.f31223s, this.U);
                invalidate();
            }
            this.f31205d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f31223s.getMeasuredWidth() / 2.0f) {
                this.f31220q0 = false;
                if (this.f31222r0 <= 0) {
                    this.f31222r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(pn0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f31223s.getMeasuredWidth() / 2.0f)) {
                this.f31220q0 = true;
                if (this.f31222r0 <= 0) {
                    this.f31222r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(pn0Var2, 16L);
            } else {
                this.f31222r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(pn0Var2);
            }
            fc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f31222r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(pn0Var2);
            AndroidUtilities.cancelRunOnUIThread(pn0Var);
            if (this.f31223s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < fc1Var.getChildCount(); i14++) {
                        fc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new m80(this, 13));
                ofFloat.addListener(new zd0(this, 9));
                ofFloat.start();
            }
            this.f31202b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f31216n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f31221r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f31227y;
    }

    public float getExpandedOffset() {
        if (this.f31210g0) {
            return AndroidUtilities.dp(50.0f) * this.f31212i0;
        }
        return 0.0f;
    }

    public tn0 getType() {
        return this.f31201b;
    }

    public final void h() {
        HashMap hashMap = this.f31216n;
        fc1 fc1Var = this.f31206e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                fc1Var.removeView((View) entry.getValue());
            }
            this.f31216n.clear();
        }
        SparseArray sparseArray = this.f31221r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (fc1Var.indexOfChild(view) != keyAt) {
                fc1Var.removeView(view);
                fc1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f31209f0 != z10) {
            this.f31209f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f31211h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31211h0.cancel();
            }
            float f11 = this.f31212i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f31211h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    un0 un0Var = un0.this;
                    fc1 fc1Var = un0Var.f31206e;
                    if (!z10) {
                        float childCount = un0Var.f31214k0 * fc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (un0Var.getScrollX() + f12) / (un0Var.f31213j0 * fc1Var.getChildCount());
                        float measuredWidth = (childCount - un0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        un0Var.f31215l0 = (un0Var.getScrollX() + f12) - f13;
                    }
                    un0Var.f31212i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < fc1Var.getChildCount(); i10++) {
                        fc1Var.getChildAt(i10).invalidate();
                    }
                    fc1Var.invalidate();
                    un0Var.p();
                }
            });
            this.f31211h0.addListener(new rn0(this, z10, f7, 0));
            this.f31211h0.start();
            fc1 fc1Var = this.f31206e;
            if (z10) {
                this.f31210g0 = true;
                for (int i10 = 0; i10 < fc1Var.getChildCount(); i10++) {
                    View childAt = fc1Var.getChildAt(i10);
                    if (childAt instanceof ly0) {
                        ((ly0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                fc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f31213j0 * fc1Var.getChildCount() * ((getScrollX() + f7) / (this.f31214k0 * fc1Var.getChildCount()));
                this.f31215l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f31227y;
        if (i12 != i10) {
            fc1 fc1Var = this.f31206e;
            View childAt = fc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f31227y = i10;
            if (i10 >= fc1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= fc1Var.getChildCount()) {
                    break;
                }
                View childAt2 = fc1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f31211h0 == null) {
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
        if (this.f31226x != 0) {
            fc1 fc1Var = this.f31206e;
            if (fc1Var.getChildAt(i10) != null) {
                int left = fc1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f31226x) {
            this.f31206e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.un0.n():void");
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
        for (int i10 = 0; i10 < this.f31226x; i10++) {
            View childAt = this.f31206e.getChildAt(i10);
            if (this.f31225w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f31203c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f31227y = i10;
    }

    public void setDelegate(sn0 sn0Var) {
        this.f31208f = sn0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f31199a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f31225w = z10;
        requestLayout();
    }

    public void setType(tn0 tn0Var) {
        if (tn0Var != null && this.f31201b != tn0Var) {
            this.f31201b = tn0Var;
            int ordinal = tn0Var.ordinal();
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
