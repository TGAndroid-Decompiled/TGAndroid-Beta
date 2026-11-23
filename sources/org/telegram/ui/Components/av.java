package org.telegram.ui.Components;
public final class av implements Runnable {
    public final int f33623a;
    public final bv f33624b;

    public av(bv bvVar, int i7) {
        this.f33623a = i7;
        this.f33624b = bvVar;
    }

    @Override
    public final void run() {
        int i7 = this.f33623a;
        bv bvVar = this.f33624b;
        switch (i7) {
            case 0:
                bvVar.f33894f.dismiss();
                return;
            default:
                dv dvVar = bvVar.f33894f;
                dvVar.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var = dvVar.n1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754432, lc.b0(g2Var), null);
                    return;
                }
                return;
        }
    }
}
