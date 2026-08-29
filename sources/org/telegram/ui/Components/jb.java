package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class jb extends rb {
    private ib button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.c6 resourcesProvider;
    public fc timerView;
    private boolean wrapWidth;

    public jb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.resourcesProvider = c6Var;
    }

    public ib getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ib ibVar = this.button;
        if (ibVar != null && view != ibVar) {
            i11 = org.telegram.ui.b.C(12.0f, ibVar.getMeasuredWidth(), i11);
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

    public void setButton(ib ibVar) {
        ib ibVar2 = this.button;
        if (ibVar2 != null) {
            removeCallback(ibVar2);
            removeView(this.button);
        }
        this.button = ibVar;
        if (ibVar != null) {
            addCallback(ibVar);
            addView(ibVar, 0, i7.f6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        fc fcVar = new fc(getContext(), this.resourcesProvider);
        this.timerView = fcVar;
        fcVar.f28371b = 5000L;
        addView(fcVar, i7.f6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
