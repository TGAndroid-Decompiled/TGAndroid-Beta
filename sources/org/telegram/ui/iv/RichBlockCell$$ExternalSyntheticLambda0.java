package org.telegram.ui.iv;

public final class RichBlockCell$$ExternalSyntheticLambda0 {
    public final int $r8$classId;
    public final RichBlockCell f$0;

    public RichBlockCell$$ExternalSyntheticLambda0(RichBlockCell richBlockCell, int i) {
        this.$r8$classId = i;
        this.f$0 = richBlockCell;
    }

    public final void apply(int i) {
        switch (this.$r8$classId) {
            case 0:
                RichBlockCell richBlockCell = this.f$0;
                richBlockCell.blockInset = i;
                richBlockCell.onBlockInsetChanged(i);
                break;
            default:
                RichBlockCell richBlockCell2 = this.f$0;
                richBlockCell2.blockInset = i;
                richBlockCell2.onBlockInsetChanged(i);
                break;
        }
    }
}
