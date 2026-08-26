package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Gifts.GiftSheet;

public final class ChatActivity$$ExternalSyntheticLambda263 implements Predicate {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda263(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final Predicate and(Predicate predicate) {
        int i = this.$r8$classId;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        int i = this.$r8$classId;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                return ((ChatActivity) this.f$0).lambda$applyChatLinkMessageMaybe$246((TLRPC.MessageEntity) obj);
            case 1:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f$0, ((MessageObject) obj).messageOwner.from_id);
            case 2:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = (TLObject) this.f$0;
                return !(tLObject instanceof TLRPC.User) ? !((tLObject instanceof TLRPC.Chat) && messageObject.messageOwner.from_id.user_id == ((TLRPC.Chat) tLObject).id) : messageObject.messageOwner.from_id.user_id != ((TLRPC.User) tLObject).id;
            default:
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z = giftSheet.userSettings.disallow_unique_stargifts;
                } else {
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = giftSheet.userSettings;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z = giftSheet.userSettings.disallow_unlimited_stargifts;
                }
                return true ^ z;
        }
    }
}
