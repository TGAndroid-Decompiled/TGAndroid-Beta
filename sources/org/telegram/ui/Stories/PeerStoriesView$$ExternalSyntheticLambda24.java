package org.telegram.ui.Stories;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PeerStoriesView$$ExternalSyntheticLambda24 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public PeerStoriesView$$ExternalSyntheticLambda24(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            default:
                this.f$0.run();
                break;
        }
    }
}
