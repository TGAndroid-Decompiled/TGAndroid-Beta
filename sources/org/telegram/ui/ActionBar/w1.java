package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y70;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.in0;
public final class w1 extends ScrollView {
    public final int f23206a;
    public final Object f23207b;

    public w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f23206a = i10;
        this.f23207b = notificationCenterDelegate;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f23206a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                e2 e2Var = (e2) this.f23207b;
                if (e2Var.f22598y[0].getPaint().getAlpha() != 0) {
                    e2Var.f22598y[0].setBounds(0, getScrollY(), getMeasuredWidth(), AndroidUtilities.dp(3.0f) + getScrollY());
                    e2Var.f22598y[0].draw(canvas);
                }
                if (e2Var.f22598y[1].getPaint().getAlpha() != 0) {
                    e2Var.f22598y[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    e2Var.f22598y[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23206a) {
            case 1:
                y70 y70Var = (y70) this.f23207b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    y70Var.f34961s0 = AndroidUtilities.dp(56.0f);
                } else {
                    y70Var.f34961s0 = AndroidUtilities.dp(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(y70Var.f34961s0, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((fi.l5) this.f23207b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                ((in0) this.f23207b).f40313s0 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f23206a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f23206a) {
            case 3:
                int i10 = ((gg0) this.f23207b).f39651a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i11 = ((in0) this.f23207b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f23207b;
                if (usersSelectActivity.v) {
                    usersSelectActivity.v = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.t.D(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = org.telegram.messenger.t.D(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public w1(Context context, int i10, fi.l5 l5Var) {
        super(context, null, 0, i10);
        this.f23206a = 2;
        this.f23207b = l5Var;
    }
}
