package org.telegram.ui.Components;
public final class g20 implements Runnable {
    public final int f26229a;
    public final FragmentContextView f26230b;

    public g20(FragmentContextView fragmentContextView, int i10) {
        this.f26229a = i10;
        this.f26230b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26229a;
        FragmentContextView fragmentContextView = this.f26230b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31703g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
