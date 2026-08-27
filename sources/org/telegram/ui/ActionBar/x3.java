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

    public b5 f23949a;

    public ActionBarLayout f23950b;

    public boolean f23951c;
    public final Paint d;

    public r0.m1 f23952e;

    public i0.c f23953f;
    public i0.c h;

    public x3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.c cVar = i0.c.f10488e;
        this.f23953f = cVar;
        this.h = cVar;
        n nVar = new n(this, 7);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(this, nVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.f23952e;
        if (m1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.j0.b(view, m1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f23950b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f23950b.N(canvas, this);
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
        return ((ActionBarLayout) this.f23949a).j();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Exception {
        this.f23951c = true;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e9) {
                    FileLog.e(e9);
                    if (BuildVars.DEBUG_VERSION) {
                        throw e9;
                    }
                }
            }
        }
        this.f23951c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        i0.c cVar = this.f23953f;
        int i12 = (size - cVar.f10489a) - cVar.f10491c;
        int i13 = (size2 - cVar.f10490b) - cVar.d;
        Point point = AndroidUtilities.displaySize;
        point.x = i12;
        point.y = i13;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i15 = layoutParams.height;
                int iMakeMeasureSpec2 = i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824);
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).e0()) {
                    childAt.forceLayout();
                }
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f23951c) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f23950b = actionBarLayout;
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
        this.f23949a = b5Var;
    }
}
