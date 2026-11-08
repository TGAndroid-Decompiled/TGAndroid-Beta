package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kx extends org.telegram.ui.Components.q41 {
    public final int f47339m3;

    public kx(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i7, i10, z9, v10Var, a20Var, b20Var, f6Var);
        this.f47339m3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f47339m3) {
            case 0:
                org.telegram.ui.Components.x31 G = this.f37190f3.G(i7);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.V0(i7);
            case 1:
            default:
                return super.V0(i7);
            case 2:
                return 0;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47339m3) {
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            case 8:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f47339m3) {
            case 1:
                if (view instanceof org.telegram.ui.Wallet.v3) {
                    org.telegram.ui.Wallet.v3 v3Var = (org.telegram.ui.Wallet.v3) view;
                    if (v3Var.F > 0.0f || v3Var.I.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public kx(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context, i7, i10, z9, v10Var, a20Var, b20Var, f6Var, i11, i12);
        this.f47339m3 = 1;
    }

    public kx(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, int i7) {
        super(f2Var, v10Var, a20Var, b20Var);
        this.f47339m3 = i7;
    }
}
