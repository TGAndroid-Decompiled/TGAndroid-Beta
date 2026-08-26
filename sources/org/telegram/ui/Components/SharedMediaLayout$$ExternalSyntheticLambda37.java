package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;

public final class SharedMediaLayout$$ExternalSyntheticLambda37 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;
    public final TLRPC.TL_error f$1;
    public final int f$2;
    public final int f$3;
    public final TLObject f$4;

    public SharedMediaLayout$$ExternalSyntheticLambda37(SharedMediaLayout sharedMediaLayout, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, int i3) {
        this.$r8$classId = i3;
        this.f$0 = sharedMediaLayout;
        this.f$1 = tL_error;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedMediaLayout sharedMediaLayout = this.f$0;
                NotificationCenter.getInstance(sharedMediaLayout.profileActivity.getCurrentAccount()).doOnIdle(new SharedMediaLayout$$ExternalSyntheticLambda37(sharedMediaLayout, this.f$1, this.f$2, this.f$3, this.f$4, 1));
                break;
            default:
                TLRPC.TL_error tL_error = this.f$1;
                SharedMediaLayout sharedMediaLayout2 = this.f$0;
                if (tL_error != null) {
                    sharedMediaLayout2.getClass();
                    break;
                } else {
                    SharedMediaLayout.SharedMediaData[] sharedMediaDataArr = sharedMediaLayout2.sharedMediaData;
                    int i = this.f$3;
                    SharedMediaLayout.SharedMediaData sharedMediaData = sharedMediaDataArr[i];
                    if (this.f$2 == sharedMediaData.requestIndex) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f$4;
                        sharedMediaData.fastScrollPeriods.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i3);
                            if (tL_searchResultPosition.date != 0) {
                                sharedMediaDataArr[i].fastScrollPeriods.add(new SharedMediaLayout.Period(tL_searchResultPosition));
                            }
                        }
                        Collections.sort(sharedMediaDataArr[i].fastScrollPeriods, new ChatActivity$$ExternalSyntheticLambda18(24));
                        SharedMediaLayout.SharedMediaData sharedMediaData2 = sharedMediaDataArr[i];
                        sharedMediaData2.totalCount[0] = tL_messages_searchResultsPositions.count;
                        sharedMediaData2.fastScrollDataLoaded = true;
                        if (!sharedMediaData2.fastScrollPeriods.isEmpty()) {
                            while (true) {
                                SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout2.mediaPages;
                                if (i2 < mediaPageArr.length) {
                                    SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i2];
                                    if (mediaPage.selectedType == i) {
                                        mediaPage.fastScrollEnabled = true;
                                        sharedMediaLayout2.updateFastScrollVisibility(mediaPage, true);
                                    }
                                    i2++;
                                }
                            }
                        }
                        sharedMediaLayout2.photoVideoAdapter.notifyDataSetChanged();
                        break;
                    }
                }
                break;
        }
    }
}
