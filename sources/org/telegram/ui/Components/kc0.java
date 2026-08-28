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
public final class kc0 extends HorizontalScrollView {
    public int A;
    public int B;
    public int C;
    public final org.telegram.ui.ActionBar.b6 D;
    public int E;
    public final y5 F;
    public final y5 G;
    public final LinearLayout.LayoutParams f30053a;
    public final ih.j5 f30054b;
    public m2.e f30055c;
    public final LinearLayout d;
    public m2.g f30056e;
    public int f30057f;
    public int h;
    public float f30058n;
    public final Paint f30059r;
    public int f30060s;
    public int v;
    public boolean f30061w;
    public int f30062x;
    public int f30063y;

    public kc0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f30054b = new ih.j5(1, this);
        this.h = 0;
        this.f30058n = 0.0f;
        this.f30060s = -10066330;
        this.v = 436207616;
        this.f30061w = false;
        this.f30062x = AndroidUtilities.dp(52.0f);
        this.f30063y = AndroidUtilities.dp(8.0f);
        this.A = AndroidUtilities.dp(2.0f);
        this.B = AndroidUtilities.dp(12.0f);
        this.C = AndroidUtilities.dp(24.0f);
        this.E = 0;
        gr grVar = gr.h;
        this.F = new y5(this, 350L, grVar);
        this.G = new y5(this, 350L, grVar);
        this.D = b6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f30059r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f30053a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(kc0 kc0Var, int i9, int i10) {
        View childAt;
        if (kc0Var.f30057f != 0 && (childAt = kc0Var.d.getChildAt(i9)) != null) {
            int left = childAt.getLeft() + i10;
            if (i9 > 0 || i10 > 0) {
                left -= kc0Var.f30062x;
            }
            if (left != kc0Var.E) {
                kc0Var.E = left;
                kc0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i9, CharSequence charSequence) {
        jc0 jc0Var = new jc0(this, getContext(), i9);
        boolean z10 = true;
        jc0Var.setTextSize(1, 14.0f);
        jc0Var.setTypeface(AndroidUtilities.bold());
        jc0Var.setTextColor(c(0.6f));
        jc0Var.setFocusable(true);
        jc0Var.setGravity(17);
        jc0Var.setText(charSequence);
        g7.g6.b(jc0Var, 0.025f, 1.2f);
        jc0Var.setOnClickListener(new gh.z0(this, i9, 10));
        jc0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(jc0Var, g7.e6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i9 != this.h) {
            z10 = false;
        }
        jc0Var.setSelected(z10);
    }

    public final int c(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, this.D), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f30057f = this.f30056e.getAdapter().b();
        for (int i9 = 0; i9 < this.f30057f; i9++) {
            if (this.f30056e.getAdapter() instanceof ic0) {
                ((ic0) this.f30056e.getAdapter()).getClass();
                b(i9, this.f30056e.getAdapter().d(i9));
            } else {
                b(i9, this.f30056e.getAdapter().d(i9));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.k(this, 5));
    }

    public final void e() {
        float f10;
        for (int i9 = 0; i9 < this.f30057f; i9++) {
            View childAt = this.d.getChildAt(i9);
            childAt.setLayoutParams(this.f30053a);
            if (this.f30061w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.f30056e.getAdapter() instanceof ic0) {
                ((px) ((ic0) this.f30056e.getAdapter())).getClass();
                if (i9 == 1) {
                    f10 = 12.0f;
                } else {
                    f10 = 18.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                childAt.setPadding(dp, 0, dp, 0);
            } else {
                int i10 = this.C;
                childAt.setPadding(i10, 0, i10, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.B;
    }

    public int getIndicatorColor() {
        return this.f30060s;
    }

    public int getIndicatorHeight() {
        return this.f30063y;
    }

    public int getScrollOffset() {
        return this.f30062x;
    }

    public boolean getShouldExpand() {
        return this.f30061w;
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
        float d9;
        int i9;
        if (!isInEditMode() && this.f30057f != 0) {
            int height = getHeight();
            int i10 = this.A;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f30059r;
            if (i10 != 0) {
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
                float f11 = this.f30058n;
                y5 y5Var = this.G;
                y5 y5Var2 = this.F;
                if (f11 > 0.0f && (i9 = this.h) < this.f30057f - 1) {
                    View childAt2 = linearLayout.getChildAt(i9 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f12 = this.f30058n;
                    float f13 = 1.0f - f12;
                    d = (paddingLeft * f13) + (paddingLeft2 * f12);
                    d9 = (f13 * right) + (f12 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    y5Var2.d(d, true);
                    y5Var.d(d9, true);
                    if (childAt instanceof jc0) {
                        jc0 jc0Var = (jc0) childAt;
                        jc0Var.setTextColor(jc0Var.f29716a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f30058n)));
                    }
                    if (childAt2 instanceof jc0) {
                        jc0 jc0Var2 = (jc0) childAt2;
                        jc0Var2.setTextColor(jc0Var2.f29716a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f30058n)));
                    }
                } else {
                    d = y5Var2.d(paddingLeft, false);
                    d9 = y5Var.d(right, false);
                }
                if (this.f30063y != 0) {
                    paint.setColor(this.f30060s);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(d - AndroidUtilities.dp(11.0f), getPaddingTop(), d9 + AndroidUtilities.dp(11.0f), height - getPaddingBottom());
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f30061w && View.MeasureSpec.getMode(i9) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        if (!this.f30061w) {
            post(new ib0(this, 3));
        }
    }

    public void setDividerPadding(int i9) {
        this.B = i9;
        invalidate();
    }

    public void setIndicatorColor(int i9) {
        this.f30060s = i9;
        invalidate();
    }

    public void setIndicatorColorResource(int i9) {
        this.f30060s = getResources().getColor(i9);
        invalidate();
    }

    public void setIndicatorHeight(int i9) {
        this.f30063y = i9;
        invalidate();
    }

    public void setOnPageChangeListener(m2.e eVar) {
        this.f30055c = eVar;
    }

    public void setScrollOffset(int i9) {
        this.f30062x = i9;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f30061w = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i9) {
        this.C = i9;
        e();
    }

    public void setUnderlineColor(int i9) {
        this.v = i9;
        invalidate();
    }

    public void setUnderlineColorResource(int i9) {
        this.v = getResources().getColor(i9);
        invalidate();
    }

    public void setUnderlineHeight(int i9) {
        this.A = i9;
        invalidate();
    }

    public void setViewPager(m2.g gVar) {
        this.f30056e = gVar;
        if (gVar.getAdapter() != null) {
            gVar.setOnPageChangeListener(this.f30054b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
