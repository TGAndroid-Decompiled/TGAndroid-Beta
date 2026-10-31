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
import org.telegram.messenger.f8;
public final class s3 extends FrameLayout {
    public z4 f20768a;
    public ActionBarLayout f20769b;
    public boolean f20770c;
    public final Paint d;
    public r0.j1 e;
    public i0.c f20771f;
    public i0.c h;

    public s3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.c cVar = i0.c.e;
        this.f20771f = cVar;
        this.h = cVar;
        mg.l lVar = new mg.l(this, 13);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(this, lVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.j1 j1Var = this.e;
        if (j1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.h0.b(view, j1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f20769b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f20769b.P(canvas, this);
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
        return ((ActionBarLayout) this.f20768a).i();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f20770c = true;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e) {
                    f8.g(e, true);
                    boolean z11 = org.telegram.messenger.v2.f18448a;
                    throw e;
                }
            }
        }
        this.f20770c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        i0.c cVar = this.f20771f;
        int i12 = (size - cVar.f7765a) - cVar.f7767c;
        int i13 = (size2 - cVar.f7766b) - cVar.d;
        Point point = org.telegram.messenger.i0.f16026q;
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
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).h0()) {
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
        if (!this.f20770c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f20769b = actionBarLayout;
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

    public void setParentActionBarLayout(z4 z4Var) {
        this.f20768a = z4Var;
    }
}
