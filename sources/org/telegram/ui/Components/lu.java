package org.telegram.ui.Components;
public final class lu extends q6 {
    public final int f28280d0;
    public final EditTextBoldCursor f28281e0;

    public lu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f28280d0 = i10;
        this.f28281e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f28280d0) {
            case 0:
                this.f28281e0.invalidate();
                return;
            default:
                this.f28281e0.invalidate();
                return;
        }
    }
}
