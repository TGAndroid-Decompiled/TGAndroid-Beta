package org.telegram.ui.Components;
public final class a00 implements Runnable {
    public final int f31693a;
    public final FragmentContextView f31694b;

    public a00(FragmentContextView fragmentContextView, int i3) {
        this.f31693a = i3;
        this.f31694b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i3 = this.f31693a;
        FragmentContextView fragmentContextView = this.f31694b;
        switch (i3) {
            case 0:
                fragmentContextView.P.f39350g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
