package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BulletinFactory;

public final class PhotoViewer$16$$ExternalSyntheticLambda9 implements Utilities.Callback {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass16 f$0;
    public final boolean f$1;

    public PhotoViewer$16$$ExternalSyntheticLambda9(PhotoViewer.AnonymousClass16 anonymousClass16, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass16;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, this.f$1).show();
                break;
            default:
                BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, this.f$1).show();
                break;
        }
    }
}
