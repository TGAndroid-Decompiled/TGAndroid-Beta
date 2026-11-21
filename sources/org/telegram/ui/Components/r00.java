package org.telegram.ui.Components;
public final class r00 implements Runnable {
    public final int f39034a;
    public final FragmentContextView f39035b;

    public r00(FragmentContextView fragmentContextView, int i7) {
        this.f39034a = i7;
        this.f39035b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f39034a;
        FragmentContextView fragmentContextView = this.f39035b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f41186g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
