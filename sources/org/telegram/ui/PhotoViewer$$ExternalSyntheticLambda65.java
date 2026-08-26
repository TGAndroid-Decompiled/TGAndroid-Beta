package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;

public final class PhotoViewer$$ExternalSyntheticLambda65 implements Utilities.Callback {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda65(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$33((MediaController.PhotoEntry) obj);
                break;
            case 1:
                this.f$0.lambda$setParentActivity$10((Boolean) obj);
                break;
            case 2:
                this.f$0.lambda$setParentActivity$11((Uri) obj);
                break;
            case 3:
                this.f$0.lambda$prepareSegmentImage$133((StickerMakerView.SegmentedObject) obj);
                break;
            case 4:
                this.f$0.lambda$createPaintView$119((Integer) obj);
                break;
            case 5:
                this.f$0.lambda$setParentActivity$38((Integer) obj);
                break;
            case 6:
                this.f$0.lambda$setParentActivity$39((Integer) obj);
                break;
            case 7:
                this.f$0.lambda$setParentActivity$41((Integer) obj);
                break;
            case 8:
                this.f$0.lambda$setParentActivity$42((Integer) obj);
                break;
            default:
                this.f$0.lambda$setParentActivity$8((Boolean) obj);
                break;
        }
    }
}
