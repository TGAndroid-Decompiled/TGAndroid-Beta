package org.telegram.ui.Components;
public final class ju extends q6 {
    public final int f27848d0;
    public final EditTextBoldCursor f27849e0;

    public ju(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f27848d0 = i10;
        this.f27849e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f27848d0) {
            case 0:
                this.f27849e0.invalidate();
                return;
            default:
                this.f27849e0.invalidate();
                return;
        }
    }
}
