package org.telegram.ui.Components;
public final class x10 implements Runnable {
    public final int f34578a;
    public final FragmentContextView f34579b;

    public x10(FragmentContextView fragmentContextView, int i10) {
        this.f34578a = i10;
        this.f34579b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f34578a;
        FragmentContextView fragmentContextView = this.f34579b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f33818g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
