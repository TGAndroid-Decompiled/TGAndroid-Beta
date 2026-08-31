package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class eb extends nb {
    private db button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.g6 resourcesProvider;
    public bc timerView;
    private boolean wrapWidth;

    public eb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.resourcesProvider = g6Var;
    }

    public db getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        db dbVar = this.button;
        if (dbVar != null && view != dbVar) {
            i11 = org.telegram.ui.b.C(12.0f, dbVar.getMeasuredWidth(), i11);
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

    public void setButton(db dbVar) {
        db dbVar2 = this.button;
        if (dbVar2 != null) {
            removeCallback(dbVar2);
            removeView(this.button);
        }
        this.button = dbVar;
        if (dbVar != null) {
            addCallback(dbVar);
            addView(dbVar, 0, k7.c6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        bc bcVar = new bc(getContext(), this.resourcesProvider);
        this.timerView = bcVar;
        bcVar.f25559b = 5000L;
        addView(bcVar, k7.c6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
