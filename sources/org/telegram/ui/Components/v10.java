package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31140a;
    public final FragmentContextView f31141b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31140a = i10;
        this.f31141b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31140a;
        FragmentContextView fragmentContextView = this.f31141b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31468g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
