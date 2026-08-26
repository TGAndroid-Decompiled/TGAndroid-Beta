package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

public final class ProfileActivity$$ExternalSyntheticLambda72 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;
    public final boolean f$3;

    public ProfileActivity$$ExternalSyntheticLambda72(Object obj, boolean z, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).getMessagesController().getStoriesController().updateStoriesPinned(this.f$1, (ArrayList) this.f$2, this.f$3, null);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadFeaturedStickers$57((TLObject) this.f$2, this.f$3, this.f$1);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$processLoadedFeaturedStickers$60((ArrayList) this.f$2, this.f$1, this.f$3);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$processUpdates$376(this.f$3, this.f$1, (ArrayList) this.f$2);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$getChannelRecommendations$481((TLObject) this.f$2, this.f$3, this.f$1);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$processLoadedChannelAdmins$66(this.f$1, (LongSparseArray) this.f$2, this.f$3);
                break;
            case 6:
                ((MessagesStorage) this.f$0).lambda$createTaskForMid$115(this.f$3, this.f$1, (ArrayList) this.f$2);
                break;
            case 7:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$24((Theme.OverrideWallpaperInfo) this.f$2, this.f$3, this.f$1);
                break;
            case 8:
                ((VideoPlayerHolderBase) this.f$0).lambda$seekTo$12(this.f$1, this.f$3, (Runnable) this.f$2);
                break;
            default:
                ((CacheControlActivity) this.f$0).lambda$cleanupFoldersInternal$16(this.f$3, this.f$1, (CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5) this.f$2);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda72(BaseController baseController, Object obj, boolean z, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$2 = obj;
        this.f$3 = z;
        this.f$1 = j;
    }

    public ProfileActivity$$ExternalSyntheticLambda72(MediaDataController mediaDataController, ArrayList arrayList, long j, boolean z) {
        this.$r8$classId = 2;
        this.f$0 = mediaDataController;
        this.f$2 = arrayList;
        this.f$1 = j;
        this.f$3 = z;
    }

    public ProfileActivity$$ExternalSyntheticLambda72(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j, Cloneable cloneable, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = j;
        this.f$2 = cloneable;
        this.f$3 = z;
    }

    public ProfileActivity$$ExternalSyntheticLambda72(VideoPlayerHolderBase videoPlayerHolderBase, long j, boolean z, Runnable runnable) {
        this.$r8$classId = 8;
        this.f$0 = videoPlayerHolderBase;
        this.f$1 = j;
        this.f$3 = z;
        this.f$2 = runnable;
    }
}
