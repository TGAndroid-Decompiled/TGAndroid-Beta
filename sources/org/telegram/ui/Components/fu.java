package org.telegram.ui.Components;
public final class fu extends r6 {
    public final int f24815d0;
    public final EditTextBoldCursor f24816e0;

    public fu(int i10, EditTextBoldCursor editTextBoldCursor) {
        super(false, false, false);
        this.f24815d0 = i10;
        this.f24816e0 = editTextBoldCursor;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f24815d0) {
            case 0:
                this.f24816e0.invalidate();
                return;
            default:
                this.f24816e0.invalidate();
                return;
        }
    }
}
