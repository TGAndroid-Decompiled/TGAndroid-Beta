package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f35041a;
    public final Context f35042b;
    public final sg.a f35043c;

    public k20(Context context, sg.a aVar, int i10) {
        this.f35041a = i10;
        this.f35042b = context;
        this.f35043c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f35041a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f35042b;
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(context, false, gVar, 1);
                sg.f fVar = this.f35043c.f43232c;
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
                Context context2 = this.f35042b;
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f35043c.f43232c;
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
