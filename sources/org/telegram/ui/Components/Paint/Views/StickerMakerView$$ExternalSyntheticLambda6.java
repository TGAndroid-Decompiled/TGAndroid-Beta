package org.telegram.ui.Components.Paint.Views;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ThanosEffect;

public final class StickerMakerView$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final StickerMakerView f$0;

    public StickerMakerView$$ExternalSyntheticLambda6(StickerMakerView stickerMakerView, int i) {
        this.$r8$classId = i;
        this.f$0 = stickerMakerView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StickerMakerView stickerMakerView = this.f$0;
                ThanosEffect thanosEffect = stickerMakerView.thanosEffect;
                if (thanosEffect != null) {
                    stickerMakerView.thanosEffect = null;
                    stickerMakerView.removeView(thanosEffect);
                }
                break;
            default:
                StickerMakerView stickerMakerView2 = this.f$0;
                StickerMakerView.StickerUploader stickerUploader = stickerMakerView2.stickerUploader;
                if (stickerUploader != null) {
                    if (stickerUploader.messageObject != null) {
                        MediaController.getInstance().cancelVideoConvert(stickerMakerView2.stickerUploader.messageObject);
                        FileLoader.getInstance(stickerMakerView2.currentAccount).cancelFileUpload(stickerMakerView2.stickerUploader.finalPath, false);
                        stickerMakerView2.stickerUploader.getClass();
                    }
                    stickerMakerView2.stickerUploader.destroy();
                    stickerMakerView2.stickerUploader = null;
                }
                stickerMakerView2.loadingToast.hide();
                stickerMakerView2.loadingToast = null;
                break;
        }
    }
}
