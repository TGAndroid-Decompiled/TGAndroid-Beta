package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31280a;
    public final FragmentContextView f31281b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31280a = i10;
        this.f31281b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31280a;
        FragmentContextView fragmentContextView = this.f31281b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31614g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
