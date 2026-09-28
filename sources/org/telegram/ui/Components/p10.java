package org.telegram.ui.Components;
public final class p10 implements Runnable {
    public final int f27219a;
    public final FragmentContextView f27220b;

    public p10(FragmentContextView fragmentContextView, int i10) {
        this.f27219a = i10;
        this.f27220b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27219a;
        FragmentContextView fragmentContextView = this.f27220b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29289g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
