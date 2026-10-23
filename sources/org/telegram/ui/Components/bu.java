package org.telegram.ui.Components;
public final class bu extends p6 {
    public final int f25149d0;
    public final EditTextBoldCursor f25150e0;

    public bu(EditTextBoldCursor editTextBoldCursor, int i10) {
        super(false, false, false);
        this.f25149d0 = i10;
        this.f25150e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25149d0) {
            case 0:
                this.f25150e0.invalidate();
                return;
            default:
                this.f25150e0.invalidate();
                return;
        }
    }
}
