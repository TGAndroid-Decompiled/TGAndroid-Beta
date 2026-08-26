package org.telegram.ui.Stories.recorder;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

public final class StoryEntry$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final StoryEntry f$0;
    public final HintView2$$ExternalSyntheticLambda0 f$1;

    public StoryEntry$$ExternalSyntheticLambda1(StoryEntry storyEntry, HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0, int i) {
        this.$r8$classId = i;
        this.f$0 = storyEntry;
        this.f$1 = hintView2$$ExternalSyntheticLambda0;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0 = this.f$1;
                StoryEntry storyEntry = this.f$0;
                storyEntry.getClass();
                try {
                    StoryEntry.HDRInfo hDRInfo = storyEntry.hdrInfo;
                    if (hDRInfo == null) {
                        hDRInfo = new StoryEntry.HDRInfo();
                        storyEntry.hdrInfo = hDRInfo;
                    }
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(storyEntry.file.getAbsolutePath());
                    int iFindTrack = MediaController.findTrack(mediaExtractor, false);
                    mediaExtractor.selectTrack(iFindTrack);
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
                    if (trackFormat.containsKey("color-transfer")) {
                        hDRInfo.colorTransfer = trackFormat.getInteger("color-transfer");
                    }
                    if (trackFormat.containsKey("color-standard")) {
                        hDRInfo.colorStandard = trackFormat.getInteger("color-standard");
                    }
                    if (trackFormat.containsKey("color-range")) {
                        trackFormat.getInteger("color-range");
                        break;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                } finally {
                    storyEntry.hdrInfo = storyEntry.hdrInfo;
                    AndroidUtilities.runOnUIThread(new StoryEntry$$ExternalSyntheticLambda1(storyEntry, hintView2$$ExternalSyntheticLambda0, 1));
                }
            default:
                this.f$1.run(this.f$0.hdrInfo);
                return;
        }
    }
}
