package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.us;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.hf0;
import org.telegram.ui.ll0;
public final class p1 extends ScrollView {
    public final int f20634a;
    public final Object f20635b;

    public p1(us usVar, Context context, int i10) {
        super(context);
        this.f20634a = i10;
        this.f20635b = usVar;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f20634a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                x1 x1Var = (x1) this.f20635b;
                if (x1Var.D[0].getPaint().getAlpha() != 0) {
                    x1Var.D[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.i0.L(3.0f) + getScrollY());
                    x1Var.D[0].draw(canvas);
                }
                if (x1Var.D[1].getPaint().getAlpha() != 0) {
                    x1Var.D[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    x1Var.D[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f20634a) {
            case 1:
                m60 m60Var = (m60) this.f20635b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!org.telegram.messenger.i0.Q1() && size2 <= size) {
                    m60Var.f28305j2 = org.telegram.messenger.i0.L(56.0f);
                } else {
                    m60Var.f28305j2 = org.telegram.messenger.i0.L(144.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(m60Var.f28305j2, Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(((qe0) this.f20635b).getMeasuredWidth(), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                ((ll0) this.f20635b).f39298s0 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(30.0f);
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f20634a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f20634a) {
            case 3:
                int i10 = ((hf0) this.f20635b).f37918a;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 4:
                int i11 = ((ll0) this.f20635b).I1;
                if (i11 == 1 || i11 == 2 || i11 == 4) {
                    rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f20635b;
                if (usersSelectActivity.f34153w) {
                    usersSelectActivity.f34153w = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.m5.C(20.0f, usersSelectActivity.Q, rect.top);
                rect.bottom = org.telegram.messenger.m5.C(50.0f, usersSelectActivity.Q, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    public p1(Context context, qe0 qe0Var) {
        super(context, null, 0, 2131755436);
        this.f20634a = 2;
        this.f20635b = qe0Var;
    }
}
