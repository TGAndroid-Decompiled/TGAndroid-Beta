package org.telegram.ui.Components;

public final class b10 implements Runnable {

    public final int f26877a;

    public final FragmentContextView f26878b;

    public b10(FragmentContextView fragmentContextView, int i10) {
        this.f26877a = i10;
        this.f26878b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26877a;
        FragmentContextView fragmentContextView = this.f26878b;
        switch (i10) {
            case 0:
                fragmentContextView.J.f33592g = 0.0f;
                fragmentContextView.H.invalidate();
                break;
            default:
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.n(true);
                break;
        }
    }
}
