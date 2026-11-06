package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bk0;
import org.telegram.ui.ce0;
public final class m1 extends ScrollView {
    public final int f28297a;
    public final Object f28298b;

    public m1(ls lsVar, Context context, int i7) {
        super(context);
        this.f28297a = i7;
        this.f28298b = lsVar;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f28297a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                u1 u1Var = (u1) this.f28298b;
                if (u1Var.D[0].getPaint().getAlpha() != 0) {
                    u1Var.D[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    u1Var.D[0].draw(canvas);
                }
                if (u1Var.D[1].getPaint().getAlpha() != 0) {
                    u1Var.D[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    u1Var.D[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f28297a) {
            case 1:
                x50 x50Var = (x50) this.f28298b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    x50Var.f40199j2 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    x50Var.f40199j2 = org.telegram.messenger.g0.L(144.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(x50Var.f40199j2, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(((vd0) this.f28298b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                ((bk0) this.f28298b).f44400s0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.f28297a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        switch (this.f28297a) {
            case 3:
                int i7 = ((ce0) this.f28298b).f44756a;
                if (i7 == 1 || i7 == 2 || i7 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z9);
            case 4:
                int i10 = ((bk0) this.f28298b).I1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z9);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f28298b;
                if (usersSelectActivity.f42078w) {
                    usersSelectActivity.f42078w = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.k5.C(20.0f, usersSelectActivity.R, rect.top);
                rect.bottom = org.telegram.messenger.k5.C(50.0f, usersSelectActivity.R, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z9);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z9);
        }
    }

    public m1(Context context, vd0 vd0Var) {
        super(context, null, 0, 2131755436);
        this.f28297a = 2;
        this.f28298b = vd0Var;
    }
}
