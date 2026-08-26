package org.telegram.ui.Stars;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class StarGiftSheet$$ExternalSyntheticLambda63 implements Utilities.Callback {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda63(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.$r8$classId) {
            case 0:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                if (stargiftupgradepreview != null) {
                    starGiftSheet.sample_attributes = stargiftupgradepreview.sample_attributes;
                    starGiftSheet.prices = stargiftupgradepreview.prices;
                    starGiftSheet.next_prices = stargiftupgradepreview.next_prices;
                    starGiftSheet.openUpgradeAfter();
                    break;
                }
                break;
            case 1:
                StarGiftSheet starGiftSheet2 = this.f$0;
                starGiftSheet2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    starGiftSheet2.skipDismissAnimation();
                }
                starGiftSheet2.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                this.f$0.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                StarGiftSheet starGiftSheet3 = this.f$0;
                starGiftSheet3.userStarGiftRepolling = false;
                starGiftSheet3.userStarGiftRepolled = true;
                if (savedStarGift != null) {
                    starGiftSheet3.unsavedFromSavedStarGift = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = starGiftSheet3.messageObject;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z = tL_messageActionStarGiftUnique.saved;
                            boolean z2 = !savedStarGift.unsaved;
                            if (z != z2) {
                                tL_messageActionStarGiftUnique.saved = z2;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z3 = tL_messageActionStarGift.saved;
                            boolean z4 = !savedStarGift.unsaved;
                            if (z3 != z4) {
                                tL_messageActionStarGift.saved = z4;
                            }
                        }
                        starGiftSheet3.set(messageObject, (StarsController.IGiftsList) null);
                        break;
                    }
                }
                break;
        }
    }
}
