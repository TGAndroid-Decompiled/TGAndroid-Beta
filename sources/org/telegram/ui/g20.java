package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class g20 implements View.OnClickListener {
    public final int f36967a;
    public final Context f36968b;
    public final gg.a f36969c;

    public g20(Context context, gg.a aVar, int i10) {
        this.f36967a = i10;
        this.f36968b = context;
        this.f36969c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f36967a) {
            case 0:
                h hVar = new h(this, 18);
                Context context = this.f36968b;
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(context, false, hVar, 1);
                gg.j jVar = this.f36969c.f7048c;
                if (jVar != null) {
                    i10 = jVar.C;
                } else {
                    i10 = 0;
                }
                m8Var.e(i10, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(m8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                return;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.f36968b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, hVar2, 2);
                gg.j jVar2 = this.f36969c.f7048c;
                if (jVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = jVar2.B;
                }
                m8Var2.e(i11, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(m8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                return;
        }
    }
}
