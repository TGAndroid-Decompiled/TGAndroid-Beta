package org.telegram.ui.Components;
public final class ab0 implements Runnable {
    public final int f22408a;
    public final ob0 f22409b;

    public ab0(ob0 ob0Var, int i10) {
        this.f22408a = i10;
        this.f22409b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f22408a) {
            case 0:
                ob0 ob0Var = this.f22409b;
                hb0 hb0Var = ob0Var.f26709f;
                if (ob0Var.f26708c0.d.webpageTop) {
                    hb0Var.w0(-hb0Var.computeVerticalScrollOffset(), 250, ji.n.V);
                    return;
                }
                hb0Var.w0(hb0Var.computeVerticalScrollRange() - (hb0Var.computeVerticalScrollExtent() + hb0Var.computeVerticalScrollOffset()), 250, ji.n.V);
                return;
            default:
                this.f22409b.g(true, false);
                return;
        }
    }
}
