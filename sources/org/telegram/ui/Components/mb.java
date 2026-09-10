package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class mb extends tb {
    private lb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.f6 resourcesProvider;
    public ic timerView;
    private boolean wrapWidth;

    public mb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.resourcesProvider = f6Var;
    }

    public lb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        lb lbVar = this.button;
        if (lbVar != null && view != lbVar) {
            i11 = org.telegram.messenger.em.D(12.0f, lbVar.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.button != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
        }
    }

    public void setButton(lb lbVar) {
        lb lbVar2 = this.button;
        if (lbVar2 != null) {
            removeCallback(lbVar2);
            removeView(this.button);
        }
        this.button = lbVar;
        if (lbVar != null) {
            addCallback(lbVar);
            addView(lbVar, 0, w7.a6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        ic icVar = new ic(getContext(), this.resourcesProvider);
        this.timerView = icVar;
        icVar.f23985b = 5000L;
        addView(icVar, w7.a6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
