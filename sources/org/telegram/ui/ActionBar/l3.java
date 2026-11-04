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
public final class l3 extends FrameLayout {
    public q4 f28305a;
    public ActionBarLayout f28306b;
    public boolean f28307c;
    public final Paint d;
    public r0.k1 f28308e;
    public i0.b f28309f;
    public i0.b h;

    public l3(Activity activity) {
        super(activity);
        this.d = new Paint(1);
        i0.b bVar = i0.b.f14494e;
        this.f28309f = bVar;
        this.h = bVar;
        e3 e3Var = new e3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(this, e3Var);
        setSystemUiVisibility(1280);
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        r0.k1 k1Var = this.f28308e;
        if (k1Var != null) {
            if ((view instanceof ActionBarLayout) || view.getTag() == null) {
                r0.i0.b(view, k1Var);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f28306b;
        if (actionBarLayout != null && actionBarLayout.getParent() == this) {
            this.f28306b.Q(canvas, this);
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
        return ((ActionBarLayout) this.f28305a).i();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f28307c = true;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                try {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin + getPaddingTop(), layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight() + getPaddingTop());
                } catch (Exception e10) {
                    a8.g(e10, true);
                    boolean z11 = org.telegram.messenger.r2.f25040a;
                    throw e10;
                }
            }
        }
        this.f28307c = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        i0.b bVar = this.f28309f;
        int i11 = (size - bVar.f14495a) - bVar.f14497c;
        int i12 = (size2 - bVar.f14496b) - bVar.d;
        Point point = org.telegram.messenger.g0.f22608q;
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
        if (!this.f28307c) {
            super.requestLayout();
        }
    }

    public void setActionBarLayout(ActionBarLayout actionBarLayout) {
        this.f28306b = actionBarLayout;
    }

    public void setInternalNavigationBarColor(int i3) {
        Paint paint = this.d;
        if (paint.getColor() != i3) {
            paint.setColor(i3);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setParentActionBarLayout(q4 q4Var) {
        this.f28305a = q4Var;
    }
}
