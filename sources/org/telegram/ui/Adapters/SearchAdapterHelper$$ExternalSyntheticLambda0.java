package org.telegram.ui.Adapters;

import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class SearchAdapterHelper$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Serializable f$1;
    public final boolean f$2;

    public SearchAdapterHelper$$ExternalSyntheticLambda0(Object obj, Serializable serializable, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
        this.f$2 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((SearchAdapterHelper) this.f$0).lambda$queryServerSearch$0((String) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 1:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda14(giftsList, (int[]) this.f$1, tLObject, this.f$2, 5));
                break;
            default:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda14(gifAdapter, tLObject, (String) this.f$1, this.f$2, 7));
                break;
        }
    }
}
