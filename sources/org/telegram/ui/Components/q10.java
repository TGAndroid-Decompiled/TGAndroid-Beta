package org.telegram.ui.Components;
public final class q10 implements Runnable {
    public final int f29897a;
    public final FragmentContextView f29898b;

    public q10(FragmentContextView fragmentContextView, int i10) {
        this.f29897a = i10;
        this.f29898b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29897a;
        FragmentContextView fragmentContextView = this.f29898b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31949g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
