package org.telegram.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import org.telegram.messenger.MessageObject;

public final class PhotoViewer$$ExternalSyntheticLambda146 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Serializable f$1;
    public final boolean f$2;
    public final Object f$3;
    public final boolean f$4;
    public final boolean f$5;

    public PhotoViewer$$ExternalSyntheticLambda146(PhotoViewer.AnonymousClass16 anonymousClass16, int[] iArr, int[] iArr2, boolean z, boolean z2, boolean z3) {
        this.f$0 = anonymousClass16;
        this.f$1 = iArr;
        this.f$3 = iArr2;
        this.f$2 = z;
        this.f$4 = z2;
        this.f$5 = z3;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$openCurrentPhotoInPaintModeForSelect$142((File) this.f$1, this.f$2, (MessageObject) this.f$3, this.f$4, this.f$5);
                break;
            default:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$5((int[]) this.f$1, (int[]) this.f$3, this.f$2, this.f$4, this.f$5);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda146(PhotoViewer photoViewer, File file, boolean z, MessageObject messageObject, boolean z2, boolean z3) {
        this.f$0 = photoViewer;
        this.f$1 = file;
        this.f$2 = z;
        this.f$3 = messageObject;
        this.f$4 = z2;
        this.f$5 = z3;
    }
}
