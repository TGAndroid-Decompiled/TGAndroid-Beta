package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26298a;
    public final FragmentContextView f26299b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26298a = i10;
        this.f26299b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26298a;
        FragmentContextView fragmentContextView = this.f26299b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28966g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
