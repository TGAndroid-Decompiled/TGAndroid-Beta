package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31116a;
    public final FragmentContextView f31117b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31116a = i10;
        this.f31117b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31116a;
        FragmentContextView fragmentContextView = this.f31117b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31433g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
