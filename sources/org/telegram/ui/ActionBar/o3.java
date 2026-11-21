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
import org.telegram.messenger.a8;
public final class o3 extends FrameLayout {
    public r4 f29844a;
    public ActionBarLayout f29845b;
    public boolean f29846c;
    public final Paint d;
    public r0.l1 f29847e;
    public i0.b f29848f;
    public i0.b h;

    public o3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.b bVar = i0.b.f15913e;
        this.f29848f = bVar;
        this.h = bVar;
        org.telegram.tgnet.u uVar = new org.telegram.tgnet.u(this, 6);
        WeakHashMap weakHashMap = r0.i0.f56285a;
        r0.a0.i(this, uVar);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.l1 l1Var = this.f29847e;
        if (l1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.i0.b(view, l1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f29845b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f29845b.Q(canvas, this);
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
        return ((ActionBarLayout) this.f29844a).i();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f29846c = true;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e10) {
                    a8.g(e10, true);
                    boolean z11 = org.telegram.messenger.s2.f26749a;
                    throw e10;
                }
            }
        }
        this.f29846c = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        i0.b bVar = this.f29848f;
        int i11 = (size - bVar.f15914a) - bVar.f15916c;
        int i12 = (size2 - bVar.f15915b) - bVar.d;
        Point point = org.telegram.messenger.g0.f24146q;
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
                if ((childAt instanceof ActionBarLayout) && ((ActionBarLayout) childAt).i0()) {
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
        if (!this.f29846c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f29845b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i7) {
        Paint paint = this.d;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(r4 r4Var) {
        this.f29844a = r4Var;
    }
}
