package org.telegram.ui.Components;
public final class o10 implements Runnable {
    public final int f26874a;
    public final FragmentContextView f26875b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f26874a = i10;
        this.f26875b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f26874a;
        FragmentContextView fragmentContextView = this.f26875b;
        switch (i10) {
            case 0:
                fragmentContextView.N.f29368g = 0.0f;
                fragmentContextView.L.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.o(true);
                return;
        }
    }
}
