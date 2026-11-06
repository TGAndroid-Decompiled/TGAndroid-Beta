package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class za extends gb {
    private ya button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.f6 resourcesProvider;
    public vb timerView;
    private boolean wrapWidth;

    public za(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.resourcesProvider = f6Var;
    }

    public ya getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ya yaVar = this.button;
        if (yaVar != null && view != yaVar) {
            i10 = org.telegram.messenger.camera.q.D(12.0f, yaVar.getMeasuredWidth(), i10);
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

    public void setButton(ya yaVar) {
        ya yaVar2 = this.button;
        if (yaVar2 != null) {
            removeCallback(yaVar2);
            removeView(this.button);
        }
        this.button = yaVar;
        if (yaVar != null) {
            addCallback(yaVar);
            addView(yaVar, 0, c8.ha.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        vb vbVar = new vb(getContext(), this.resourcesProvider);
        this.timerView = vbVar;
        vbVar.f38931b = 5000L;
        addView(vbVar, c8.ha.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
