package org.telegram.ui.Components;
public final class e20 implements Runnable {
    public final int f25803a;
    public final FragmentContextView f25804b;

    public e20(FragmentContextView fragmentContextView, int i10) {
        this.f25803a = i10;
        this.f25804b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f25803a;
        FragmentContextView fragmentContextView = this.f25804b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f32002g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
