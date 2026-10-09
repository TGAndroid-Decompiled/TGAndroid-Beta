package org.telegram.ui.Components;
public final class iu extends q6 {
    public final int f27486d0;
    public final EditTextBoldCursor f27487e0;

    public iu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f27486d0 = i10;
        this.f27487e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f27486d0) {
            case 0:
                this.f27487e0.invalidate();
                return;
            default:
                this.f27487e0.invalidate();
                return;
        }
    }
}
