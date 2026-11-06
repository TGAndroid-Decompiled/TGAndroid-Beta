package org.telegram.ui;
public final class ck extends pn {
    public boolean T0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.T0) {
            n0();
            this.T0 = true;
        }
    }
}
