package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

public final class PhotoViewer$16$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass16 f$0;

    public PhotoViewer$16$$ExternalSyntheticLambda12(PhotoViewer.AnonymousClass16 anonymousClass16, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass16;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onItemClick$0((Uri) obj);
                break;
            default:
                this.f$0.lambda$onItemClick$2((Uri) obj);
                break;
        }
    }
}
