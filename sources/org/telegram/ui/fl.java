package org.telegram.ui;
public final class fl extends zo {
    public boolean T0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.T0) {
            i0();
            this.T0 = true;
        }
    }
}
