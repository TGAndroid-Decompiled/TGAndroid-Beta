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
public final class zc0 extends HorizontalScrollView {
    public int A;
    public int B;
    public int C;
    public final org.telegram.ui.ActionBar.c6 D;
    public int E;
    public final d6 F;
    public final d6 G;
    public final LinearLayout.LayoutParams f35313a;
    public final lh.g5 f35314b;
    public m2.e f35315c;
    public final LinearLayout d;
    public m2.g f35316e;
    public int f35317f;
    public int h;
    public float f35318n;
    public final Paint f35319r;
    public int f35320s;
    public int v;
    public boolean f35321w;
    public int f35322x;
    public int f35323y;

    public zc0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35314b = new lh.g5(1, this);
        this.h = 0;
        this.f35318n = 0.0f;
        this.f35320s = -10066330;
        this.v = 436207616;
        this.f35321w = false;
        this.f35322x = AndroidUtilities.dp(52.0f);
        this.f35323y = AndroidUtilities.dp(8.0f);
        this.A = AndroidUtilities.dp(2.0f);
        this.B = AndroidUtilities.dp(12.0f);
        this.C = AndroidUtilities.dp(24.0f);
        this.E = 0;
        jr jrVar = jr.h;
        this.F = new d6(this, 350L, jrVar);
        this.G = new d6(this, 350L, jrVar);
        this.D = c6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f35319r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f35313a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(zc0 zc0Var, int i10, int i11) {
        View childAt;
        if (zc0Var.f35317f != 0 && (childAt = zc0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= zc0Var.f35322x;
            }
            if (left != zc0Var.E) {
                zc0Var.E = left;
                zc0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        yc0 yc0Var = new yc0(this, getContext(), i10);
        boolean z10 = true;
        yc0Var.setTextSize(1, 14.0f);
        yc0Var.setTypeface(AndroidUtilities.bold());
        yc0Var.setTextColor(c(0.6f));
        yc0Var.setFocusable(true);
        yc0Var.setGravity(17);
        yc0Var.setText(charSequence);
        i7.h6.b(yc0Var, 0.025f, 1.2f);
        yc0Var.setOnClickListener(new jh.y0(this, i10, 10));
        yc0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(yc0Var, i7.f6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        yc0Var.setSelected(z10);
    }

    public final int c(float f9) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.D), (int) (f9 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f35317f = this.f35316e.getAdapter().b();
        for (int i10 = 0; i10 < this.f35317f; i10++) {
            if (this.f35316e.getAdapter() instanceof xc0) {
                ((xc0) this.f35316e.getAdapter()).getClass();
                b(i10, this.f35316e.getAdapter().d(i10));
            } else {
                b(i10, this.f35316e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.h(this, 5));
    }

    public final void e() {
        float f9;
        for (int i10 = 0; i10 < this.f35317f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f35313a);
            if (this.f35321w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f35316e.getAdapter() instanceof xc0) {
                ((xx) ((xc0) this.f35316e.getAdapter())).getClass();
                if (i10 == 1) {
                    f9 = 12.0f;
                } else {
                    f9 = 18.0f;
                }
                int dp = AndroidUtilities.dp(f9);
                childAt.setPadding(dp, 0, dp, 0);
            } else {
                int i11 = this.C;
                childAt.setPadding(i11, 0, i11, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.B;
    }

    public int getIndicatorColor() {
        return this.f35320s;
    }

    public int getIndicatorHeight() {
        return this.f35323y;
    }

    public int getScrollOffset() {
        return this.f35322x;
    }

    public boolean getShouldExpand() {
        return this.f35321w;
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
        float d;
        float d10;
        int i10;
        if (!isInEditMode() && this.f35317f != 0) {
            int height = getHeight();
            int i11 = this.A;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f35319r;
            if (i11 != 0) {
                paint.setColor(this.v);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, height - this.A, linearLayout.getWidth(), height);
                float f9 = this.A / 2.0f;
                canvas.drawRoundRect(rectF, f9, f9, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                float f10 = this.f35318n;
                d6 d6Var = this.G;
                d6 d6Var2 = this.F;
                if (f10 > 0.0f && (i10 = this.h) < this.f35317f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f35318n;
                    float f12 = 1.0f - f11;
                    d = (paddingLeft * f12) + (paddingLeft2 * f11);
                    d10 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    d6Var2.d(d, true);
                    d6Var.d(d10, true);
                    if (childAt instanceof yc0) {
                        yc0 yc0Var = (yc0) childAt;
                        yc0Var.setTextColor(yc0Var.f35044a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f35318n)));
                    }
                    if (childAt2 instanceof yc0) {
                        yc0 yc0Var2 = (yc0) childAt2;
                        yc0Var2.setTextColor(yc0Var2.f35044a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f35318n)));
                    }
                } else {
                    d = d6Var2.d(paddingLeft, false);
                    d10 = d6Var.d(right, false);
                }
                if (this.f35323y != 0) {
                    paint.setColor(this.f35320s);
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
        if (this.f35321w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f35321w) {
            post(new xb0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f35320s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f35320s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f35323y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(m2.e eVar) {
        this.f35315c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f35322x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f35321w = z10;
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
        this.f35316e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f35314b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
