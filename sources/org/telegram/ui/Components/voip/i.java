package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f40649a;
    public final k f40650b;

    public i(k kVar, int i7) {
        this.f40649a = i7;
        this.f40650b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f40649a) {
            case 0:
                k kVar = this.f40650b;
                kVar.f40709x = false;
                kVar.c();
                return;
            default:
                this.f40650b.f40700a.setVisibility(4);
                return;
        }
    }
}
