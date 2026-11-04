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
import org.telegram.messenger.h10;
public final class v extends FrameLayout {
    public boolean E;
    public final ActionBarLayout F;
    public final Rect f28701a;
    public boolean f28702b;
    public int f28703c;
    public final Paint d;
    public int f28704e;
    public boolean f28705f;
    public int h;
    public int f28706n;
    public LinearGradient f28707r;
    public final Matrix f28708s;
    public Paint f28709w;
    public m3 f28710x;
    public boolean f28711y;

    public v(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.F = actionBarLayout;
        this.f28701a = new Rect();
        this.d = new Paint();
        this.f28708s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i3) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = k6.n0(i3);
        m3 m3Var = m3.f28339c;
        if (paddingLeft > 0 && this.f28710x != m3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f28710x != m3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.f28710x == m3.f28337a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.f27320t1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.f27320t1);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.y.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v.b():void");
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
        l3 l3Var = actionBarLayout.f27329y;
        boolean z10 = false;
        if (l3Var != null) {
            x02 = l3Var.getInternalNavbarPaint().getColor();
        } else {
            x02 = k6.x0(null, k6.f27824a7, false);
        }
        boolean z11 = true;
        if (this == actionBarLayout.f27327x) {
            org.telegram.ui.Components.u5 u5Var = actionBarLayout.f27298i1;
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.hasSheet()) {
                z10 = true;
            }
            float d = u5Var.d(z10);
            if (d > 0.0f) {
                a(canvas, this.E, k6.r1(d, x02));
            }
        } else {
            d2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f27316s && this.f28710x != m3.f28337a) {
                    int childCount = getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        if (getChildAt(i3) instanceof a2) {
                            break;
                        }
                    }
                }
                z11 = false;
                a(canvas, z11, x02);
                if (z11 && this.f28711y && actionBarLayout.w(false) <= 0 && (bVar = actionBarLayout.f27322u1) != null && bVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.f27322u1.d, getWidth(), getHeight(), k6.n0(x02));
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
        if ((!z10 && !actionBarLayout.f27280b0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f27316s) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d2 d2Var;
        int i3;
        int i10;
        int i11;
        int i12;
        Drawable drawable;
        ArrayList<z1> arrayList;
        ActionBarLayout actionBarLayout = this.F;
        z1 z1Var = null;
        if (!actionBarLayout.V0.isEmpty()) {
            d2Var = (d2) t4.c.d(1, actionBarLayout.V0);
        } else {
            d2Var = null;
        }
        r rVar = actionBarLayout.H;
        if (rVar != null && (arrayList = rVar.sheetsStack) != null && !arrayList.isEmpty()) {
            d2Var = actionBarLayout.H;
        }
        if (d2Var != null) {
            z1Var = d2Var.getLastSheet();
        }
        if (z1Var != null && z1Var.j() && z1Var.d() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j10);
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
                    i3 = kVar.getShadowAlpha();
                }
            } else {
                i13++;
            }
        }
        i3 = 0;
        i10 = 0;
        i11 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0 && (drawable = ActionBarLayout.f27273w1) != null) {
            int alpha = drawable.getAlpha();
            int i14 = i11 + i10;
            ActionBarLayout.f27273w1.setBounds(0, i14, getMeasuredWidth(), ActionBarLayout.f27273w1.getIntrinsicHeight() + i14);
            ActionBarLayout.f27273w1.setAlpha(i3);
            ActionBarLayout.f27273w1.draw(canvas);
            ActionBarLayout.f27273w1.setAlpha(alpha);
        }
        if (!actionBarLayout.T0 && this.E && this.f28711y && d2Var != null && d2Var.getListViewForSimpleGlass() == null && (i12 = org.telegram.messenger.g0.f22603n) >= org.telegram.messenger.g0.L(32.0f)) {
            int i15 = (int) (i12 * 1.33f);
            int navigationBarColor = d2Var.getNavigationBarColor();
            if (i15 != this.h || this.f28706n != navigationBarColor || this.f28709w == null) {
                if (this.f28709w == null) {
                    this.f28709w = new Paint(1);
                }
                this.f28706n = navigationBarColor;
                this.h = i15;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i15, new int[]{k6.r1(0.1f, navigationBarColor), k6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f28707r = linearGradient;
                this.f28709w.setShader(linearGradient);
            }
            Matrix matrix = this.f28708s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i15);
            this.f28707r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i15, getWidth(), getHeight(), this.f28709w);
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
        if (this.f28703c != 0) {
            int i3 = k6.f27878d6;
            int x02 = k6.x0(null, i3, false);
            int i10 = this.f28704e;
            Paint paint = this.d;
            if (i10 != x02) {
                int x03 = k6.x0(null, i3, false);
                this.f28704e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f28703c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
                if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof a2)) {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin + i13, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i13);
                } else {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f28701a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i14 = org.telegram.messenger.g0.f22602m;
        } else {
            i14 = 0;
        }
        if (((height - i14) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top) > 0) {
            z11 = true;
        }
        this.f28702b = z11;
        ActionBarLayout actionBarLayout = this.F;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f27316s.f28702b && !actionBarLayout.f27325w.f28702b) {
            org.telegram.messenger.g0.r(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f28705f;
        ActionBarLayout actionBarLayout = this.F;
        if (z11 != z10 && actionBarLayout.y()) {
            actionBarLayout.v();
        }
        this.f28705f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f28701a);
        b3 b3Var = actionBarLayout.F;
        if (b3Var != null) {
            b3Var.setCurrentAccount(h10.f22829t0);
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
                if (childAt2 instanceof a2) {
                    if (actionBarLayout.w(false) <= 0 && this.f28711y) {
                        i13 = actionBarLayout.f27322u1.d;
                    } else {
                        i13 = 0;
                    }
                    measureChildWithMargins(childAt2, i3, 0, i10, i13);
                } else if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i3, 0, i10, i11);
                } else {
                    if (this.f28711y) {
                        i12 = actionBarLayout.f27322u1.d;
                    } else {
                        i12 = 0;
                    }
                    measureChildWithMargins(childAt2, i3, 0, i10, i12);
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

    public void setFragmentPanTranslationOffset(int i3) {
        this.f28703c = i3;
        invalidate();
    }

    public void setShouldHandleBottomInsets(m3 m3Var) {
        boolean z10;
        if (this.f28710x != m3Var) {
            this.f28710x = m3Var;
            if (m3Var != m3.f28337a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f28711y = z10;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.F;
            if (actionBarLayout.f27320t1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.f27320t1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.i0.f54015a;
                r0.y.c(view);
            }
        }
    }
}
