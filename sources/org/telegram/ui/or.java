package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class or extends org.telegram.ui.Cells.m8 {
    public final int W = 1;
    public final Object f48571a0;

    public or(qr qrVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f48571a0 = qrVar;
    }

    @Override
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((mw0) this.f48571a0).f48065e;
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
                qr qrVar = (qr) this.f48571a0;
                int measuredHeight2 = (measuredHeight - qrVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var = qrVar.U;
                k9Var.layout(L, measuredHeight2, k9Var.getMeasuredWidth() + L, qrVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                mt0 mt0Var = (mt0) this.f48571a0;
                int measuredHeight4 = (measuredHeight3 - mt0Var.d.f41669w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var2 = mt0Var.d.f41669w0;
                k9Var2.layout(L2, measuredHeight4, k9Var2.getMeasuredWidth() + L2, mt0Var.d.f41669w0.getMeasuredHeight() + measuredHeight4);
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
                qr qrVar = (qr) this.f48571a0;
                qrVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                qrVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i7, i10);
                mt0 mt0Var = (mt0) this.f48571a0;
                mt0Var.d.f41669w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                mt0Var.d.f41669w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public or(mt0 mt0Var, Activity activity) {
        super(activity);
        this.f48571a0 = mt0Var;
    }

    public or(mw0 mw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(18, context, h6Var, false, false);
        this.f48571a0 = mw0Var;
    }
}
