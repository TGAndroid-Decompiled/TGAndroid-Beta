package org.telegram.ui.Components;
public final class g20 implements Runnable {
    public final int f26227a;
    public final FragmentContextView f26228b;

    public g20(FragmentContextView fragmentContextView, int i10) {
        this.f26227a = i10;
        this.f26228b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26227a;
        FragmentContextView fragmentContextView = this.f26228b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31688g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
