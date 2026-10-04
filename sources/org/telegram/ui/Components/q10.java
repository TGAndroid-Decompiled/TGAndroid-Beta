package org.telegram.ui.Components;
public final class q10 implements Runnable {
    public final int f29858a;
    public final FragmentContextView f29859b;

    public q10(FragmentContextView fragmentContextView, int i10) {
        this.f29858a = i10;
        this.f29859b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29858a;
        FragmentContextView fragmentContextView = this.f29859b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31876g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
