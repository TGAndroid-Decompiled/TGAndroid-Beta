package org.telegram.ui.Components;
public final class r00 implements Runnable {
    public final int f39027a;
    public final FragmentContextView f39028b;

    public r00(FragmentContextView fragmentContextView, int i7) {
        this.f39027a = i7;
        this.f39028b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f39027a;
        FragmentContextView fragmentContextView = this.f39028b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f41187g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
