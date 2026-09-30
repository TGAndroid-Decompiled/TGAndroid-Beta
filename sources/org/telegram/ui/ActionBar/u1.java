package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.g80;
import org.telegram.ui.qg0;
public final class u1 extends ScrollView {
    public final int f19833a;
    public final Object f19834b;

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f19833a = i10;
        this.f19834b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f19833a) {
            case 3:
                int action = motionEvent.getAction();
                float f7 = ((g80) this.f19834b).f33991b.e;
                float y3 = motionEvent.getY();
                if (action == 0 && y3 > f7) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f19833a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                a2 a2Var = (a2) this.f19834b;
                if (a2Var.f18721y[0].getPaint().getAlpha() != 0) {
                    a2Var.f18721y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    a2Var.f18721y[0].draw(canvas);
                }
                if (a2Var.f18721y[1].getPaint().getAlpha() != 0) {
                    a2Var.f18721y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    a2Var.f18721y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f19833a) {
            case 1:
                p70 p70Var = (p70) this.f19834b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    p70Var.f27280s0 = AndroidUtilities.dp(56.0f);
                } else {
                    p70Var.f27280s0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(p70Var.f27280s0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((ci.w5) this.f19834b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((fn0) this.f19834b).f33828s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f19833a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f19833a) {
            case 3:
                g80 g80Var = (g80) this.f19834b;
                if (g80Var.v) {
                    g80Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.f0.C(20.0f, g80Var.I, rect.top);
                rect.bottom = org.telegram.messenger.f0.C(50.0f, g80Var.I, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((qg0) this.f19834b).f36985a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((fn0) this.f19834b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f19834b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.f0.C(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = org.telegram.messenger.f0.C(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public u1(Context context, int i10, ci.w5 w5Var) {
        super(context, null, 0, i10);
        this.f19833a = 2;
        this.f19834b = w5Var;
    }
}
