package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31112a;
    public final FragmentContextView f31113b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31112a = i10;
        this.f31113b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31112a;
        FragmentContextView fragmentContextView = this.f31113b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31429g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
