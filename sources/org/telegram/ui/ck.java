package org.telegram.ui;
public final class ck extends qn {
    public boolean U0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.U0) {
            n0();
            this.U0 = true;
        }
    }
}
