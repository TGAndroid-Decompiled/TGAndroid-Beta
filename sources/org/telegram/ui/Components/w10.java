package org.telegram.ui.Components;
public final class w10 implements Runnable {
    public final int f28624a;
    public final FragmentContextView f28625b;

    public w10(FragmentContextView fragmentContextView, int i10) {
        this.f28624a = i10;
        this.f28625b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f28624a;
        FragmentContextView fragmentContextView = this.f28625b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28148g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.n(true);
                return;
        }
    }
}
