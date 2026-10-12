package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o20 implements View.OnClickListener {
    public final int f38842a;
    public final Context f38843b;
    public final tg.g f38844c;

    public o20(Context context, tg.g gVar, int i10) {
        this.f38842a = i10;
        this.f38843b = context;
        this.f38844c = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f38842a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f38843b;
                org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false, gVar, 1);
                tg.o oVar = this.f38844c.f45705c;
                if (oVar != null) {
                    i10 = oVar.I;
                } else {
                    i10 = 0;
                }
                x8Var.e(i10, 0);
                x8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(x8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f38843b;
                org.telegram.ui.Components.x8 x8Var2 = new org.telegram.ui.Components.x8(context2, false, gVar2, 2);
                tg.o oVar2 = this.f38844c.f45705c;
                if (oVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = oVar2.H;
                }
                x8Var2.e(i11, 0);
                x8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(x8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                return;
        }
    }
}
