package org.telegram.ui.Components;
public final class i00 implements Runnable {
    public final int f35392a;
    public final FragmentContextView f35393b;

    public i00(FragmentContextView fragmentContextView, int i7) {
        this.f35392a = i7;
        this.f35393b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i7 = this.f35392a;
        FragmentContextView fragmentContextView = this.f35393b;
        switch (i7) {
            case 0:
                fragmentContextView.P.f40796g = 0.0f;
                fragmentContextView.N.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.o(true);
                return;
        }
    }
}
