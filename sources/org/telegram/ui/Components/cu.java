package org.telegram.ui.Components;
public final class cu extends r6 {
    public final int f27255d0;
    public final EditTextBoldCursor f27256e0;

    public cu(EditTextBoldCursor editTextBoldCursor, int i10) {
        super(false, false, false);
        this.f27255d0 = i10;
        this.f27256e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f27255d0) {
            case 0:
                this.f27256e0.invalidate();
                return;
            default:
                this.f27256e0.invalidate();
                return;
        }
    }
}
