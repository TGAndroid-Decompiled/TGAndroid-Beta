package org.telegram.ui.Components;
public final class bu extends p6 {
    public final int f25051e0;
    public final EditTextBoldCursor f25052f0;

    public bu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f25051e0 = i10;
        this.f25052f0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f25051e0) {
            case 0:
                this.f25052f0.invalidate();
                return;
            default:
                this.f25052f0.invalidate();
                return;
        }
    }
}
