package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f34974a;
    public final Context f34975b;
    public final sg.a f34976c;

    public k20(Context context, sg.a aVar, int i10) {
        this.f34974a = i10;
        this.f34975b = context;
        this.f34976c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f34974a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f34975b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, gVar, 1);
                sg.f fVar = this.f34976c.f43167c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                u8Var.e(i10, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(u8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f34975b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f34976c.f43167c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                u8Var2.e(i11, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(u8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
