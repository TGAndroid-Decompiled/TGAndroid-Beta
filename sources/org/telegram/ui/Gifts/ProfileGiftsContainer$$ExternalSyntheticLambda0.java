package org.telegram.ui.Gifts;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stars.StarsController;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout.AnonymousClass13 f$0;

    public ProfileGiftsContainer$$ExternalSyntheticLambda0(SharedMediaLayout.AnonymousClass13 anonymousClass13, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass13;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarsController.GiftsCollections giftsCollections = this.f$0.collections;
                giftsCollections.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = giftsCollections.currentAccount;
                reorderstargiftcollections.peer = MessagesController.getInstance(i).getInputPeer(giftsCollections.dialogId);
                ArrayList arrayList = giftsCollections.collections;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                giftsCollections.refilterCollections();
                break;
            case 1:
                this.f$0.addGifts();
                break;
            default:
                this.f$0.setReorderingCollections(true);
                break;
        }
    }
}
