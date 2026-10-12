package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.g80;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.n80;
import org.telegram.ui.pn0;
import org.telegram.ui.xg0;
public final class u1 extends ScrollView {
    public final int f21339a;
    public final Object f21340b;

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f21339a = i10;
        this.f21340b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f21339a) {
            case 3:
                int action = motionEvent.getAction();
                float f7 = ((n80) this.f21340b).f40319b.f16096e;
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
        switch (this.f21339a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                a2 a2Var = (a2) this.f21340b;
                if (a2Var.f20186y[0].getPaint().getAlpha() != 0) {
                    a2Var.f20186y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    a2Var.f20186y[0].draw(canvas);
                }
                if (a2Var.f20186y[1].getPaint().getAlpha() != 0) {
                    a2Var.f20186y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    a2Var.f20186y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f21339a) {
            case 1:
                g80 g80Var = (g80) this.f21340b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    g80Var.f26338s0 = AndroidUtilities.dp(56.0f);
                } else {
                    g80Var.f26338s0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(g80Var.f26338s0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((ci.w5) this.f21340b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((pn0) this.f21340b).f41043s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f21339a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f21339a) {
            case 3:
                n80 n80Var = (n80) this.f21340b;
                if (n80Var.v) {
                    n80Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.v0.C(20.0f, n80Var.I, rect.top);
                rect.bottom = org.telegram.messenger.v0.C(50.0f, n80Var.I, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((xg0) this.f21340b).f43937a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((pn0) this.f21340b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f21340b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.v0.C(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = org.telegram.messenger.v0.C(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public u1(Context context, int i10, ci.w5 w5Var) {
        super(context, null, 0, i10);
        this.f21339a = 2;
        this.f21340b = w5Var;
    }
}
