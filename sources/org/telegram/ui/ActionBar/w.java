package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.k10;
public final class w extends FrameLayout {
    public boolean E;
    public final ActionBarLayout F;
    public final Rect f30116a;
    public boolean f30117b;
    public int f30118c;
    public final Paint d;
    public int f30119e;
    public boolean f30120f;
    public int h;
    public int f30121n;
    public LinearGradient f30122r;
    public final Matrix f30123s;
    public Paint f30124w;
    public p3 f30125x;
    public boolean f30126y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.F = actionBarLayout;
        this.f30116a = new Rect();
        this.d = new Paint();
        this.f30123s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i7) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = m6.n0(i7);
        p3 p3Var = p3.f29852c;
        if (paddingLeft > 0 && this.f30125x != p3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f30125x != p3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.f30125x == p3.f29850a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.f28720t1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.f28720t1);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.y.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x02;
        i0.b bVar;
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.T0) {
            super.dispatchDraw(canvas);
            return;
        }
        o3 o3Var = actionBarLayout.f28729y;
        boolean z10 = false;
        if (o3Var != null) {
            x02 = o3Var.getInternalNavbarPaint().getColor();
        } else {
            x02 = m6.x0(null, m6.f29290a7, false);
        }
        boolean z11 = true;
        if (this == actionBarLayout.f28727x) {
            org.telegram.ui.Components.d6 d6Var = actionBarLayout.f28698i1;
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.hasSheet()) {
                z10 = true;
            }
            float d = d6Var.d(z10);
            if (d > 0.0f) {
                a(canvas, this.E, m6.r1(d, x02));
            }
        } else {
            g2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f28716s && this.f30125x != p3.f29850a) {
                    int childCount = getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        if (getChildAt(i7) instanceof d2) {
                            break;
                        }
                    }
                }
                z11 = false;
                a(canvas, z11, x02);
                if (z11 && this.f30126y && actionBarLayout.w(false) <= 0 && (bVar = actionBarLayout.f28722u1) != null && bVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.f28722u1.d, getWidth(), getHeight(), m6.n0(x02));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.h && actionBarLayout.K == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !actionBarLayout.f28680b0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f28716s) {
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
            if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g2 g2Var;
        int i7;
        int i10;
        int i11;
        int i12;
        Drawable drawable;
        ArrayList<c2> arrayList;
        ActionBarLayout actionBarLayout = this.F;
        c2 c2Var = null;
        if (!actionBarLayout.V0.isEmpty()) {
            g2Var = (g2) p5.c.h(1, actionBarLayout.V0);
        } else {
            g2Var = null;
        }
        r rVar = actionBarLayout.H;
        if (rVar != null && (arrayList = rVar.sheetsStack) != null && !arrayList.isEmpty()) {
            g2Var = actionBarLayout.H;
        }
        if (g2Var != null) {
            c2Var = g2Var.getLastSheet();
        }
        if (c2Var != null && c2Var.j() && c2Var.d() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j3);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                k kVar = (k) childAt;
                if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                    i10 = childAt.getMeasuredHeight();
                    i11 = (int) childAt.getY();
                    i7 = kVar.getShadowAlpha();
                }
            } else {
                i13++;
            }
        }
        i7 = 0;
        i10 = 0;
        i11 = 0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i10 != 0 && (drawable = ActionBarLayout.f28673w1) != null) {
            int alpha = drawable.getAlpha();
            int i14 = i11 + i10;
            ActionBarLayout.f28673w1.setBounds(0, i14, getMeasuredWidth(), ActionBarLayout.f28673w1.getIntrinsicHeight() + i14);
            ActionBarLayout.f28673w1.setAlpha(i7);
            ActionBarLayout.f28673w1.draw(canvas);
            ActionBarLayout.f28673w1.setAlpha(alpha);
        }
        if (!actionBarLayout.T0 && this.E && this.f30126y && g2Var != null && g2Var.getListViewForSimpleGlass() == null && (i12 = org.telegram.messenger.g0.f24005n) >= org.telegram.messenger.g0.L(32.0f)) {
            int i15 = (int) (i12 * 1.33f);
            int navigationBarColor = g2Var.getNavigationBarColor();
            if (i15 != this.h || this.f30121n != navigationBarColor || this.f30124w == null) {
                if (this.f30124w == null) {
                    this.f30124w = new Paint(1);
                }
                this.f30121n = navigationBarColor;
                this.h = i15;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i15, new int[]{m6.r1(0.1f, navigationBarColor), m6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f30122r = linearGradient;
                this.f30124w.setShader(linearGradient);
            }
            Matrix matrix = this.f30123s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i15);
            this.f30122r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i15, getWidth(), getHeight(), this.f30124w);
        }
        return drawChild;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f30118c != 0) {
            int i7 = m6.f29347d6;
            int x02 = m6.x0(null, i7, false);
            int i10 = this.f30119e;
            Paint paint = this.d;
            if (i10 != x02) {
                int x03 = m6.x0(null, i7, false);
                this.f30119e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f30118c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z11 = false;
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt instanceof k) {
                    i13 = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i13);
                    break;
                }
                i15++;
            } else {
                i13 = 0;
                break;
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(2131296649) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof d2)) {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin + i13, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i13);
                } else {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f30116a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i14 = org.telegram.messenger.g0.f24004m;
        } else {
            i14 = 0;
        }
        if (((height - i14) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top) > 0) {
            z11 = true;
        }
        this.f30117b = z11;
        ActionBarLayout actionBarLayout = this.F;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f28716s.f30117b && !actionBarLayout.f28725w.f30117b) {
            org.telegram.messenger.g0.r(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f30120f;
        ActionBarLayout actionBarLayout = this.F;
        if (z11 != z10 && actionBarLayout.y()) {
            actionBarLayout.v();
        }
        this.f30120f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f30116a);
        f3 f3Var = actionBarLayout.F;
        if (f3Var != null) {
            f3Var.setCurrentAccount(k10.f24932t0);
        }
        int i14 = 0;
        while (true) {
            if (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt instanceof k) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i11 = childAt.getMeasuredHeight();
                    break;
                }
                i14++;
            } else {
                i11 = 0;
                break;
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof d2) {
                    if (actionBarLayout.w(false) <= 0 && this.f30126y) {
                        i13 = actionBarLayout.f28722u1.d;
                    } else {
                        i13 = 0;
                    }
                    measureChildWithMargins(childAt2, i7, 0, i10, i13);
                } else if (childAt2.getTag(2131296649) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i7, 0, i10, i11);
                } else {
                    if (this.f30126y) {
                        i12 = actionBarLayout.f28722u1.d;
                    } else {
                        i12 = 0;
                    }
                    measureChildWithMargins(childAt2, i7, 0, i10, i12);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        b();
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        b();
    }

    public void setDrawNavigationBar(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i7) {
        this.f30118c = i7;
        invalidate();
    }

    public void setShouldHandleBottomInsets(p3 p3Var) {
        boolean z10;
        if (this.f30125x != p3Var) {
            this.f30125x = p3Var;
            if (p3Var != p3.f29850a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30126y = z10;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.F;
            if (actionBarLayout.f28720t1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.f28720t1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.i0.f56254a;
                r0.y.c(view);
            }
        }
    }
}
