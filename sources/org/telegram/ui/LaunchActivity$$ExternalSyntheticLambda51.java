package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.tl.TL_stories;

public final class LaunchActivity$$ExternalSyntheticLambda51 implements Consumer {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final Runnable f$1;
    public final Long f$2;

    public LaunchActivity$$ExternalSyntheticLambda51(LaunchActivity launchActivity, Runnable runnable, Long l, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
        this.f$1 = runnable;
        this.f$2 = l;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$runLinkRequest$60(this.f$1, this.f$2, (TL_stories.StoryItem) obj);
                break;
            default:
                this.f$0.lambda$runLinkRequest$61(this.f$1, this.f$2, (TL_stories.StoryItem) obj);
                break;
        }
    }
}
