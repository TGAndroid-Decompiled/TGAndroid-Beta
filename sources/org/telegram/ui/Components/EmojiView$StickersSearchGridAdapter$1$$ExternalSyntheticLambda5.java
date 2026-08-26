package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId;
    public final EmojiView.StickersSearchGridAdapter.AnonymousClass1 f$0;

    public EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda5(EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadNext$5((Runnable) obj);
                break;
            case 1:
                this.f$0.addFromAllStickers((Runnable) obj);
                break;
            case 2:
                this.f$0.addFromSuggestions((Runnable) obj);
                break;
            case 3:
                this.f$0.addLocalPacks((Runnable) obj);
                break;
            case 4:
                this.f$0.searchStickers((Runnable) obj);
                break;
            case 5:
                this.f$0.addPremiumStickers((Runnable) obj);
                break;
            case 6:
                this.f$0.searchStickerSets((Runnable) obj);
                break;
            default:
                this.f$0.searchStickerSetsByName((Runnable) obj);
                break;
        }
    }
}
