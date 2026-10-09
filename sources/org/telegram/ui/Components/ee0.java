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
public final class ee0 extends HorizontalScrollView {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.e6 H;
    public int I;
    public final g6 J;
    public final g6 K;
    public final LinearLayout.LayoutParams f26067a;
    public final ai.o7 f26068b;
    public z4.e f26069c;
    public final LinearLayout d;
    public z4.g f26070e;
    public int f26071f;
    public int h;
    public float f26072n;
    public final Paint f26073r;
    public int f26074s;
    public int v;
    public boolean f26075w;
    public int f26076x;
    public int f26077y;

    public ee0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26068b = new ai.o7(this, 2);
        this.h = 0;
        this.f26072n = 0.0f;
        this.f26074s = -10066330;
        this.v = 436207616;
        this.f26075w = false;
        this.f26076x = AndroidUtilities.dp(52.0f);
        this.f26077y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        hs hsVar = hs.h;
        this.J = new g6(this, 350L, hsVar);
        this.K = new g6(this, 350L, hsVar);
        this.H = e6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f26073r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f26067a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(ee0 ee0Var, int i10, int i11) {
        View childAt;
        if (ee0Var.f26071f != 0 && (childAt = ee0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= ee0Var.f26076x;
            }
            if (left != ee0Var.I) {
                ee0Var.I = left;
                ee0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        de0 de0Var = new de0(this, getContext(), i10);
        boolean z10 = true;
        de0Var.setTextSize(1, 14.0f);
        de0Var.setTypeface(AndroidUtilities.bold());
        de0Var.setTextColor(c(0.6f));
        de0Var.setFocusable(true);
        de0Var.setGravity(17);
        de0Var.setText(charSequence);
        w7.z5.b(de0Var, 0.025f, 1.2f);
        de0Var.setOnClickListener(new ci.m4(this, i10, 11));
        de0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(de0Var, w7.x5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        de0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f26071f = this.f26070e.getAdapter().b();
        for (int i10 = 0; i10 < this.f26071f; i10++) {
            if (this.f26070e.getAdapter() instanceof ce0) {
                ((ce0) this.f26070e.getAdapter()).getClass();
                b(i10, this.f26070e.getAdapter().d(i10));
            } else {
                b(i10, this.f26070e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(this, 5));
    }

    public final void e() {
        float f7;
        for (int i10 = 0; i10 < this.f26071f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f26067a);
            if (this.f26075w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f26070e.getAdapter() instanceof ce0) {
                ((ty) ((ce0) this.f26070e.getAdapter())).getClass();
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
        return this.f26074s;
    }

    public int getIndicatorHeight() {
        return this.f26077y;
    }

    public int getScrollOffset() {
        return this.f26076x;
    }

    public boolean getShouldExpand() {
        return this.f26075w;
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
        if (!isInEditMode() && this.f26071f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f26073r;
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
                int i12 = (this.f26072n > 0.0f ? 1 : (this.f26072n == 0.0f ? 0 : -1));
                g6 g6Var = this.K;
                g6 g6Var2 = this.J;
                if (i12 > 0 && (i10 = this.h) < this.f26071f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f10 = this.f26072n;
                    float f11 = 1.0f - f10;
                    d = (paddingLeft * f11) + (paddingLeft2 * f10);
                    d10 = (f11 * right) + (f10 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    g6Var2.d(d, true);
                    g6Var.d(d10, true);
                    if (childAt instanceof de0) {
                        de0 de0Var = (de0) childAt;
                        de0Var.setTextColor(de0Var.f25695a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f26072n)));
                    }
                    if (childAt2 instanceof de0) {
                        de0 de0Var2 = (de0) childAt2;
                        de0Var2.setTextColor(de0Var2.f25695a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f26072n)));
                    }
                } else {
                    d = g6Var2.d(paddingLeft, false);
                    d10 = g6Var.d(right, false);
                }
                if (this.f26077y != 0) {
                    paint.setColor(this.f26074s);
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
        if (this.f26075w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f26075w) {
            post(new bd0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f26074s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f26074s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f26077y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f26069c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f26076x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f26075w = z10;
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
        this.f26070e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f26068b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
