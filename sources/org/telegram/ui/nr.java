package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class nr extends org.telegram.ui.Cells.m8 {
    public final int W = 1;
    public final Object f48227a0;

    public nr(pr prVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f48227a0 = prVar;
    }

    @Override
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((lw0) this.f48227a0).f47690e;
                RectF rectF = ProfileActivity.V6;
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
                pr prVar = (pr) this.f48227a0;
                int measuredHeight2 = (measuredHeight - prVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var = prVar.U;
                l9Var.layout(L, measuredHeight2, l9Var.getMeasuredWidth() + L, prVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                lt0 lt0Var = (lt0) this.f48227a0;
                int measuredHeight4 = (measuredHeight3 - lt0Var.d.f41678w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var2 = lt0Var.d.f41678w0;
                l9Var2.layout(L2, measuredHeight4, l9Var2.getMeasuredWidth() + L2, lt0Var.d.f41678w0.getMeasuredHeight() + measuredHeight4);
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
                pr prVar = (pr) this.f48227a0;
                prVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                prVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i7, i10);
                lt0 lt0Var = (lt0) this.f48227a0;
                lt0Var.d.f41678w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                lt0Var.d.f41678w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public nr(lt0 lt0Var, Activity activity) {
        super(activity);
        this.f48227a0 = lt0Var;
    }

    public nr(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(18, context, g6Var, false, false);
        this.f48227a0 = lw0Var;
    }
}
