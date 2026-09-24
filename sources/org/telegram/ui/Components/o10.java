package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f26870a;
    public final FragmentContextView f26871b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f26870a = i10;
        this.f26871b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26870a;
        FragmentContextView fragmentContextView = this.f26871b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29359g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
