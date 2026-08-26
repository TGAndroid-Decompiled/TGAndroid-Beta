package org.telegram.ui.Stories.recorder;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class DownloadButton$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final DownloadButton f$0;

    public DownloadButton$$ExternalSyntheticLambda7(DownloadButton downloadButton, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadButton;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Float f = (Float) obj;
                DownloadButton.PreparingVideoToast preparingVideoToast = this.f$0.toast;
                if (preparingVideoToast != null) {
                    preparingVideoToast.setProgress(f.floatValue());
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                DownloadButton downloadButton = this.f$0;
                if (downloadButton.downloading && downloadButton.currentEntry != null) {
                    downloadButton.toast.setDone(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    downloadButton.downloading = false;
                    downloadButton.updateImage();
                    downloadButton.savedToGalleryUri = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                DownloadButton downloadButton2 = this.f$0;
                downloadButton2.downloading = false;
                downloadButton2.updateImage();
                DownloadButton.PreparingVideoToast preparingVideoToast2 = downloadButton2.toast;
                if (preparingVideoToast2 != null) {
                    preparingVideoToast2.hide();
                    downloadButton2.toast = null;
                }
                DownloadButton.PreparingVideoToast preparingVideoToast3 = new DownloadButton.PreparingVideoToast(downloadButton2.getContext(), LocaleController.getString(R.string.PreparingVideo));
                downloadButton2.toast = preparingVideoToast3;
                preparingVideoToast3.setDone(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                downloadButton2.container.addView(downloadButton2.toast);
                downloadButton2.savedToGalleryUri = uri2;
                break;
        }
    }
}
