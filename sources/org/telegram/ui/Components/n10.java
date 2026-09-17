package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f28625a;
    public final FragmentContextView f28626b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f28625a = i10;
        this.f28626b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f28625a;
        FragmentContextView fragmentContextView = this.f28626b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f31532g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
