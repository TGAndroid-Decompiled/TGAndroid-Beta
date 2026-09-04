package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k20 implements View.OnClickListener {
    public final int f37896a;
    public final Context f37897b;
    public final tg.a f37898c;

    public k20(Context context, tg.a aVar, int i10) {
        this.f37896a = i10;
        this.f37897b = context;
        this.f37898c = aVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        switch (this.f37896a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.f37897b;
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8(context, false, gVar, 1);
                tg.f fVar = this.f37898c.f46490c;
                if (fVar != null) {
                    i10 = fVar.C;
                } else {
                    i10 = 0;
                }
                v8Var.e(i10, 0);
                v8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(v8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                return;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.f37897b;
                org.telegram.ui.Components.v8 v8Var2 = new org.telegram.ui.Components.v8(context2, false, gVar2, 2);
                tg.f fVar2 = this.f37898c.f46490c;
                if (fVar2 == null) {
                    i11 = 0;
                } else {
                    i11 = fVar2.B;
                }
                v8Var2.e(i11, 0);
                v8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(v8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                return;
        }
    }
}
