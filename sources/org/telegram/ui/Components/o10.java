package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f27428a;
    public final FragmentContextView f27429b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f27428a = i10;
        this.f27429b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27428a;
        FragmentContextView fragmentContextView = this.f27429b;
        switch (i10) {
            case 0:
                fragmentContextView.K.f29629g = 0.0f;
                fragmentContextView.I.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.n(true);
                return;
        }
    }
}
