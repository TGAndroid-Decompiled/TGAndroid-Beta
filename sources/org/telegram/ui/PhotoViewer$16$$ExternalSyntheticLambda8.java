package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BulletinFactory;

public final class PhotoViewer$16$$ExternalSyntheticLambda8 implements Utilities.Callback {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass16 f$0;

    public PhotoViewer$16$$ExternalSyntheticLambda8(PhotoViewer.AnonymousClass16 anonymousClass16, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass16;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                new BulletinFactory(PhotoViewer.this.containerView, null).createDownloadBulletin(BulletinFactory.FileType.LIVEPHOTO, 1, -115203550, -1, null).show();
                break;
            default:
                new BulletinFactory(PhotoViewer.this.containerView, null).createDownloadBulletin(BulletinFactory.FileType.LIVEPHOTO, 1, -115203550, -1, null).show();
                break;
        }
    }
}
