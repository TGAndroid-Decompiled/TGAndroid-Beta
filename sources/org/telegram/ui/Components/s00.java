package org.telegram.ui.Components;
public final class s00 implements Runnable {
    public final int f30077a;
    public final FragmentContextView f30078b;

    public s00(FragmentContextView fragmentContextView, int i10) {
        this.f30077a = i10;
        this.f30078b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f30077a;
        FragmentContextView fragmentContextView = this.f30078b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31437g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
