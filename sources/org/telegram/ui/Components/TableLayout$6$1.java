package org.telegram.ui.Components;

public final class TableLayout$6$1 extends TableLayout.Bounds {
    public int size;

    @Override
    public final int getOffset(TableLayout.Child child, TableLayout.AnonymousClass1 anonymousClass1, int i) {
        return Math.max(0, this.before - anonymousClass1.getAlignmentValue());
    }

    @Override
    public final void include(int i, int i2) {
        super.include(i, i2);
        this.size = Math.max(this.size, i + i2);
    }

    @Override
    public final void reset() {
        super.reset();
        this.size = Integer.MIN_VALUE;
    }

    @Override
    public final int size(boolean z) {
        return Math.max(super.size(z), this.size);
    }
}
