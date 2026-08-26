package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.tl.TL_stories;

public final class LaunchActivity$$ExternalSyntheticLambda53 implements Consumer {
    public final LaunchActivity f$0;
    public final Runnable f$1;
    public final Long f$2;
    public final int f$3;

    public LaunchActivity$$ExternalSyntheticLambda53(LaunchActivity launchActivity, Runnable runnable, Long l, int i) {
        this.f$0 = launchActivity;
        this.f$1 = runnable;
        this.f$2 = l;
        this.f$3 = i;
    }

    @Override
    public final void accept(Object obj) {
        LaunchActivity launchActivity = this.f$0;
        Long l = this.f$2;
        launchActivity.lambda$runLinkRequest$62(this.f$1, l, this.f$3, (TL_stories.TL_storyAlbum) obj);
    }
}
