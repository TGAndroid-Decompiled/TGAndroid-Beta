package org.telegram.ui.Stories;

import androidx.collection.LongSparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class StoriesStorage$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Timer.Task f$1;
    public final Cloneable f$2;
    public final long f$3;
    public final boolean f$4;
    public final Timer f$5;
    public final Serializable f$6;
    public final Runnable f$7;

    public StoriesStorage$$ExternalSyntheticLambda3(MediaDataController mediaDataController, Timer.Task task, long j, LongSparseArray longSparseArray, boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$1 = task;
        this.f$3 = j;
        this.f$2 = longSparseArray;
        this.f$4 = z;
        this.f$5 = timer;
        this.f$6 = atomicInteger;
        this.f$7 = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StoriesStorage storiesStorage = (StoriesStorage) this.f$0;
                storiesStorage.getClass();
                Timer.done(this.f$1);
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) this.f$2;
                        if (i < arrayList.size()) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i);
                            int i2 = 0;
                            while (true) {
                                int size = tL_stories_stories.stories.size();
                                long j = this.f$3;
                                int i3 = storiesStorage.currentAccount;
                                if (i2 >= size) {
                                    TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                    tL_storyItemDeleted.id = StoriesStorage.getStoryId(messageObject);
                                    StoriesStorage.applyStory(i3, j, messageObject, tL_storyItemDeleted);
                                } else if (tL_stories_stories.stories.get(i2).id == StoriesStorage.getStoryId(messageObject)) {
                                    StoriesStorage.applyStory(i3, j, messageObject, tL_stories_stories.stories.get(i2));
                                } else {
                                    i2++;
                                }
                            }
                            if (this.f$4) {
                                storiesStorage.storage.getStorageQueue().postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(11, storiesStorage, arrayList));
                            }
                            i++;
                        }
                    }
                } else if (tL_error != null) {
                    Timer.log(this.f$5, "fillMessagesWithStories: getStoriesByID error " + tL_error.code + " " + tL_error.text);
                }
                int[] iArr = (int[]) this.f$6;
                int i4 = iArr[0] - 1;
                iArr[0] = i4;
                if (i4 == 0) {
                    this.f$7.run();
                }
                break;
            default:
                ((MediaDataController) this.f$0).lambda$loadReplyMessagesForMessages$176(this.f$1, this.f$3, (LongSparseArray) this.f$2, this.f$4, this.f$5, (AtomicInteger) this.f$6, this.f$7, tLObject, tL_error);
                break;
        }
    }

    public StoriesStorage$$ExternalSyntheticLambda3(StoriesStorage storiesStorage, Timer.Task task, ArrayList arrayList, long j, boolean z, Timer timer, int[] iArr, Runnable runnable) {
        this.f$0 = storiesStorage;
        this.f$1 = task;
        this.f$2 = arrayList;
        this.f$3 = j;
        this.f$4 = z;
        this.f$5 = timer;
        this.f$6 = iArr;
        this.f$7 = runnable;
    }
}
