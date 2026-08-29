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
public final class x3 extends FrameLayout {
    public b5 f23963a;
    public ActionBarLayout f23964b;
    public boolean f23965c;
    public final Paint d;
    public r0.m1 f23966e;
    public i0.b f23967f;
    public i0.b h;

    public x3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.b bVar = i0.b.f8185e;
        this.f23967f = bVar;
        this.h = bVar;
        o oVar = new o(this, 7);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(this, oVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.f23966e;
        if (m1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.j0.b(view, m1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f23964b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f23964b.N(canvas, this);
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
        return ((ActionBarLayout) this.f23963a).j();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f23965c = true;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e10;
                    }
                }
            }
        }
        this.f23965c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        i0.b bVar = this.f23967f;
        int i12 = (size - bVar.f8186a) - bVar.f8188c;
        int i13 = (size2 - bVar.f8187b) - bVar.d;
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
        if (!this.f23965c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f23964b = actionBarLayout;
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

    public void setParentActionBarLayout(b5 b5Var) {
        this.f23963a = b5Var;
    }
}
