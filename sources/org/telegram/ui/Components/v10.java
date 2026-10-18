package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31147a;
    public final FragmentContextView f31148b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31147a = i10;
        this.f31148b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31147a;
        FragmentContextView fragmentContextView = this.f31148b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31475g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
