package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i20 implements View.OnClickListener {
    public final int f34341a;
    public final Context f34342b;
    public final sg.a f34343c;

    public i20(Context context, sg.a aVar, int i10) {
        this.f34341a = i10;
        this.f34342b = context;
        this.f34343c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f34341a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f34342b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, gVar, 1);
                sg.f fVar = this.f34343c.f43242c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                u8Var.e(i10, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, false);
                g3Var.setCustomView(u8Var);
                g3Var.setDimBehind(false);
                g3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f34342b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f34343c.f43242c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                u8Var2.e(i11, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(context2, false);
                g3Var2.setCustomView(u8Var2);
                g3Var2.setDimBehind(false);
                g3Var2.show();
                return;
        }
    }
}
