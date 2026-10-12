package org.telegram.ui.Components;
public final class lu extends q6 {
    public final int f28285d0;
    public final EditTextBoldCursor f28286e0;

    public lu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f28285d0 = i10;
        this.f28286e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f28285d0) {
            case 0:
                this.f28286e0.invalidate();
                return;
            default:
                this.f28286e0.invalidate();
                return;
        }
    }
}
