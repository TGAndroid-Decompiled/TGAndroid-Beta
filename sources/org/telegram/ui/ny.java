package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ny extends org.telegram.ui.Components.u51 {
    public final int f40070m3;

    public ny(Context context, int i10, int i11, boolean z10, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(context, i10, i11, z10, j20Var, o20Var, p20Var, p6Var);
        this.f40070m3 = i12;
    }

    @Override
    public Integer V0(int i10) {
        switch (this.f40070m3) {
            case 0:
                org.telegram.ui.Components.a51 G = this.f30819f3.G(i10);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.V0(i10);
            case 1:
            default:
                return super.V0(i10);
            case 2:
                return 0;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40070m3) {
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 5:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f40070m3) {
            case 1:
                if (view instanceof org.telegram.ui.Wallet.w3) {
                    org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
                    if (w3Var.F > 0.0f || w3Var.I.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public ny(Context context, int i10, int i11, boolean z10, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12, int i13) {
        super(context, i10, i11, z10, j20Var, o20Var, p20Var, p6Var, i12, i13);
        this.f40070m3 = 1;
    }

    public ny(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.messenger.p20 p20Var, int i10) {
        super(k2Var, j20Var, o20Var, p20Var);
        this.f40070m3 = i10;
    }
}
