package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.a80;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bh0;
import org.telegram.ui.p80;
import org.telegram.ui.un0;
public final class u1 extends ScrollView {
    public final int f20703a;
    public final Object f20704b;

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f20703a = i10;
        this.f20704b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f20703a) {
            case 3:
                int action = motionEvent.getAction();
                float f7 = ((p80) this.f20704b).f39143b.e;
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f20703a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                a2 a2Var = (a2) this.f20704b;
                if (a2Var.f19591y[0].getPaint().getAlpha() != 0) {
                    a2Var.f19591y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    a2Var.f19591y[0].draw(canvas);
                }
                if (a2Var.f19591y[1].getPaint().getAlpha() != 0) {
                    a2Var.f19591y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    a2Var.f19591y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f20703a) {
            case 1:
                a80 a80Var = (a80) this.f20704b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    a80Var.f23483s0 = AndroidUtilities.dp(56.0f);
                } else {
                    a80Var.f23483s0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(a80Var.f23483s0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((di.v5) this.f20704b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((un0) this.f20704b).f40760s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f20703a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f20703a) {
            case 3:
                p80 p80Var = (p80) this.f20704b;
                if (p80Var.v) {
                    p80Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = yh.c(20.0f, p80Var.I, rect.top);
                rect.bottom = yh.c(50.0f, p80Var.I, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((bh0) this.f20704b).f34543a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((un0) this.f20704b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f20704b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = yh.c(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = yh.c(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public u1(Context context, int i10, di.v5 v5Var) {
        super(context, null, 0, i10);
        this.f20703a = 2;
        this.f20704b = v5Var;
    }
}
