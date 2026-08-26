package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ArchiveHelp$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public ArchiveHelp$$ExternalSyntheticLambda0(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            case 1:
                SharedMediaLayout.MoreRecommendationsCell.lambda$new$0(this.f$0, view);
                break;
            case 2:
                FolderBottomSheet.HeaderCell.lambda$setAction$0(this.f$0, view);
                break;
            case 3:
                this.f$0.run();
                break;
            case 4:
                this.f$0.run();
                break;
            case 5:
                this.f$0.run();
                break;
            default:
                AndroidUtilities.runOnUIThread(this.f$0, 100L);
                break;
        }
    }
}
