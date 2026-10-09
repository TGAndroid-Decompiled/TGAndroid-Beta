package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class qb extends xb {
    private pb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.e6 resourcesProvider;
    public mc timerView;
    private boolean wrapWidth;

    public qb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.resourcesProvider = e6Var;
    }

    public pb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        pb pbVar = this.button;
        if (pbVar != null && view != pbVar) {
            i11 = org.telegram.messenger.bi.D(12.0f, pbVar.getMeasuredWidth(), i11);
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

    public void setButton(pb pbVar) {
        pb pbVar2 = this.button;
        if (pbVar2 != null) {
            removeCallback(pbVar2);
            removeView(this.button);
        }
        this.button = pbVar;
        if (pbVar != null) {
            addCallback(pbVar);
            addView(pbVar, 0, w7.x5.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        mc mcVar = new mc(getContext(), this.resourcesProvider);
        this.timerView = mcVar;
        mcVar.f28806b = 5000L;
        addView(mcVar, w7.x5.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
