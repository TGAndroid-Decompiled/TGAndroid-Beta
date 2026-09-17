package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26306a;
    public final FragmentContextView f26307b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26306a = i10;
        this.f26307b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26306a;
        FragmentContextView fragmentContextView = this.f26307b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28943g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
