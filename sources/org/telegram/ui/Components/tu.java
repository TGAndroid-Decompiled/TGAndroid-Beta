package org.telegram.ui.Components;
public final class tu implements Runnable {
    public final int f39808a;
    public final uu f39809b;

    public tu(uu uuVar, int i7) {
        this.f39808a = i7;
        this.f39809b = uuVar;
    }

    @Override
    public final void run() {
        int i7 = this.f39808a;
        uu uuVar = this.f39809b;
        switch (i7) {
            case 0:
                uuVar.f40164f.dismiss();
                return;
            default:
                wu wuVar = uuVar.f40164f;
                wuVar.dismiss();
                org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                if (e2Var != null && e2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.o(null, 2131754435, cc.a0(e2Var), null);
                    return;
                }
                return;
        }
    }
}
