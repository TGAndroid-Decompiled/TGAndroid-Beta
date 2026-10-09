package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i20 implements View.OnClickListener {
    public final int f38461a;
    public final Context f38462b;
    public final sg.g f38463c;

    public i20(Context context, sg.g gVar, int i10) {
        this.f38461a = i10;
        this.f38462b = context;
        this.f38463c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f38461a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f38462b;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false, gVar, 1);
                sg.o oVar = this.f38463c.f48042c;
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
                Context context2 = this.f38462b;
                org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8(context2, false, gVar2, 2);
                sg.o oVar2 = this.f38463c.f48042c;
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
