package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f28598a;
    public final FragmentContextView f28599b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f28598a = i10;
        this.f28599b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f28598a;
        FragmentContextView fragmentContextView = this.f28599b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31505g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
