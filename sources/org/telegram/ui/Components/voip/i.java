package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39339a;
    public final k f39340b;

    public i(k kVar, int i7) {
        this.f39339a = i7;
        this.f39340b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39339a) {
            case 0:
                k kVar = this.f39340b;
                kVar.f39378x = false;
                kVar.c();
                return;
            default:
                this.f39340b.f39369a.setVisibility(4);
                return;
        }
    }
}
