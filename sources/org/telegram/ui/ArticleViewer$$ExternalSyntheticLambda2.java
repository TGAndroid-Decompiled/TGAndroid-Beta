package org.telegram.ui;

import android.content.DialogInterface;

public final class ArticleViewer$$ExternalSyntheticLambda2 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda2(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showCopyPopup$1(dialogInterface);
                break;
            default:
                this.f$0.lambda$showDialog$66(dialogInterface);
                break;
        }
    }
}
