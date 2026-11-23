package org.telegram.ui.Components;
public final class p00 implements Runnable {
    public final int f38352a;
    public final FragmentContextView f38353b;

    public p00(FragmentContextView fragmentContextView, int i7) {
        this.f38352a = i7;
        this.f38353b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f38352a;
        FragmentContextView fragmentContextView = this.f38353b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f41075g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
