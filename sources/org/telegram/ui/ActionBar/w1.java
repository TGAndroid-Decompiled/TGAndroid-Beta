package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.x60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.s70;
import org.telegram.ui.vm0;
public final class w1 extends ScrollView {
    public final int f23940a;
    public final Object f23941b;

    public w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f23940a = i10;
        this.f23941b = notificationCenterDelegate;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23940a) {
            case 3:
                int action = motionEvent.getAction();
                float f9 = ((s70) this.f23941b).f42294b.f49510e;
                float y8 = motionEvent.getY();
                if (action == 0 && y8 > f9) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f23940a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                c2 c2Var = (c2) this.f23941b;
                if (c2Var.f22811y[0].getPaint().getAlpha() != 0) {
                    c2Var.f22811y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    c2Var.f22811y[0].draw(canvas);
                }
                if (c2Var.f22811y[1].getPaint().getAlpha() != 0) {
                    c2Var.f22811y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    c2Var.f22811y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23940a) {
            case 1:
                x60 x60Var = (x60) this.f23941b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    x60Var.f34617o0 = AndroidUtilities.dp(56.0f);
                } else {
                    x60Var.f34617o0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(x60Var.f34617o0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((bg.l0) this.f23941b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                ((vm0) this.f23941b).f43654o0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f23940a) {
            case 5:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f23940a) {
            case 3:
                s70 s70Var = (s70) this.f23941b;
                if (s70Var.v) {
                    s70Var.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.x3.C(20.0f, s70Var.E, rect.top);
                rect.bottom = org.telegram.messenger.x3.C(50.0f, s70Var.E, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((fg0) this.f23941b).f38151a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                int i11 = ((vm0) this.f23941b).E1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 6:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f23941b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.x3.C(20.0f, usersSelectActivity.M, rect.top);
                rect.bottom = org.telegram.messenger.x3.C(50.0f, usersSelectActivity.M, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public w1(Context context, int i10, bg.l0 l0Var) {
        super(context, null, 0, i10);
        this.f23940a = 2;
        this.f23941b = l0Var;
    }
}
