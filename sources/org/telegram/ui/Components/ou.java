package org.telegram.ui.Components;
public final class ou implements Runnable {
    public final int f36695a;
    public final pu f36696b;

    public ou(pu puVar, int i7) {
        this.f36695a = i7;
        this.f36696b = puVar;
    }

    @Override
    public final void run() {
        int i7 = this.f36695a;
        pu puVar = this.f36696b;
        switch (i7) {
            case 0:
                puVar.f37105f.dismiss();
                return;
            default:
                ru ruVar = puVar.f37105f;
                ruVar.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37776j1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, hc.a0(f2Var), null);
                    return;
                }
                return;
        }
    }
}
