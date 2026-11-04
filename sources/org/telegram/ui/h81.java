package org.telegram.ui;
public final class h81 extends org.telegram.ui.Components.qt0 {
    public boolean f45854g0;

    @Override
    public final void onMeasure(int i3, int i10) {
        Q();
        if (getKeyboardHeight() == 0 && !this.f45854g0) {
            int i11 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            this.f37535f = i11;
            setPadding(0, 0, 0, i11);
        } else {
            this.f45854g0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i3, i10);
    }
}
