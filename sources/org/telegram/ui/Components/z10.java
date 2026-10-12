package org.telegram.ui.Components;
public final class z10 implements Runnable {
    public final int f31731a;
    public final FragmentContextView f31732b;

    public z10(FragmentContextView fragmentContextView, int i10) {
        this.f31731a = i10;
        this.f31732b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31731a;
        FragmentContextView fragmentContextView = this.f31732b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f30197g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
