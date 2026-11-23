package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
public final class or extends org.telegram.ui.Cells.m8 {
    public final int f50746a0 = 1;
    public final Object f50747b0;

    public or(qr qrVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f50747b0 = qrVar;
    }

    @Override
    public int e(int i7) {
        switch (this.f50746a0) {
            case 2:
                ProfileActivity profileActivity = ((jw0) this.f50747b0).f49218e;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                return i7;
            default:
                return i7;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f50746a0) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                qr qrVar = (qr) this.f50747b0;
                int measuredHeight2 = (measuredHeight - qrVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = qrVar.V;
                p9Var.layout(L, measuredHeight2, p9Var.getMeasuredWidth() + L, qrVar.V.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                jt0 jt0Var = (jt0) this.f50747b0;
                int measuredHeight4 = (measuredHeight3 - jt0Var.d.f43614x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = jt0Var.d.f43614x0;
                p9Var2.layout(L2, measuredHeight4, p9Var2.getMeasuredWidth() + L2, jt0Var.d.f43614x0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50746a0) {
            case 0:
                super.onMeasure(i7, i10);
                qr qrVar = (qr) this.f50747b0;
                qrVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                qrVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            case 1:
                super.onMeasure(i7, i10);
                jt0 jt0Var = (jt0) this.f50747b0;
                jt0Var.d.f43614x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
                jt0Var.d.f43614x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public or(jt0 jt0Var, Activity activity) {
        super(activity);
        this.f50747b0 = jt0Var;
    }

    public or(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(18, context, i6Var, false, false);
        this.f50747b0 = jw0Var;
    }
}
