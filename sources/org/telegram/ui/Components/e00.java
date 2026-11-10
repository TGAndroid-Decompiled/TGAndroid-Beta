package org.telegram.ui.Components;
public final class e00 implements Runnable {
    public final int f33118a;
    public final FragmentContextView f33119b;

    public e00(FragmentContextView fragmentContextView, int i7) {
        this.f33118a = i7;
        this.f33119b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33118a;
        FragmentContextView fragmentContextView = this.f33119b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39384g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
