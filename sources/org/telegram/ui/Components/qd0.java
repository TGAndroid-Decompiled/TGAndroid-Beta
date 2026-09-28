package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qd0 extends HorizontalScrollView {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.d6 H;
    public int I;
    public final e6 J;
    public final e6 K;
    public final LinearLayout.LayoutParams f27668a;
    public final ai.n7 f27669b;
    public z4.e f27670c;
    public final LinearLayout d;
    public z4.g e;
    public int f27671f;
    public int h;
    public float f27672n;
    public final Paint f27673r;
    public int f27674s;
    public int v;
    public boolean f27675w;
    public int f27676x;
    public int f27677y;

    public qd0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27669b = new ai.n7(this, 2);
        this.h = 0;
        this.f27672n = 0.0f;
        this.f27674s = -10066330;
        this.v = 436207616;
        this.f27675w = false;
        this.f27676x = AndroidUtilities.dp(52.0f);
        this.f27677y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        sr srVar = sr.h;
        this.J = new e6(this, 350L, srVar);
        this.K = new e6(this, 350L, srVar);
        this.H = d6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f27673r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f27668a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(qd0 qd0Var, int i10, int i11) {
        View childAt;
        if (qd0Var.f27671f != 0 && (childAt = qd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= qd0Var.f27676x;
            }
            if (left != qd0Var.I) {
                qd0Var.I = left;
                qd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        pd0 pd0Var = new pd0(this, getContext(), i10);
        boolean z10 = true;
        pd0Var.setTextSize(1, 14.0f);
        pd0Var.setTypeface(AndroidUtilities.bold());
        pd0Var.setTextColor(c(0.6f));
        pd0Var.setFocusable(true);
        pd0Var.setGravity(17);
        pd0Var.setText(charSequence);
        w7.a6.b(pd0Var, 0.025f, 1.2f);
        pd0Var.setOnClickListener(new ci.n4(this, i10, 11));
        pd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(pd0Var, w7.y5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        pd0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f27671f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f27671f; i10++) {
            if (this.e.getAdapter() instanceof od0) {
                ((od0) this.e.getAdapter()).getClass();
                b(i10, this.e.getAdapter().d(i10));
            } else {
                b(i10, this.e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(this, 5));
    }

    public final void e() {
        float f7;
        for (int i10 = 0; i10 < this.f27671f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f27668a);
            if (this.f27675w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof od0) {
                ((gy) ((od0) this.e.getAdapter())).getClass();
                if (i10 == 1) {
                    f7 = 12.0f;
                } else {
                    f7 = 18.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                childAt.setPadding(dp, 0, dp, 0);
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
        return this.f27674s;
    }

    public int getIndicatorHeight() {
        return this.f27677y;
    }

    public int getScrollOffset() {
        return this.f27676x;
    }

    public boolean getShouldExpand() {
        return this.f27675w;
    }

    public int getTabPaddingLeftRight() {
        return this.G;
    }

    public int getUnderlineColor() {
        return this.v;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d;
        float d10;
        int i10;
        if (!isInEditMode() && this.f27671f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f27673r;
            if (i11 != 0) {
                paint.setColor(this.v);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
                float f7 = this.E / 2.0f;
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                float f10 = this.f27672n;
                e6 e6Var = this.K;
                e6 e6Var2 = this.J;
                if (f10 > 0.0f && (i10 = this.h) < this.f27671f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f27672n;
                    float f12 = 1.0f - f11;
                    d = (paddingLeft * f12) + (paddingLeft2 * f11);
                    d10 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    e6Var2.d(d, true);
                    e6Var.d(d10, true);
                    if (childAt instanceof pd0) {
                        pd0 pd0Var = (pd0) childAt;
                        pd0Var.setTextColor(pd0Var.f27339a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f27672n)));
                    }
                    if (childAt2 instanceof pd0) {
                        pd0 pd0Var2 = (pd0) childAt2;
                        pd0Var2.setTextColor(pd0Var2.f27339a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f27672n)));
                    }
                } else {
                    d = e6Var2.d(paddingLeft, false);
                    d10 = e6Var.d(right, false);
                }
                if (this.f27677y != 0) {
                    paint.setColor(this.f27674s);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(d - AndroidUtilities.dp(11.0f), getPaddingTop(), d10 + AndroidUtilities.dp(11.0f), height - getPaddingBottom());
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
        if (this.f27675w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f27675w) {
            post(new kc0(this, 4));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f27674s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f27674s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f27677y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f27670c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f27676x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f27675w = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.G = i10;
        e();
    }

    public void setUnderlineColor(int i10) {
        this.v = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.v = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        this.E = i10;
        invalidate();
    }

    public void setViewPager(z4.g gVar) {
        this.e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f27669b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
