package org.telegram.ui.Components;
public final class zt extends n6 {
    public final int f33353d0;
    public final EditTextBoldCursor f33354e0;

    public zt(EditTextBoldCursor editTextBoldCursor, int i10) {
        super(false, false, false);
        this.f33353d0 = i10;
        this.f33354e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f33353d0) {
            case 0:
                this.f33354e0.invalidate();
                return;
            default:
                this.f33354e0.invalidate();
                return;
        }
    }
}
