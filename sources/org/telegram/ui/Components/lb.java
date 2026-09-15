package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class lb extends sb {
    private kb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.e6 resourcesProvider;
    public hc timerView;
    private boolean wrapWidth;

    public lb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.resourcesProvider = e6Var;
    }

    public kb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        kb kbVar = this.button;
        if (kbVar != null && view != kbVar) {
            i11 = org.telegram.messenger.wl.D(12.0f, kbVar.getMeasuredWidth(), i11);
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

    public void setButton(kb kbVar) {
        kb kbVar2 = this.button;
        if (kbVar2 != null) {
            removeCallback(kbVar2);
            removeView(this.button);
        }
        this.button = kbVar;
        if (kbVar != null) {
            addCallback(kbVar);
            addView(kbVar, 0, w7.x5.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        hc hcVar = new hc(getContext(), this.resourcesProvider);
        this.timerView = hcVar;
        hcVar.f24659b = 5000L;
        addView(hcVar, w7.x5.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
