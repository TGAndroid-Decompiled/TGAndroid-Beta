package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import bi.w6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.k80;
import org.telegram.ui.on0;
import org.telegram.ui.xg0;
public final class x1 extends ScrollView {
    public final int f18728a;
    public final Object f18729b;

    public x1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f18728a = i10;
        this.f18729b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f18728a) {
            case 3:
                int action = motionEvent.getAction();
                float f7 = ((k80) this.f18729b).f34259b.e;
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
        switch (this.f18728a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                d2 d2Var = (d2) this.f18729b;
                if (d2Var.f17643y[0].getPaint().getAlpha() != 0) {
                    d2Var.f17643y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    d2Var.f17643y[0].draw(canvas);
                }
                if (d2Var.f17643y[1].getPaint().getAlpha() != 0) {
                    d2Var.f17643y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    d2Var.f17643y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f18728a) {
            case 1:
                k70 k70Var = (k70) this.f18729b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    k70Var.f24643s0 = AndroidUtilities.dp(56.0f);
                } else {
                    k70Var.f24643s0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(k70Var.f24643s0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((w6) this.f18729b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((on0) this.f18729b).f35558s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f18728a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f18728a) {
            case 3:
                k80 k80Var = (k80) this.f18729b;
                if (k80Var.v) {
                    k80Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.a2.C(20.0f, k80Var.I, rect.top);
                rect.bottom = org.telegram.messenger.a2.C(50.0f, k80Var.I, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((xg0) this.f18729b).f38717a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((on0) this.f18729b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f18729b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.a2.C(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = org.telegram.messenger.a2.C(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public x1(Context context, int i10, w6 w6Var) {
        super(context, null, 0, i10);
        this.f18728a = 2;
        this.f18729b = w6Var;
    }
}
