package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class m20 implements View.OnClickListener {
    public final int f35669a;
    public final Context f35670b;
    public final sg.a f35671c;

    public m20(Context context, sg.a aVar, int i10) {
        this.f35669a = i10;
        this.f35670b = context;
        this.f35671c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f35669a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f35670b;
                org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(context, false, gVar, 1);
                sg.f fVar = this.f35671c.f42931c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                s8Var.e(i10, 0);
                s8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, false);
                g3Var.setCustomView(s8Var);
                g3Var.setDimBehind(false);
                g3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f35670b;
                org.telegram.ui.Components.s8 s8Var2 = new org.telegram.ui.Components.s8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f35671c.f42931c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                s8Var2.e(i11, 0);
                s8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(context2, false);
                g3Var2.setCustomView(s8Var2);
                g3Var2.setDimBehind(false);
                g3Var2.show();
                return;
        }
    }
}
