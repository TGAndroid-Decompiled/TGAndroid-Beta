package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.fs;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
public final class l1 extends ScrollView {
    public final int f29194a;
    public final Object f29195b;

    public l1(fs fsVar, Context context, int i7) {
        super(context);
        this.f29194a = i7;
        this.f29195b = fsVar;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f29194a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                t1 t1Var = (t1) this.f29195b;
                if (t1Var.E[0].getPaint().getAlpha() != 0) {
                    t1Var.E[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    t1Var.E[0].draw(canvas);
                }
                if (t1Var.E[1].getPaint().getAlpha() != 0) {
                    t1Var.E[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    t1Var.E[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f29194a) {
            case 1:
                l60 l60Var = (l60) this.f29195b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    l60Var.f37126n2 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    l60Var.f37126n2 = org.telegram.messenger.g0.L(144.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(l60Var.f37126n2, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(((ge0) this.f29195b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                ((hk0) this.f29195b).f48455t0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.f29194a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f29194a) {
            case 3:
                int i7 = ((de0) this.f29195b).f46923a;
                if (i7 == 1 || i7 == 2 || i7 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((hk0) this.f29195b).J1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f29195b;
                if (usersSelectActivity.f43943w) {
                    usersSelectActivity.f43943w = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.f3.C(20.0f, usersSelectActivity.S, rect.top);
                rect.bottom = org.telegram.messenger.f3.C(50.0f, usersSelectActivity.S, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public l1(Context context, ge0 ge0Var) {
        super(context, null, 0, 2131755436);
        this.f29194a = 2;
        this.f29195b = ge0Var;
    }
}
