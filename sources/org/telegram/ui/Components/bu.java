package org.telegram.ui.Components;
public final class bu extends p6 {
    public final int f25042d0;
    public final EditTextBoldCursor f25043e0;

    public bu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f25042d0 = i10;
        this.f25043e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25042d0) {
            case 0:
                this.f25043e0.invalidate();
                return;
            default:
                this.f25043e0.invalidate();
                return;
        }
    }
}
