package org.telegram.ui.Stories.recorder;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class RoundVideoRecorder$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CaptionStory.AnonymousClass1 f$0;

    public RoundVideoRecorder$$ExternalSyntheticLambda0(CaptionStory.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.stop();
                break;
            case 1:
                CaptionStory.AnonymousClass1 anonymousClass1 = this.f$0;
                anonymousClass1.cameraView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(280L).start();
                anonymousClass1.recordingStarted = System.currentTimeMillis();
                anonymousClass1.invalidate();
                try {
                    anonymousClass1.performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(anonymousClass1.stopRunnable, 59500L);
                break;
            default:
                CaptionStory.AnonymousClass1 anonymousClass2 = this.f$0;
                if (anonymousClass2.getParent() instanceof ViewGroup) {
                    ((ViewGroup) anonymousClass2.getParent()).removeView(anonymousClass2);
                }
                break;
        }
    }
}
