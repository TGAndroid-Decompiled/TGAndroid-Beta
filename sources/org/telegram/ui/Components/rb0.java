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
public final class rb0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.g6 H;
    public int I;
    public final w5 J;
    public final w5 K;
    public final LinearLayout.LayoutParams f37641a;
    public final di.o5 f37642b;
    public c5.g f37643c;
    public final LinearLayout d;
    public c5.k f37644e;
    public int f37645f;
    public int h;
    public float f37646n;
    public final Paint f37647r;
    public int f37648s;
    public int f37649w;
    public boolean f37650x;
    public int f37651y;

    public rb0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37642b = new di.o5(1, this);
        this.h = 0;
        this.f37646n = 0.0f;
        this.f37648s = -10066330;
        this.f37649w = 436207616;
        this.f37650x = false;
        this.f37651y = org.telegram.messenger.g0.L(52.0f);
        this.D = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(2.0f);
        this.F = org.telegram.messenger.g0.L(12.0f);
        this.G = org.telegram.messenger.g0.L(24.0f);
        this.I = 0;
        xq xqVar = xq.h;
        this.J = new w5(this, 350L, xqVar);
        this.K = new w5(this, 350L, xqVar);
        this.H = g6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f37647r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f37641a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(rb0 rb0Var, int i7, int i10) {
        View childAt;
        if (rb0Var.f37645f != 0 && (childAt = rb0Var.d.getChildAt(i7)) != null) {
            int left = childAt.getLeft() + i10;
            if (i7 > 0 || i10 > 0) {
                left -= rb0Var.f37651y;
            }
            if (left != rb0Var.I) {
                rb0Var.I = left;
                rb0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i7, CharSequence charSequence) {
        qb0 qb0Var = new qb0(this, getContext(), i7);
        boolean z9 = true;
        qb0Var.setTextSize(1, 14.0f);
        qb0Var.setTypeface(org.telegram.messenger.g0.o());
        qb0Var.setTextColor(c(0.6f));
        qb0Var.setFocusable(true);
        qb0Var.setGravity(17);
        qb0Var.setText(charSequence);
        c8.ka.b(qb0Var, 0.025f, 1.2f);
        qb0Var.setOnClickListener(new ai.v(this, i7, 15));
        qb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(qb0Var, c8.ha.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i7 != this.h) {
            z9 = false;
        }
        qb0Var.setSelected(z9);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Kl, this.H), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f37645f = this.f37644e.getAdapter().b();
        for (int i7 = 0; i7 < this.f37645f; i7++) {
            if (this.f37644e.getAdapter() instanceof ax) {
                ((ax) this.f37644e.getAdapter()).getClass();
                b(i7, this.f37644e.getAdapter().d(i7));
            } else {
                b(i7, this.f37644e.getAdapter().d(i7));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        float f10;
        for (int i7 = 0; i7 < this.f37645f; i7++) {
            View childAt = this.d.getChildAt(i7);
            childAt.setLayoutParams(this.f37641a);
            if (this.f37650x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f37644e.getAdapter() instanceof ax) {
                ((ax) this.f37644e.getAdapter()).getClass();
                if (i7 == 1) {
                    f10 = 12.0f;
                } else {
                    f10 = 18.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i10 = this.G;
                childAt.setPadding(i10, 0, i10, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getIndicatorColor() {
        return this.f37648s;
    }

    public int getIndicatorHeight() {
        return this.D;
    }

    public int getScrollOffset() {
        return this.f37651y;
    }

    public boolean getShouldExpand() {
        return this.f37650x;
    }

    public int getTabPaddingLeftRight() {
        return this.G;
    }

    public int getUnderlineColor() {
        return this.f37649w;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10;
        float e11;
        int i7;
        if (!isInEditMode() && this.f37645f != 0) {
            int height = getHeight();
            int i10 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f37647r;
            if (i10 != 0) {
                paint.setColor(this.f37649w);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
                float f10 = this.E / 2.0f;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i11 = (this.f37646n > 0.0f ? 1 : (this.f37646n == 0.0f ? 0 : -1));
                w5 w5Var = this.K;
                w5 w5Var2 = this.J;
                if (i11 > 0 && (i7 = this.h) < this.f37645f - 1) {
                    View childAt2 = linearLayout.getChildAt(i7 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f37646n;
                    float f12 = 1.0f - f11;
                    e10 = (paddingLeft * f12) + (paddingLeft2 * f11);
                    e11 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    w5Var2.e(true, e10);
                    w5Var.e(true, e11);
                    if (childAt instanceof qb0) {
                        qb0 qb0Var = (qb0) childAt;
                        qb0Var.setTextColor(qb0Var.f37285a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.f37646n)));
                    }
                    if (childAt2 instanceof qb0) {
                        qb0 qb0Var2 = (qb0) childAt2;
                        qb0Var2.setTextColor(qb0Var2.f37285a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.f37646n)));
                    }
                } else {
                    e10 = w5Var2.e(false, paddingLeft);
                    e11 = w5Var.e(false, right);
                }
                if (this.D != 0) {
                    paint.setColor(this.f37648s);
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
        if (this.f37650x && View.MeasureSpec.getMode(i7) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (!this.f37650x) {
            post(new pb0(this, 0));
        }
    }

    public void setDividerPadding(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setIndicatorColor(int i7) {
        this.f37648s = i7;
        invalidate();
    }

    public void setIndicatorColorResource(int i7) {
        this.f37648s = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.D = i7;
        invalidate();
    }

    public void setOnPageChangeListener(c5.g gVar) {
        this.f37643c = gVar;
    }

    public void setScrollOffset(int i7) {
        this.f37651y = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z9) {
        this.f37650x = z9;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i7) {
        this.G = i7;
        e();
    }

    public void setUnderlineColor(int i7) {
        this.f37649w = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.f37649w = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        this.E = i7;
        invalidate();
    }

    public void setViewPager(c5.k kVar) {
        this.f37644e = kVar;
        if (kVar.getAdapter() != null) {
            kVar.setOnPageChangeListener(this.f37642b);
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
