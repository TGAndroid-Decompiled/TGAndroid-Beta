package org.telegram.ui;

import android.util.SparseIntArray;
public final class pm implements Runnable {
    public final int f48607a;
    public final um f48608b;

    public pm(um umVar, int i3) {
        this.f48607a = i3;
        this.f48608b = umVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        switch (this.f48607a) {
            case 0:
                SparseIntArray sparseIntArray = new SparseIntArray();
                um umVar = this.f48608b;
                umVar.f50123e = sparseIntArray;
                wm wmVar = umVar.G;
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) wmVar.getThemedDrawable("drawableMsgOut");
                umVar.f50137t = t4Var;
                q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                t4Var.J = q4Var.getMessageDrawableOutStart();
                org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) wmVar.getThemedDrawable("drawableMsgOutMedia");
                umVar.f50138u = t4Var2;
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                t4Var2.J = q4Var2.getMessageDrawableOutMediaStart();
                umVar.f50137t.K = 0.0f;
                umVar.f50138u.K = 0.0f;
                wmVar.Yc();
                umVar.u(0.0f);
                return;
            default:
                um umVar2 = this.f48608b;
                umVar2.f50137t.J = null;
                umVar2.f50138u.J = null;
                umVar2.f50123e = null;
                umVar2.u(1.0f);
                return;
        }
    }
}
