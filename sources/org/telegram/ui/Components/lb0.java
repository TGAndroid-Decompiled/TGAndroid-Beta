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
public final class lb0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.e6 I;
    public int J;
    public final u5 K;
    public final u5 L;
    public final LinearLayout.LayoutParams f35676a;
    public final ei.n5 f35677b;
    public b5.h f35678c;
    public final LinearLayout d;
    public b5.l f35679e;
    public int f35680f;
    public int h;
    public float f35681n;
    public final Paint f35682r;
    public int f35683s;
    public int f35684w;
    public boolean f35685x;
    public int f35686y;

    public lb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35677b = new ei.n5(1, this);
        this.h = 0;
        this.f35681n = 0.0f;
        this.f35683s = -10066330;
        this.f35684w = 436207616;
        this.f35685x = false;
        this.f35686y = org.telegram.messenger.g0.L(52.0f);
        this.E = org.telegram.messenger.g0.L(8.0f);
        this.F = org.telegram.messenger.g0.L(2.0f);
        this.G = org.telegram.messenger.g0.L(12.0f);
        this.H = org.telegram.messenger.g0.L(24.0f);
        this.J = 0;
        xq xqVar = xq.h;
        this.K = new u5(this, 350L, xqVar);
        this.L = new u5(this, 350L, xqVar);
        this.I = e6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f35682r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f35676a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(lb0 lb0Var, int i3, int i10) {
        View childAt;
        if (lb0Var.f35680f != 0 && (childAt = lb0Var.d.getChildAt(i3)) != null) {
            int left = childAt.getLeft() + i10;
            if (i3 > 0 || i10 > 0) {
                left -= lb0Var.f35686y;
            }
            if (left != lb0Var.J) {
                lb0Var.J = left;
                lb0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i3, CharSequence charSequence) {
        kb0 kb0Var = new kb0(this, getContext(), i3);
        boolean z10 = true;
        kb0Var.setTextSize(1, 14.0f);
        kb0Var.setTypeface(org.telegram.messenger.g0.o());
        kb0Var.setTextColor(c(0.6f));
        kb0Var.setFocusable(true);
        kb0Var.setGravity(17);
        kb0Var.setText(charSequence);
        b8.pf.b(kb0Var, 0.025f, 1.2f);
        kb0Var.setOnClickListener(new bi.q(this, i3, 15));
        kb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(kb0Var, b8.mf.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i3 != this.h) {
            z10 = false;
        }
        kb0Var.setSelected(z10);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.I), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f35680f = this.f35679e.getAdapter().b();
        for (int i3 = 0; i3 < this.f35680f; i3++) {
            if (this.f35679e.getAdapter() instanceof yw) {
                ((yw) this.f35679e.getAdapter()).getClass();
                b(i3, this.f35679e.getAdapter().d(i3));
            } else {
                b(i3, this.f35679e.getAdapter().d(i3));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        float f10;
        for (int i3 = 0; i3 < this.f35680f; i3++) {
            View childAt = this.d.getChildAt(i3);
            childAt.setLayoutParams(this.f35676a);
            if (this.f35685x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f35679e.getAdapter() instanceof yw) {
                ((yw) this.f35679e.getAdapter()).getClass();
                if (i3 == 1) {
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
        return this.f35683s;
    }

    public int getIndicatorHeight() {
        return this.E;
    }

    public int getScrollOffset() {
        return this.f35686y;
    }

    public boolean getShouldExpand() {
        return this.f35685x;
    }

    public int getTabPaddingLeftRight() {
        return this.H;
    }

    public int getUnderlineColor() {
        return this.f35684w;
    }

    public int getUnderlineHeight() {
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10;
        float e11;
        int i3;
        if (!isInEditMode() && this.f35680f != 0) {
            int height = getHeight();
            int i10 = this.F;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f35682r;
            if (i10 != 0) {
                paint.setColor(this.f35684w);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
                float f10 = this.F / 2.0f;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i11 = (this.f35681n > 0.0f ? 1 : (this.f35681n == 0.0f ? 0 : -1));
                u5 u5Var = this.L;
                u5 u5Var2 = this.K;
                if (i11 > 0 && (i3 = this.h) < this.f35680f - 1) {
                    View childAt2 = linearLayout.getChildAt(i3 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f35681n;
                    float f12 = 1.0f - f11;
                    e10 = (paddingLeft * f12) + (paddingLeft2 * f11);
                    e11 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    u5Var2.e(true, e10);
                    u5Var.e(true, e11);
                    if (childAt instanceof kb0) {
                        kb0 kb0Var = (kb0) childAt;
                        kb0Var.setTextColor(kb0Var.f35361a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.f35681n)));
                    }
                    if (childAt2 instanceof kb0) {
                        kb0 kb0Var2 = (kb0) childAt2;
                        kb0Var2.setTextColor(kb0Var2.f35361a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.f35681n)));
                    }
                } else {
                    e10 = u5Var2.e(false, paddingLeft);
                    e11 = u5Var.e(false, right);
                }
                if (this.E != 0) {
                    paint.setColor(this.f35683s);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f35685x && View.MeasureSpec.getMode(i3) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (!this.f35685x) {
            post(new jb0(this, 0));
        }
    }

    public void setDividerPadding(int i3) {
        this.G = i3;
        invalidate();
    }

    public void setIndicatorColor(int i3) {
        this.f35683s = i3;
        invalidate();
    }

    public void setIndicatorColorResource(int i3) {
        this.f35683s = getResources().getColor(i3);
        invalidate();
    }

    public void setIndicatorHeight(int i3) {
        this.E = i3;
        invalidate();
    }

    public void setOnPageChangeListener(b5.h hVar) {
        this.f35678c = hVar;
    }

    public void setScrollOffset(int i3) {
        this.f35686y = i3;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f35685x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i3) {
        this.H = i3;
        e();
    }

    public void setUnderlineColor(int i3) {
        this.f35684w = i3;
        invalidate();
    }

    public void setUnderlineColorResource(int i3) {
        this.f35684w = getResources().getColor(i3);
        invalidate();
    }

    public void setUnderlineHeight(int i3) {
        this.F = i3;
        invalidate();
    }

    public void setViewPager(b5.l lVar) {
        this.f35679e = lVar;
        if (lVar.getAdapter() != null) {
            lVar.setOnPageChangeListener(this.f35677b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    @Override
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
                try {
                    View childAt = linearLayout.getChildAt(i3);
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
