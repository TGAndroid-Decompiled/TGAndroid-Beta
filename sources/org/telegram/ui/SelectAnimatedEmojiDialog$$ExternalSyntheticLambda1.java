package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Reactions.HwEmojis;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateRows(true, true, true);
                break;
            case 1:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
                selectAnimatedEmojiDialog.getClass();
                HashSet hashSet = HwEmojis.hwViews;
                DispatchQueuePriority cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.pauseLatch == null) {
                    cacheOutQueue.pauseLatch = new CountDownLatch(1);
                }
                HwEmojis.hwEnabled = true;
                HwEmojis.isPreparing = false;
                HwEmojis.isBeforePreparing = false;
                AndroidUtilities.runOnUIThread(new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1(selectAnimatedEmojiDialog, 3), 0L);
                break;
            case 2:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = this.f$0;
                ArrayList arrayList = selectAnimatedEmojiDialog2.searchResult;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = selectAnimatedEmojiDialog2.searchResultStickers;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = selectAnimatedEmojiDialog2.searchSets;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                selectAnimatedEmojiDialog2.searchAdapter.updateRows(true);
                break;
            case 3:
                this.f$0.showAnimator.start();
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = this.f$0;
                selectAnimatedEmojiDialog3.getClass();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                SelectAnimatedEmojiDialog$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$$ExternalSyntheticLambda1 = selectAnimatedEmojiDialog3.updateRows;
                globalInstance.removeDelayed(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                NotificationCenter.getGlobalInstance().doOnIdle(selectAnimatedEmojiDialog$$ExternalSyntheticLambda1);
                break;
        }
    }
}
