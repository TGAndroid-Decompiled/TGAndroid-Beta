package org.telegram.ui.Stories.recorder;

import android.content.DialogInterface;

public final class PaintView$$ExternalSyntheticLambda61 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final PaintView f$0;

    public PaintView$$ExternalSyntheticLambda61(PaintView paintView, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onOpenCloseStickersAlert(false);
                break;
            default:
                this.f$0.onOpenCloseStickersAlert(false);
                break;
        }
    }
}
