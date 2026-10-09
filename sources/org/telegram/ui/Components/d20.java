package org.telegram.ui.Components;
public final class d20 implements Runnable {
    public final int f25569a;
    public final FragmentContextView f25570b;

    public d20(FragmentContextView fragmentContextView, int i10) {
        this.f25569a = i10;
        this.f25570b = fragmentContextView;
    }

    @Override
    public final void run() {
        int i10 = this.f25569a;
        FragmentContextView fragmentContextView = this.f25570b;
        switch (i10) {
            case 0:
                fragmentContextView.O.f31956g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.o(true);
                return;
        }
    }
}
