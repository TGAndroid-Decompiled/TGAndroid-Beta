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
public final class bc0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.i6 I;
    public int J;
    public final c6 K;
    public final c6 L;
    public final LinearLayout.LayoutParams f33653a;
    public final fi.d5 f33654b;
    public c5.h f33655c;
    public final LinearLayout d;
    public c5.l f33656e;
    public int f33657f;
    public int h;
    public float f33658n;
    public final Paint f33659r;
    public int f33660s;
    public int f33661w;
    public boolean f33662x;
    public int f33663y;

    public bc0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f33654b = new fi.d5(1, this);
        this.h = 0;
        this.f33658n = 0.0f;
        this.f33660s = -10066330;
        this.f33661w = 436207616;
        this.f33662x = false;
        this.f33663y = org.telegram.messenger.g0.L(52.0f);
        this.E = org.telegram.messenger.g0.L(8.0f);
        this.F = org.telegram.messenger.g0.L(2.0f);
        this.G = org.telegram.messenger.g0.L(12.0f);
        this.H = org.telegram.messenger.g0.L(24.0f);
        this.J = 0;
        lr lrVar = lr.h;
        this.K = new c6(this, 350L, lrVar);
        this.L = new c6(this, 350L, lrVar);
        this.I = i6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f33659r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f33653a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(bc0 bc0Var, int i7, int i10) {
        View childAt;
        if (bc0Var.f33657f != 0 && (childAt = bc0Var.d.getChildAt(i7)) != null) {
            int left = childAt.getLeft() + i10;
            if (i7 > 0 || i10 > 0) {
                left -= bc0Var.f33663y;
            }
            if (left != bc0Var.J) {
                bc0Var.J = left;
                bc0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i7, CharSequence charSequence) {
        ac0 ac0Var = new ac0(this, getContext(), i7);
        boolean z10 = true;
        ac0Var.setTextSize(1, 14.0f);
        ac0Var.setTypeface(org.telegram.messenger.g0.o());
        ac0Var.setTextColor(c(0.6f));
        ac0Var.setFocusable(true);
        ac0Var.setGravity(17);
        ac0Var.setText(charSequence);
        c8.ra.b(ac0Var, 0.025f, 1.2f);
        ac0Var.setOnClickListener(new ci.q(this, i7, 17));
        ac0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(ac0Var, c8.ma.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i7 != this.h) {
            z10 = false;
        }
        ac0Var.setSelected(z10);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, this.I), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f33657f = this.f33656e.getAdapter().b();
        for (int i7 = 0; i7 < this.f33657f; i7++) {
            if (this.f33656e.getAdapter() instanceof lx) {
                ((lx) this.f33656e.getAdapter()).getClass();
                b(i7, this.f33656e.getAdapter().d(i7));
            } else {
                b(i7, this.f33656e.getAdapter().d(i7));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        float f10;
        for (int i7 = 0; i7 < this.f33657f; i7++) {
            View childAt = this.d.getChildAt(i7);
            childAt.setLayoutParams(this.f33653a);
            if (this.f33662x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f33656e.getAdapter() instanceof lx) {
                ((lx) this.f33656e.getAdapter()).getClass();
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
        return this.f33660s;
    }

    public int getIndicatorHeight() {
        return this.E;
    }

    public int getScrollOffset() {
        return this.f33663y;
    }

    public boolean getShouldExpand() {
        return this.f33662x;
    }

    public int getTabPaddingLeftRight() {
        return this.H;
    }

    public int getUnderlineColor() {
        return this.f33661w;
    }

    public int getUnderlineHeight() {
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10;
        float e11;
        int i7;
        if (!isInEditMode() && this.f33657f != 0) {
            int height = getHeight();
            int i10 = this.F;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f33659r;
            if (i10 != 0) {
                paint.setColor(this.f33661w);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
                float f10 = this.F / 2.0f;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i11 = (this.f33658n > 0.0f ? 1 : (this.f33658n == 0.0f ? 0 : -1));
                c6 c6Var = this.L;
                c6 c6Var2 = this.K;
                if (i11 > 0 && (i7 = this.h) < this.f33657f - 1) {
                    View childAt2 = linearLayout.getChildAt(i7 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f33658n;
                    float f12 = 1.0f - f11;
                    e10 = (paddingLeft * f12) + (paddingLeft2 * f11);
                    e11 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    c6Var2.e(true, e10);
                    c6Var.e(true, e11);
                    if (childAt instanceof ac0) {
                        ac0 ac0Var = (ac0) childAt;
                        ac0Var.setTextColor(ac0Var.f33330a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.f33658n)));
                    }
                    if (childAt2 instanceof ac0) {
                        ac0 ac0Var2 = (ac0) childAt2;
                        ac0Var2.setTextColor(ac0Var2.f33330a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.f33658n)));
                    }
                } else {
                    e10 = c6Var2.e(false, paddingLeft);
                    e11 = c6Var.e(false, right);
                }
                if (this.E != 0) {
                    paint.setColor(this.f33660s);
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
        if (this.f33662x && View.MeasureSpec.getMode(i7) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (!this.f33662x) {
            post(new gb0(this, 2));
        }
    }

    public void setDividerPadding(int i7) {
        this.G = i7;
        invalidate();
    }

    public void setIndicatorColor(int i7) {
        this.f33660s = i7;
        invalidate();
    }

    public void setIndicatorColorResource(int i7) {
        this.f33660s = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.E = i7;
        invalidate();
    }

    public void setOnPageChangeListener(c5.h hVar) {
        this.f33655c = hVar;
    }

    public void setScrollOffset(int i7) {
        this.f33663y = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f33662x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i7) {
        this.H = i7;
        e();
    }

    public void setUnderlineColor(int i7) {
        this.f33661w = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.f33661w = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setViewPager(c5.l lVar) {
        this.f33656e = lVar;
        if (lVar.getAdapter() != null) {
            lVar.setOnPageChangeListener(this.f33654b);
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
