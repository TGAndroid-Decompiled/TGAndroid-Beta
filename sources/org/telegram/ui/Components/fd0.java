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
public final class fd0 extends HorizontalScrollView {
    public int B;
    public int C;
    public int D;
    public final org.telegram.ui.ActionBar.f6 E;
    public int F;
    public final z5 G;
    public final z5 H;
    public final LinearLayout.LayoutParams f24854a;
    public final nh.h5 f24855b;
    public m2.f f24856c;
    public final LinearLayout d;
    public m2.h e;
    public int f24857f;
    public int h;
    public float f24858n;
    public final Paint f24859r;
    public int f24860s;
    public int v;
    public boolean f24861w;
    public int f24862x;
    public int f24863y;

    public fd0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24855b = new nh.h5(1, this);
        this.h = 0;
        this.f24858n = 0.0f;
        this.f24860s = -10066330;
        this.v = 436207616;
        this.f24861w = false;
        this.f24862x = AndroidUtilities.dp(52.0f);
        this.f24863y = AndroidUtilities.dp(8.0f);
        this.B = AndroidUtilities.dp(2.0f);
        this.C = AndroidUtilities.dp(12.0f);
        this.D = AndroidUtilities.dp(24.0f);
        this.F = 0;
        nr nrVar = nr.h;
        this.G = new z5(this, 350L, nrVar);
        this.H = new z5(this, 350L, nrVar);
        this.E = f6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f24859r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f24854a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(fd0 fd0Var, int i10, int i11) {
        View childAt;
        if (fd0Var.f24857f != 0 && (childAt = fd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= fd0Var.f24862x;
            }
            if (left != fd0Var.F) {
                fd0Var.F = left;
                fd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        ed0 ed0Var = new ed0(this, getContext(), i10);
        boolean z4 = true;
        ed0Var.setTextSize(1, 14.0f);
        ed0Var.setTypeface(AndroidUtilities.bold());
        ed0Var.setTextColor(c(0.6f));
        ed0Var.setFocusable(true);
        ed0Var.setGravity(17);
        ed0Var.setText(charSequence);
        k7.d6.b(ed0Var, 0.025f, 1.2f);
        ed0Var.setOnClickListener(new lh.y0(this, i10, 8));
        ed0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(ed0Var, k7.b6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z4 = false;
        }
        ed0Var.setSelected(z4);
    }

    public final int c(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.E), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f24857f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f24857f; i10++) {
            if (this.e.getAdapter() instanceof dd0) {
                ((dd0) this.e.getAdapter()).getClass();
                b(i10, this.e.getAdapter().d(i10));
            } else {
                b(i10, this.e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 5));
    }

    public final void e() {
        float f10;
        for (int i10 = 0; i10 < this.f24857f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f24854a);
            if (this.f24861w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof dd0) {
                ((cy) ((dd0) this.e.getAdapter())).getClass();
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
        return this.f24860s;
    }

    public int getIndicatorHeight() {
        return this.f24863y;
    }

    public int getScrollOffset() {
        return this.f24862x;
    }

    public boolean getShouldExpand() {
        return this.f24861w;
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
        if (!isInEditMode() && this.f24857f != 0) {
            int height = getHeight();
            int i11 = this.B;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f24859r;
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
                float f11 = this.f24858n;
                z5 z5Var = this.H;
                z5 z5Var2 = this.G;
                if (f11 > 0.0f && (i10 = this.h) < this.f24857f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f12 = this.f24858n;
                    float f13 = 1.0f - f12;
                    d = (paddingLeft * f13) + (paddingLeft2 * f12);
                    d10 = (f13 * right) + (f12 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    z5Var2.d(d, true);
                    z5Var.d(d10, true);
                    if (childAt instanceof ed0) {
                        ed0 ed0Var = (ed0) childAt;
                        ed0Var.setTextColor(ed0Var.f24555a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f24858n)));
                    }
                    if (childAt2 instanceof ed0) {
                        ed0 ed0Var2 = (ed0) childAt2;
                        ed0Var2.setTextColor(ed0Var2.f24555a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f24858n)));
                    }
                } else {
                    d = z5Var2.d(paddingLeft, false);
                    d10 = z5Var.d(right, false);
                }
                if (this.f24863y != 0) {
                    paint.setColor(this.f24860s);
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
        if (this.f24861w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f24861w) {
            post(new cc0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f24860s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f24860s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f24863y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(m2.f fVar) {
        this.f24856c = fVar;
    }

    public void setScrollOffset(int i10) {
        this.f24862x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z4) {
        this.f24861w = z4;
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
        this.e = hVar;
        if (hVar.getAdapter() != null) {
            hVar.setOnPageChangeListener(this.f24855b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
