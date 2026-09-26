package org.telegram.ui.Components;
public final class p10 implements Runnable {
    public final int f27184a;
    public final FragmentContextView f27185b;

    public p10(FragmentContextView fragmentContextView, int i10) {
        this.f27184a = i10;
        this.f27185b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27184a;
        FragmentContextView fragmentContextView = this.f27185b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29285g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
