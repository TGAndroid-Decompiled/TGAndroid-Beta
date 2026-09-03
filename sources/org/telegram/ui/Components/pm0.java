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
import org.telegram.ui.ob1;
public abstract class pm0 extends HorizontalScrollView {
    public static final int f30127q0 = 0;
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
    public int f30128a;
    public float f30129a0;
    public om0 f30130b;
    public final lm0 f30131b0;
    public final LinearLayout.LayoutParams f30132c;
    public boolean f30133c0;
    public final LinearLayout.LayoutParams d;
    public boolean f30134d0;
    public final ob1 f30135e;
    public ValueAnimator f30136e0;
    public nm0 f30137f;
    public float f30138f0;
    public final float f30139g0;
    public HashMap h;
    public final float f30140h0;
    public float f30141i0;
    public int f30142j0;
    public final Paint f30143k0;
    public boolean f30144l0;
    public final z5 m0;
    public HashMap f30145n;
    public boolean f30146n0;
    public long f30147o0;
    public final lm0 f30148p0;
    public final SparseArray f30149r;
    public View f30150s;
    public float v;
    public boolean f30151w;
    public int f30152x;
    public int f30153y;

    public pm0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f30128a = 1;
        this.f30130b = om0.f29821a;
        this.h = new HashMap();
        this.f30145n = new HashMap();
        this.f30149r = new SparseArray();
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
        this.f30131b0 = new lm0(this, 0);
        this.f30133c0 = false;
        this.f30139g0 = AndroidUtilities.dp(64.0f);
        this.f30140h0 = AndroidUtilities.dp(33.0f);
        this.f30142j0 = -1;
        this.f30143k0 = new Paint();
        this.f30144l0 = true;
        this.m0 = new z5(this, 350L, prVar);
        this.f30148p0 = new lm0(this, 1);
        this.L = g6Var;
        this.M = z4;
        this.D = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ob1 ob1Var = new ob1(this, context, 9);
        this.f30135e = ob1Var;
        ob1Var.setOrientation(0);
        ob1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ob1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f30132c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f10;
        if (this.f30134d0) {
            f10 = 64.0f;
        } else {
            f10 = 33.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.f30152x;
        this.f30152x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f30145n.get(j10);
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
            frameLayout.setOnClickListener(new jm0(this, 3));
            this.f30135e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30153y) {
            z4 = false;
        }
        frameLayout.setSelected(z4);
        this.h.put(j10, frameLayout);
        return frameLayout;
    }

    public final fx0 c(int i10, Drawable drawable) {
        String j10 = l.d.j(i10, "tab");
        int i11 = this.f30152x;
        this.f30152x = i11 + 1;
        fx0 fx0Var = (fx0) this.f30145n.get(j10);
        boolean z4 = true;
        if (fx0Var != null) {
            g(j10, fx0Var, i11);
        } else {
            fx0Var = new fx0(getContext(), 1);
            fx0Var.f27025f.setImageDrawable(drawable);
            fx0Var.setFocusable(true);
            fx0Var.setOnClickListener(new jm0(this, 4));
            fx0Var.setExpanded(this.f30133c0);
            fx0Var.a(this.f30138f0);
            this.f30135e.addView(fx0Var, i11);
        }
        fx0Var.d = false;
        fx0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f30153y) {
            z4 = false;
        }
        fx0Var.setSelected(z4);
        this.h.put(j10, fx0Var);
        return fx0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.V = false;
        AndroidUtilities.cancelRunOnUIThread(this.f30131b0);
    }

    public final void d(boolean z4) {
        this.f30145n = this.h;
        this.h = new HashMap();
        this.f30149r.clear();
        this.f30152x = 0;
        if (z4) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new mm0(this, 0));
            TransitionManager.beginDelayedTransition(this.f30135e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ob1 ob1Var;
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
        float f15 = this.f30140h0 - this.f30139g0;
        float f16 = (1.0f - this.f30138f0) * this.f30141i0;
        int i10 = 0;
        while (true) {
            ob1Var = this.f30135e;
            if (i10 >= ob1Var.getChildCount()) {
                break;
            }
            if (ob1Var.getChildAt(i10) instanceof fx0) {
                fx0 fx0Var = (fx0) ob1Var.getChildAt(i10);
                float f17 = fx0Var.f27031y;
                if (fx0Var.getLeft() != f17 && fx0Var.B) {
                    fx0Var.f27022b = f17 - fx0Var.getLeft();
                    ValueAnimator valueAnimator = fx0Var.f27030x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fx0Var.f27030x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fx0Var.f27022b, 0.0f);
                    fx0Var.f27030x = ofFloat;
                    ofFloat.addUpdateListener(new dx0(fx0Var, this, 0));
                    fx0Var.f27030x.addListener(new ex0(0, fx0Var, this));
                    fx0Var.f27030x.start();
                }
                fx0Var.B = false;
                if (this.f30134d0) {
                    fx0Var.setTranslationX(e2.c.w(1.0f, this.f30138f0, i10 * f15, f16) + fx0Var.f27022b);
                } else {
                    fx0Var.setTranslationX(fx0Var.f27022b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f30134d0) {
            height = org.telegram.ui.yh.c(1.0f, this.f30138f0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f18 = height;
        if (this.f30144l0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.m0.d(f10, false);
        if (!isInEditMode() && this.f30152x != 0 && this.G >= 0) {
            z5 z5Var = this.B;
            float d10 = z5Var.d(this.f30153y, false);
            TimeInterpolator timeInterpolator = z5Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < ob1Var.getChildCount()) {
                view = ob1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < ob1Var.getChildCount()) {
                view2 = ob1Var.getChildAt(ceil);
            }
            float f19 = f18 / 2.0f;
            if (view != null && view2 != null) {
                f11 = 2.0f;
                float f20 = d10 - floor;
                f12 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30138f0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30138f0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f20);
                if (view instanceof fx0) {
                    f13 = ((fx0) view).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                if (view2 instanceof fx0) {
                    f14 = ((fx0) view2).getTextWidth();
                } else {
                    f14 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f13, f14, f20);
            } else {
                f11 = 2.0f;
                if (view != null) {
                    f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30138f0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof fx0) {
                        textWidth = ((fx0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f12 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f30138f0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof fx0) {
                            textWidth = ((fx0) view2).getTextWidth();
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
            float interpolation = pr.f30170i.getInterpolation(this.f30138f0);
            float lerp = f19 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f11;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f11;
            float f21 = lerp + lerp3;
            RectF rectF = this.C;
            rectF.set(f12 - lerp2, lerp - lerp3, f12 + lerp2, f21);
            boolean z4 = this.M;
            org.telegram.ui.ActionBar.g6 g6Var = this.L;
            Paint paint = this.f30143k0;
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
        if (!isInEditMode() && this.f30152x != 0 && this.J > 0) {
            int i11 = this.F;
            Paint paint2 = this.E;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f18 - this.J, ob1Var.getWidth(), f18, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.P && i10 >= 0) {
            ob1 ob1Var = this.f30135e;
            if (i10 < ob1Var.getChildCount()) {
                View childAt = ob1Var.getChildAt(i10);
                if (childAt instanceof fx0) {
                    fx0 fx0Var = (fx0) childAt;
                    if (fx0Var.f27021a == 0 && !fx0Var.d) {
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
        lm0 lm0Var = this.f30131b0;
        if (action == 0 && this.f30150s == null) {
            this.V = true;
            AndroidUtilities.runOnUIThread(lm0Var, 500L);
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
        }
        if (this.V && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.T);
            float f10 = this.D;
            if (abs > f10 || Math.abs(motionEvent.getY() - this.U) > f10) {
                this.V = false;
                AndroidUtilities.cancelRunOnUIThread(lm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        lm0 lm0Var2 = this.f30148p0;
        ob1 ob1Var = this.f30135e;
        if (action2 == 2 && this.f30150s != null) {
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
                for (int i11 = 0; i11 < ob1Var.getChildCount(); i11++) {
                    if (i11 != this.R) {
                        fx0 fx0Var = (fx0) ob1Var.getChildAt(i11);
                        fx0Var.f27031y = fx0Var.getLeft();
                        fx0Var.B = true;
                        fx0Var.invalidate();
                    }
                }
                this.S += (ceil - this.R) * getTabSize();
                this.R = ceil;
                ob1Var.removeView(this.f30150s);
                ob1Var.addView(this.f30150s, this.R);
                invalidate();
            }
            this.f30129a0 = this.T - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f30150s.getMeasuredWidth() / 2.0f) {
                this.f30146n0 = false;
                if (this.f30147o0 <= 0) {
                    this.f30147o0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(lm0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f30150s.getMeasuredWidth() / 2.0f)) {
                this.f30146n0 = true;
                if (this.f30147o0 <= 0) {
                    this.f30147o0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(lm0Var2, 16L);
            } else {
                this.f30147o0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(lm0Var2);
            }
            ob1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f30147o0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(lm0Var2);
            AndroidUtilities.cancelRunOnUIThread(lm0Var);
            if (this.f30150s != null) {
                int i12 = this.Q;
                int i13 = this.R;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < ob1Var.getChildCount(); i14++) {
                        ob1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
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
        HashMap hashMap = this.f30145n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f30149r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f30153y;
    }

    public float getExpandedOffset() {
        if (this.f30134d0) {
            return AndroidUtilities.dp(50.0f) * this.f30138f0;
        }
        return 0.0f;
    }

    public om0 getType() {
        return this.f30130b;
    }

    public final void h() {
        HashMap hashMap = this.f30145n;
        ob1 ob1Var = this.f30135e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ob1Var.removeView((View) entry.getValue());
            }
            this.f30145n.clear();
        }
        SparseArray sparseArray = this.f30149r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ob1Var.indexOfChild(view) != keyAt) {
                ob1Var.removeView(view);
                ob1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z4) {
        float f11;
        if (this.f30133c0 != z4) {
            this.f30133c0 = z4;
            if (!z4) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f30136e0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30136e0.cancel();
            }
            float f12 = this.f30138f0;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
            this.f30136e0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pm0 pm0Var = pm0.this;
                    ob1 ob1Var = pm0Var.f30135e;
                    if (!z4) {
                        float childCount = pm0Var.f30140h0 * ob1Var.getChildCount();
                        float f13 = f10;
                        float scrollX = (pm0Var.getScrollX() + f13) / (pm0Var.f30139g0 * ob1Var.getChildCount());
                        float measuredWidth = (childCount - pm0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f13 = 0.0f;
                        }
                        float f14 = childCount * scrollX;
                        if (f14 - f13 < 0.0f) {
                            f14 = f13;
                        }
                        pm0Var.f30141i0 = (pm0Var.getScrollX() + f13) - f14;
                    }
                    pm0Var.f30138f0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                        ob1Var.getChildAt(i10).invalidate();
                    }
                    ob1Var.invalidate();
                    pm0Var.p();
                }
            });
            this.f30136e0.addListener(new kh.r(this, z4, f10, 1));
            this.f30136e0.start();
            ob1 ob1Var = this.f30135e;
            if (z4) {
                this.f30134d0 = true;
                for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                    View childAt = ob1Var.getChildAt(i10);
                    if (childAt instanceof fx0) {
                        ((fx0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ob1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z4) {
                float childCount = this.f30139g0 * ob1Var.getChildCount() * ((getScrollX() + f10) / (this.f30140h0 * ob1Var.getChildCount()));
                this.f30141i0 = childCount - (getScrollX() + f10);
                this.f30142j0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f30153y;
        if (i12 != i10) {
            ob1 ob1Var = this.f30135e;
            View childAt = ob1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f30153y = i10;
            if (i10 >= ob1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z4 = true;
                if (i13 >= ob1Var.getChildCount()) {
                    break;
                }
                View childAt2 = ob1Var.getChildAt(i13);
                if (i13 != i10) {
                    z4 = false;
                }
                childAt2.setSelected(z4);
                i13++;
            }
            if (this.f30136e0 == null) {
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
        if (this.f30152x != 0) {
            ob1 ob1Var = this.f30135e;
            if (ob1Var.getChildAt(i10) != null) {
                int left = ob1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f30152x) {
            this.f30135e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm0.n():void");
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
        int i14 = this.f30142j0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.f30142j0 = -1;
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
        for (int i10 = 0; i10 < this.f30152x; i10++) {
            View childAt = this.f30135e.getChildAt(i10);
            if (this.f30151w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f30132c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f30153y = i10;
    }

    public void setDelegate(nm0 nm0Var) {
        this.f30137f = nm0Var;
    }

    public void setDragEnabled(boolean z4) {
        this.P = z4;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f30128a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.G = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f30151w = z4;
        requestLayout();
    }

    public void setType(om0 om0Var) {
        if (om0Var != null && this.f30130b != om0Var) {
            this.f30130b = om0Var;
            int ordinal = om0Var.ordinal();
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
