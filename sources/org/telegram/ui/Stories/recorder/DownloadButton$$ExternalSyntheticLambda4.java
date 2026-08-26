package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class DownloadButton$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final DownloadButton f$0;

    public DownloadButton$$ExternalSyntheticLambda4(DownloadButton downloadButton, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadButton;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onClickInternal();
                break;
            case 1:
                DownloadButton downloadButton = this.f$0;
                downloadButton.preparing = false;
                DownloadButton.BuildingVideo buildingVideo = downloadButton.buildingVideo;
                if (buildingVideo != null) {
                    buildingVideo.stop(true);
                    downloadButton.buildingVideo = null;
                }
                DownloadButton.PreparingVideoToast preparingVideoToast = downloadButton.toast;
                if (preparingVideoToast != null) {
                    preparingVideoToast.hide();
                }
                downloadButton.downloading = false;
                downloadButton.updateImage();
                break;
            default:
                DownloadButton downloadButton2 = this.f$0;
                if (downloadButton2.downloading && downloadButton2.currentEntry != null) {
                    downloadButton2.toast.setDone(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    downloadButton2.downloading = false;
                    downloadButton2.updateImage();
                    break;
                }
                break;
        }
    }
}
