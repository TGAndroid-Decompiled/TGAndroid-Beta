package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.d80;
import org.telegram.ui.fn0;
import org.telegram.ui.og0;
public final class x1 extends ScrollView {
    public final int f22401a;
    public final Object f22402b;

    public x1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f22401a = i10;
        this.f22402b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f22401a) {
            case 3:
                int action = motionEvent.getAction();
                float f10 = ((d80) this.f22402b).f36133b.f50509e;
                float y10 = motionEvent.getY();
                if (action == 0 && y10 > f10) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f22401a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                d2 d2Var = (d2) this.f22402b;
                if (d2Var.f21268y[0].getPaint().getAlpha() != 0) {
                    d2Var.f21268y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    d2Var.f21268y[0].draw(canvas);
                }
                if (d2Var.f21268y[1].getPaint().getAlpha() != 0) {
                    d2Var.f21268y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    d2Var.f21268y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f22401a) {
            case 1:
                e70 e70Var = (e70) this.f22402b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    e70Var.f26470p0 = AndroidUtilities.dp(56.0f);
                } else {
                    e70Var.f26470p0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(e70Var.f26470p0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((eg.i0) this.f22402b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((fn0) this.f22402b).f36951p0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f22401a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.f22401a) {
            case 3:
                d80 d80Var = (d80) this.f22402b;
                if (d80Var.v) {
                    d80Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.y3.C(20.0f, d80Var.F, rect.top);
                rect.bottom = org.telegram.messenger.y3.C(50.0f, d80Var.F, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z4);
            case 4:
                int i10 = ((og0) this.f22402b).f39750a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z4);
            case 5:
                int i11 = ((fn0) this.f22402b).F1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z4);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f22402b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.y3.C(20.0f, usersSelectActivity.N, rect.top);
                rect.bottom = org.telegram.messenger.y3.C(50.0f, usersSelectActivity.N, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z4);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z4);
        }
    }

    public x1(Context context, int i10, eg.i0 i0Var) {
        super(context, null, 0, i10);
        this.f22401a = 2;
        this.f22402b = i0Var;
    }
}
