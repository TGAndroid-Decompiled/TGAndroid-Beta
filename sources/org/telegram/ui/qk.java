package org.telegram.ui;

public final class qk extends jo {
    public boolean P0;

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.P0) {
            return;
        }
        i0();
        this.P0 = true;
    }
}
