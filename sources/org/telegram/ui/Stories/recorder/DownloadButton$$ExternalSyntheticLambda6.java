package org.telegram.ui.Stories.recorder;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

public final class DownloadButton$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final DownloadButton f$0;
    public final File f$1;

    public DownloadButton$$ExternalSyntheticLambda6(DownloadButton downloadButton, File file, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadButton;
        this.f$1 = file;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DownloadButton downloadButton = this.f$0;
                if (downloadButton.downloading && downloadButton.currentEntry != null) {
                    MediaController.saveFile(this.f$1.getAbsolutePath(), downloadButton.getContext(), 1, null, null, new DownloadButton$$ExternalSyntheticLambda7(downloadButton, 1), false);
                    break;
                }
                break;
            case 1:
                DownloadButton downloadButton2 = this.f$0;
                downloadButton2.getClass();
                MediaController.saveFile(this.f$1.getAbsolutePath(), downloadButton2.getContext(), 0, null, null, new DownloadButton$$ExternalSyntheticLambda7(downloadButton2, 2), false);
                break;
            default:
                DownloadButton downloadButton3 = this.f$0;
                StoryEntry storyEntry = downloadButton3.currentEntry;
                File file = this.f$1;
                storyEntry.buildPhoto(file);
                if (downloadButton3.downloading && downloadButton3.currentEntry != null) {
                    AndroidUtilities.runOnUIThread(new DownloadButton$$ExternalSyntheticLambda6(downloadButton3, file, 1));
                    break;
                }
                break;
        }
    }
}
