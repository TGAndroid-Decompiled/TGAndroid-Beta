package org.telegram.ui;
public final class ok extends ho {
    public boolean P0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.P0) {
            h0();
            this.P0 = true;
        }
    }
}
