package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class z3 extends FrameLayout {
    public d5 f21556a;
    public ActionBarLayout f21557b;
    public boolean f21558c;
    public final Paint d;
    public r0.l1 f21559e;
    public i0.c f21560f;
    public i0.c h;

    public z3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.c cVar = i0.c.f11424e;
        this.f21560f = cVar;
        this.h = cVar;
        n nVar = new n(this, 8);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(this, nVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.f21559e;
        if (l1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.i0.b(view, l1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f21557b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f21557b.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public Paint getInternalNavbarPaint() {
        return this.d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return ((ActionBarLayout) this.f21556a).j();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f21558c = true;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e7;
                    }
                }
            }
        }
        this.f21558c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        i0.c cVar = this.f21560f;
        int i12 = (size - cVar.f11425a) - cVar.f11427c;
        int i13 = (size2 - cVar.f11426b) - cVar.d;
        Point point = AndroidUtilities.displaySize;
        point.x = i12;
        point.y = i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i15 = layoutParams.height;
                if (i15 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824);
                }
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).e0()) {
                    childAt.forceLayout();
                }
                childAt.measure(makeMeasureSpec2, makeMeasureSpec);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f21558c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f21557b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i10) {
        Paint paint = this.d;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(d5 d5Var) {
        this.f21556a = d5Var;
    }
}
