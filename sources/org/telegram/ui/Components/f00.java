package org.telegram.ui.Components;
public final class f00 implements Runnable {
    public final int f33538a;
    public final FragmentContextView f33539b;

    public f00(FragmentContextView fragmentContextView, int i7) {
        this.f33538a = i7;
        this.f33539b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33538a;
        FragmentContextView fragmentContextView = this.f33539b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39464g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
