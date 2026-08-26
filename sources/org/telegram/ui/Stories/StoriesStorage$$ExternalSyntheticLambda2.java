package org.telegram.ui.Stories;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

public final class StoriesStorage$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final StoriesStorage f$0;
    public final TL_stories.PeerStories f$1;

    public StoriesStorage$$ExternalSyntheticLambda2(StoriesStorage storiesStorage, TL_stories.PeerStories peerStories, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesStorage;
        this.f$1 = peerStories;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoriesStorage storiesStorage = this.f$0;
                storiesStorage.getClass();
                TL_stories.PeerStories peerStories = this.f$1;
                storiesStorage.putStoriesInternal(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                StoriesStorage storiesStorage2 = this.f$0;
                storiesStorage2.getClass();
                int i = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f$1;
                    if (i < peerStories2.stories.size()) {
                        storiesStorage2.updateStoryItemInternal(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
