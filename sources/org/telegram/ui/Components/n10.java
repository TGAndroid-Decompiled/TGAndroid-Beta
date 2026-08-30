package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f27161a;
    public final FragmentContextView f27162b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f27161a = i10;
        this.f27162b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f27161a;
        FragmentContextView fragmentContextView = this.f27162b;
        switch (i10) {
            case 0:
                fragmentContextView.K.f29657g = 0.0f;
                fragmentContextView.I.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.n(true);
                return;
        }
    }
}
