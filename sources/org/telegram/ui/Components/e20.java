package org.telegram.ui.Components;
public final class e20 implements Runnable {
    public final int f25947a;
    public final FragmentContextView f25948b;

    public e20(FragmentContextView fragmentContextView, int i10) {
        this.f25947a = i10;
        this.f25948b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f25947a;
        FragmentContextView fragmentContextView = this.f25948b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f32066g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
