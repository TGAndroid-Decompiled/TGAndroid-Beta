package org.telegram.ui.Components;
public final class y00 implements Runnable {
    public final int f34821a;
    public final FragmentContextView f34822b;

    public y00(FragmentContextView fragmentContextView, int i9) {
        this.f34821a = i9;
        this.f34822b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i9 = this.f34821a;
        FragmentContextView fragmentContextView = this.f34822b;
        switch (i9) {
            case 0:
                fragmentContextView.J.f33542g = 0.0f;
                fragmentContextView.H.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.n(true);
                return;
        }
    }
}
