package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StickerCategoriesListView$EmojiSearch$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Utilities.Callback4 f$0;

    public StickerCategoriesListView$EmojiSearch$$ExternalSyntheticLambda0(Utilities.Callback4 callback4, int i) {
        this.$r8$classId = i;
        this.f$0 = callback4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StickerCategoriesListView.EmojiSearch.lambda$getRemote$0(this.f$0, tLObject, tL_error);
                break;
            default:
                StickerCategoriesListView.EmojiGroupFetcher.lambda$getRemote$0(this.f$0, tLObject, tL_error);
                break;
        }
    }
}
