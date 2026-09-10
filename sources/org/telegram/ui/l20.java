package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l20 implements View.OnClickListener {
    public final int f34524a;
    public final Context f34525b;
    public final rg.a f34526c;

    public l20(Context context, rg.a aVar, int i10) {
        this.f34524a = i10;
        this.f34525b = context;
        this.f34526c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f34524a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f34525b;
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(context, false, gVar, 1);
                rg.g gVar2 = this.f34526c.f41455c;
                if (gVar2 != null) {
                    i10 = gVar2.C;
                } else {
                    i10 = 0;
                }
                t8Var.e(i10, 0);
                t8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(t8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                return;
            default:
                g gVar3 = new g(this, 19);
                Context context2 = this.f34525b;
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8(context2, false, gVar3, 2);
                rg.g gVar4 = this.f34526c.f41455c;
                if (gVar4 == null) {
                    i11 = 0;
                } else {
                    i11 = gVar4.B;
                }
                t8Var2.e(i11, 0);
                t8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(t8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                return;
        }
    }
}
