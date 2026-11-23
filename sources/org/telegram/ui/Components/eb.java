package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class eb extends lb {
    private db button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.h6 resourcesProvider;
    public zb timerView;
    private boolean wrapWidth;

    public eb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.resourcesProvider = h6Var;
    }

    public db getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        db dbVar = this.button;
        if (dbVar != null && view != dbVar) {
            i10 = org.telegram.ui.Cells.c0.i(12.0f, dbVar.getMeasuredWidth(), i10);
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

    public void setButton(db dbVar) {
        db dbVar2 = this.button;
        if (dbVar2 != null) {
            removeCallback(dbVar2);
            removeView(this.button);
        }
        this.button = dbVar;
        if (dbVar != null) {
            addCallback(dbVar);
            addView(dbVar, 0, c8.ma.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        zb zbVar = new zb(getContext(), this.resourcesProvider);
        this.timerView = zbVar;
        zbVar.f42765b = 5000L;
        addView(zbVar, c8.ma.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
