package org.telegram.ui.Components;
public final class nu implements Runnable {
    public final int f36395a;
    public final ou f36396b;

    public nu(ou ouVar, int i7) {
        this.f36395a = i7;
        this.f36396b = ouVar;
    }

    @Override
    public final void run() {
        int i7 = this.f36395a;
        ou ouVar = this.f36396b;
        switch (i7) {
            case 0:
                ouVar.f36693f.dismiss();
                return;
            default:
                qu quVar = ouVar.f36693f;
                quVar.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = quVar.f37396m1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, gc.a0(f2Var), null);
                    return;
                }
                return;
        }
    }
}
