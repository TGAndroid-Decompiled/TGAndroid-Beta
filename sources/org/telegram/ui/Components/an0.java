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
import org.telegram.ui.vb1;
public abstract class an0 extends HorizontalScrollView {
    public static final int f24648t0 = 0;
    public final e6 E;
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
    public int f24649a;
    public float f24650a0;
    public zm0 f24651b;
    public boolean f24652b0;
    public final LinearLayout.LayoutParams f24653c;
    public float f24654c0;
    public final LinearLayout.LayoutParams d;
    public float f24655d0;
    public final vb1 f24656e;
    public final vm0 f24657e0;
    public ym0 f24658f;
    public boolean f24659f0;
    public boolean f24660g0;
    public HashMap h;
    public ValueAnimator f24661h0;
    public float f24662i0;
    public final float f24663j0;
    public final float f24664k0;
    public float f24665l0;
    public int m0;
    public HashMap f24666n;
    public final Paint f24667n0;
    public boolean f24668o0;
    public final e6 f24669p0;
    public boolean f24670q0;
    public final SparseArray f24671r;
    public long f24672r0;
    public View f24673s;
    public final vm0 f24674s0;
    public float v;
    public boolean f24675w;
    public int f24676x;
    public int f24677y;

    public an0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f24649a = 1;
        this.f24651b = zm0.f33584a;
        this.h = new HashMap();
        this.f24666n = new HashMap();
        this.f24671r = new SparseArray();
        tr trVar = tr.h;
        this.E = new e6(this, 350L, trVar);
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
        this.f24657e0 = new vm0(this, 0);
        this.f24659f0 = false;
        this.f24663j0 = AndroidUtilities.dp(64.0f);
        this.f24664k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f24667n0 = new Paint();
        this.f24668o0 = true;
        this.f24669p0 = new e6(this, 350L, trVar);
        this.f24674s0 = new vm0(this, 1);
        this.O = d6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        vb1 vb1Var = new vb1(this, context, 8);
        this.f24656e = vb1Var;
        vb1Var.setOrientation(0);
        vb1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(vb1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f24653c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f24660g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f24676x;
        this.f24676x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f24666n.get(h);
        boolean z10 = true;
        if (frameLayout != null) {
            g(h, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new tm0(this, 3));
            this.f24656e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f24677y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(h, frameLayout);
        return frameLayout;
    }

    public final zx0 c(int i10, Drawable drawable) {
        String h = hg.c.h(i10, "tab");
        int i11 = this.f24676x;
        this.f24676x = i11 + 1;
        zx0 zx0Var = (zx0) this.f24666n.get(h);
        boolean z10 = true;
        if (zx0Var != null) {
            g(h, zx0Var, i11);
        } else {
            zx0Var = new zx0(getContext(), 1);
            zx0Var.f33665f.setImageDrawable(drawable);
            zx0Var.setFocusable(true);
            zx0Var.setOnClickListener(new tm0(this, 4));
            zx0Var.setExpanded(this.f24659f0);
            zx0Var.a(this.f24662i0);
            this.f24656e.addView(zx0Var, i11);
        }
        zx0Var.d = false;
        zx0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f24677y) {
            z10 = false;
        }
        zx0Var.setSelected(z10);
        this.h.put(h, zx0Var);
        return zx0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f24652b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f24657e0);
    }

    public final void d(boolean z10) {
        this.f24666n = this.h;
        this.h = new HashMap();
        this.f24671r.clear();
        this.f24676x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new wm0(this, 0));
            TransitionManager.beginDelayedTransition(this.f24656e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vb1 vb1Var;
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
        float f14 = this.f24664k0 - this.f24663j0;
        float f15 = (1.0f - this.f24662i0) * this.f24665l0;
        int i10 = 0;
        while (true) {
            vb1Var = this.f24656e;
            if (i10 >= vb1Var.getChildCount()) {
                break;
            }
            if (vb1Var.getChildAt(i10) instanceof zx0) {
                zx0 zx0Var = (zx0) vb1Var.getChildAt(i10);
                float f16 = zx0Var.f33671y;
                if (zx0Var.getLeft() != f16 && zx0Var.E) {
                    zx0Var.f33662b = f16 - zx0Var.getLeft();
                    ValueAnimator valueAnimator = zx0Var.f33670x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        zx0Var.f33670x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(zx0Var.f33662b, 0.0f);
                    zx0Var.f33670x = ofFloat;
                    ofFloat.addUpdateListener(new yx0(zx0Var, this, 0));
                    zx0Var.f33670x.addListener(new cl0(3, zx0Var, this));
                    zx0Var.f33670x.start();
                }
                zx0Var.E = false;
                if (this.f24660g0) {
                    zx0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f24662i0, i10 * f14, f15) + zx0Var.f33662b);
                } else {
                    zx0Var.setTranslationX(zx0Var.f33662b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f24660g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f24662i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f24668o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f24669p0.d(f7, false);
        if (!isInEditMode() && this.f24676x != 0 && this.J >= 0) {
            e6 e6Var = this.E;
            float d10 = e6Var.d(this.f24677y, false);
            TimeInterpolator timeInterpolator = e6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < vb1Var.getChildCount()) {
                view = vb1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < vb1Var.getChildCount()) {
                view2 = vb1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f24662i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f24662i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof zx0) {
                    f12 = ((zx0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof zx0) {
                    f13 = ((zx0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f24662i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof zx0) {
                        textWidth = ((zx0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f24662i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof zx0) {
                            textWidth = ((zx0) view2).getTextWidth();
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    textWidth = 0.0f;
                }
            }
            float dp = AndroidUtilities.dp(30.0f);
            if (timeInterpolator != null) {
                b10 = timeInterpolator.getInterpolation(e6Var.b());
            } else {
                b10 = e6Var.b();
            }
            float abs = (1.25f - ((Math.abs(0.5f - b10) * 0.25f) * f10)) * dp;
            if (timeInterpolator != null) {
                b11 = timeInterpolator.getInterpolation(e6Var.b());
            } else {
                b11 = e6Var.b();
            }
            float abs2 = ((Math.abs(0.5f - b11) * 0.1f * f10) + 0.9f) * dp;
            float interpolation = tr.f31217i.getInterpolation(this.f24662i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.d6 d6Var = this.O;
            Paint paint = this.f24667n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, d6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Me, d6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f24676x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, vb1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            vb1 vb1Var = this.f24656e;
            if (i10 < vb1Var.getChildCount()) {
                View childAt = vb1Var.getChildAt(i10);
                if (childAt instanceof zx0) {
                    zx0 zx0Var = (zx0) childAt;
                    if (zx0Var.f33661a == 0 && !zx0Var.d) {
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
        vm0 vm0Var = this.f24657e0;
        if (action == 0 && this.f24673s == null) {
            this.f24652b0 = true;
            AndroidUtilities.runOnUIThread(vm0Var, 500L);
            this.W = motionEvent.getX();
            this.f24650a0 = motionEvent.getY();
        }
        if (this.f24652b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f24650a0) > f7) {
                this.f24652b0 = false;
                AndroidUtilities.cancelRunOnUIThread(vm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        vm0 vm0Var2 = this.f24674s0;
        vb1 vb1Var = this.f24656e;
        if (action2 == 2 && this.f24673s != null) {
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
                for (int i11 = 0; i11 < vb1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        zx0 zx0Var = (zx0) vb1Var.getChildAt(i11);
                        zx0Var.f33671y = zx0Var.getLeft();
                        zx0Var.E = true;
                        zx0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                vb1Var.removeView(this.f24673s);
                vb1Var.addView(this.f24673s, this.U);
                invalidate();
            }
            this.f24655d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f24673s.getMeasuredWidth() / 2.0f) {
                this.f24670q0 = false;
                if (this.f24672r0 <= 0) {
                    this.f24672r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(vm0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f24673s.getMeasuredWidth() / 2.0f)) {
                this.f24670q0 = true;
                if (this.f24672r0 <= 0) {
                    this.f24672r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(vm0Var2, 16L);
            } else {
                this.f24672r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(vm0Var2);
            }
            vb1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f24672r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(vm0Var2);
            AndroidUtilities.cancelRunOnUIThread(vm0Var);
            if (this.f24673s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < vb1Var.getChildCount(); i14++) {
                        vb1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v70(this, 12));
                ofFloat.addListener(new hd0(this, 9));
                ofFloat.start();
            }
            this.f24652b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f24666n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f24671r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f24677y;
    }

    public float getExpandedOffset() {
        if (this.f24660g0) {
            return AndroidUtilities.dp(50.0f) * this.f24662i0;
        }
        return 0.0f;
    }

    public zm0 getType() {
        return this.f24651b;
    }

    public final void h() {
        HashMap hashMap = this.f24666n;
        vb1 vb1Var = this.f24656e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                vb1Var.removeView((View) entry.getValue());
            }
            this.f24666n.clear();
        }
        SparseArray sparseArray = this.f24671r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (vb1Var.indexOfChild(view) != keyAt) {
                vb1Var.removeView(view);
                vb1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f24659f0 != z10) {
            this.f24659f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f24661h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24661h0.cancel();
            }
            float f11 = this.f24662i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f24661h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    an0 an0Var = an0.this;
                    vb1 vb1Var = an0Var.f24656e;
                    if (!z10) {
                        float childCount = an0Var.f24664k0 * vb1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (an0Var.getScrollX() + f12) / (an0Var.f24663j0 * vb1Var.getChildCount());
                        float measuredWidth = (childCount - an0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        an0Var.f24665l0 = (an0Var.getScrollX() + f12) - f13;
                    }
                    an0Var.f24662i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < vb1Var.getChildCount(); i10++) {
                        vb1Var.getChildAt(i10).invalidate();
                    }
                    vb1Var.invalidate();
                    an0Var.p();
                }
            });
            this.f24661h0.addListener(new xm0(this, z10, f7, 0));
            this.f24661h0.start();
            vb1 vb1Var = this.f24656e;
            if (z10) {
                this.f24660g0 = true;
                for (int i10 = 0; i10 < vb1Var.getChildCount(); i10++) {
                    View childAt = vb1Var.getChildAt(i10);
                    if (childAt instanceof zx0) {
                        ((zx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                vb1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f24663j0 * vb1Var.getChildCount() * ((getScrollX() + f7) / (this.f24664k0 * vb1Var.getChildCount()));
                this.f24665l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f24677y;
        if (i12 != i10) {
            vb1 vb1Var = this.f24656e;
            View childAt = vb1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f24677y = i10;
            if (i10 >= vb1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= vb1Var.getChildCount()) {
                    break;
                }
                View childAt2 = vb1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f24661h0 == null) {
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
        if (this.f24676x != 0) {
            vb1 vb1Var = this.f24656e;
            if (vb1Var.getChildAt(i10) != null) {
                int left = vb1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f24676x) {
            this.f24656e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an0.n():void");
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
        for (int i10 = 0; i10 < this.f24676x; i10++) {
            View childAt = this.f24656e.getChildAt(i10);
            if (this.f24675w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f24653c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f24677y = i10;
    }

    public void setDelegate(ym0 ym0Var) {
        this.f24658f = ym0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f24649a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f24675w = z10;
        requestLayout();
    }

    public void setType(zm0 zm0Var) {
        if (zm0Var != null && this.f24651b != zm0Var) {
            this.f24651b = zm0Var;
            int ordinal = zm0Var.ordinal();
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
