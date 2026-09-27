package org.telegram.ui.Components;
public final class p10 implements Runnable {
    public final int f27243a;
    public final FragmentContextView f27244b;

    public p10(FragmentContextView fragmentContextView, int i10) {
        this.f27243a = i10;
        this.f27244b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27243a;
        FragmentContextView fragmentContextView = this.f27244b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29311g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
