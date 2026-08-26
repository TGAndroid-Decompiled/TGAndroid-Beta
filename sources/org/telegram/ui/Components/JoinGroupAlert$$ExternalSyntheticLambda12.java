package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class JoinGroupAlert$$ExternalSyntheticLambda12 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public JoinGroupAlert$$ExternalSyntheticLambda12(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                JoinGroupAlert joinGroupAlert = (JoinGroupAlert) this.f$0;
                JoinGroupAlert.showBulletin(joinGroupAlert.getContext(), joinGroupAlert.fragment, joinGroupAlert.bulletinFactory, this.f$1);
                break;
            case 1:
                JoinGroupAlert joinGroupAlert2 = (JoinGroupAlert) this.f$0;
                JoinGroupAlert.showBulletin(joinGroupAlert2.getContext(), joinGroupAlert2.fragment, joinGroupAlert2.bulletinFactory, this.f$1);
                break;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                storyRecorder.shownLimitReached = false;
                storyRecorder.previewView.updatePauseReason(7, true);
                if (this.f$1) {
                    storyRecorder.close(true);
                }
                break;
        }
    }
}
