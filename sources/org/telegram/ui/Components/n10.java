package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26297a;
    public final FragmentContextView f26298b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26297a = i10;
        this.f26298b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26297a;
        FragmentContextView fragmentContextView = this.f26298b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f28963g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
