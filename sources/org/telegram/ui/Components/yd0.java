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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yd0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.g6 H;
    public int I;
    public final d6 J;
    public final d6 K;
    public final LinearLayout.LayoutParams f32889a;
    public final ci.w5 f32890b;
    public z4.f f32891c;
    public final LinearLayout d;
    public z4.h e;
    public int f32892f;
    public int h;
    public float f32893n;
    public final Paint f32894r;
    public int f32895s;
    public int v;
    public boolean f32896w;
    public int f32897x;
    public int f32898y;

    public yd0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f32890b = new ci.w5(this, 2);
        this.h = 0;
        this.f32893n = 0.0f;
        this.f32895s = -10066330;
        this.v = 436207616;
        this.f32896w = false;
        this.f32897x = AndroidUtilities.dp(52.0f);
        this.f32898y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        zr zrVar = zr.h;
        this.J = new d6(this, 350L, zrVar);
        this.K = new d6(this, 350L, zrVar);
        this.H = g6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f32894r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f32889a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(yd0 yd0Var, int i10, int i11) {
        View childAt;
        if (yd0Var.f32892f != 0 && (childAt = yd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= yd0Var.f32897x;
            }
            if (left != yd0Var.I) {
                yd0Var.I = left;
                yd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        xd0 xd0Var = new xd0(this, getContext(), i10);
        boolean z10 = true;
        xd0Var.setTextSize(1, 14.0f);
        xd0Var.setTypeface(AndroidUtilities.bold());
        xd0Var.setTextColor(c(0.6f));
        xd0Var.setFocusable(true);
        xd0Var.setGravity(17);
        xd0Var.setText(charSequence);
        w7.b6.b(xd0Var, 0.025f, 1.2f);
        xd0Var.setOnClickListener(new ai.n1(this, i10, 13));
        xd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(xd0Var, w7.z5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        xd0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f32892f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f32892f; i10++) {
            if (this.e.getAdapter() instanceof wd0) {
                ((wd0) this.e.getAdapter()).getClass();
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
        for (int i10 = 0; i10 < this.f32892f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f32889a);
            if (this.f32896w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof wd0) {
                ((jy) ((wd0) this.e.getAdapter())).getClass();
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
        return this.f32895s;
    }

    public int getIndicatorHeight() {
        return this.f32898y;
    }

    public int getScrollOffset() {
        return this.f32897x;
    }

    public boolean getShouldExpand() {
        return this.f32896w;
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
        if (!isInEditMode() && this.f32892f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f32894r;
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
                int i12 = (this.f32893n > 0.0f ? 1 : (this.f32893n == 0.0f ? 0 : -1));
                d6 d6Var = this.K;
                d6 d6Var2 = this.J;
                if (i12 > 0 && (i10 = this.h) < this.f32892f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f10 = this.f32893n;
                    float f11 = 1.0f - f10;
                    d = (paddingLeft * f11) + (paddingLeft2 * f10);
                    d10 = (f11 * right) + (f10 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    d6Var2.d(d, true);
                    d6Var.d(d10, true);
                    if (childAt instanceof xd0) {
                        xd0 xd0Var = (xd0) childAt;
                        xd0Var.setTextColor(xd0Var.f32563a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f32893n)));
                    }
                    if (childAt2 instanceof xd0) {
                        xd0 xd0Var2 = (xd0) childAt2;
                        xd0Var2.setTextColor(xd0Var2.f32563a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f32893n)));
                    }
                } else {
                    d = d6Var2.d(paddingLeft, false);
                    d10 = d6Var.d(right, false);
                }
                if (this.f32898y != 0) {
                    paint.setColor(this.f32895s);
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
        if (this.f32896w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f32896w) {
            post(new wb0(this, 4));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f32895s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f32895s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f32898y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.f fVar) {
        this.f32891c = fVar;
    }

    public void setScrollOffset(int i10) {
        this.f32897x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f32896w = z10;
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

    public void setViewPager(z4.h hVar) {
        this.e = hVar;
        if (hVar.getAdapter() != null) {
            hVar.setOnPageChangeListener(this.f32890b);
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
                    FileLog.e(e);
                    return;
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
