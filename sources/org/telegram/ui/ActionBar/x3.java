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
    public b5 f23938a;
    public ActionBarLayout f23939b;
    public boolean f23940c;
    public final Paint d;
    public r0.m1 f23941e;
    public i0.b f23942f;
    public i0.b h;

    public x3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.b bVar = i0.b.f10847e;
        this.f23942f = bVar;
        this.h = bVar;
        n nVar = new n(this, 7);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(this, nVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        r0.m1 m1Var = this.f23941e;
        if (m1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.j0.b(view, m1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f23939b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f23939b.N(canvas, this);
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
        return ((ActionBarLayout) this.f23938a).j();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f23940c = true;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
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
        this.f23940c = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        i0.b bVar = this.f23942f;
        int i11 = (size - bVar.f10848a) - bVar.f10850c;
        int i12 = (size2 - bVar.f10849b) - bVar.d;
        Point point = AndroidUtilities.displaySize;
        point.x = i11;
        point.y = i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                int i14 = layoutParams.height;
                if (i14 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
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
        if (!this.f23940c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f23939b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i9) {
        Paint paint = this.d;
        if (paint.getColor() != i9) {
            paint.setColor(i9);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(b5 b5Var) {
        this.f23938a = b5Var;
    }
}
