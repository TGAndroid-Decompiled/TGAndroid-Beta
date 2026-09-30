package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class ob extends vb {
    private nb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.d6 resourcesProvider;
    public kc timerView;
    private boolean wrapWidth;

    public ob(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.resourcesProvider = d6Var;
    }

    public nb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        nb nbVar = this.button;
        if (nbVar != null && view != nbVar) {
            i11 = org.telegram.messenger.ok.D(12.0f, nbVar.getMeasuredWidth(), i11);
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

    public void setButton(nb nbVar) {
        nb nbVar2 = this.button;
        if (nbVar2 != null) {
            removeCallback(nbVar2);
            removeView(this.button);
        }
        this.button = nbVar;
        if (nbVar != null) {
            addCallback(nbVar);
            addView(nbVar, 0, w7.y5.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        kc kcVar = new kc(getContext(), this.resourcesProvider);
        this.timerView = kcVar;
        kcVar.f25738b = 5000L;
        addView(kcVar, w7.y5.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
