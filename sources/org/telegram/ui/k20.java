package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f39344a;
    public final Context f39345b;
    public final sg.g f39346c;

    public k20(Context context, sg.g gVar, int i10) {
        this.f39344a = i10;
        this.f39345b = context;
        this.f39346c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f39344a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f39345b;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false, gVar, 1);
                sg.o oVar = this.f39346c.f48273c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                w8Var.e(i10, 0);
                w8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(w8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f39345b;
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8(context2, false, gVar2, 2);
                sg.o oVar2 = this.f39346c.f48273c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                w8Var2.e(i11, 0);
                w8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(w8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                return;
        }
    }
}
