package org.telegram.ui.Components;
public final class n10 implements Runnable {
    public final int f26595a;
    public final FragmentContextView f26596b;

    public n10(FragmentContextView fragmentContextView, int i10) {
        this.f26595a = i10;
        this.f26596b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26595a;
        FragmentContextView fragmentContextView = this.f26596b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29262g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
