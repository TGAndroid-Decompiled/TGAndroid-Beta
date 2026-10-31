package org.telegram.ui.Components;
public final class nt implements Runnable {
    public final int f28887a;
    public final qt f28888b;

    public nt(qt qtVar, int i10) {
        this.f28887a = i10;
        this.f28888b = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f28887a) {
            case 0:
                qt qtVar = this.f28888b;
                qtVar.post(new nt(qtVar, 1));
                return;
            default:
                qt qtVar2 = this.f28888b;
                qtVar2.h();
                qtVar2.d();
                return;
        }
    }
}
