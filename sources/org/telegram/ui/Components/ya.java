package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class ya extends fb {
    private xa button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.h6 resourcesProvider;
    public ub timerView;
    private boolean wrapWidth;

    public ya(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.resourcesProvider = h6Var;
    }

    public xa getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        xa xaVar = this.button;
        if (xaVar != null && view != xaVar) {
            i10 = org.telegram.messenger.camera.q.D(12.0f, xaVar.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.button != null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
        }
    }

    public void setButton(xa xaVar) {
        xa xaVar2 = this.button;
        if (xaVar2 != null) {
            removeCallback(xaVar2);
            removeView(this.button);
        }
        this.button = xaVar;
        if (xaVar != null) {
            addCallback(xaVar);
            addView(xaVar, 0, c8.ha.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        ub ubVar = new ub(getContext(), this.resourcesProvider);
        this.timerView = ubVar;
        ubVar.f38609b = 5000L;
        addView(ubVar, c8.ha.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
