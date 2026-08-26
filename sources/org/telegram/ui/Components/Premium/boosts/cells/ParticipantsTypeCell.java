package org.telegram.ui.Components.Premium.boosts.cells;

public final class ParticipantsTypeCell extends BaseCell {
    public static final int $r8$clinit = 0;
    public int selectedType;

    public int getSelectedType() {
        return this.selectedType;
    }

    @Override
    public final boolean needCheck() {
        return true;
    }
}
