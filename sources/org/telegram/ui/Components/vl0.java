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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ra1;

public abstract class vl0 extends HorizontalScrollView {

    public static final int f33440p0 = 0;
    public final y5 A;
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

    public int f33441a;

    public final rl0 f33442a0;

    public ul0 f33443b;

    public boolean f33444b0;

    public final LinearLayout.LayoutParams f33445c;

    public boolean f33446c0;
    public final LinearLayout.LayoutParams d;

    public ValueAnimator f33447d0;

    public final ra1 f33448e;

    public float f33449e0;

    public tl0 f33450f;

    public final float f33451f0;

    public final float f33452g0;
    public HashMap h;

    public float f33453h0;

    public int f33454i0;

    public final Paint f33455j0;

    public boolean f33456k0;

    public final y5 f33457l0;
    public boolean m0;

    public HashMap f33458n;

    public long f33459n0;

    public final rl0 f33460o0;

    public final SparseArray f33461r;

    public View f33462s;
    public float v;

    public boolean f33463w;

    public int f33464x;

    public int f33465y;

    public vl0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f33441a = 1;
        this.f33443b = ul0.f33120a;
        this.h = new HashMap();
        this.f33458n = new HashMap();
        this.f33461r = new SparseArray();
        er erVar = er.h;
        this.A = new y5(this, 350L, erVar);
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
        this.f33442a0 = new rl0(this, 0);
        this.f33444b0 = false;
        this.f33451f0 = AndroidUtilities.dp(64.0f);
        this.f33452g0 = AndroidUtilities.dp(33.0f);
        this.f33454i0 = -1;
        this.f33455j0 = new Paint();
        this.f33456k0 = true;
        this.f33457l0 = new y5(this, 350L, erVar);
        this.f33460o0 = new rl0(this, 1);
        this.K = c6Var;
        this.L = z10;
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ra1 ra1Var = new ra1(this, context, 10);
        this.f33448e = ra1Var;
        ra1Var.setOrientation(0);
        ra1Var.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(ra1Var, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.D = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f33445c = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        return AndroidUtilities.dp(this.f33446c0 ? 64.0f : 33.0f);
    }

    public final FrameLayout b(int i10, Drawable drawable) {
        String strK = i0.a.k(i10, "tab");
        int i11 = this.f33464x;
        this.f33464x = i11 + 1;
        FrameLayout frameLayout = (FrameLayout) this.f33458n.get(strK);
        if (frameLayout != null) {
            g(strK, frameLayout, i11);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, h7.z5.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new pl0(this, 3));
            this.f33448e.addView(frameLayout, i11);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i11));
        frameLayout.setSelected(i11 == this.f33465y);
        this.h.put(strK, frameLayout);
        return frameLayout;
    }

    public final nw0 c(int i10, Drawable drawable) {
        String strK = i0.a.k(i10, "tab");
        int i11 = this.f33464x;
        this.f33464x = i11 + 1;
        nw0 nw0Var = (nw0) this.f33458n.get(strK);
        if (nw0Var != null) {
            g(strK, nw0Var, i11);
        } else {
            nw0Var = new nw0(getContext(), 1);
            nw0Var.f31047f.setImageDrawable(drawable);
            nw0Var.setFocusable(true);
            nw0Var.setOnClickListener(new pl0(this, 4));
            nw0Var.setExpanded(this.f33444b0);
            nw0Var.a(this.f33449e0);
            this.f33448e.addView(nw0Var, i11);
        }
        nw0Var.d = false;
        nw0Var.setTag(R.id.index_tag, Integer.valueOf(i11));
        nw0Var.setSelected(i11 == this.f33465y);
        this.h.put(strK, nw0Var);
        return nw0Var;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.U = false;
        AndroidUtilities.cancelRunOnUIThread(this.f33442a0);
    }

    public final void d(boolean z10) {
        this.f33458n = this.h;
        this.h = new HashMap();
        this.f33461r.clear();
        this.f33464x = 0;
        if (z10) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new sl0(this, 0));
            TransitionManager.beginDelayedTransition(this.f33448e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ra1 ra1Var;
        Canvas canvas2;
        float f10;
        float fLerp;
        float textWidth;
        float f11 = this.f33452g0 - this.f33451f0;
        float f12 = (1.0f - this.f33449e0) * this.f33453h0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ra1Var = this.f33448e;
            if (i11 >= ra1Var.getChildCount()) {
                break;
            }
            if (ra1Var.getChildAt(i11) instanceof nw0) {
                nw0 nw0Var = (nw0) ra1Var.getChildAt(i11);
                float left = nw0Var.getLeft();
                float f13 = nw0Var.f31053y;
                if (left != f13 && nw0Var.A) {
                    nw0Var.f31044b = f13 - nw0Var.getLeft();
                    ValueAnimator valueAnimator = nw0Var.f31052x;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        nw0Var.f31052x.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(nw0Var.f31044b, 0.0f);
                    nw0Var.f31052x = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new mw0(nw0Var, this, i10));
                    nw0Var.f31052x.addListener(new fk0(3, nw0Var, this));
                    nw0Var.f31052x.start();
                }
                nw0Var.A = false;
                if (this.f33446c0) {
                    nw0Var.setTranslationX(com.google.android.recaptcha.internal.a.z(1.0f, this.f33449e0, i11 * f11, f12) + nw0Var.f31044b);
                } else {
                    nw0Var.setTranslationX(nw0Var.f31044b);
                }
            }
            i11++;
        }
        float height = getHeight();
        if (this.f33446c0) {
            height = org.telegram.ui.Cells.pa.b(1.0f, this.f33449e0, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f14 = height;
        float fD = this.f33457l0.d(this.f33456k0 ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.f33464x == 0 || this.F < 0) {
            canvas2 = canvas;
        } else {
            float f15 = this.f33465y;
            y5 y5Var = this.A;
            float fD2 = y5Var.d(f15, false);
            TimeInterpolator timeInterpolator = y5Var.h;
            double d = fD2;
            int iFloor = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            View childAt = null;
            View childAt2 = (iFloor < 0 || iFloor >= ra1Var.getChildCount()) ? null : ra1Var.getChildAt(iFloor);
            if (iCeil >= 0 && iCeil < ra1Var.getChildCount()) {
                childAt = ra1Var.getChildAt(iCeil);
            }
            float f16 = f14 / 2.0f;
            if (childAt2 == null || childAt == null) {
                f10 = 2.0f;
                if (childAt2 != null) {
                    fLerp = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f33449e0) / 2.0f) + childAt2.getTranslationX() + childAt2.getLeft();
                    textWidth = childAt2 instanceof nw0 ? ((nw0) childAt2).getTextWidth() : 0.0f;
                } else {
                    if (childAt != null) {
                        fLerp = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f33449e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                        if (childAt instanceof nw0) {
                            textWidth = ((nw0) childAt).getTextWidth();
                        }
                    } else {
                        fLerp = 0.0f;
                    }
                }
            } else {
                f10 = 2.0f;
                float f17 = fD2 - iFloor;
                fLerp = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f33449e0) / 2.0f) + childAt2.getTranslationX() + childAt2.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.f33449e0) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), f17);
                textWidth = AndroidUtilities.lerp(childAt2 instanceof nw0 ? ((nw0) childAt2).getTextWidth() : 0.0f, childAt instanceof nw0 ? ((nw0) childAt).getTextWidth() : 0.0f, f17);
            }
            float fDp = AndroidUtilities.dp(30.0f);
            float fAbs = (1.25f - ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.25f) * f10)) * fDp;
            float fAbs2 = ((Math.abs(0.5f - (timeInterpolator != null ? timeInterpolator.getInterpolation(y5Var.b()) : y5Var.b())) * 0.1f * f10) + 0.9f) * fDp;
            float interpolation = er.f28124i.getInterpolation(this.f33449e0);
            float fLerp2 = AndroidUtilities.lerp(fAbs, textWidth + AndroidUtilities.dp(10.0f), interpolation);
            float fLerp3 = f16 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float f18 = fLerp2 / f10;
            float fLerp4 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * fAbs2) / f10;
            float f19 = fLerp3 + fLerp4;
            RectF rectF = this.B;
            rectF.set(fLerp - f18, fLerp3 - fLerp4, fLerp + f18, f19);
            boolean z10 = this.L;
            org.telegram.ui.ActionBar.c6 c6Var = this.K;
            Paint paint = this.f33455j0;
            if (z10) {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 12.75f));
            } else {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var), 46));
                paint.setAlpha((int) (paint.getAlpha() * fD));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.f33464x == 0 || this.I <= 0) {
            return;
        }
        int i12 = this.E;
        Paint paint2 = this.D;
        paint2.setColor(i12);
        canvas2.drawRect(0.0f, f14 - this.I, ra1Var.getWidth(), f14, paint2);
    }

    public final boolean e(int i10) {
        if (!this.O || i10 < 0) {
            return false;
        }
        ra1 ra1Var = this.f33448e;
        if (i10 >= ra1Var.getChildCount()) {
            return false;
        }
        View childAt = ra1Var.getChildAt(i10);
        if (!(childAt instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) childAt;
        return nw0Var.f31043a == 0 && !nw0Var.d;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rl0 rl0Var = this.f33442a0;
        if (action == 0 && this.f33462s == null) {
            this.U = true;
            AndroidUtilities.runOnUIThread(rl0Var, 500L);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
        }
        if (this.U && motionEvent.getAction() == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.S);
            float f10 = this.C;
            if (fAbs > f10 || Math.abs(motionEvent.getY() - this.T) > f10) {
                this.U = false;
                AndroidUtilities.cancelRunOnUIThread(rl0Var);
            }
        }
        int action2 = motionEvent.getAction();
        rl0 rl0Var2 = this.f33460o0;
        ra1 ra1Var = this.f33448e;
        if (action2 != 2 || this.f33462s == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.f33459n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(rl0Var2);
            AndroidUtilities.cancelRunOnUIThread(rl0Var);
            if (this.f33462s != null) {
                int i10 = this.P;
                int i11 = this.Q;
                if (i10 != i11) {
                    o(i10, i11);
                    for (int i12 = 0; i12 < ra1Var.getChildCount(); i12++) {
                        ra1Var.getChildAt(i12).setTag(R.id.index_tag, Integer.valueOf(i12));
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new v60(this, 12));
                valueAnimatorOfFloat.addListener(new sz(this, 16));
                valueAnimatorOfFloat.start();
            }
            this.U = false;
            j();
            return false;
        }
        int iCeil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i13 = this.Q;
        if (iCeil != i13) {
            if (iCeil < i13) {
                while (!e(iCeil) && iCeil != this.Q) {
                    iCeil++;
                }
            } else {
                while (!e(iCeil) && iCeil != this.Q) {
                    iCeil--;
                }
            }
        }
        if (this.Q != iCeil && e(iCeil)) {
            for (int i14 = 0; i14 < ra1Var.getChildCount(); i14++) {
                if (i14 != this.Q) {
                    nw0 nw0Var = (nw0) ra1Var.getChildAt(i14);
                    nw0Var.f31053y = nw0Var.getLeft();
                    nw0Var.A = true;
                    nw0Var.invalidate();
                }
            }
            this.R += (iCeil - this.Q) * getTabSize();
            this.Q = iCeil;
            ra1Var.removeView(this.f33462s);
            ra1Var.addView(this.f33462s, this.Q);
            invalidate();
        }
        this.W = this.S - motionEvent.getX();
        float x8 = motionEvent.getX();
        if (x8 < this.f33462s.getMeasuredWidth() / 2.0f) {
            this.m0 = false;
            if (this.f33459n0 <= 0) {
                this.f33459n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(rl0Var2, 16L);
        } else if (x8 > getMeasuredWidth() - (this.f33462s.getMeasuredWidth() / 2.0f)) {
            this.m0 = true;
            if (this.f33459n0 <= 0) {
                this.f33459n0 = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(rl0Var2, 16L);
        } else {
            this.f33459n0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(rl0Var2);
        }
        ra1Var.invalidate();
        j();
        return true;
    }

    public final void g(String str, FrameLayout frameLayout, int i10) {
        HashMap map = this.f33458n;
        if (map != null) {
            map.remove(str);
        }
        this.f33461r.put(i10, frameLayout);
    }

    public int getCurrentPosition() {
        return this.f33465y;
    }

    public float getExpandedOffset() {
        if (this.f33446c0) {
            return AndroidUtilities.dp(50.0f) * this.f33449e0;
        }
        return 0.0f;
    }

    public ul0 getType() {
        return this.f33443b;
    }

    public final void h() {
        HashMap map = this.f33458n;
        ra1 ra1Var = this.f33448e;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ra1Var.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.f33458n.clear();
        }
        SparseArray sparseArray = this.f33461r;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            View view = (View) sparseArray.valueAt(i10);
            if (ra1Var.indexOfChild(view) != iKeyAt) {
                ra1Var.removeView(view);
                ra1Var.addView(view, iKeyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final float f10, final boolean z10) {
        if (this.f33444b0 != z10) {
            this.f33444b0 = z10;
            if (!z10) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.f33447d0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f33447d0.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f33449e0, z10 ? 1.0f : 0.0f);
            this.f33447d0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    vl0 vl0Var = this.f31924a;
                    ra1 ra1Var = vl0Var.f33448e;
                    if (!z10) {
                        float childCount = vl0Var.f33452g0 * ra1Var.getChildCount();
                        float scrollX = vl0Var.getScrollX();
                        float f11 = f10;
                        float childCount2 = (scrollX + f11) / (vl0Var.f33451f0 * ra1Var.getChildCount());
                        float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f11 = 0.0f;
                        }
                        float f12 = childCount * childCount2;
                        if (f12 - f11 < 0.0f) {
                            f12 = f11;
                        }
                        vl0Var.f33453h0 = (vl0Var.getScrollX() + f11) - f12;
                    }
                    vl0Var.f33449e0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                        ra1Var.getChildAt(i10).invalidate();
                    }
                    ra1Var.invalidate();
                    vl0Var.p();
                }
            });
            this.f33447d0.addListener(new fh.r(this, z10, f10, 1));
            this.f33447d0.start();
            ra1 ra1Var = this.f33448e;
            if (z10) {
                this.f33446c0 = true;
                for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                    View childAt = ra1Var.getChildAt(i10);
                    if (childAt instanceof nw0) {
                        ((nw0) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                }
                ra1Var.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z10) {
                float childCount = this.f33451f0 * ra1Var.getChildCount() * ((getScrollX() + f10) / (this.f33452g0 * ra1Var.getChildCount()));
                this.f33453h0 = childCount - (getScrollX() + f10);
                this.f33454i0 = (int) (childCount - f10);
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f33465y;
        if (i12 == i10) {
            return;
        }
        ra1 ra1Var = this.f33448e;
        View childAt = ra1Var.getChildAt(i12);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.f33465y = i10;
        if (i10 >= ra1Var.getChildCount()) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i13 >= ra1Var.getChildCount()) {
                break;
            }
            View childAt2 = ra1Var.getChildAt(i13);
            if (i13 != i10) {
                z10 = false;
            }
            childAt2.setSelected(z10);
            i13++;
        }
        if (this.f33447d0 == null) {
            if (i11 != i10 || i10 <= 1) {
                l(i10);
            } else {
                l(i10 - 1);
            }
        }
        invalidate();
    }

    public final void l(int i10) {
        if (this.f33464x != 0) {
            ra1 ra1Var = this.f33448e;
            if (ra1Var.getChildAt(i10) == null) {
                return;
            }
            int left = ra1Var.getChildAt(i10).getLeft();
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

    public final void m(int i10) {
        if (i10 < 0 || i10 >= this.f33464x) {
            return;
        }
        this.f33448e.getChildAt(i10).performClick();
    }

    public final void n() {
        SparseArray sparseArray;
        ra1 ra1Var;
        int i10;
        String str;
        ImageLocation forSticker;
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        float fDp = AndroidUtilities.dp(33.0f);
        float fDp2 = AndroidUtilities.dp(31.0f);
        float f10 = this.f33449e0;
        float f11 = (fDp2 * f10) + fDp;
        float scrollX = getScrollX() - (this.f33446c0 ? (1.0f - f10) * this.f33453h0 : 0.0f);
        ra1 ra1Var2 = this.f33448e;
        int paddingLeft = (int) ((scrollX - ra1Var2.getPaddingLeft()) / f11);
        int i11 = 1;
        int iMin = Math.min(ra1Var2.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f11)) + paddingLeft + 1);
        if (this.f33446c0) {
            paddingLeft -= 2;
            iMin += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (iMin > ra1Var2.getChildCount()) {
                iMin = ra1Var2.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.N;
        sparseArray2.clear();
        int i12 = 0;
        while (true) {
            sparseArray = this.M;
            if (i12 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((nw0) sparseArray.valueAt(i12)).f31050s, (nw0) sparseArray.valueAt(i12));
            i12++;
        }
        sparseArray.clear();
        while (paddingLeft < iMin) {
            View childAt = ra1Var2.getChildAt(paddingLeft);
            if (childAt instanceof nw0) {
                nw0 nw0Var = (nw0) childAt;
                int i13 = nw0Var.f31050s;
                n9 n9Var = nw0Var.f31046e;
                if (nw0Var.f31043a == 2) {
                    Object tag = nw0Var.getTag(R.id.parent_tag);
                    Object tag2 = nw0Var.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        n9Var.h(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i11) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        n9Var.setImageDrawable(drawable);
                    }
                    paddingLeft = paddingLeft;
                    iMin = iMin;
                    ra1Var = ra1Var2;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!nw0Var.f31045c) {
                            nw0Var.v = DocumentObject.getSvgThumb((TLRPC.Document) tag3, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(document);
                        paddingLeft = paddingLeft;
                        iMin = iMin;
                        str = null;
                    } else {
                        if (tag3 instanceof TLRPC.PhotoSize) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                            if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                                i10 = stickerSet.thumb_version;
                                if (!nw0Var.f31045c) {
                                    ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                    nw0Var.v = DocumentObject.getSvgThumb(arrayList, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                                }
                            } else {
                                i10 = 0;
                            }
                            str = photoSize.type;
                            forSticker = ImageLocation.getForSticker(photoSize, document, i10);
                        } else {
                            paddingLeft = paddingLeft;
                            iMin = iMin;
                        }
                        ra1Var = ra1Var2;
                    }
                    if (!nw0Var.f31045c && nw0Var.v == null && document != null) {
                        nw0Var.v = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f);
                    }
                    if (forSticker == null) {
                        ra1Var = ra1Var2;
                    } else {
                        nw0Var.f31045c = true;
                        SvgHelper.SvgDrawable svgDrawable = nw0Var.v;
                        boolean zIsEnabled = LiteMode.isEnabled(1);
                        String str4 = !zIsEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            ra1Var = ra1Var2;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                if (str == null) {
                                    if (!zIsEnabled) {
                                        n9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                                    } else if (svgDrawable != null) {
                                        n9Var.n(ImageLocation.getForDocument(document), str4, svgDrawable, tag4);
                                    } else {
                                        obj3 = tag4;
                                        n9Var.j(ImageLocation.getForDocument(document), str4, forSticker, null, 0, obj3);
                                        obj2 = obj3;
                                    }
                                    obj2 = tag4;
                                } else {
                                    obj2 = tag4;
                                    str3 = str4;
                                    if (svgDrawable != null) {
                                        n9Var.n(forSticker, str3, svgDrawable, obj2);
                                    } else {
                                        n9Var.j(forSticker, str3, null, null, 0, obj2);
                                    }
                                }
                            }
                            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                                str2 = ((TLRPC.TL_messages_stickerSet) obj2).set.title;
                            } else {
                                str2 = null;
                            }
                            nw0Var.h.setText(str2);
                        } else {
                            ra1Var = ra1Var2;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            String str5 = str4;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    obj = tag4;
                                    n9Var.i(forSticker, str5, "tgs", svgDrawable, obj);
                                } else {
                                    obj = tag4;
                                    n9Var.i(forSticker, str5, "webp", svgDrawable, obj);
                                }
                                obj2 = obj;
                            } else if (svgDrawable != null) {
                                n9Var.n(forSticker, str5, svgDrawable, tag4);
                                obj2 = tag4;
                            } else {
                                obj3 = tag4;
                                n9Var.j(forSticker, str5, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                        } else if (str == null) {
                            if (!zIsEnabled) {
                                n9Var.n(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                            } else if (svgDrawable != null) {
                                n9Var.n(ImageLocation.getForDocument(document), str4, svgDrawable, tag4);
                            } else {
                                obj3 = tag4;
                                n9Var.j(ImageLocation.getForDocument(document), str4, forSticker, null, 0, obj3);
                                obj2 = obj3;
                            }
                            obj2 = tag4;
                        } else {
                            obj2 = tag4;
                            str3 = str4;
                            if (svgDrawable != null) {
                                n9Var.n(forSticker, str3, svgDrawable, obj2);
                            } else {
                                n9Var.j(forSticker, str3, null, null, 0, obj2);
                            }
                        }
                        if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                            str2 = ((TLRPC.TL_messages_stickerSet) obj2).set.title;
                        } else {
                            str2 = null;
                        }
                        nw0Var.h.setText(str2);
                    }
                }
                sparseArray.put(i13, nw0Var);
                sparseArray2.remove(i13);
            } else {
                paddingLeft = paddingLeft;
                iMin = iMin;
                ra1Var = ra1Var2;
            }
            paddingLeft++;
            iMin = iMin;
            ra1Var2 = ra1Var;
            i11 = 1;
        }
        for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
            if (((nw0) sparseArray2.valueAt(i14)) != this.f33462s) {
                ((nw0) sparseArray2.valueAt(i14)).f31046e.setImageDrawable(null);
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
        int i14 = this.f33454i0;
        if (i14 >= 0) {
            scrollTo(i14, 0);
            this.f33454i0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        n();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return f(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void q() {
        for (int i10 = 0; i10 < this.f33464x; i10++) {
            View childAt = this.f33448e.getChildAt(i10);
            if (this.f33463w) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.f33445c);
            }
        }
    }

    public void setCurrentPosition(int i10) {
        this.f33465y = i10;
    }

    public void setDelegate(tl0 tl0Var) {
        this.f33450f = tl0Var;
    }

    public void setDragEnabled(boolean z10) {
        this.O = z10;
    }

    public void setImageReceiversLayerNum(int i10) {
        this.f33441a = i10;
    }

    public void setIndicatorColor(int i10) {
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f33463w = z10;
        requestLayout();
    }

    public void setType(ul0 ul0Var) {
        if (ul0Var == null || this.f33443b == ul0Var) {
            return;
        }
        this.f33443b = ul0Var;
        int iOrdinal = ul0Var.ordinal();
        GradientDrawable gradientDrawable = this.G;
        if (iOrdinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, 0.0f, 0.0f, 0.0f, 0.0f});
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
