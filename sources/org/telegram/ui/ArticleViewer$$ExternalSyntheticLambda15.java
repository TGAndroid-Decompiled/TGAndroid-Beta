package org.telegram.ui;

import android.view.View;

public final class ArticleViewer$$ExternalSyntheticLambda15 implements View.OnClickListener {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda15(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPopup$4(view);
                break;
            case 1:
                this.f$0.lambda$setParentActivity$43(view);
                break;
            case 2:
                this.f$0.lambda$setParentActivity$44(view);
                break;
            case 3:
                this.f$0.lambda$setParentActivity$26(view);
                break;
            case 4:
                this.f$0.lambda$setParentActivity$40(view);
                break;
            default:
                this.f$0.lambda$setParentActivity$38(view);
                break;
        }
    }
}
