package org.telegram.ui.Components;
public final class e00 implements Runnable {
    public final int f33074a;
    public final FragmentContextView f33075b;

    public e00(FragmentContextView fragmentContextView, int i7) {
        this.f33074a = i7;
        this.f33075b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33074a;
        FragmentContextView fragmentContextView = this.f33075b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39322g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
