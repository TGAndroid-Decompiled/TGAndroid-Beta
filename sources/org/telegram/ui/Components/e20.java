package org.telegram.ui.Components;
public final class e20 implements Runnable {
    public final int f25873a;
    public final FragmentContextView f25874b;

    public e20(FragmentContextView fragmentContextView, int i10) {
        this.f25873a = i10;
        this.f25874b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f25873a;
        FragmentContextView fragmentContextView = this.f25874b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f32021g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
