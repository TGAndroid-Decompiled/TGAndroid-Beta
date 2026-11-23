package org.telegram.ui.Components;
public final class r00 implements Runnable {
    public final int f38982a;
    public final FragmentContextView f38983b;

    public r00(FragmentContextView fragmentContextView, int i7) {
        this.f38982a = i7;
        this.f38983b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f38982a;
        FragmentContextView fragmentContextView = this.f38983b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f41149g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
