package org.telegram.ui.Components;
public final class p00 implements Runnable {
    public final int f38222a;
    public final FragmentContextView f38223b;

    public p00(FragmentContextView fragmentContextView, int i7) {
        this.f38222a = i7;
        this.f38223b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f38222a;
        FragmentContextView fragmentContextView = this.f38223b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f41051g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
