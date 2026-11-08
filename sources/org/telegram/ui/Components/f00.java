package org.telegram.ui.Components;
public final class f00 implements Runnable {
    public final int f33424a;
    public final FragmentContextView f33425b;

    public f00(FragmentContextView fragmentContextView, int i7) {
        this.f33424a = i7;
        this.f33425b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33424a;
        FragmentContextView fragmentContextView = this.f33425b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39375g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
