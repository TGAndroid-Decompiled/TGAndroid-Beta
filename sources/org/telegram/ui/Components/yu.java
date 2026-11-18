package org.telegram.ui.Components;
public final class yu implements Runnable {
    public final int f42639a;
    public final zu f42640b;

    public yu(zu zuVar, int i7) {
        this.f42639a = i7;
        this.f42640b = zuVar;
    }

    @Override
    public final void run() {
        int i7 = this.f42639a;
        zu zuVar = this.f42640b;
        switch (i7) {
            case 0:
                zuVar.f42949f.dismiss();
                return;
            default:
                bv bvVar = zuVar.f42949f;
                bvVar.dismiss();
                org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                if (h2Var != null && h2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754433, lc.b0(h2Var), null);
                    return;
                }
                return;
        }
    }
}
