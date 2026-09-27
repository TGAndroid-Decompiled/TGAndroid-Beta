package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ag implements View.OnClickListener {
    public final int f32065a;
    public final xn f32066b;
    public final ArrayList f32067c;

    public ag(xn xnVar, ArrayList arrayList, int i10) {
        this.f32065a = i10;
        this.f32066b = xnVar;
        this.f32067c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32065a) {
            case 0:
                xn xnVar = this.f32066b;
                oi oiVar = new oi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f39750ea, this.f32067c);
                oiVar.setCalcMandatoryInsets(xnVar.x9());
                oiVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(oiVar);
                return;
            default:
                xn xnVar2 = this.f32066b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.uv(xnVar2, xnVar2.getParentActivity(), xnVar2.f39750ea, this.f32067c).show();
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
