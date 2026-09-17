package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class bg implements View.OnClickListener {
    public final int f32125a;
    public final bo f32126b;
    public final ArrayList f32127c;

    public bg(bo boVar, ArrayList arrayList, int i10) {
        this.f32125a = i10;
        this.f32126b = boVar;
        this.f32127c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32125a) {
            case 0:
                bo boVar = this.f32126b;
                qi qiVar = new qi(boVar, boVar, boVar.getParentActivity(), boVar.f32275ea, this.f32127c);
                qiVar.setCalcMandatoryInsets(boVar.x9());
                qiVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(qiVar);
                return;
            default:
                bo boVar2 = this.f32126b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.f32275ea, this.f32127c).show();
                    boVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
