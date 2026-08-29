package org.telegram.ui.Components;
public final class j10 implements Runnable {
    public final int f29523a;
    public final FragmentContextView f29524b;

    public j10(FragmentContextView fragmentContextView, int i10) {
        this.f29523a = i10;
        this.f29524b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29523a;
        FragmentContextView fragmentContextView = this.f29524b;
        switch (i10) {
            case 0:
                fragmentContextView.J.f33721g = 0.0f;
                fragmentContextView.H.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.n(true);
                return;
        }
    }
}
