package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class cc0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.h6 I;
    public int J;
    public final d6 K;
    public final d6 L;
    public final LinearLayout.LayoutParams f34179a;
    public final fi.e5 f34180b;
    public c5.h f34181c;
    public final LinearLayout d;
    public c5.l f34182e;
    public int f34183f;
    public int h;
    public float f34184n;
    public final Paint f34185r;
    public int f34186s;
    public int f34187w;
    public boolean f34188x;
    public int f34189y;

    public cc0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f34180b = new fi.e5(1, this);
        this.h = 0;
        this.f34184n = 0.0f;
        this.f34186s = -10066330;
        this.f34187w = 436207616;
        this.f34188x = false;
        this.f34189y = org.telegram.messenger.g0.L(52.0f);
        this.E = org.telegram.messenger.g0.L(8.0f);
        this.F = org.telegram.messenger.g0.L(2.0f);
        this.G = org.telegram.messenger.g0.L(12.0f);
        this.H = org.telegram.messenger.g0.L(24.0f);
        this.J = 0;
        nr nrVar = nr.h;
        this.K = new d6(this, 350L, nrVar);
        this.L = new d6(this, 350L, nrVar);
        this.I = h6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f34185r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f34179a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(cc0 cc0Var, int i7, int i10) {
        View childAt;
        if (cc0Var.f34183f != 0 && (childAt = cc0Var.d.getChildAt(i7)) != null) {
            int left = childAt.getLeft() + i10;
            if (i7 > 0 || i10 > 0) {
                left -= cc0Var.f34189y;
            }
            if (left != cc0Var.J) {
                cc0Var.J = left;
                cc0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i7, CharSequence charSequence) {
        bc0 bc0Var = new bc0(this, getContext(), i7);
        boolean z10 = true;
        bc0Var.setTextSize(1, 14.0f);
        bc0Var.setTypeface(org.telegram.messenger.g0.o());
        bc0Var.setTextColor(c(0.6f));
        bc0Var.setFocusable(true);
        bc0Var.setGravity(17);
        bc0Var.setText(charSequence);
        c8.ra.b(bc0Var, 0.025f, 1.2f);
        bc0Var.setOnClickListener(new ci.q(this, i7, 17));
        bc0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(bc0Var, c8.ma.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i7 != this.h) {
            z10 = false;
        }
        bc0Var.setSelected(z10);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, this.I), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f34183f = this.f34182e.getAdapter().b();
        for (int i7 = 0; i7 < this.f34183f; i7++) {
            if (this.f34182e.getAdapter() instanceof nx) {
                ((nx) this.f34182e.getAdapter()).getClass();
                b(i7, this.f34182e.getAdapter().d(i7));
            } else {
                b(i7, this.f34182e.getAdapter().d(i7));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        float f10;
        for (int i7 = 0; i7 < this.f34183f; i7++) {
            View childAt = this.d.getChildAt(i7);
            childAt.setLayoutParams(this.f34179a);
            if (this.f34188x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f34182e.getAdapter() instanceof nx) {
                ((nx) this.f34182e.getAdapter()).getClass();
                if (i7 == 1) {
                    f10 = 12.0f;
                } else {
                    f10 = 18.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i10 = this.H;
                childAt.setPadding(i10, 0, i10, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getIndicatorColor() {
        return this.f34186s;
    }

    public int getIndicatorHeight() {
        return this.E;
    }

    public int getScrollOffset() {
        return this.f34189y;
    }

    public boolean getShouldExpand() {
        return this.f34188x;
    }

    public int getTabPaddingLeftRight() {
        return this.H;
    }

    public int getUnderlineColor() {
        return this.f34187w;
    }

    public int getUnderlineHeight() {
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10;
        float e11;
        int i7;
        if (!isInEditMode() && this.f34183f != 0) {
            int height = getHeight();
            int i10 = this.F;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f34185r;
            if (i10 != 0) {
                paint.setColor(this.f34187w);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
                float f10 = this.F / 2.0f;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i11 = (this.f34184n > 0.0f ? 1 : (this.f34184n == 0.0f ? 0 : -1));
                d6 d6Var = this.L;
                d6 d6Var2 = this.K;
                if (i11 > 0 && (i7 = this.h) < this.f34183f - 1) {
                    View childAt2 = linearLayout.getChildAt(i7 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f34184n;
                    float f12 = 1.0f - f11;
                    e10 = (paddingLeft * f12) + (paddingLeft2 * f11);
                    e11 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    d6Var2.e(true, e10);
                    d6Var.e(true, e11);
                    if (childAt instanceof bc0) {
                        bc0 bc0Var = (bc0) childAt;
                        bc0Var.setTextColor(bc0Var.f33832a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.f34184n)));
                    }
                    if (childAt2 instanceof bc0) {
                        bc0 bc0Var2 = (bc0) childAt2;
                        bc0Var2.setTextColor(bc0Var2.f33832a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.f34184n)));
                    }
                } else {
                    e10 = d6Var2.e(false, paddingLeft);
                    e11 = d6Var.e(false, right);
                }
                if (this.E != 0) {
                    paint.setColor(this.f34186s);
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(e10 - org.telegram.messenger.g0.L(11.0f), getPaddingTop(), e11 + org.telegram.messenger.g0.L(11.0f), height - getPaddingBottom());
                    rectF2.offset(getPaddingLeft(), 0.0f);
                    canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                }
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f34188x && View.MeasureSpec.getMode(i7) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (!this.f34188x) {
            post(new hb0(this, 2));
        }
    }

    public void setDividerPadding(int i7) {
        this.G = i7;
        invalidate();
    }

    public void setIndicatorColor(int i7) {
        this.f34186s = i7;
        invalidate();
    }

    public void setIndicatorColorResource(int i7) {
        this.f34186s = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.E = i7;
        invalidate();
    }

    public void setOnPageChangeListener(c5.h hVar) {
        this.f34181c = hVar;
    }

    public void setScrollOffset(int i7) {
        this.f34189y = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f34188x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i7) {
        this.H = i7;
        e();
    }

    public void setUnderlineColor(int i7) {
        this.f34187w = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.f34187w = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setViewPager(c5.l lVar) {
        this.f34182e = lVar;
        if (lVar.getAdapter() != null) {
            lVar.setOnPageChangeListener(this.f34180b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    @Override
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
                try {
                    View childAt = linearLayout.getChildAt(i7);
                    childAt.setSelected(childAt.isSelected());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
