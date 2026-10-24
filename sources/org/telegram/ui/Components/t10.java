package org.telegram.ui.Components;
public final class t10 implements Runnable {
    public final int f30681a;
    public final FragmentContextView f30682b;

    public t10(FragmentContextView fragmentContextView, int i10) {
        this.f30681a = i10;
        this.f30682b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f30681a;
        FragmentContextView fragmentContextView = this.f30682b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31584g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
