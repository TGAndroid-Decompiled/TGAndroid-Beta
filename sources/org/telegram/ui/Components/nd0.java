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
public final class nd0 extends HorizontalScrollView {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.e6 H;
    public int I;
    public final e6 J;
    public final e6 K;
    public final LinearLayout.LayoutParams f26665a;
    public final ai.m7 f26666b;
    public z4.e f26667c;
    public final LinearLayout d;
    public z4.g e;
    public int f26668f;
    public int h;
    public float f26669n;
    public final Paint f26670r;
    public int f26671s;
    public int v;
    public boolean f26672w;
    public int f26673x;
    public int f26674y;

    public nd0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26666b = new ai.m7(this, 2);
        this.h = 0;
        this.f26669n = 0.0f;
        this.f26671s = -10066330;
        this.v = 436207616;
        this.f26672w = false;
        this.f26673x = AndroidUtilities.dp(52.0f);
        this.f26674y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        qr qrVar = qr.h;
        this.J = new e6(this, 350L, qrVar);
        this.K = new e6(this, 350L, qrVar);
        this.H = e6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f26670r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f26665a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(nd0 nd0Var, int i10, int i11) {
        View childAt;
        if (nd0Var.f26668f != 0 && (childAt = nd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= nd0Var.f26673x;
            }
            if (left != nd0Var.I) {
                nd0Var.I = left;
                nd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        md0 md0Var = new md0(this, getContext(), i10);
        boolean z10 = true;
        md0Var.setTextSize(1, 14.0f);
        md0Var.setTypeface(AndroidUtilities.bold());
        md0Var.setTextColor(c(0.6f));
        md0Var.setFocusable(true);
        md0Var.setGravity(17);
        md0Var.setText(charSequence);
        w7.a6.b(md0Var, 0.025f, 1.2f);
        md0Var.setOnClickListener(new ci.o4(this, i10, 11));
        md0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(md0Var, w7.y5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        md0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f26668f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f26668f; i10++) {
            if (this.e.getAdapter() instanceof ld0) {
                ((ld0) this.e.getAdapter()).getClass();
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
        for (int i10 = 0; i10 < this.f26668f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f26665a);
            if (this.f26672w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof ld0) {
                ((ey) ((ld0) this.e.getAdapter())).getClass();
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
        return this.f26671s;
    }

    public int getIndicatorHeight() {
        return this.f26674y;
    }

    public int getScrollOffset() {
        return this.f26673x;
    }

    public boolean getShouldExpand() {
        return this.f26672w;
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
        if (!isInEditMode() && this.f26668f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f26670r;
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
                float f10 = this.f26669n;
                e6 e6Var = this.K;
                e6 e6Var2 = this.J;
                if (f10 > 0.0f && (i10 = this.h) < this.f26668f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f26669n;
                    float f12 = 1.0f - f11;
                    d = (paddingLeft * f12) + (paddingLeft2 * f11);
                    d10 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    e6Var2.d(d, true);
                    e6Var.d(d10, true);
                    if (childAt instanceof md0) {
                        md0 md0Var = (md0) childAt;
                        md0Var.setTextColor(md0Var.f26400a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f26669n)));
                    }
                    if (childAt2 instanceof md0) {
                        md0 md0Var2 = (md0) childAt2;
                        md0Var2.setTextColor(md0Var2.f26400a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f26669n)));
                    }
                } else {
                    d = e6Var2.d(paddingLeft, false);
                    d10 = e6Var.d(right, false);
                }
                if (this.f26674y != 0) {
                    paint.setColor(this.f26671s);
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
        if (this.f26672w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f26672w) {
            post(new kc0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f26671s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f26671s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f26674y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f26667c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f26673x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f26672w = z10;
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
            gVar.setOnPageChangeListener(this.f26666b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
