package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f28597a;
    public final FragmentContextView f28598b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f28597a = i10;
        this.f28598b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f28597a;
        FragmentContextView fragmentContextView = this.f28598b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31504g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
