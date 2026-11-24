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
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class b extends FrameLayout {
    public boolean E;
    public final ActionBarLayout F;
    public final Rect a;
    public boolean b;
    public int c;
    public final Paint d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public LinearGradient r;
    public final Matrix s;
    public Paint w;
    public bu3 x;
    public boolean y;

    public b(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.F = actionBarLayout;
        this.a = new Rect();
        this.d = new Paint();
        this.s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z, int i) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint l0 = cmb.l0(i);
        bu3 bu3Var = bu3.c;
        if (paddingLeft > 0 && this.x != bu3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l0);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.x != bu3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l0);
        }
        if (paddingBottom > 0) {
            if (this.x == bu3.a || z) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l0);
            }
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
            actionBarLayout.m(this, actionBarLayout.t1);
            return;
        }
        WeakHashMap weakHashMap = kfc.a;
        afc.c(this);
    }

    public final void b() {
        int i;
        try {
            int childCount = getChildCount();
            int i2 = childCount - 1;
            while (true) {
                if (i2 >= 0) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof rx) && childAt.getVisibility() == 0) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2 != null) {
                    if (i2 != -1 && i3 != i2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    if (childAt2.getImportantForAccessibility() != i) {
                        childAt2.setImportantForAccessibility(i);
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w0;
        iq5 iq5Var;
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.T0) {
            super.dispatchDraw(canvas);
            return;
        }
        wr3 wr3Var = actionBarLayout.y;
        boolean z = false;
        if (wr3Var != null) {
            w0 = wr3Var.getInternalNavbarPaint().getColor();
        } else {
            w0 = cmb.w0(null, cmb.Z6, false);
        }
        boolean z2 = true;
        if (this == actionBarLayout.x) {
            ln lnVar = actionBarLayout.i1;
            k6 k6Var = actionBarLayout.H;
            if (k6Var != null && k6Var.hasSheet()) {
                z = true;
            }
            float d = lnVar.d(z);
            if (d > 0.0f) {
                a(canvas, this.E, cmb.p1(d, w0));
            }
        } else {
            d lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.s && this.x != bu3.a) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        if (getChildAt(i) instanceof rx) {
                            break;
                        }
                    }
                }
                z2 = false;
                a(canvas, z2, w0);
                if (z2 && this.y && actionBarLayout.u(false) <= 0 && (iq5Var = actionBarLayout.u1) != null && iq5Var.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.u1.d, getWidth(), getHeight(), cmb.l0(w0));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        d dVar;
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        ArrayList<ah0> arrayList;
        ActionBarLayout actionBarLayout = this.F;
        ah0 ah0Var = null;
        if (!actionBarLayout.V0.isEmpty()) {
            dVar = (d) aq1.m(1, actionBarLayout.V0);
        } else {
            dVar = null;
        }
        k6 k6Var = actionBarLayout.H;
        if (k6Var != null && (arrayList = k6Var.sheetsStack) != null && !arrayList.isEmpty()) {
            dVar = actionBarLayout.H;
        }
        if (dVar != null) {
            ah0Var = dVar.getLastSheet();
        }
        if (ah0Var != null && ah0Var.h() && ah0Var.d() != view) {
            return true;
        }
        if (view instanceof a) {
            return super.drawChild(canvas, view, j);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt != view && (childAt instanceof a) && childAt.getVisibility() == 0) {
                a aVar = (a) childAt;
                if (aVar.getCastShadows() && aVar.getShadowAlpha() > 0) {
                    i2 = childAt.getMeasuredHeight();
                    i3 = (int) childAt.getY();
                    i = aVar.getShadowAlpha();
                }
            } else {
                i5++;
            }
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i2 != 0 && (drawable = ActionBarLayout.w1) != null) {
            int alpha = drawable.getAlpha();
            int i6 = i3 + i2;
            ActionBarLayout.w1.setBounds(0, i6, getMeasuredWidth(), ActionBarLayout.w1.getIntrinsicHeight() + i6);
            ActionBarLayout.w1.setAlpha(i);
            ActionBarLayout.w1.draw(canvas);
            ActionBarLayout.w1.setAlpha(alpha);
        }
        if (!actionBarLayout.T0 && this.E && this.y && dVar != null && dVar.getListViewForSimpleGlass() == null && (i4 = gm.n) >= gm.L(32.0f)) {
            int i7 = (int) (i4 * 1.33f);
            int navigationBarColor = dVar.getNavigationBarColor();
            if (i7 != this.h || this.n != navigationBarColor || this.w == null) {
                if (this.w == null) {
                    this.w = new Paint(1);
                }
                this.n = navigationBarColor;
                this.h = i7;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i7, new int[]{cmb.p1(0.1f, navigationBarColor), cmb.p1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.r = linearGradient;
                this.w.setShader(linearGradient);
            }
            Matrix matrix = this.s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i7);
            this.r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i7, getWidth(), getHeight(), this.w);
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
        if (this.c != 0) {
            int i = cmb.c6;
            int w0 = cmb.w0(null, i, false);
            int i2 = this.e;
            Paint paint = this.d;
            if (i2 != w0) {
                int w02 = cmb.w0(null, i, false);
                this.e = w02;
                paint.setColor(w02);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt instanceof a) {
                    i5 = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i5);
                    break;
                }
                i7++;
            } else {
                i5 = 0;
                break;
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (!(childAt2 instanceof a)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(2131296649) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof rx)) {
                    int i9 = layoutParams.leftMargin + paddingLeft;
                    childAt2.layout(i9, layoutParams.topMargin + i5, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight() + layoutParams.topMargin + i5);
                } else {
                    int i10 = layoutParams.leftMargin + paddingLeft;
                    childAt2.layout(i10, layoutParams.topMargin, childAt2.getMeasuredWidth() + i10, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i6 = gm.m;
        } else {
            i6 = 0;
        }
        if (((height - i6) - gm.o1(rootView)) - (rect.bottom - rect.top) > 0) {
            z2 = true;
        }
        this.b = z2;
        ActionBarLayout actionBarLayout = this.F;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.s.b && !actionBarLayout.w.b) {
            gm.r(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > size) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.f;
        ActionBarLayout actionBarLayout = this.F;
        if (z2 != z && actionBarLayout.w()) {
            actionBarLayout.t();
        }
        this.f = z;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.a);
        xy0 xy0Var = actionBarLayout.F;
        if (xy0Var != null) {
            xy0Var.setCurrentAccount(z8c.t0);
        }
        int i6 = 0;
        while (true) {
            if (i6 < childCount) {
                View childAt = getChildAt(i6);
                if (childAt instanceof a) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i3 = childAt.getMeasuredHeight();
                    break;
                }
                i6++;
            } else {
                i3 = 0;
                break;
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (!(childAt2 instanceof a)) {
                if (childAt2 instanceof rx) {
                    if (actionBarLayout.u(false) <= 0 && this.y) {
                        i5 = actionBarLayout.u1.d;
                    } else {
                        i5 = 0;
                    }
                    measureChildWithMargins(childAt2, i, 0, i2, i5);
                } else if (childAt2.getTag(2131296649) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i, 0, i2, i3);
                } else {
                    if (this.y) {
                        i4 = actionBarLayout.u1.d;
                    } else {
                        i4 = 0;
                    }
                    measureChildWithMargins(childAt2, i, 0, i2, i4);
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

    public void setDrawNavigationBar(boolean z) {
        if (this.E != z) {
            this.E = z;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i) {
        this.c = i;
        invalidate();
    }

    public void setShouldHandleBottomInsets(bu3 bu3Var) {
        boolean z;
        if (this.x != bu3Var) {
            this.x = bu3Var;
            if (bu3Var != bu3.a) {
                z = true;
            } else {
                z = false;
            }
            this.y = z;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.F;
            if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
                actionBarLayout.m(this, actionBarLayout.t1);
            } else if (view != null) {
                WeakHashMap weakHashMap = kfc.a;
                afc.c(view);
            }
        }
    }
}
