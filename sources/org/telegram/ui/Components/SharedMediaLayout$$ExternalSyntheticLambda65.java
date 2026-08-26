package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;

public final class SharedMediaLayout$$ExternalSyntheticLambda65 implements Utilities.Callback {
    public final SharedPhotoVideoCell2 f$0;
    public final float f$1;
    public final float f$2;

    public SharedMediaLayout$$ExternalSyntheticLambda65(SharedPhotoVideoCell2 sharedPhotoVideoCell2, float f, float f2) {
        this.f$0 = sharedPhotoVideoCell2;
        this.f$1 = f;
        this.f$2 = f2;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.startRevealMedia(this.f$1, this.f$2);
    }
}
