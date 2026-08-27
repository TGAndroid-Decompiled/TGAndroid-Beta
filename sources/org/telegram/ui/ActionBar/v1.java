package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ig0;
import org.telegram.ui.t70;
import org.telegram.ui.xm0;

public final class v1 extends ScrollView {

    public final int f23879a;

    public final Object f23880b;

    public v1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f23879a = i10;
        this.f23880b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23879a) {
            case 3:
                int action = motionEvent.getAction();
                float f10 = ((t70) this.f23880b).f42795b.f48502e;
                float y10 = motionEvent.getY();
                if (action != 0 || y10 <= f10) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f23879a) {
            case 0:
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                b2 b2Var = (b2) this.f23880b;
                if (b2Var.f22775y[0].getPaint().getAlpha() != 0) {
                    b2Var.f22775y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    b2Var.f22775y[0].draw(canvas);
                }
                if (b2Var.f22775y[1].getPaint().getAlpha() != 0) {
                    b2Var.f22775y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    b2Var.f22775y[1].draw(canvas);
                }
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23879a) {
            case 1:
                p60 p60Var = (p60) this.f23880b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    p60Var.f31527o0 = AndroidUtilities.dp(144.0f);
                } else {
                    p60Var.f31527o0 = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(p60Var.f31527o0, Integer.MIN_VALUE));
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((lh.m5) this.f23880b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                ((xm0) this.f23880b).f44511o0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f23879a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f23879a) {
            case 3:
                t70 t70Var = (t70) this.f23880b;
                if (t70Var.v) {
                    t70Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.y1.C(20.0f, t70Var.E, rect.top);
                rect.bottom = org.telegram.messenger.y1.C(50.0f, t70Var.E, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((ig0) this.f23880b).f39079a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((xm0) this.f23880b).E1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f23880b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.y1.C(20.0f, usersSelectActivity.M, rect.top);
                rect.bottom = org.telegram.messenger.y1.C(50.0f, usersSelectActivity.M, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public v1(Context context, int i10, lh.m5 m5Var) {
        super(context, null, 0, i10);
        this.f23879a = 2;
        this.f23880b = m5Var;
    }
}
