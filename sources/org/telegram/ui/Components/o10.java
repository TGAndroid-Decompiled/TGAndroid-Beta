package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f29634a;
    public final FragmentContextView f29635b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f29634a = i10;
        this.f29635b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f29634a;
        FragmentContextView fragmentContextView = this.f29635b;
        switch (i10) {
            case 0:
                fragmentContextView.K.f32061g = 0.0f;
                fragmentContextView.I.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.n(true);
                return;
        }
    }
}
