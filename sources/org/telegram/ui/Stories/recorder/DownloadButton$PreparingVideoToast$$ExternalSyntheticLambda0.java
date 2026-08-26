package org.telegram.ui.Stories.recorder;

import android.view.ViewGroup;

public final class DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final DownloadButton.PreparingVideoToast f$0;

    public DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0(DownloadButton.PreparingVideoToast preparingVideoToast, int i) {
        this.$r8$classId = i;
        this.f$0 = preparingVideoToast;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.hide();
                break;
            default:
                DownloadButton.PreparingVideoToast preparingVideoToast = this.f$0;
                if (preparingVideoToast.getParent() instanceof ViewGroup) {
                    ((ViewGroup) preparingVideoToast.getParent()).removeView(preparingVideoToast);
                }
                break;
        }
    }
}
