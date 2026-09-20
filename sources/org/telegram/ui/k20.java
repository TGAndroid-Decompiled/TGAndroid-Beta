package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f35019a;
    public final Context f35020b;
    public final sg.a f35021c;

    public k20(Context context, sg.a aVar, int i10) {
        this.f35019a = i10;
        this.f35020b = context;
        this.f35021c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f35019a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f35020b;
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(context, false, gVar, 1);
                sg.f fVar = this.f35021c.f43211c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                t8Var.e(i10, 0);
                t8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(t8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f35020b;
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f35021c.f43211c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                t8Var2.e(i11, 0);
                t8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(t8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
