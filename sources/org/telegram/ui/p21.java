package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class p21 implements q21 {
    public final org.telegram.ui.ActionBar.r2 f42335a;
    public final Context f42336b;
    public final org.telegram.ui.ActionBar.u6 f42337c;
    public final org.telegram.ui.Components.t90 d;

    public p21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.t90 t90Var) {
        this.f42335a = r2Var;
        this.f42336b = context;
        this.f42337c = u6Var;
        this.d = t90Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.f42335a, this.f42336b, this.f42337c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new fy0(16, this.f42335a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f42335a;
        r2Var.showDialog(new tg.y0(r2Var, 3, true));
    }
}
