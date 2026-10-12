package org.telegram.ui.Components;
public final class fu extends r6 {
    public final int f25125d0;
    public final EditTextBoldCursor f25126e0;

    public fu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f25125d0 = i10;
        this.f25126e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25125d0) {
            case 0:
                this.f25126e0.invalidate();
                return;
            default:
                this.f25126e0.invalidate();
                return;
        }
    }
}
