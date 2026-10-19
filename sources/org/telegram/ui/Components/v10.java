package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31113a;
    public final FragmentContextView f31114b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31113a = i10;
        this.f31114b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31113a;
        FragmentContextView fragmentContextView = this.f31114b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31477g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
