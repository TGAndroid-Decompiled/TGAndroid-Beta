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
import org.telegram.ui.bc1;
public abstract class vm0 extends HorizontalScrollView {
    public static final int f29107t0 = 0;
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
    public final org.telegram.ui.ActionBar.e6 O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseArray R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int f29108a;
    public float f29109a0;
    public um0 f29110b;
    public boolean f29111b0;
    public final LinearLayout.LayoutParams f29112c;
    public float f29113c0;
    public final LinearLayout.LayoutParams d;
    public float f29114d0;
    public final bc1 e;
    public final qm0 f29115e0;
    public tm0 f29116f;
    public boolean f29117f0;
    public boolean f29118g0;
    public HashMap h;
    public ValueAnimator f29119h0;
    public float f29120i0;
    public final float f29121j0;
    public final float f29122k0;
    public float f29123l0;
    public int m0;
    public HashMap f29124n;
    public final Paint f29125n0;
    public boolean f29126o0;
    public final e6 f29127p0;
    public boolean f29128q0;
    public final SparseArray f29129r;
    public long f29130r0;
    public View f29131s;
    public final qm0 f29132s0;
    public float v;
    public boolean f29133w;
    public int f29134x;
    public int f29135y;

    public vm0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f29108a = 1;
        this.f29110b = um0.f28731a;
        this.h = new HashMap();
        this.f29124n = new HashMap();
        this.f29129r = new SparseArray();
        qr qrVar = qr.h;
        this.E = new e6(this, 350L, qrVar);
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
        this.f29115e0 = new qm0(this, 0);
        this.f29117f0 = false;
        this.f29121j0 = AndroidUtilities.dp(64.0f);
        this.f29122k0 = AndroidUtilities.dp(33.0f);
        this.m0 = -1;
        this.f29125n0 = new Paint();
        this.f29126o0 = true;
        this.f29127p0 = new e6(this, 350L, qrVar);
        this.f29132s0 = new qm0(this, 1);
        this.O = e6Var;
        this.P = z10;
        this.G = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        bc1 bc1Var = new bc1(this, context, 8);
        this.e = bc1Var;
        bc1Var.setOrientation(0);
        bc1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(bc1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f29112c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f7;
        if (this.f29118g0) {
            f7 = 64.0f;
        } else {
            f7 = 33.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String h = hg.k0.h(i10, "tab");
        int i11 = this.f29134x;
        this.f29134x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f29124n.get(h);
        boolean z10 = true;
        if (frameLayout != null) {
            g(h, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, w7.y5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new om0(this, 3));
            this.e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f29135y) {
            z10 = false;
        }
        frameLayout.setSelected(z10);
        this.h.put(h, frameLayout);
        return frameLayout;
    }

    public final px0 c(int i10, Drawable drawable) {
        String h = hg.k0.h(i10, "tab");
        int i11 = this.f29134x;
        this.f29134x = i11 + 1;
        px0 px0Var = (px0) this.f29124n.get(h);
        boolean z10 = true;
        if (px0Var != null) {
            g(h, px0Var, i11);
        } else {
            px0Var = new px0(getContext(), 1);
            px0Var.f27338f.setImageDrawable(drawable);
            px0Var.setFocusable(true);
            px0Var.setOnClickListener(new om0(this, 4));
            px0Var.setExpanded(this.f29117f0);
            px0Var.a(this.f29120i0);
            this.e.addView(px0Var, i11);
        }
        px0Var.d = false;
        px0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        if (i11 != this.f29135y) {
            z10 = false;
        }
        px0Var.setSelected(z10);
        this.h.put(h, px0Var);
        return px0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.f29111b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29115e0);
    }

    public final void d(boolean z10) {
        this.f29124n = this.h;
        this.h = new HashMap();
        this.f29129r.clear();
        this.f29134x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new rm0(this, 0));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bc1 bc1Var;
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
        float f14 = this.f29122k0 - this.f29121j0;
        float f15 = (1.0f - this.f29120i0) * this.f29123l0;
        int i10 = 0;
        while (true) {
            bc1Var = this.e;
            if (i10 >= bc1Var.getChildCount()) {
                break;
            }
            if (bc1Var.getChildAt(i10) instanceof px0) {
                px0 px0Var = (px0) bc1Var.getChildAt(i10);
                float f16 = px0Var.f27344y;
                if (px0Var.getLeft() != f16 && px0Var.E) {
                    px0Var.f27336b = f16 - px0Var.getLeft();
                    ValueAnimator valueAnimator = px0Var.f27343x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        px0Var.f27343x.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(px0Var.f27336b, 0.0f);
                    px0Var.f27343x = ofFloat;
                    ofFloat.addUpdateListener(new ox0(px0Var, this, 0));
                    px0Var.f27343x.addListener(new al0(3, px0Var, this));
                    px0Var.f27343x.start();
                }
                px0Var.E = false;
                if (this.f29118g0) {
                    px0Var.setTranslationX(com.google.android.gms.internal.vision.e2.z(1.0f, this.f29120i0, i10 * f14, f15) + px0Var.f27336b);
                } else {
                    px0Var.setTranslationX(px0Var.f27336b);
                }
            }
            i10++;
        }
        float height = getHeight();
        if (this.f29118g0) {
            height = com.google.android.gms.internal.vision.e2.b(1.0f, this.f29120i0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f17 = height;
        if (this.f29126o0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f29127p0.d(f7, false);
        if (!isInEditMode() && this.f29134x != 0 && this.J >= 0) {
            e6 e6Var = this.E;
            float d10 = e6Var.d(this.f29135y, false);
            TimeInterpolator timeInterpolator = e6Var.h;
            double d11 = d10;
            int floor = (int) Math.floor(d11);
            int ceil = (int) Math.ceil(d11);
            View view2 = null;
            if (floor >= 0 && floor < bc1Var.getChildCount()) {
                view = bc1Var.getChildAt(floor);
            } else {
                view = null;
            }
            if (ceil >= 0 && ceil < bc1Var.getChildCount()) {
                view2 = bc1Var.getChildAt(ceil);
            }
            float f18 = f17 / 2.0f;
            if (view != null && view2 != null) {
                f10 = 2.0f;
                float f19 = d10 - floor;
                f11 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29120i0) / 2.0f) + view.getTranslationX() + view.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29120i0) / 2.0f) + view2.getTranslationX() + view2.getLeft(), f19);
                if (view instanceof px0) {
                    f12 = ((px0) view).getTextWidth();
                } else {
                    f12 = 0.0f;
                }
                if (view2 instanceof px0) {
                    f13 = ((px0) view2).getTextWidth();
                } else {
                    f13 = 0.0f;
                }
                textWidth = AndroidUtilities.lerp(f12, f13, f19);
            } else {
                f10 = 2.0f;
                if (view != null) {
                    f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29120i0) / 2.0f) + view.getTranslationX() + view.getLeft();
                    if (view instanceof px0) {
                        textWidth = ((px0) view).getTextWidth();
                    }
                    textWidth = 0.0f;
                } else {
                    if (view2 != null) {
                        f11 = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f29120i0) / 2.0f) + view2.getTranslationX() + view2.getLeft();
                        if (view2 instanceof px0) {
                            textWidth = ((px0) view2).getTextWidth();
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
            float interpolation = qr.f27717i.getInterpolation(this.f29120i0);
            float lerp = f18 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp2 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / f10;
            float lerp3 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * abs2) / f10;
            float f20 = lerp + lerp3;
            RectF rectF = this.F;
            rectF.set(f11 - lerp2, lerp - lerp3, f11 + lerp2, f20);
            boolean z10 = this.P;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.O;
            Paint paint = this.f29125n0;
            if (z10) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, e6Var2), (int) 12.75f));
            } else {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, e6Var2), 46));
                paint.setAlpha((int) (paint.getAlpha() * d));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode() && this.f29134x != 0 && this.M > 0) {
            int i11 = this.I;
            Paint paint2 = this.H;
            paint2.setColor(i11);
            canvas2.drawRect(0.0f, f17 - this.M, bc1Var.getWidth(), f17, paint2);
        }
    }

    public final boolean e(int i10) {
        if (this.S && i10 >= 0) {
            bc1 bc1Var = this.e;
            if (i10 < bc1Var.getChildCount()) {
                View childAt = bc1Var.getChildAt(i10);
                if (childAt instanceof px0) {
                    px0 px0Var = (px0) childAt;
                    if (px0Var.f27335a == 0 && !px0Var.d) {
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
        qm0 qm0Var = this.f29115e0;
        if (action == 0 && this.f29131s == null) {
            this.f29111b0 = true;
            AndroidUtilities.runOnUIThread(qm0Var, 500L);
            this.W = motionEvent.getX();
            this.f29109a0 = motionEvent.getY();
        }
        if (this.f29111b0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.W);
            float f7 = this.G;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.f29109a0) > f7) {
                this.f29111b0 = false;
                AndroidUtilities.cancelRunOnUIThread(qm0Var);
            }
        }
        int action2 = motionEvent.getAction();
        qm0 qm0Var2 = this.f29132s0;
        bc1 bc1Var = this.e;
        if (action2 == 2 && this.f29131s != null) {
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
                for (int i11 = 0; i11 < bc1Var.getChildCount(); i11++) {
                    if (i11 != this.U) {
                        px0 px0Var = (px0) bc1Var.getChildAt(i11);
                        px0Var.f27344y = px0Var.getLeft();
                        px0Var.E = true;
                        px0Var.invalidate();
                    }
                }
                this.V += (ceil - this.U) * getTabSize();
                this.U = ceil;
                bc1Var.removeView(this.f29131s);
                bc1Var.addView(this.f29131s, this.U);
                invalidate();
            }
            this.f29114d0 = this.W - motionEvent.getX();
            float x10 = motionEvent.getX();
            if (x10 < this.f29131s.getMeasuredWidth() / 2.0f) {
                this.f29128q0 = false;
                if (this.f29130r0 <= 0) {
                    this.f29130r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(qm0Var2, 16L);
            } else if (x10 > getMeasuredWidth() - (this.f29131s.getMeasuredWidth() / 2.0f)) {
                this.f29128q0 = true;
                if (this.f29130r0 <= 0) {
                    this.f29130r0 = System.currentTimeMillis();
                }
                AndroidUtilities.runOnUIThread(qm0Var2, 16L);
            } else {
                this.f29130r0 = -1L;
                AndroidUtilities.cancelRunOnUIThread(qm0Var2);
            }
            bc1Var.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.f29130r0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(qm0Var2);
            AndroidUtilities.cancelRunOnUIThread(qm0Var);
            if (this.f29131s != null) {
                int i12 = this.T;
                int i13 = this.U;
                if (i12 != i13) {
                    o(i12, i13);
                    for (int i14 = 0; i14 < bc1Var.getChildCount(); i14++) {
                        bc1Var.getChildAt(i14).setTag(R.id.index_tag, Integer.valueOf(i14));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q70(this, 12));
                ofFloat.addListener(new ed0(this, 9));
                ofFloat.start();
            }
            this.f29111b0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap hashMap = this.f29124n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.f29129r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f29135y;
    }

    public float getExpandedOffset() {
        if (this.f29118g0) {
            return AndroidUtilities.dp(50.0f) * this.f29120i0;
        }
        return 0.0f;
    }

    public um0 getType() {
        return this.f29110b;
    }

    public final void h() {
        HashMap hashMap = this.f29124n;
        bc1 bc1Var = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                bc1Var.removeView((View) entry.getValue());
            }
            this.f29124n.clear();
        }
        SparseArray sparseArray = this.f29129r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (bc1Var.indexOfChild(view) != keyAt) {
                bc1Var.removeView(view);
                bc1Var.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f7, final boolean z10) {
        float f10;
        if (this.f29117f0 != z10) {
            this.f29117f0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f29119h0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f29119h0.cancel();
            }
            float f11 = this.f29120i0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f29119h0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vm0 vm0Var = vm0.this;
                    bc1 bc1Var = vm0Var.e;
                    if (!z10) {
                        float childCount = vm0Var.f29122k0 * bc1Var.getChildCount();
                        float f12 = f7;
                        float scrollX = (vm0Var.getScrollX() + f12) / (vm0Var.f29121j0 * bc1Var.getChildCount());
                        float measuredWidth = (childCount - vm0Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f12 = 0.0f;
                        }
                        float f13 = childCount * scrollX;
                        if (f13 - f12 < 0.0f) {
                            f13 = f12;
                        }
                        vm0Var.f29123l0 = (vm0Var.getScrollX() + f12) - f13;
                    }
                    vm0Var.f29120i0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < bc1Var.getChildCount(); i10++) {
                        bc1Var.getChildAt(i10).invalidate();
                    }
                    bc1Var.invalidate();
                    vm0Var.p();
                }
            });
            this.f29119h0.addListener(new sm0(this, z10, f7, 0));
            this.f29119h0.start();
            bc1 bc1Var = this.e;
            if (z10) {
                this.f29118g0 = true;
                for (int i10 = 0; i10 < bc1Var.getChildCount(); i10++) {
                    View childAt = bc1Var.getChildAt(i10);
                    if (childAt instanceof px0) {
                        ((px0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                bc1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f29121j0 * bc1Var.getChildCount() * ((getScrollX() + f7) / (this.f29122k0 * bc1Var.getChildCount()));
                this.f29123l0 = childCount - (getScrollX() + f7);
                this.m0 = (int) (childCount - f7);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f29135y;
        if (i12 != i10) {
            bc1 bc1Var = this.e;
            View childAt = bc1Var.getChildAt(i12);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.f29135y = i10;
            if (i10 >= bc1Var.getChildCount()) {
                return;
            }
            int i13 = 0;
            while (true) {
                boolean z10 = true;
                if (i13 >= bc1Var.getChildCount()) {
                    break;
                }
                View childAt2 = bc1Var.getChildAt(i13);
                if (i13 != i10) {
                    z10 = false;
                }
                childAt2.setSelected(z10);
                i13++;
            }
            if (this.f29119h0 == null) {
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
        if (this.f29134x != 0) {
            bc1 bc1Var = this.e;
            if (bc1Var.getChildAt(i10) != null) {
                int left = bc1Var.getChildAt(i10).getLeft();
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
        if (i10 >= 0 && i10 < this.f29134x) {
            this.e.getChildAt(i10).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vm0.n():void");
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
        for (int i10 = 0; i10 < this.f29134x; i10++) {
            View childAt = this.e.getChildAt(i10);
            if (this.f29133w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f29112c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f29135y = i10;
    }

    public void setDelegate(tm0 tm0Var) {
        this.f29116f = tm0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.S = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f29108a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.J = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f29133w = z10;
        requestLayout();
    }

    public void setType(um0 um0Var) {
        if (um0Var != null && this.f29110b != um0Var) {
            this.f29110b = um0Var;
            int ordinal = um0Var.ordinal();
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
