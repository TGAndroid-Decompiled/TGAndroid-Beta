package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.cs;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.xd0;
import org.telegram.ui.yj0;
public final class k1 extends ScrollView {
    public final int f27760a;
    public final Object f27761b;

    public k1(cs csVar, Context context, int i3) {
        super(context);
        this.f27760a = i3;
        this.f27761b = csVar;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f27760a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                s1 s1Var = (s1) this.f27761b;
                if (s1Var.E[0].getPaint().getAlpha() != 0) {
                    s1Var.E[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    s1Var.E[0].draw(canvas);
                }
                if (s1Var.E[1].getPaint().getAlpha() != 0) {
                    s1Var.E[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    s1Var.E[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f27760a) {
            case 1:
                t50 t50Var = (t50) this.f27761b;
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    t50Var.f38297k2 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    t50Var.f38297k2 = org.telegram.messenger.g0.L(144.0f);
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(t50Var.f38297k2, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i3, i10);
                setMeasuredDimension(((pd0) this.f27761b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i3, i10);
                return;
            case 4:
                ((yj0) this.f27761b).f52327t0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        switch (this.f27760a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i3, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f27760a) {
            case 3:
                int i3 = ((xd0) this.f27761b).f51946a;
                if (i3 == 1 || i3 == 2 || i3 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((yj0) this.f27761b).J1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f27761b;
                if (usersSelectActivity.f42113w) {
                    usersSelectActivity.f42113w = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.k5.C(20.0f, usersSelectActivity.S, rect.top);
                rect.bottom = org.telegram.messenger.k5.C(50.0f, usersSelectActivity.S, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public k1(Context context, pd0 pd0Var) {
        super(context, null, 0, 2131755436);
        this.f27760a = 2;
        this.f27761b = pd0Var;
    }
}
