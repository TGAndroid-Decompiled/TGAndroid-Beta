package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class db extends kb {
    private cb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.i6 resourcesProvider;
    public yb timerView;
    private boolean wrapWidth;

    public db(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.resourcesProvider = i6Var;
    }

    public cb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        cb cbVar = this.button;
        if (cbVar != null && view != cbVar) {
            i10 = org.telegram.ui.Cells.c0.i(12.0f, cbVar.getMeasuredWidth(), i10);
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

    public void setButton(cb cbVar) {
        cb cbVar2 = this.button;
        if (cbVar2 != null) {
            removeCallback(cbVar2);
            removeView(this.button);
        }
        this.button = cbVar;
        if (cbVar != null) {
            addCallback(cbVar);
            addView(cbVar, 0, c8.na.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        yb ybVar = new yb(getContext(), this.resourcesProvider);
        this.timerView = ybVar;
        ybVar.f42399b = 5000L;
        addView(ybVar, c8.na.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
