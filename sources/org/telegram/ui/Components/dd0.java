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
public final class dd0 extends HorizontalScrollView {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.e6 H;
    public int I;
    public final c6 J;
    public final c6 K;
    public final LinearLayout.LayoutParams f23297a;
    public final ai.m7 f23298b;
    public z4.e f23299c;
    public final LinearLayout d;
    public z4.g e;
    public int f23300f;
    public int h;
    public float f23301n;
    public final Paint f23302r;
    public int f23303s;
    public int v;
    public boolean f23304w;
    public int f23305x;
    public int f23306y;

    public dd0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f23298b = new ai.m7(this, 2);
        this.h = 0;
        this.f23301n = 0.0f;
        this.f23303s = -10066330;
        this.v = 436207616;
        this.f23304w = false;
        this.f23305x = AndroidUtilities.dp(52.0f);
        this.f23306y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        qr qrVar = qr.h;
        this.J = new c6(this, 350L, qrVar);
        this.K = new c6(this, 350L, qrVar);
        this.H = e6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.f23302r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f23297a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(dd0 dd0Var, int i10, int i11) {
        View childAt;
        if (dd0Var.f23300f != 0 && (childAt = dd0Var.d.getChildAt(i10)) != null) {
            int left = childAt.getLeft() + i11;
            if (i10 > 0 || i11 > 0) {
                left -= dd0Var.f23305x;
            }
            if (left != dd0Var.I) {
                dd0Var.I = left;
                dd0Var.scrollTo(left, 0);
            }
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        cd0 cd0Var = new cd0(this, getContext(), i10);
        boolean z10 = true;
        cd0Var.setTextSize(1, 14.0f);
        cd0Var.setTypeface(AndroidUtilities.bold());
        cd0Var.setTextColor(c(0.6f));
        cd0Var.setFocusable(true);
        cd0Var.setGravity(17);
        cd0Var.setText(charSequence);
        w7.z5.b(cd0Var, 0.025f, 1.2f);
        cd0Var.setOnClickListener(new ci.o4(this, i10, 11));
        cd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(cd0Var, w7.x5.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i10 != this.h) {
            z10 = false;
        }
        cd0Var.setSelected(z10);
    }

    public final int c(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f23300f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f23300f; i10++) {
            if (this.e.getAdapter() instanceof bd0) {
                ((bd0) this.e.getAdapter()).getClass();
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
        for (int i10 = 0; i10 < this.f23300f; i10++) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.f23297a);
            if (this.f23304w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof bd0) {
                ((dy) ((bd0) this.e.getAdapter())).getClass();
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
        return this.f23303s;
    }

    public int getIndicatorHeight() {
        return this.f23306y;
    }

    public int getScrollOffset() {
        return this.f23305x;
    }

    public boolean getShouldExpand() {
        return this.f23304w;
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
        if (!isInEditMode() && this.f23300f != 0) {
            int height = getHeight();
            int i11 = this.E;
            LinearLayout linearLayout = this.d;
            Paint paint = this.f23302r;
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
                float f10 = this.f23301n;
                c6 c6Var = this.K;
                c6 c6Var2 = this.J;
                if (f10 > 0.0f && (i10 = this.h) < this.f23300f - 1) {
                    View childAt2 = linearLayout.getChildAt(i10 + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f11 = this.f23301n;
                    float f12 = 1.0f - f11;
                    d = (paddingLeft * f12) + (paddingLeft2 * f11);
                    d10 = (f12 * right) + (f11 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    c6Var2.d(d, true);
                    c6Var.d(d10, true);
                    if (childAt instanceof cd0) {
                        cd0 cd0Var = (cd0) childAt;
                        cd0Var.setTextColor(cd0Var.f23074a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.f23301n)));
                    }
                    if (childAt2 instanceof cd0) {
                        cd0 cd0Var2 = (cd0) childAt2;
                        cd0Var2.setTextColor(cd0Var2.f23074a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.f23301n)));
                    }
                } else {
                    d = c6Var2.d(paddingLeft, false);
                    d10 = c6Var.d(right, false);
                }
                if (this.f23306y != 0) {
                    paint.setColor(this.f23303s);
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
        if (this.f23304w && View.MeasureSpec.getMode(i10) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!this.f23304w) {
            post(new bc0(this, 3));
        }
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.f23303s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.f23303s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.f23306y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.f23299c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.f23305x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.f23304w = z10;
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
            gVar.setOnPageChangeListener(this.f23298b);
            d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
