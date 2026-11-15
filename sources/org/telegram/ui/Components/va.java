package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class va extends cb {
    private ua button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.e6 resourcesProvider;
    public qb timerView;
    private boolean wrapWidth;

    public va(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.resourcesProvider = e6Var;
    }

    public ua getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ua uaVar = this.button;
        if (uaVar != null && view != uaVar) {
            i10 = org.telegram.messenger.i20.D(12.0f, uaVar.getMeasuredWidth(), i10);
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

    public void setButton(ua uaVar) {
        ua uaVar2 = this.button;
        if (uaVar2 != null) {
            removeCallback(uaVar2);
            removeView(this.button);
        }
        this.button = uaVar;
        if (uaVar != null) {
            addCallback(uaVar);
            addView(uaVar, 0, c8.ja.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        qb qbVar = new qb(getContext(), this.resourcesProvider);
        this.timerView = qbVar;
        qbVar.f38604b = 5000L;
        addView(qbVar, c8.ja.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
