package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i20 implements View.OnClickListener {
    public final int f38459a;
    public final Context f38460b;
    public final sg.g f38461c;

    public i20(Context context, sg.g gVar, int i10) {
        this.f38459a = i10;
        this.f38460b = context;
        this.f38461c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f38459a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f38460b;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false, gVar, 1);
                sg.o oVar = this.f38461c.f48040c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                w8Var.e(i10, 0);
                w8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(w8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f38460b;
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8(context2, false, gVar2, 2);
                sg.o oVar2 = this.f38461c.f48040c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                w8Var2.e(i11, 0);
                w8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(w8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
