package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.q70;
import org.telegram.ui.wm0;
public final class w1 extends ScrollView {
    public final int f23926a;
    public final Object f23927b;

    public w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.f23926a = i9;
        this.f23927b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23926a) {
            case 3:
                int action = motionEvent.getAction();
                float f10 = ((q70) this.f23927b).f41701b.f47780e;
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
        switch (this.f23926a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                c2 c2Var = (c2) this.f23927b;
                if (c2Var.f22794y[0].getPaint().getAlpha() != 0) {
                    c2Var.f22794y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    c2Var.f22794y[0].draw(canvas);
                }
                if (c2Var.f22794y[1].getPaint().getAlpha() != 0) {
                    c2Var.f22794y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    c2Var.f22794y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f23926a) {
            case 1:
                k60 k60Var = (k60) this.f23927b;
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    k60Var.f29987o0 = AndroidUtilities.dp(56.0f);
                } else {
                    k60Var.f29987o0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(k60Var.f29987o0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i9, i10);
                setMeasuredDimension(((kh.n5) this.f23927b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i9, i10);
                return;
            case 5:
                ((wm0) this.f23927b).f44180o0 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        switch (this.f23926a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i9, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f23926a) {
            case 3:
                q70 q70Var = (q70) this.f23927b;
                if (q70Var.v) {
                    q70Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.l0.C(20.0f, q70Var.E, rect.top);
                rect.bottom = org.telegram.messenger.l0.C(50.0f, q70Var.E, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i9 = ((fg0) this.f23927b).f38259a;
                if (i9 == 1 || i9 == 2 || i9 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i10 = ((wm0) this.f23927b).E1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f23927b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.l0.C(20.0f, usersSelectActivity.M, rect.top);
                rect.bottom = org.telegram.messenger.l0.C(50.0f, usersSelectActivity.M, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public w1(Context context, int i9, kh.n5 n5Var) {
        super(context, null, 0, i9);
        this.f23926a = 2;
        this.f23927b = n5Var;
    }
}
