package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ItemOptions;

public final class ArticleViewer$$ExternalSyntheticLambda29 implements Runnable {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final float f$2;

    public ArticleViewer$$ExternalSyntheticLambda29(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.actionBar.backButtonDrawable.setRotation(0.0f, true);
                PhotoViewer$6$$ExternalSyntheticLambda0 photoViewer$6$$ExternalSyntheticLambda0 = new PhotoViewer$6$$ExternalSyntheticLambda0(articleViewer, this.f$2, 1);
                ItemOptions itemOptions = (ItemOptions) this.f$1;
                itemOptions.dismissListener = photoViewer$6$$ExternalSyntheticLambda0;
                itemOptions.show();
                break;
            default:
                ((MediaController) this.f$0).lambda$setPlaybackSpeed$16((MessageObject) this.f$1, this.f$2);
                break;
        }
    }
}
