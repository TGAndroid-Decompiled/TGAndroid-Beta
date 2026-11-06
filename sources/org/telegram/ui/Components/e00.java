package org.telegram.ui.Components;
public final class e00 implements Runnable {
    public final int f33087a;
    public final FragmentContextView f33088b;

    public e00(FragmentContextView fragmentContextView, int i7) {
        this.f33087a = i7;
        this.f33088b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f33087a;
        FragmentContextView fragmentContextView = this.f33088b;
        switch (i7) {
            case 0:
                fragmentContextView.O.f39319g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
