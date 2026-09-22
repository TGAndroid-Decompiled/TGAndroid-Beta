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
public abstract class im0 extends HorizontalScrollView {
    public static final int f25059t0 = 0;
    public final c6 E;
    public final RectF F;
    public final float G;
    public final Paint H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public final int L;
    public int M;
    public int N;
    public final org.telegram.ui.ActionBar.e6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f25060a;
    public float f25061a0;
    public hm0 f25062b;
    public boolean f25063b0;
    public final LinearLayout.LayoutParams f25064c;
    public float f25065c0;
    public final LinearLayout.LayoutParams d;
    public float f25066d0;
    public final cc1 e;
    public final dm0 f25067e0;
    public gm0 f25068f;
    public boolean f25069f0;
    public boolean f25070g0;
    public HashMap h;
    public ValueAnimator f25071h0;
    public float f25072i0;
    public final float f25073j0;
    public final float f25074k0;
    public float f25075l0;
    public int m0;
    public HashMap f25076n;
    public final Paint f25077n0;
    public boolean f25078o0;
    public final c6 f25079p0;
    public boolean f25080q0;
    public final SparseArray f25081r;
    public long f25082r0;
    public View f25083s;
    public final dm0 f25084s0;
    public float v;
    public boolean f25085w;
    public int f25086x;
    public int f25087y;

    public im0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f25060a = 1;
        this.f25062b = hm0.f24725a;
        this.h = new HashMap();
        this.f25076n = new HashMap();
        this.f25081r = new SparseArray();
        qr qrVar = qr.h;
        this.E = new c6(this, 350L, qrVar);
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
        this.f25067e0 = new dm0(this, 0);
        this.f25069f0 = false;
        this.f25073j0 = AndroidUtilities.dp(64.0f);
        this.f25074k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f25077n0 = new Paint();
        this.f25078o0 = true;
        this.f25079p0 = new c6(this, 350L, qrVar);
        this.f25084s0 = new dm0(this, 1);
        this.O = e6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        cc1 cc1Var = new cc1(this, context, 8);
        this.e = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(cc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f25064c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f25070g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String i11 = hg.c.i(i10, "tab");
        int i12 = this.f25086x;
        this.f25086x = i12 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f25076n.get(i11);
        boolean z10 = true;
        if (frameLayout != null) {
            g(i11, frameLayout, i12);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new bm0(this, 3));
            this.e.addView(frameLayout, i12);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f25087y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(i11, frameLayout);
        return frameLayout;
    }

    public final dx0 c(int i10, Drawable drawable) {
        String i11 = hg.c.i(i10, "tab");
        int i12 = this.f25086x;
        this.f25086x = i12 + 1;
        dx0 dx0Var = (dx0) this.f25076n.get(i11);
        boolean z10 = true;
        if (dx0Var != null) {
            g(i11, dx0Var, i12);
        } else {
            dx0Var = new dx0(getContext(), 1);
            dx0Var.f23407f.setImageDrawable(drawable);
            dx0Var.setFocusable(true);
            dx0Var.setOnClickListener(new bm0(this, 4));
            dx0Var.setExpanded(this.f25069f0);
            dx0Var.a(this.f25072i0);
            this.e.addView(dx0Var, i12);
        }
        dx0Var.d = false;
        dx0Var.setTag(R.id.index_tag, Integer.valueOf(i12));
        if (i12 != this.f25087y) {
            z10 = false;
        }
        dx0Var.setSelected(z10);
        this.h.put(i11, dx0Var);
        return dx0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f25063b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f25067e0);
    }

    public final void d(boolean z10) {
        this.f25076n = this.h;
        this.h = new HashMap();
        this.f25081r.clear();
        this.f25086x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new em0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
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
        float f14 = this.f25074k0 - this.f25073j0;
        float f15 = (1.0f - this.f25072i0) * this.f25075l0;
        int i10 = 0;
        while (true) {
            cc1Var = this.e;
            if (i10 >= cc1Var.getChildCount()) {
                break;
            }
            if (cc1Var.getChildAt(i10) instanceof dx0) {
                dx0 dx0Var = (dx0) cc1Var.getChildAt(i10);
                float f16 = dx0Var.f23413y;
                if (dx0Var.getLeft() != f16 && dx0Var.E) {
                    dx0Var.f23405b = f16 - dx0Var.getLeft();
                    ValueAnimator valueAnimator = dx0Var.f23412x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        dx0Var.f23412x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(dx0Var.f23405b, 0.0f);
                    dx0Var.f23412x = ofFloat;
                    ofFloat.addUpdateListener(new cx0(dx0Var, this, 0));
                    dx0Var.f23412x.addListener(new pk0(3, dx0Var, this));
                    dx0Var.f23412x.start();
                }
                dx0Var.E = false;
                if (this.f25070g0) {
                    dx0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f25072i0, i10 * f14, f15) + dx0Var.f23405b);
                } else {
                    dx0Var.setTranslationX(dx0Var.f23405b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f25070g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f25072i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f25078o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f25079p0.d(f7, false);
        if (!isInEditMode() && this.f25086x != 0 && this.J >= 0) {
            c6 c6Var = this.E;
            float d10 = c6Var.d(this.f25087y, false);
            TimeInterpolator timeInterpolator = c6Var.h;
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
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25072i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25072i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof dx0) {
                    f12 = ((dx0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof dx0) {
                    f13 = ((dx0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25072i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof dx0) {
                        textWidth = ((dx0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f25072i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof dx0) {
                            textWidth = ((dx0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b10 = c6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(c6Var.b());
            } else {
                b11 = c6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = qr.f27422i.getInterpolation(this.f25072i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.e6 e6Var = this.O;
            Paint paint = this.f25077n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, e6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, e6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f25086x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, cc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            cc1 cc1Var = this.e;
            if (i10 < cc1Var.getChildCount()) {
                View childAt = cc1Var.getChildAt(i10);
                if (childAt instanceof dx0) {
                    dx0 dx0Var = (dx0) childAt;
                    if (dx0Var.f23404a == 0 && !dx0Var.d) {
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
        dm0 dm0Var = this.f25067e0;
        if (action == 0 && this.f25083s == null) {
            this.f25063b0 = true;
            AndroidUtilities.runOnUIThread(dm0Var, 500L);
            this.W = motionEvent.getX();
            this.f25061a0 = motionEvent.getY();
        }
        if (this.f25063b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f25061a0) > f7) {
                this.f25063b0 = false;
                AndroidUtilities.cancelRunOnUIThread(dm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        dm0 dm0Var2 = this.f25084s0;
        cc1 cc1Var = this.e;
        if (action2 == 2 && this.f25083s != null) {
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
                        dx0 dx0Var = (dx0) cc1Var.getChildAt(i11);
                        dx0Var.f23413y = dx0Var.getLeft();
                        dx0Var.E = true;
                        dx0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                cc1Var.removeView(this.f25083s);
                cc1Var.addView(this.f25083s, this.U);
                invalidate();
            }
            this.f25066d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f25083s.getMeasuredWidth() / 2.0f) {
                this.f25080q0 = false;
                if (this.f25082r0 <= 0) {
                    this.f25082r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(dm0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f25083s.getMeasuredWidth() / 2.0f)) {
                this.f25080q0 = true;
                if (this.f25082r0 <= 0) {
                    this.f25082r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(dm0Var2, 16L);
            } else {
                this.f25082r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(dm0Var2);
            }
            cc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f25082r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(dm0Var2);
            AndroidUtilities.cancelRunOnUIThread(dm0Var);
            if (this.f25083s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < cc1Var.getChildCount(); i14++) {
                        cc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h70(this, 12));
                ofFloat.addListener(new jd0(this, 8));
                ofFloat.start();
            }
            this.f25063b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f25076n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f25081r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f25087y;
    }

    public float getExpandedOffset() {
        if (this.f25070g0) {
            return AndroidUtilities.dp(50.0f) * this.f25072i0;
        }
        return 0.0f;
    }

    public hm0 getType() {
        return this.f25062b;
    }

    public final void h() {
        HashMap hashMap = this.f25076n;
        cc1 cc1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                cc1Var.removeView((View) entry.getValue());
            }
            this.f25076n.clear();
        }
        SparseArray sparseArray = this.f25081r;
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
        if (this.f25069f0 != z10) {
            this.f25069f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f25071h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25071h0.cancel();
            }
            float f11 = this.f25072i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f25071h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    im0 im0Var = im0.this;
                    cc1 cc1Var = im0Var.e;
                    if (!z10) {
                        float childCount = im0Var.f25074k0 * cc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (im0Var.getScrollX() + f12) / (im0Var.f25073j0 * cc1Var.getChildCount());
                        float measuredWidth = (childCount - im0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        im0Var.f25075l0 = (im0Var.getScrollX() + f12) - f13;
                    }
                    im0Var.f25072i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                        cc1Var.getChildAt(i10).invalidate();
                    }
                    cc1Var.invalidate();
                    im0Var.p();
                }
            });
            this.f25071h0.addListener(new fm0(this, z10, f7, 0));
            this.f25071h0.start();
            cc1 cc1Var = this.e;
            if (z10) {
                this.f25070g0 = true;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    View childAt = cc1Var.getChildAt(i10);
                    if (childAt instanceof dx0) {
                        ((dx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                cc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f25073j0 * cc1Var.getChildCount() * ((getScrollX() + f7) / (this.f25074k0 * cc1Var.getChildCount()));
                this.f25075l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f25087y;
        if (i12 != i10) {
            cc1 cc1Var = this.e;
            View childAt = cc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f25087y = i10;
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
            if (this.f25071h0 == null) {
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
        if (this.f25086x != 0) {
            cc1 cc1Var = this.e;
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
        if (i10 >= 0 && i10 < this.f25086x) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im0.n():void");
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
        for (int i10 = 0; i10 < this.f25086x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f25085w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f25064c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f25087y = i10;
    }

    public void setDelegate(gm0 gm0Var) {
        this.f25068f = gm0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f25060a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f25085w = z10;
        requestLayout();
    }

    public void setType(hm0 hm0Var) {
        if (hm0Var != null && this.f25062b != hm0Var) {
            this.f25062b = hm0Var;
            int ordinal = hm0Var.ordinal();
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
