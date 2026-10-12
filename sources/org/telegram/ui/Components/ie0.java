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
public final class ie0 extends HorizontalScrollView {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.c6 H;
    public int I;
    public final g6 J;
    public final g6 K;
    public final LinearLayout.LayoutParams f27148a;
    public final ai.o7 f27149b;
    public z4.e f27150c;
    public final LinearLayout d;
    public z4.g f27151e;
    public int f27152f;
    public int h;
    public float f27153n;
    public final Paint f27154r;
    public int f27155s;
    public int v;
    public boolean f27156w;
    public int f27157x;
    public int f27158y;

    public ie0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27149b = new ai.o7(this, 2);
        this.h = 0;
        this.f27153n = 0.0f;
        this.f27155s = -10066330;
        this.v = 436207616;
        this.f27156w = false;
        this.f27157x = AndroidUtilities.dp(52.0f);
        this.f27158y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        js jsVar = js.h;
        this.J = new g6(this, 350L, jsVar);
        this.K = new g6(this, 350L, jsVar);
        this.H = c6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f27154r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f27148a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(ie0 ie0Var, int i10, int i11) {
        View childAt;
        if (ie0Var.f27152f != 0 && (childAt = ie0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= ie0Var.f27157x;
            }
            if (left != ie0Var.I) {
                ie0Var.I = left;
                ie0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        he0 he0Var = new he0(this, getContext(), i10);
        boolean z10 = true;
        he0Var.setTextSize(1, 14.0f);
        he0Var.setTypeface(AndroidUtilities.bold());
        he0Var.setTextColor(c(0.6f));
        he0Var.setFocusable(true);
        he0Var.setGravity(17);
        he0Var.setText(charSequence);
        w7.y5.b(he0Var, 0.025f, 1.2f);
        he0Var.setOnClickListener(new ci.m4(this, i10, 11));
        he0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(he0Var, w7.w5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        he0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f27152f = this.f27151e.getAdapter().b();
        for (int i10 = 0; i10 < this.f27152f; i10++) {
            if (this.f27151e.getAdapter() instanceof ge0) {
                ((ge0) this.f27151e.getAdapter()).getClass();
                b(i10, this.f27151e.getAdapter().d(i10));
            } else {
                b(i10, this.f27151e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(this, 5));
    }

    public final void e() {
        float f7;
        for (int i10 = 0; i10 < this.f27152f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f27148a);
            if (this.f27156w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f27151e.getAdapter() instanceof ge0) {
                ((wy) ((ge0) this.f27151e.getAdapter())).getClass();
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
        return this.f27155s;
    }

    public int getIndicatorHeight() {
        return this.f27158y;
    }

    public int getScrollOffset() {
        return this.f27157x;
    }

    public boolean getShouldExpand() {
        return this.f27156w;
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
        if (!isInEditMode() && this.f27152f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f27154r;
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
                int i12 = (this.f27153n > 0.0f ? 1 : (this.f27153n == 0.0f ? 0 : -1));
                g6 g6Var = this.K;
                g6 g6Var2 = this.J;
                if (i12 > 0 && (i10 = this.h) < this.f27152f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f10 = this.f27153n;
                    float f11 = 1.0f - f10;
                    d = (paddingLeft * f11) + (paddingLeft2 * f10);
                    d10 = (f11 * right) + (f10 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    g6Var2.d(d, true);
                    g6Var.d(d10, true);
                    if (childAt instanceof he0) {
                        he0 he0Var = (he0) childAt;
                        he0Var.setTextColor(he0Var.f26764a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f27153n)));
                    }
                    if (childAt2 instanceof he0) {
                        he0 he0Var2 = (he0) childAt2;
                        he0Var2.setTextColor(he0Var2.f26764a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f27153n)));
                    }
                } else {
                    d = g6Var2.d(paddingLeft, false);
                    d10 = g6Var.d(right, false);
                }
                if (this.f27158y != 0) {
                    paint.setColor(this.f27155s);
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
        if (this.f27156w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f27156w) {
            post(new cd0(this, 4));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f27155s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f27155s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f27158y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f27150c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f27157x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f27156w = z10;
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
        this.f27151e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f27149b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
