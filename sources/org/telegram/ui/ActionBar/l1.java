package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.is;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ce0;
import org.telegram.ui.ek0;
public final class l1 extends ScrollView {
    public final int f29357a;
    public final Object f29358b;

    public l1(is isVar, Context context, int i7) {
        super(context);
        this.f29357a = i7;
        this.f29358b = isVar;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f29357a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                t1 t1Var = (t1) this.f29358b;
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
        switch (this.f29357a) {
            case 1:
                a60 a60Var = (a60) this.f29358b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    a60Var.f32879n2 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    a60Var.f32879n2 = org.telegram.messenger.g0.L(144.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(a60Var.f32879n2, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(((vd0) this.f29358b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                ((ek0) this.f29358b).f46835t0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.f29357a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f29357a) {
            case 3:
                int i7 = ((ce0) this.f29358b).f46074a;
                if (i7 == 1 || i7 == 2 || i7 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i10 = ((ek0) this.f29358b).J1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f29358b;
                if (usersSelectActivity.f43456w) {
                    usersSelectActivity.f43456w = false;
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

    public l1(Context context, vd0 vd0Var) {
        super(context, null, 0, 2131755436);
        this.f29357a = 2;
        this.f29358b = vd0Var;
    }
}
