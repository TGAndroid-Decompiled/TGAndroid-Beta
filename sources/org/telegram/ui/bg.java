package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class bg implements View.OnClickListener {
    public final int f32129a;
    public final bo f32130b;
    public final ArrayList f32131c;

    public bg(bo boVar, ArrayList arrayList, int i10) {
        this.f32129a = i10;
        this.f32130b = boVar;
        this.f32131c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32129a) {
            case 0:
                bo boVar = this.f32130b;
                qi qiVar = new qi(boVar, boVar, boVar.getParentActivity(), boVar.f32279ea, this.f32131c);
                qiVar.setCalcMandatoryInsets(boVar.x9());
                qiVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(qiVar);
                return;
            default:
                bo boVar2 = this.f32130b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.f32279ea, this.f32131c).show();
                    boVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
