package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract class cb extends jb {
    private bb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.c6 resourcesProvider;
    public xb timerView;
    private boolean wrapWidth;

    public cb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.resourcesProvider = c6Var;
    }

    public bb getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        bb bbVar = this.button;
        if (bbVar != null && view != bbVar) {
            i11 = org.telegram.messenger.rl.C(12.0f, bbVar.getMeasuredWidth(), i11);
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
        if (this.button == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
    }

    public void setButton(bb bbVar) {
        bb bbVar2 = this.button;
        if (bbVar2 != null) {
            removeCallback(bbVar2);
            removeView(this.button);
        }
        this.button = bbVar;
        if (bbVar != null) {
            addCallback(bbVar);
            addView(bbVar, 0, h7.z5.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        xb xbVar = new xb(getContext(), this.resourcesProvider);
        this.timerView = xbVar;
        xbVar.f34571b = 5000L;
        addView(xbVar, h7.z5.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
