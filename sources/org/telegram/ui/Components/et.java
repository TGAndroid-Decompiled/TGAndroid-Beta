package org.telegram.ui.Components;
public final class et extends i6 {
    public final int W;
    public final EditTextBoldCursor X;

    public et(int i9, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false, false);
        this.W = i9;
        this.X = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidate();
                return;
            default:
                this.X.invalidate();
                return;
        }
    }
}
