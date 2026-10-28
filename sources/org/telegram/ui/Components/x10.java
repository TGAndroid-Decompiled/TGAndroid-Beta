package org.telegram.ui.Components;
public final class x10 implements Runnable {
    public final int f34635a;
    public final FragmentContextView f34636b;

    public x10(FragmentContextView fragmentContextView, int i10) {
        this.f34635a = i10;
        this.f34636b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f34635a;
        FragmentContextView fragmentContextView = this.f34636b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f33926g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
