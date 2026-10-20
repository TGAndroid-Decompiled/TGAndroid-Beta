package org.telegram.ui.Components;
public final class v10 implements Runnable {
    public final int f31111a;
    public final FragmentContextView f31112b;

    public v10(FragmentContextView fragmentContextView, int i10) {
        this.f31111a = i10;
        this.f31112b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f31111a;
        FragmentContextView fragmentContextView = this.f31112b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31428g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
