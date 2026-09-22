package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26590a;
    public final FragmentContextView f26591b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26590a = i10;
        this.f26591b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26590a;
        FragmentContextView fragmentContextView = this.f26591b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29331g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
