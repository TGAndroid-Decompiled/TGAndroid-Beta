package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.StoriesController;

public final class SharedMediaLayout$5$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$5$$ExternalSyntheticLambda1(SharedMediaLayout sharedMediaLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout.access$3800(this.f$0, (StoriesController.StoryAlbum) obj);
                break;
            default:
                SharedMediaLayout.access$3800(this.f$0, (StoriesController.StoryAlbum) obj);
                break;
        }
    }
}
