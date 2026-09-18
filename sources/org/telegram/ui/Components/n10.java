package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26309a;
    public final FragmentContextView f26310b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26309a = i10;
        this.f26310b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26309a;
        FragmentContextView fragmentContextView = this.f26310b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28946g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
