package org.telegram.ui.Components;
public final class s00 implements Runnable {
    public final int f30145a;
    public final FragmentContextView f30146b;

    public s00(FragmentContextView fragmentContextView, int i10) {
        this.f30145a = i10;
        this.f30146b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f30145a;
        FragmentContextView fragmentContextView = this.f30146b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31495g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
