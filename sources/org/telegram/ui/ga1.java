package org.telegram.ui;
public final class ga1 extends org.telegram.ui.Components.vu0 {
    public boolean f37439f0;

    @Override
    public final void onMeasure(int i10, int i11) {
        Q();
        if (getKeyboardHeight() == 0 && !this.f37439f0) {
            int i12 = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            this.f31916f = i12;
            setPadding(0, 0, 0, i12);
        } else {
            this.f37439f0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i10, i11);
    }
}
