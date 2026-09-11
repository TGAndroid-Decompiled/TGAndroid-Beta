package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
public final class ec1 extends org.telegram.ui.Components.ll0 {
    public final int X2;

    public ec1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = i10;
    }

    @Override
    public Integer V0(int i10) {
        switch (this.X2) {
            case 1:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 8:
                return 0;
            default:
                return super.V0(i10);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 2:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z11 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z11 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z11);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
            case 7:
                int size = View.MeasureSpec.getSize(i11);
                int h = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h <= size) {
                    size = h;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 10:
                int size2 = View.MeasureSpec.getSize(i11);
                int h10 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h10 <= size2) {
                    size2 = h10;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void q0(View view, View view2) {
        switch (this.X2) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    return;
                }
                return;
            case 11:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    return;
                }
                return;
            default:
                super.q0(view, view2);
                return;
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.X2) {
            case 5:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 11:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.X2) {
            case 9:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    public ec1(Context context) {
        super(context, null);
        this.X2 = 12;
    }
}
