package org.telegram.ui.Components;
public final class ju extends q6 {
    public final int f27754d0;
    public final EditTextBoldCursor f27755e0;

    public ju(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f27754d0 = i10;
        this.f27755e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f27754d0) {
            case 0:
                this.f27755e0.invalidate();
                return;
            default:
                this.f27755e0.invalidate();
                return;
        }
    }
}
