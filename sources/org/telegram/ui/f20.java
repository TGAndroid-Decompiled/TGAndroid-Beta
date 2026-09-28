package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f20 implements View.OnClickListener {
    public final int f33521a;
    public final Context f33522b;
    public final sg.a f33523c;

    public f20(Context context, sg.a aVar, int i10) {
        this.f33521a = i10;
        this.f33522b = context;
        this.f33523c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f33521a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f33522b;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false, gVar, 1);
                sg.f fVar = this.f33523c.f43198c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                u8Var.e(i10, 0);
                u8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(u8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f33522b;
                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(context2, false, gVar2, 2);
                sg.f fVar2 = this.f33523c.f43198c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                u8Var2.e(i11, 0);
                u8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(u8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                return;
        }
    }
}
