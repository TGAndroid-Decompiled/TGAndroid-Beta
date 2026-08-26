package org.telegram.ui.Stories;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

public final class StoriesController$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final StoriesController f$0;

    public StoriesController$$ExternalSyntheticLambda2(StoriesController storiesController, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dialogIdToMaxReadId = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                StoriesController storiesController = this.f$0;
                storiesController.loadingFromDatabase = false;
                if (tL_stories_allStories == null) {
                    storiesController.cleanup();
                    storiesController.loadStories();
                } else {
                    storiesController.processAllStoriesResponse(tL_stories_allStories, false, true, false);
                    storiesController.loadFromServer(false);
                    storiesController.loadFromServer(true);
                }
                break;
        }
    }
}
