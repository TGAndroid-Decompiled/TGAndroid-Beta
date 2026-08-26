package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class MediaActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public MediaActivity$$ExternalSyntheticLambda5(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaActivity) this.f$0).lambda$updateMediaCount$11(this.f$1);
                break;
            case 1:
                ((InstantCameraView.VideoRecorder) this.f$0).lambda$prepareEncoder$13(this.f$1);
                break;
            case 2:
                ((SharedMediaLayout.AnonymousClass13) this.f$0).lambda$updatedReordering$0(this.f$1);
                break;
            case 3:
                ((SharedMediaLayout.AnonymousClass15) this.f$0).lambda$updatedReordering$0(this.f$1);
                break;
            case 4:
                TranslateAlert2.AnonymousClass5.lambda$run$1((Utilities.Callback2) this.f$0, this.f$1);
                break;
            case 5:
                ((ChatThemeBottomSheet) this.f$0).lambda$setupLightDarkTheme$12(this.f$1);
                break;
            case 6:
                ((EmojiTabsStrip) this.f$0).lambda$showGifts$0(this.f$1);
                break;
            case 7:
                ((FolderBottomSheet) this.f$0).lambda$updateHeaderCell$20(this.f$1);
                break;
            case 8:
                ((HashtagActivity) this.f$0).lambda$updateStoriesVisible$1(this.f$1);
                break;
            case 9:
                ((SearchDownloadsContainer) this.f$0).lambda$showPremiumFloodWaitBulletin$6(this.f$1);
                break;
            case 10:
                ((SizeNotifierFrameLayout) this.f$0).lambda$notifyHeightChanged$1(this.f$1);
                break;
            case 11:
                ((SizeNotifierFrameLayoutPhoto) this.f$0).lambda$notifyHeightChanged$0(this.f$1);
                break;
            default:
                ((UniversalAdapter) this.f$0).lambda$update$0(this.f$1);
                break;
        }
    }
}
