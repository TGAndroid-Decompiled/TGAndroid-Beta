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
public final class ae0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.g6 H;
    public int I;
    public final f6 J;
    public final f6 K;
    public final LinearLayout.LayoutParams f24700a;
    public final ci.w5 f24701b;
    public z4.f f24702c;
    public final LinearLayout d;
    public z4.h e;
    public int f24703f;
    public int h;
    public float f24704n;
    public final Paint f24705r;
    public int f24706s;
    public int v;
    public boolean f24707w;
    public int f24708x;
    public int f24709y;

    public ae0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24701b = new ci.w5(this, 2);
        this.h = 0;
        this.f24704n = 0.0f;
        this.f24706s = -10066330;
        this.v = 436207616;
        this.f24707w = false;
        this.f24708x = AndroidUtilities.dp(52.0f);
        this.f24709y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        bs bsVar = bs.h;
        this.J = new f6(this, 350L, bsVar);
        this.K = new f6(this, 350L, bsVar);
        this.H = g6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f24705r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f24700a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(ae0 ae0Var, int i10, int i11) {
        View childAt;
        if (ae0Var.f24703f != 0 && (childAt = ae0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= ae0Var.f24708x;
            }
            if (left != ae0Var.I) {
                ae0Var.I = left;
                ae0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        zd0 zd0Var = new zd0(this, getContext(), i10);
        boolean z10 = true;
        zd0Var.setTextSize(1, 14.0f);
        zd0Var.setTypeface(AndroidUtilities.bold());
        zd0Var.setTextColor(c(0.6f));
        zd0Var.setFocusable(true);
        zd0Var.setGravity(17);
        zd0Var.setText(charSequence);
        w7.b6.b(zd0Var, 0.025f, 1.2f);
        zd0Var.setOnClickListener(new ai.n1(this, i10, 13));
        zd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(zd0Var, w7.z5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        zd0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f24703f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f24703f; i10++) {
            if (this.e.getAdapter() instanceof yd0) {
                ((yd0) this.e.getAdapter()).getClass();
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
        for (int i10 = 0; i10 < this.f24703f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f24700a);
            if (this.f24707w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof yd0) {
                ((ly) ((yd0) this.e.getAdapter())).getClass();
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
        return this.f24706s;
    }

    public int getIndicatorHeight() {
        return this.f24709y;
    }

    public int getScrollOffset() {
        return this.f24708x;
    }

    public boolean getShouldExpand() {
        return this.f24707w;
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
        if (!isInEditMode() && this.f24703f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f24705r;
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
                int i12 = (this.f24704n > 0.0f ? 1 : (this.f24704n == 0.0f ? 0 : -1));
                f6 f6Var = this.K;
                f6 f6Var2 = this.J;
                if (i12 > 0 && (i10 = this.h) < this.f24703f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f10 = this.f24704n;
                    float f11 = 1.0f - f10;
                    d = (paddingLeft * f11) + (paddingLeft2 * f10);
                    d10 = (f11 * right) + (f10 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    f6Var2.d(d, true);
                    f6Var.d(d10, true);
                    if (childAt instanceof zd0) {
                        zd0 zd0Var = (zd0) childAt;
                        zd0Var.setTextColor(zd0Var.f33203a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f24704n)));
                    }
                    if (childAt2 instanceof zd0) {
                        zd0 zd0Var2 = (zd0) childAt2;
                        zd0Var2.setTextColor(zd0Var2.f33203a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f24704n)));
                    }
                } else {
                    d = f6Var2.d(paddingLeft, false);
                    d10 = f6Var.d(right, false);
                }
                if (this.f24709y != 0) {
                    paint.setColor(this.f24706s);
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
        if (this.f24707w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f24707w) {
            post(new yb0(this, 4));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f24706s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f24706s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f24709y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.f fVar) {
        this.f24702c = fVar;
    }

    public void setScrollOffset(int i10) {
        this.f24708x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f24707w = z10;
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
            hVar.setOnPageChangeListener(this.f24701b);
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
