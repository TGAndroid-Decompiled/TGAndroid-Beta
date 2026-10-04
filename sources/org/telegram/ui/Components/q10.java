package org.telegram.ui.Components;
public final class q10 implements Runnable {
    public final int f29863a;
    public final FragmentContextView f29864b;

    public q10(FragmentContextView fragmentContextView, int i10) {
        this.f29863a = i10;
        this.f29864b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29863a;
        FragmentContextView fragmentContextView = this.f29864b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31882g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.o(true);
                return;
        }
    }
}
