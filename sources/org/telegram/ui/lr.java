package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class lr extends org.telegram.ui.Cells.m8 {
    public final int W = 1;
    public final Object f47581a0;

    public lr(nr nrVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f47581a0 = nrVar;
    }

    @Override
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((jw0) this.f47581a0).f47050e;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                return i7;
            default:
                return i7;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.W) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                nr nrVar = (nr) this.f47581a0;
                int measuredHeight2 = (measuredHeight - nrVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var = nrVar.U;
                l9Var.layout(L, measuredHeight2, l9Var.getMeasuredWidth() + L, nrVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                jt0 jt0Var = (jt0) this.f47581a0;
                int measuredHeight4 = (measuredHeight3 - jt0Var.d.f41668w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var2 = jt0Var.d.f41668w0;
                l9Var2.layout(L2, measuredHeight4, l9Var2.getMeasuredWidth() + L2, jt0Var.d.f41668w0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.W) {
            case 0:
                super.onMeasure(i7, i10);
                nr nrVar = (nr) this.f47581a0;
                nrVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                nrVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i7, i10);
                jt0 jt0Var = (jt0) this.f47581a0;
                jt0Var.d.f41668w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                jt0Var.d.f41668w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public lr(jt0 jt0Var, Activity activity) {
        super(activity);
        this.f47581a0 = jt0Var;
    }

    public lr(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.f47581a0 = jw0Var;
    }
}
