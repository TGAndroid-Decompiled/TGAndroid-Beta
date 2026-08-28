package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class pf implements View.OnClickListener {
    public final int f41502a;
    public final qn f41503b;
    public final ArrayList f41504c;

    public pf(qn qnVar, ArrayList arrayList, int i9) {
        this.f41502a = i9;
        this.f41503b = qnVar;
        this.f41504c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41502a) {
            case 0:
                qn qnVar = this.f41503b;
                di diVar = new di(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f41848aa, this.f41504c);
                diVar.setCalcMandatoryInsets(qnVar.x9());
                diVar.setDimBehind(false);
                qnVar.A7(false);
                qnVar.showDialog(diVar);
                return;
            default:
                qn qnVar2 = this.f41503b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.dv(qnVar2, qnVar2.getParentActivity(), qnVar2.f41848aa, this.f41504c).show();
                    qnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
