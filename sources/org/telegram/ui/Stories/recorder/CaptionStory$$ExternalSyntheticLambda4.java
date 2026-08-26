package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;

public final class CaptionStory$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;
    public final StoryRecorder.AnonymousClass8 f$0;

    public CaptionStory$$ExternalSyntheticLambda4(StoryRecorder.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder.AnonymousClass8 anonymousClass8 = this.f$0;
                anonymousClass8.setPeriod(num.intValue());
                Utilities.Callback callback = anonymousClass8.onPeriodUpdate;
                if (callback != null) {
                    callback.run(num);
                }
                break;
            default:
                Utilities.Callback callback2 = this.f$0.onPremiumHintShow;
                if (callback2 != null) {
                    callback2.run(num);
                }
                break;
        }
    }
}
