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
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
public final class w extends FrameLayout {
    public boolean D;
    public final ActionBarLayout E;
    public final Rect f21418a;
    public boolean f21419b;
    public int f21420c;
    public final Paint d;
    public int e;
    public boolean f21421f;
    public int h;
    public int f21422n;
    public LinearGradient f21423r;
    public final Matrix f21424s;
    public Paint f21425w;
    public t3 f21426x;
    public boolean f21427y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.E = actionBarLayout;
        this.f21418a = new Rect();
        this.d = new Paint();
        this.f21424s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = t6.n0(i10);
        t3 t3Var = t3.f20863c;
        if (paddingLeft > 0 && this.f21426x != t3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f21426x != t3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.f21426x == t3.f20861a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.f20111s1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.f20111s1);
            return;
        }
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.x.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x02;
        i0.c cVar;
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.S0) {
            super.dispatchDraw(canvas);
            return;
        }
        s3 s3Var = actionBarLayout.f20121y;
        boolean z10 = false;
        if (s3Var != null) {
            x02 = s3Var.getInternalNavbarPaint().getColor();
        } else {
            x02 = t6.x0(null, t6.f20872a7, false);
        }
        boolean z11 = true;
        if (this == actionBarLayout.f20119x) {
            org.telegram.ui.Components.t5 t5Var = actionBarLayout.f20088h1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float d = t5Var.d(z10);
            if (d > 0.0f) {
                a(canvas, this.D, t6.r1(d, x02));
            }
        } else {
            k2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f20109s && this.f21426x != t3.f20861a) {
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        if (getChildAt(i10) instanceof h2) {
                            break;
                        }
                    }
                }
                z11 = false;
                a(canvas, z11, x02);
                if (z11 && this.f21427y && actionBarLayout.v(false) <= 0 && (cVar = actionBarLayout.f20113t1) != null && cVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.f20113t1.d, getWidth(), getHeight(), t6.n0(x02));
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
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.h && actionBarLayout.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !actionBarLayout.f20070a0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f20109s) {
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
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
        k2 k2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<g2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        g2 g2Var = null;
        if (!actionBarLayout.U0.isEmpty()) {
            k2Var = (k2) sc.e.g(1, actionBarLayout.U0);
        } else {
            k2Var = null;
        }
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            k2Var = actionBarLayout.G;
        }
        if (k2Var != null) {
            g2Var = k2Var.getLastSheet();
        }
        if (g2Var != null && g2Var.j() && g2Var.d() != view) {
            return true;
        }
        if (view instanceof l) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt != view && (childAt instanceof l) && childAt.getVisibility() == 0) {
                l lVar = (l) childAt;
                if (lVar.getCastShadows() && lVar.getShadowAlpha() > 0) {
                    i11 = childAt.getMeasuredHeight();
                    i12 = (int) childAt.getY();
                    i10 = lVar.getShadowAlpha();
                }
            } else {
                i14++;
            }
        }
        i10 = 0;
        i11 = 0;
        i12 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i11 != 0 && (drawable = ActionBarLayout.f20066v1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.f20066v1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.f20066v1.getIntrinsicHeight() + i15);
            ActionBarLayout.f20066v1.setAlpha(i10);
            ActionBarLayout.f20066v1.draw(canvas);
            ActionBarLayout.f20066v1.setAlpha(alpha);
        }
        if (this.D && this.f21427y && k2Var != null && k2Var.getListViewForSimpleGlass() == null && (i13 = org.telegram.messenger.i0.f16021n) >= org.telegram.messenger.i0.L(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = k2Var.getNavigationBarColor();
            if (i16 != this.h || this.f21422n != navigationBarColor || this.f21425w == null) {
                if (this.f21425w == null) {
                    this.f21425w = new Paint(1);
                }
                this.f21422n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{t6.r1(0.1f, navigationBarColor), t6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f21423r = linearGradient;
                this.f21425w.setShader(linearGradient);
            }
            Matrix matrix = this.f21424s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.f21423r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i16, getWidth(), getHeight(), this.f21425w);
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
        if (this.f21420c != 0) {
            int i10 = t6.f20929d6;
            int x02 = t6.x0(null, i10, false);
            int i11 = this.e;
            Paint paint = this.d;
            if (i11 != x02) {
                int x03 = t6.x0(null, i10, false);
                this.e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f21420c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z11 = false;
        int i16 = 0;
        while (true) {
            if (i16 < childCount) {
                View childAt = getChildAt(i16);
                if (childAt instanceof l) {
                    i14 = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i14);
                    break;
                }
                i16++;
            } else {
                i14 = 0;
                break;
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (!(childAt2 instanceof l)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof h2)) {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                } else {
                    int i19 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i19, layoutParams.topMargin, childAt2.getMeasuredWidth() + i19 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f21418a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i15 = org.telegram.messenger.i0.f16020m;
        } else {
            i15 = 0;
        }
        if (((height - i15) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top) > 0) {
            z11 = true;
        }
        this.f21419b = z11;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f20109s.f21419b && !actionBarLayout.f20117w.f21419b) {
            org.telegram.messenger.i0.r(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f21421f;
        ActionBarLayout actionBarLayout = this.E;
        if (z11 != z10 && actionBarLayout.x() && (actionBarLayout.h || actionBarLayout.f20070a0)) {
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                actionBarLayout.e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f21421f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f21418a);
        i3 i3Var = actionBarLayout.E;
        if (i3Var != null) {
            i3Var.setCurrentAccount(d20.f15147s0);
        }
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt instanceof l) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i12 = childAt.getMeasuredHeight();
                    break;
                }
                i15++;
            } else {
                i12 = 0;
                break;
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof l)) {
                if (childAt2 instanceof h2) {
                    if (actionBarLayout.v(false) <= 0 && this.f21427y) {
                        i14 = actionBarLayout.f20113t1.d;
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i14);
                } else if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                } else {
                    if (this.f21427y) {
                        i13 = actionBarLayout.f20113t1.d;
                    } else {
                        i13 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i13);
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
        if (this.D != z10) {
            this.D = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f21420c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(t3 t3Var) {
        boolean z10;
        if (this.f21426x != t3Var) {
            this.f21426x = t3Var;
            if (t3Var != t3.f20861a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21427y = z10;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.E;
            if (actionBarLayout.f20111s1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.f20111s1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.h0.f46123a;
                r0.x.c(view);
            }
        }
    }
}
