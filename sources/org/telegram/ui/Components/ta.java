package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class ta extends bb {
    private sa button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.p6 resourcesProvider;
    public pb timerView;
    private boolean wrapWidth;

    public ta(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.resourcesProvider = p6Var;
    }

    public sa getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        sa saVar = this.button;
        if (saVar != null && view != saVar) {
            i11 = org.telegram.messenger.z20.D(12.0f, saVar.getMeasuredWidth(), i11);
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

    public void setButton(sa saVar) {
        sa saVar2 = this.button;
        if (saVar2 != null) {
            removeCallback(saVar2);
            removeView(this.button);
        }
        this.button = saVar;
        if (saVar != null) {
            addCallback(saVar);
            addView(saVar, 0, w7.b6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        pb pbVar = new pb(getContext(), this.resourcesProvider);
        this.timerView = pbVar;
        pbVar.f29331b = 5000L;
        addView(pbVar, w7.b6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
