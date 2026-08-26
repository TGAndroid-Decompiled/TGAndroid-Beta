package org.telegram.ui;

import android.graphics.Bitmap;

public final class PhotoViewer$$ExternalSyntheticLambda45 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;
    public final Bitmap f$1;

    public PhotoViewer$$ExternalSyntheticLambda45(PhotoViewer photoViewer, Bitmap bitmap, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
        this.f$1 = bitmap;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$48(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setParentActivity$44(this.f$1);
                break;
            case 2:
                this.f$0.lambda$setParentActivity$45(this.f$1);
                break;
            case 3:
                this.f$0.lambda$setParentActivity$47(this.f$1);
                break;
            case 4:
                this.f$0.lambda$setParentActivity$49(this.f$1);
                break;
            case 5:
                this.f$0.lambda$setParentActivity$50(this.f$1);
                break;
            default:
                this.f$0.lambda$setParentActivity$46(this.f$1);
                break;
        }
    }
}
