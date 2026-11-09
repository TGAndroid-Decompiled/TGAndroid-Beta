package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class mx extends org.telegram.ui.Components.r41 {
    public final int f48023m3;

    public mx(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i7, i10, z9, v10Var, a20Var, b20Var, g6Var);
        this.f48023m3 = i11;
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f48023m3) {
            case 0:
                org.telegram.ui.Components.y31 G = this.f37556f3.G(i7);
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
        switch (this.f48023m3) {
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
        switch (this.f48023m3) {
            case 1:
                if (view instanceof org.telegram.ui.Wallet.u3) {
                    org.telegram.ui.Wallet.u3 u3Var = (org.telegram.ui.Wallet.u3) view;
                    if (u3Var.F > 0.0f || u3Var.I.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public mx(Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12) {
        super(context, i7, i10, z9, v10Var, a20Var, b20Var, g6Var, i11, i12);
        this.f48023m3 = 1;
    }

    public mx(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.messenger.b20 b20Var, int i7) {
        super(f2Var, v10Var, a20Var, b20Var);
        this.f48023m3 = i7;
    }
}
