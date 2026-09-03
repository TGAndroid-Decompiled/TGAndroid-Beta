package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h20 implements View.OnClickListener {
    public final int f34551a;
    public final Context f34552b;
    public final fg.a f34553c;

    public h20(Context context, fg.a aVar, int i10) {
        this.f34551a = i10;
        this.f34552b = context;
        this.f34553c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f34551a) {
            case 0:
                h hVar = new h(this, 18);
                Context context = this.f34552b;
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(context, false, hVar, 1);
                fg.j jVar = this.f34553c.f6119c;
                if (jVar != null) {
                    i10 = jVar.C;
                } else {
                    i10 = 0;
                }
                m8Var.e(i10, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, false);
                g3Var.setCustomView(m8Var);
                g3Var.setDimBehind(false);
                g3Var.show();
                return;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.f34552b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, hVar2, 2);
                fg.j jVar2 = this.f34553c.f6119c;
                if (jVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = jVar2.B;
                }
                m8Var2.e(i11, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(context2, false);
                g3Var2.setCustomView(m8Var2);
                g3Var2.setDimBehind(false);
                g3Var2.show();
                return;
        }
    }
}
