package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26539a;
    public final FragmentContextView f26540b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26539a = i10;
        this.f26540b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26539a;
        FragmentContextView fragmentContextView = this.f26540b;
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
