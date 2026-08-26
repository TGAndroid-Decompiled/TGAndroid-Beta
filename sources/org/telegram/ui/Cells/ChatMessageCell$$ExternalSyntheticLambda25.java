package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.UsersSelectActivity;

public final class ChatMessageCell$$ExternalSyntheticLambda25 implements UsersSelectActivity.FilterUsersActivityDelegate, CountdownTimer.Callback, SpoilersClickDetector.OnSpoilerClickedListener, StoriesListPlaceProvider.LoadNextInterface {
    public final Object f$0;
    public final boolean f$1;

    public ChatMessageCell$$ExternalSyntheticLambda25(Object obj, boolean z) {
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public void didSelectChats(ArrayList arrayList, int i) {
        BusinessRecipientsHelper businessRecipientsHelper = (BusinessRecipientsHelper) this.f$0;
        ArrayList arrayList2 = businessRecipientsHelper.neverShow;
        boolean z = this.f$1;
        int i2 = 0;
        ArrayList arrayList3 = businessRecipientsHelper.alwaysShow;
        if (z) {
            businessRecipientsHelper.includeFlags = i;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            while (i2 < arrayList3.size()) {
                arrayList2.remove(arrayList3.get(i2));
                i2++;
            }
        } else {
            businessRecipientsHelper.excludeFlags = i;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            while (i2 < arrayList2.size()) {
                arrayList3.remove(arrayList2.get(i2));
                i2++;
            }
        }
        businessRecipientsHelper.update.run();
    }

    @Override
    public void loadNext(boolean z) {
        ((DialogStoriesCell) this.f$0).lambda$openStoryForCell$4(this.f$1, z);
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        ((SpoilersTextView) this.f$0).lambda$new$2(this.f$1, spoilerEffect, f, f2);
    }

    @Override
    public void onTimerUpdate(long j) {
        ((ChatMessageCell) this.f$0).lambda$setMessageContentIfPoll$10(this.f$1, j);
    }
}
