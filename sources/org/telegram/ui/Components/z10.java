package org.telegram.ui.Components;
public final class z10 implements Runnable {
    public final int f31421a;
    public final FragmentContextView f31422b;

    public z10(FragmentContextView fragmentContextView, int i10) {
        this.f31421a = i10;
        this.f31422b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31421a;
        FragmentContextView fragmentContextView = this.f31422b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f29866g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
