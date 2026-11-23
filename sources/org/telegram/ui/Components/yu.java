package org.telegram.ui.Components;
public final class yu implements Runnable {
    public final int f42562a;
    public final zu f42563b;

    public yu(zu zuVar, int i7) {
        this.f42562a = i7;
        this.f42563b = zuVar;
    }

    @Override
    public final void run() {
        int i7 = this.f42562a;
        zu zuVar = this.f42563b;
        switch (i7) {
            case 0:
                zuVar.f43046f.dismiss();
                return;
            default:
                bv bvVar = zuVar.f43046f;
                bvVar.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var = bvVar.n1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754432, kc.b0(g2Var), null);
                    return;
                }
                return;
        }
    }
}
