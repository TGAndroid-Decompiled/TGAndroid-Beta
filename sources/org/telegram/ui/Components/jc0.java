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
public final class jc0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.p6 H;
    public int I;
    public final t5 J;
    public final t5 K;
    public final LinearLayout.LayoutParams f27315a;
    public final hc0 f27316b;
    public z4.e f27317c;
    public final LinearLayout d;
    public z4.g e;
    public int f27318f;
    public int h;
    public float f27319n;
    public final Paint f27320r;
    public int f27321s;
    public int f27322w;
    public boolean f27323x;
    public int f27324y;

    public jc0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f27316b = new hc0(0, this);
        this.h = 0;
        this.f27319n = 0.0f;
        this.f27321s = -10066330;
        this.f27322w = 436207616;
        this.f27323x = false;
        this.f27324y = org.telegram.messenger.i0.L(52.0f);
        this.D = org.telegram.messenger.i0.L(8.0f);
        this.E = org.telegram.messenger.i0.L(2.0f);
        this.F = org.telegram.messenger.i0.L(12.0f);
        this.G = org.telegram.messenger.i0.L(24.0f);
        this.I = 0;
        gr grVar = gr.h;
        this.J = new t5(this, 350L, grVar);
        this.K = new t5(this, 350L, grVar);
        this.H = p6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f27320r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f27315a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(jc0 jc0Var, int i10, int i11) {
        View childAt;
        if (jc0Var.f27318f != 0 && (childAt = jc0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= jc0Var.f27324y;
            }
            if (left != jc0Var.I) {
                jc0Var.I = left;
                jc0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        ic0 ic0Var = new ic0(this, getContext(), i10);
        boolean z10 = true;
        ic0Var.setTextSize(1, 14.0f);
        ic0Var.setTypeface(org.telegram.messenger.i0.o());
        ic0Var.setTextColor(c(0.6f));
        ic0Var.setFocusable(true);
        ic0Var.setGravity(17);
        ic0Var.setText(charSequence);
        w7.e6.b(ic0Var, 0.025f, 1.2f);
        ic0Var.setOnClickListener(new bh.f(this, i10, 10));
        ic0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        this.d.addView(ic0Var, w7.b6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        ic0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f27318f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f27318f; i10++) {
            if (this.e.getAdapter() instanceof ox) {
                ((ox) this.e.getAdapter()).getClass();
                b(i10, this.e.getAdapter().d(i10));
            } else {
                b(i10, this.e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        float f7;
        for (int i10 = 0; i10 < this.f27318f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f27315a);
            if (this.f27323x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof ox) {
                ((ox) this.e.getAdapter()).getClass();
                if (i10 == 1) {
                    f7 = 12.0f;
                } else {
                    f7 = 18.0f;
                }
                int L = org.telegram.messenger.i0.L(f7);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i11 = this.G;
                childAt.setPadding(i11, 0, i11, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getIndicatorColor() {
        return this.f27321s;
    }

    public int getIndicatorHeight() {
        return this.D;
    }

    public int getScrollOffset() {
        return this.f27324y;
    }

    public boolean getShouldExpand() {
        return this.f27323x;
    }

    public int getTabPaddingLeftRight() {
        return this.G;
    }

    public int getUnderlineColor() {
        return this.f27322w;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e;
        float e7;
        int i10;
        if (!isInEditMode() && this.f27318f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f27320r;
            if (i11 != 0) {
                paint.setColor(this.f27322w);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
                float f7 = this.E / 2.0f;
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i12 = (this.f27319n > 0.0f ? 1 : (this.f27319n == 0.0f ? 0 : -1));
                t5 t5Var = this.K;
                t5 t5Var2 = this.J;
                if (i12 > 0 && (i10 = this.h) < this.f27318f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f10 = this.f27319n;
                    float f11 = 1.0f - f10;
                    e = (paddingLeft * f11) + (paddingLeft2 * f10);
                    e7 = (f11 * right) + (f10 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    t5Var2.e(true, e);
                    t5Var.e(true, e7);
                    if (childAt instanceof ic0) {
                        ic0 ic0Var = (ic0) childAt;
                        ic0Var.setTextColor(ic0Var.f26965a.c(org.telegram.messenger.i0.T1(0.6f, 0.8f, 1.0f - this.f27319n)));
                    }
                    if (childAt2 instanceof ic0) {
                        ic0 ic0Var2 = (ic0) childAt2;
                        ic0Var2.setTextColor(ic0Var2.f26965a.c(org.telegram.messenger.i0.T1(0.6f, 0.8f, this.f27319n)));
                    }
                } else {
                    e = t5Var2.e(false, paddingLeft);
                    e7 = t5Var.e(false, right);
                }
                if (this.D != 0) {
                    paint.setColor(this.f27321s);
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(e - org.telegram.messenger.i0.L(11.0f), getPaddingTop(), e7 + org.telegram.messenger.i0.L(11.0f), height - getPaddingBottom());
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f27323x && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f27323x) {
            post(new eb0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f27321s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f27321s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.D = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f27317c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f27324y = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f27323x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.G = i10;
        e();
    }

    public void setUnderlineColor(int i10) {
        this.f27322w = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.f27322w = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        this.E = i10;
        invalidate();
    }

    public void setViewPager(z4.g gVar) {
        this.e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f27316b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    @Override
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
                try {
                    View childAt = linearLayout.getChildAt(i10);
                    childAt.setSelected(childAt.isSelected());
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
