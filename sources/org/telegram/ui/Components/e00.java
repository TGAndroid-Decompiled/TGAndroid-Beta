package org.telegram.ui.Components;
public final class e00 implements Runnable {
    public final int f33112a;
    public final FragmentContextView f33113b;

    public e00(FragmentContextView fragmentContextView, int i7) {
        this.f33112a = i7;
        this.f33113b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33112a;
        FragmentContextView fragmentContextView = this.f33113b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39340g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
