package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f26875a;
    public final FragmentContextView f26876b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f26875a = i10;
        this.f26876b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26875a;
        FragmentContextView fragmentContextView = this.f26876b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29369g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
