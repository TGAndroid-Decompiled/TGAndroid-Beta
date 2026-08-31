package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f29649a;
    public final FragmentContextView f29650b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f29649a = i10;
        this.f29650b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29649a;
        FragmentContextView fragmentContextView = this.f29650b;
        switch (i10) {
            case 0:
                fragmentContextView.K.f32056g = 0.0f;
                fragmentContextView.I.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.n(true);
                return;
        }
    }
}
