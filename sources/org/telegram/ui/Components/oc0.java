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

public final class oc0 extends HorizontalScrollView {
    public int A;
    public int B;
    public int C;
    public final org.telegram.ui.ActionBar.c6 D;
    public int E;
    public final y5 F;
    public final y5 G;

    public final LinearLayout.LayoutParams f31250a;

    public final jh.f5 f31251b;

    public m2.e f31252c;
    public final LinearLayout d;

    public m2.g f31253e;

    public int f31254f;
    public int h;

    public float f31255n;

    public final Paint f31256r;

    public int f31257s;
    public int v;

    public boolean f31258w;

    public int f31259x;

    public int f31260y;

    public oc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31251b = new jh.f5(1, this);
        this.h = 0;
        this.f31255n = 0.0f;
        this.f31257s = -10066330;
        this.v = 436207616;
        this.f31258w = false;
        this.f31259x = AndroidUtilities.dp(52.0f);
        this.f31260y = AndroidUtilities.dp(8.0f);
        this.A = AndroidUtilities.dp(2.0f);
        this.B = AndroidUtilities.dp(12.0f);
        this.C = AndroidUtilities.dp(24.0f);
        this.E = 0;
        er erVar = er.h;
        this.F = new y5(this, 350L, erVar);
        this.G = new y5(this, 350L, erVar);
        this.D = c6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f31256r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f31250a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(oc0 oc0Var, int i10, int i11) {
        View childAt;
        if (oc0Var.f31254f == 0 || (childAt = oc0Var.d.getChildAt(i10)) == null) {
            return;
        }
        int left = childAt.getLeft() + i11;
        if (i10 > 0 || i11 > 0) {
            left -= oc0Var.f31259x;
        }
        if (left != oc0Var.E) {
            oc0Var.E = left;
            oc0Var.scrollTo(left, 0);
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        nc0 nc0Var = new nc0(this, getContext(), i10);
        nc0Var.setTextSize(1, 14.0f);
        nc0Var.setTypeface(AndroidUtilities.bold());
        nc0Var.setTextColor(c(0.6f));
        nc0Var.setFocusable(true);
        nc0Var.setGravity(17);
        nc0Var.setText(charSequence);
        h7.b6.b(nc0Var, 0.025f, 1.2f);
        nc0Var.setOnClickListener(new hh.z0(this, i10, 10));
        nc0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(nc0Var, h7.z5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        nc0Var.setSelected(i10 == this.h);
    }

    public final int c(float f10) {
        return i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.D), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f31254f = this.f31253e.getAdapter().b();
        for (int i10 = 0; i10 < this.f31254f; i10++) {
            if (this.f31253e.getAdapter() instanceof mc0) {
                ((mc0) this.f31253e.getAdapter()).getClass();
                b(i10, this.f31253e.getAdapter().d(i10));
            } else {
                b(i10, this.f31253e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new l.d(this, 4));
    }

    public final void e() {
        int i10 = 0;
        while (i10 < this.f31254f) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f31250a);
            if (this.f31258w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f31253e.getAdapter() instanceof mc0) {
                ((qx) ((mc0) this.f31253e.getAdapter())).getClass();
                int iDp = AndroidUtilities.dp(i10 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(iDp, 0, iDp, 0);
            } else {
                int i11 = this.C;
                childAt.setPadding(i11, 0, i11, 0);
            }
            i10++;
        }
    }

    public int getDividerPadding() {
        return this.B;
    }

    public int getIndicatorColor() {
        return this.f31257s;
    }

    public int getIndicatorHeight() {
        return this.f31260y;
    }

    public int getScrollOffset() {
        return this.f31259x;
    }

    public boolean getShouldExpand() {
        return this.f31258w;
    }

    public int getTabPaddingLeftRight() {
        return this.C;
    }

    public int getUnderlineColor() {
        return this.v;
    }

    public int getUnderlineHeight() {
        return this.A;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fD;
        float fD2;
        int i10;
        if (isInEditMode() || this.f31254f == 0) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i11 = this.A;
        LinearLayout linearLayout = this.d;
        Paint paint = this.f31256r;
        if (i11 != 0) {
            paint.setColor(this.v);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, height - this.A, linearLayout.getWidth(), height);
            float f10 = this.A / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f11 = this.f31255n;
            y5 y5Var = this.G;
            y5 y5Var2 = this.F;
            if (f11 <= 0.0f || (i10 = this.h) >= this.f31254f - 1) {
                fD = y5Var2.d(paddingLeft, false);
                fD2 = y5Var.d(right, false);
            } else {
                View childAt2 = linearLayout.getChildAt(i10 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f12 = this.f31255n;
                float f13 = 1.0f - f12;
                fD = (paddingLeft * f13) + (paddingLeft2 * f12);
                fD2 = (f13 * right) + (f12 * right2);
                y5Var2.d(fD, true);
                y5Var.d(fD2, true);
                if (childAt instanceof nc0) {
                    nc0 nc0Var = (nc0) childAt;
                    nc0Var.setTextColor(nc0Var.f30951a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f31255n)));
                }
                if (childAt2 instanceof nc0) {
                    nc0 nc0Var2 = (nc0) childAt2;
                    nc0Var2.setTextColor(nc0Var2.f30951a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f31255n)));
                }
            }
            if (this.f31260y != 0) {
                paint.setColor(this.f31257s);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fD - AndroidUtilities.dp(11.0f), getPaddingTop(), fD2 + AndroidUtilities.dp(11.0f), height - getPaddingBottom());
                rectF2.offset(getPaddingLeft(), 0.0f);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f31258w || View.MeasureSpec.getMode(i10) == 0) {
            return;
        }
        this.d.measure(getMeasuredWidth() | 1073741824, i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.f31258w) {
            return;
        }
        post(new mb0(this, 3));
    }

    public void setDividerPadding(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f31257s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f31257s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f31260y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(m2.e eVar) {
        this.f31252c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f31259x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f31258w = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.C = i10;
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
        this.A = i10;
        invalidate();
    }

    public void setViewPager(m2.g gVar) {
        this.f31253e = gVar;
        if (gVar.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        gVar.setOnPageChangeListener(this.f31251b);
        d();
    }
}
