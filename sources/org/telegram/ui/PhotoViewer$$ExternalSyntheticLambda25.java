package org.telegram.ui;

import java.util.LinkedHashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;

public final class PhotoViewer$$ExternalSyntheticLambda25 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public PhotoViewer$$ExternalSyntheticLambda25(PhotoViewer photoViewer, boolean z, MediaController.MediaEditState mediaEditState) {
        this.f$0 = photoViewer;
        this.f$1 = z;
        this.f$2 = mediaEditState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$54(this.f$1, (MediaController.MediaEditState) this.f$2, (StickerMakerView.SegmentedObject) obj);
                break;
            default:
                SelectAnimatedEmojiDialog.lambda$search$21(this.f$1, (String) this.f$0, (LinkedHashSet) this.f$2, (Runnable) obj);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda25(boolean z, String str, LinkedHashSet linkedHashSet) {
        this.f$1 = z;
        this.f$0 = str;
        this.f$2 = linkedHashSet;
    }
}
