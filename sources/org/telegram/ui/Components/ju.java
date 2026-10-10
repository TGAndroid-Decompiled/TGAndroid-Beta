package org.telegram.ui.Components;
public final class ju extends q6 {
    public final int f27789d0;
    public final EditTextBoldCursor f27790e0;

    public ju(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f27789d0 = i10;
        this.f27790e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f27789d0) {
            case 0:
                this.f27790e0.invalidate();
                return;
            default:
                this.f27790e0.invalidate();
                return;
        }
    }
}
