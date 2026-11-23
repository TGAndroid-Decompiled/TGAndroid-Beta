package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class f61 extends org.telegram.ui.Components.ek0 {
    public final int f47618f3;

    public f61(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f47618f3 = i7;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f47618f3) {
            case 1:
                return 0;
            case 2:
            case 5:
            case 6:
            case 8:
            default:
                return super.V0(i7);
            case 3:
                return 0;
            case 4:
                return 0;
            case 7:
                return 0;
            case 9:
                return 0;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f47618f3) {
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
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47618f3) {
            case 8:
                int size = View.MeasureSpec.getSize(i10);
                int b10 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b10 <= size) {
                    size = b10;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 11:
                int size2 = View.MeasureSpec.getSize(i10);
                int b11 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b11 <= size2) {
                    size2 = b11;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f47618f3) {
            case 13:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void r0(View view, View view2) {
        switch (this.f47618f3) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.b6) {
                    super.r0(view, view2);
                    return;
                }
                return;
            case 12:
                if (view instanceof org.telegram.ui.Cells.b6) {
                    super.r0(view, view2);
                    return;
                }
                return;
            default:
                super.r0(view, view2);
                return;
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f47618f3) {
            case 5:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 12:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f47618f3) {
            case 10:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    public f61(Context context) {
        super(context, null);
        this.f47618f3 = 13;
    }
}
