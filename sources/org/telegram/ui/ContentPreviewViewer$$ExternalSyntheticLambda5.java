package org.telegram.ui;

import android.view.View;

public final class ContentPreviewViewer$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda5(ContentPreviewViewer contentPreviewViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showUnlockPremiumView$7(view);
                break;
            case 1:
                this.f$0.lambda$addVoteOptions$3(view);
                break;
            case 2:
                this.f$0.lambda$addVoteOptions$4(view);
                break;
            default:
                this.f$0.lambda$showUnlockPremiumView$8(view);
                break;
        }
    }
}
