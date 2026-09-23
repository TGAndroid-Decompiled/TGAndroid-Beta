package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f26568a;
    public final FragmentContextView f26569b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f26568a = i10;
        this.f26569b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26568a;
        FragmentContextView fragmentContextView = this.f26569b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28937g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
