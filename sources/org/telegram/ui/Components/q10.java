package org.telegram.ui.Components;
public final class q10 implements Runnable {
    public final int f27516a;
    public final FragmentContextView f27517b;

    public q10(FragmentContextView fragmentContextView, int i10) {
        this.f27516a = i10;
        this.f27517b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27516a;
        FragmentContextView fragmentContextView = this.f27517b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29286g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
