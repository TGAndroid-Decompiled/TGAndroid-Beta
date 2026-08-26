package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class JoinGroupAlert$$ExternalSyntheticLambda3 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BottomSheet f$0;
    public final long f$1;
    public final Object f$3;

    public JoinGroupAlert$$ExternalSyntheticLambda3(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
        this.f$3 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f$3;
                ((JoinGroupAlert) this.f$0).lambda$new$11(this.f$1, tL_messages_importChatInvite, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$3;
                long j = this.f$1;
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$buyGift$26(tL_starGiftUnique, j, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
                break;
            default:
                UItem uItem = (UItem) this.f$3;
                long j2 = this.f$1;
                ((StarsIntroActivity.GiftStarsSheet) this.f$0).lambda$onItemClick$4(uItem, j2, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public JoinGroupAlert$$ExternalSyntheticLambda3(JoinGroupAlert joinGroupAlert, long j, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.$r8$classId = 0;
        this.f$0 = joinGroupAlert;
        this.f$1 = j;
        this.f$3 = tL_messages_importChatInvite;
    }
}
