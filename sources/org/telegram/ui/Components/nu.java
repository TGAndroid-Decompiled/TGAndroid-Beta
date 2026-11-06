package org.telegram.ui.Components;
public final class nu implements Runnable {
    public final int f36385a;
    public final ou f36386b;

    public nu(ou ouVar, int i7) {
        this.f36385a = i7;
        this.f36386b = ouVar;
    }

    @Override
    public final void run() {
        int i7 = this.f36385a;
        ou ouVar = this.f36386b;
        switch (i7) {
            case 0:
                ouVar.f36661f.dismiss();
                return;
            default:
                qu quVar = ouVar.f36661f;
                quVar.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = quVar.f37396j1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, hc.a0(f2Var), null);
                    return;
                }
                return;
        }
    }
}
