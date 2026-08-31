package org.telegram.ui.Components;
public final class qt extends j6 {
    public final int W;
    public final EditTextBoldCursor X;

    public qt(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false, false);
        this.W = i10;
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
