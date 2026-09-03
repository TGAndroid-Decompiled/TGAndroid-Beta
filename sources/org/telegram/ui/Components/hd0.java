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
public final class hd0 extends HorizontalScrollView {
    public int B;
    public int C;
    public int D;
    public final org.telegram.ui.ActionBar.g6 E;
    public int F;
    public final z5 G;
    public final z5 H;
    public final LinearLayout.LayoutParams f27478a;
    public final oh.i5 f27479b;
    public m2.f f27480c;
    public final LinearLayout d;
    public m2.h f27481e;
    public int f27482f;
    public int h;
    public float f27483n;
    public final Paint f27484r;
    public int f27485s;
    public int v;
    public boolean f27486w;
    public int f27487x;
    public int f27488y;

    public hd0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f27479b = new oh.i5(1, this);
        this.h = 0;
        this.f27483n = 0.0f;
        this.f27485s = -10066330;
        this.v = 436207616;
        this.f27486w = false;
        this.f27487x = AndroidUtilities.dp(52.0f);
        this.f27488y = AndroidUtilities.dp(8.0f);
        this.B = AndroidUtilities.dp(2.0f);
        this.C = AndroidUtilities.dp(12.0f);
        this.D = AndroidUtilities.dp(24.0f);
        this.F = 0;
        pr prVar = pr.h;
        this.G = new z5(this, 350L, prVar);
        this.H = new z5(this, 350L, prVar);
        this.E = g6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f27484r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f27478a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(hd0 hd0Var, int i10, int i11) {
        View childAt;
        if (hd0Var.f27482f != 0 && (childAt = hd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= hd0Var.f27487x;
            }
            if (left != hd0Var.F) {
                hd0Var.F = left;
                hd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        gd0 gd0Var = new gd0(this, getContext(), i10);
        boolean z4 = true;
        gd0Var.setTextSize(1, 14.0f);
        gd0Var.setTypeface(AndroidUtilities.bold());
        gd0Var.setTextColor(c(0.6f));
        gd0Var.setFocusable(true);
        gd0Var.setGravity(17);
        gd0Var.setText(charSequence);
        k7.e6.b(gd0Var, 0.025f, 1.2f);
        gd0Var.setOnClickListener(new mh.x0(this, i10, 8));
        gd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(gd0Var, k7.c6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z4 = false;
        }
        gd0Var.setSelected(z4);
    }

    public final int c(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, this.E), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f27482f = this.f27481e.getAdapter().b();
        for (int i10 = 0; i10 < this.f27482f; i10++) {
            if (this.f27481e.getAdapter() instanceof fd0) {
                ((fd0) this.f27481e.getAdapter()).getClass();
                b(i10, this.f27481e.getAdapter().d(i10));
            } else {
                b(i10, this.f27481e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 5));
    }

    public final void e() {
        float f10;
        for (int i10 = 0; i10 < this.f27482f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f27478a);
            if (this.f27486w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f27481e.getAdapter() instanceof fd0) {
                ((ey) ((fd0) this.f27481e.getAdapter())).getClass();
                if (i10 == 1) {
                    f10 = 12.0f;
                } else {
                    f10 = 18.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                childAt.setPadding(dp, 0, dp, 0);
            } else {
                int i11 = this.D;
                childAt.setPadding(i11, 0, i11, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.C;
    }

    public int getIndicatorColor() {
        return this.f27485s;
    }

    public int getIndicatorHeight() {
        return this.f27488y;
    }

    public int getScrollOffset() {
        return this.f27487x;
    }

    public boolean getShouldExpand() {
        return this.f27486w;
    }

    public int getTabPaddingLeftRight() {
        return this.D;
    }

    public int getUnderlineColor() {
        return this.v;
    }

    public int getUnderlineHeight() {
        return this.B;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d;
        float d10;
        int i10;
        if (!isInEditMode() && this.f27482f != 0) {
            int height = getHeight();
            int i11 = this.B;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f27484r;
            if (i11 != 0) {
                paint.setColor(this.v);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, height - this.B, linearLayout.getWidth(), height);
                float f10 = this.B / 2.0f;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                float f11 = this.f27483n;
                z5 z5Var = this.H;
                z5 z5Var2 = this.G;
                if (f11 > 0.0f && (i10 = this.h) < this.f27482f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f12 = this.f27483n;
                    float f13 = 1.0f - f12;
                    d = (paddingLeft * f13) + (paddingLeft2 * f12);
                    d10 = (f13 * right) + (f12 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    z5Var2.d(d, true);
                    z5Var.d(d10, true);
                    if (childAt instanceof gd0) {
                        gd0 gd0Var = (gd0) childAt;
                        gd0Var.setTextColor(gd0Var.f27145a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f27483n)));
                    }
                    if (childAt2 instanceof gd0) {
                        gd0 gd0Var2 = (gd0) childAt2;
                        gd0Var2.setTextColor(gd0Var2.f27145a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f27483n)));
                    }
                } else {
                    d = z5Var2.d(paddingLeft, false);
                    d10 = z5Var.d(right, false);
                }
                if (this.f27488y != 0) {
                    paint.setColor(this.f27485s);
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
        if (this.f27486w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f27486w) {
            post(new ec0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f27485s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f27485s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f27488y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(m2.f fVar) {
        this.f27480c = fVar;
    }

    public void setScrollOffset(int i10) {
        this.f27487x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f27486w = z4;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.D = i10;
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
        this.B = i10;
        invalidate();
    }

    public void setViewPager(m2.h hVar) {
        this.f27481e = hVar;
        if (hVar.getAdapter() != null) {
            hVar.setOnPageChangeListener(this.f27479b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
