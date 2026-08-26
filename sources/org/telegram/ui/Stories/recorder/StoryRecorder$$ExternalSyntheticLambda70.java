package org.telegram.ui.Stories.recorder;

import android.content.DialogInterface;

public final class StoryRecorder$$ExternalSyntheticLambda70 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda70(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.previewView.updatePauseReason(3, false);
                storyRecorder.privacySheet = null;
                break;
            default:
                StoryRecorder.AnonymousClass7 anonymousClass7 = this.f$0.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.updatePauseReason(4, false);
                }
                break;
        }
    }
}
