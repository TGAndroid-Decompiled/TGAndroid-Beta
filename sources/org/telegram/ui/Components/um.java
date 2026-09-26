package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f28852a;
    public final wn f28853b;
    public final int f28854c;

    public um(wn wnVar, int i10, int i11) {
        this.f28852a = i11;
        this.f28853b = wnVar;
        this.f28854c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28852a) {
            case 0:
                this.f28853b.e0(this.f28854c, null);
                return;
            case 1:
                this.f28853b.b0(this.f28854c);
                return;
            default:
                this.f28853b.e0(this.f28854c, null);
                return;
        }
    }
}
