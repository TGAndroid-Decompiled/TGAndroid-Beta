package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f28274a;
    public final un f28275b;
    public final int f28276c;

    public sm(un unVar, int i10, int i11) {
        this.f28274a = i11;
        this.f28275b = unVar;
        this.f28276c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28274a) {
            case 0:
                this.f28275b.e0(this.f28276c, null);
                return;
            case 1:
                this.f28275b.b0(this.f28276c);
                return;
            default:
                this.f28275b.e0(this.f28276c, null);
                return;
        }
    }
}
