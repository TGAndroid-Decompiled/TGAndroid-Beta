package org.telegram.ui.Components;
public final class x10 implements Runnable {
    public final int f34581a;
    public final FragmentContextView f34582b;

    public x10(FragmentContextView fragmentContextView, int i10) {
        this.f34581a = i10;
        this.f34582b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f34581a;
        FragmentContextView fragmentContextView = this.f34582b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f33821g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
