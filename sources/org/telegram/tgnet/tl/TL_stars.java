package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.p;
public class TL_stars {

    public static class CheckCanSendGiftResult extends TLObject {
        public static CheckCanSendGiftResult TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject checkcansendgiftresultfail;
            if (i10 != -706379148) {
                if (i10 != 927967149) {
                    checkcansendgiftresultfail = null;
                } else {
                    checkcansendgiftresultfail = new checkCanSendGiftResultOk();
                }
            } else {
                checkcansendgiftresultfail = new checkCanSendGiftResultFail();
            }
            return (CheckCanSendGiftResult) TLObject.TLdeserialize(CheckCanSendGiftResult.class, checkcansendgiftresultfail, inputSerializedData, i10, z10);
        }
    }

    public static class InputSavedStarGift extends TLObject {
        public static InputSavedStarGift TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_inputSavedStarGiftChat;
            if (i10 != -251549057) {
                if (i10 != 545636920) {
                    if (i10 != 1764202389) {
                        tL_inputSavedStarGiftChat = null;
                    } else {
                        tL_inputSavedStarGiftChat = new TL_inputSavedStarGiftUser();
                    }
                } else {
                    tL_inputSavedStarGiftChat = new TL_inputSavedStarGiftSlug();
                }
            } else {
                tL_inputSavedStarGiftChat = new TL_inputSavedStarGiftChat();
            }
            return (InputSavedStarGift) TLObject.TLdeserialize(InputSavedStarGift.class, tL_inputSavedStarGiftChat, inputSerializedData, i10, z10);
        }
    }

    public static abstract class InputStarGiftAuction extends TLObject {
        public static InputStarGiftAuction TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (InputStarGiftAuction) TLObject.TLdeserialize(InputStarGiftAuction.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static InputStarGiftAuction fromConstructor(int i10) {
            if (i10 != 48327832) {
                if (i10 != 2058715912) {
                    return null;
                }
                return new TL_inputStarGiftAuctionSlug();
            }
            return new TL_inputStarGiftAuction();
        }
    }

    public static class PaidReactionPrivacy extends TLObject {
        public TLRPC.InputPeer peer;

        public static PaidReactionPrivacy TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject paidreactionprivacypeer;
            if (i10 != -596837136) {
                if (i10 != 520887001) {
                    if (i10 != 543872158) {
                        paidreactionprivacypeer = null;
                    } else {
                        paidreactionprivacypeer = new paidReactionPrivacyDefault();
                    }
                } else {
                    paidreactionprivacypeer = new paidReactionPrivacyAnonymous();
                }
            } else {
                paidreactionprivacypeer = new paidReactionPrivacyPeer();
            }
            return (PaidReactionPrivacy) TLObject.TLdeserialize(PaidReactionPrivacy.class, paidreactionprivacypeer, inputSerializedData, i10, z10);
        }

        public long getDialogId() {
            if (this instanceof paidReactionPrivacyDefault) {
                return 0L;
            }
            if (this instanceof paidReactionPrivacyAnonymous) {
                return 2666000L;
            }
            if (!(this instanceof paidReactionPrivacyPeer)) {
                return 0L;
            }
            return DialogObject.getPeerDialogId(this.peer);
        }
    }

    public static class SavedStarGift extends TLObject {
        public int can_craft_at;
        public int can_export_at;
        public int can_resell_at;
        public int can_transfer_at;
        public boolean can_upgrade;
        public ArrayList<Integer> collection_id = new ArrayList<>();
        public long convert_stars;
        public int date;
        public long drop_original_details_stars;
        public int flags;
        public TLRPC.Peer from_id;
        public StarGift gift;
        public int gift_num;
        public TLRPC.TL_textWithEntities message;
        public int msg_id;
        public boolean name_hidden;
        public boolean pinned_to_top;
        public String prepaid_upgrade_hash;
        public boolean refunded;
        public long saved_id;
        public long transfer_stars;
        public boolean unsaved;
        public boolean upgrade_separate;
        public long upgrade_stars;

        public static SavedStarGift TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_savedStarGift_layer219;
            switch (i10) {
                case -1987861422:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer219();
                    break;
                case -539360103:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer209();
                    break;
                case -355041186:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer221();
                    break;
                case 430552434:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer214();
                    break;
                case 514213599:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer211();
                    break;
                case 949728281:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer221_2();
                    break;
                case 1105150972:
                    tL_savedStarGift_layer219 = new TL_savedStarGift();
                    break;
                case 1616305061:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer202();
                    break;
                default:
                    tL_savedStarGift_layer219 = null;
                    break;
            }
            return (SavedStarGift) TLObject.TLdeserialize(SavedStarGift.class, tL_savedStarGift_layer219, inputSerializedData, i10, z10);
        }
    }

    public static class StarGift extends TLObject {
        public ArrayList<StarGiftAttribute> attributes = new ArrayList<>();
        public boolean auction;
        public String auction_slug;
        public int auction_start_date;
        public int availability_issued;
        public int availability_remains;
        public long availability_resale;
        public int availability_total;
        public TL_starGiftBackground background;
        public boolean birthday;
        public boolean burned;
        public boolean can_upgrade;
        public long convert_stars;
        public int craft_chance_permille;
        public boolean crafted;
        public int first_sale_date;
        public int flags;
        public String gift_address;
        public long gift_id;
        public int gifts_per_round;
        public TLRPC.Peer host_id;
        public long f17425id;
        public int last_sale_date;
        public boolean limited;
        public boolean limited_per_user;
        public int locked_until_date;
        public int num;
        public int offer_min_stars;
        public String owner_address;
        public TLRPC.Peer owner_id;
        public String owner_name;
        public TLRPC.PeerColor peer_color;
        public boolean peer_color_available;
        public int per_user_remains;
        public int per_user_total;
        public TLRPC.Peer released_by;
        public boolean require_premium;
        public boolean resale_ton_only;
        public ArrayList<StarsAmount> resell_amount;
        public long resell_min_stars;
        public String slug;
        public boolean sold_out;
        public long stars;
        public TLRPC.Document sticker;
        public boolean theme_available;
        public TLRPC.Peer theme_peer;
        public String title;
        public long upgrade_stars;
        public int upgrade_variants;
        public long value_amount;
        public String value_currency;
        public long value_usd_amount;

        public static StarGift TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (StarGift) TLObject.TLdeserialize(StarGift.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static StarGift fromConstructor(int i10) {
            switch (i10) {
                case -2136190013:
                    return new TL_starGift_layer217();
                case -2047825459:
                    return new TL_starGiftUnique();
                case -1365150482:
                    return new TL_starGift_layer190();
                case -1329630181:
                    return new TL_starGiftUnique_layer219();
                case -970274264:
                    return new TL_starGift_layer206();
                case -218202550:
                    return new TL_starGiftUnique_layer198();
                case -164136786:
                    return new TL_starGiftUnique_layer210();
                case 12386139:
                    return new TL_starGift_layer212();
                case 46953416:
                    return new TL_starGift_layer202();
                case 463097215:
                    return new TL_starGift_layer219();
                case 468707429:
                    return new TL_starGiftUnique_layer214();
                case 648369470:
                    return new TL_starGiftUnique_layer213();
                case 825922887:
                    return new TL_starGift();
                case 880997154:
                    return new TL_starGiftUnique_layer197();
                case 973640632:
                    return new TL_starGiftUnique_layer215();
                case 975654224:
                    return new TL_starGiftUnique_layer211();
                case 1237678029:
                    return new TL_starGift_layer195();
                case 1453155529:
                    return new TL_starGiftUnique_layer221();
                case 1549979985:
                    return new TL_starGiftUnique_layer202();
                case 1678891913:
                    return new TL_starGiftUnique_layer206();
                case 1779697613:
                    return new TL_starGiftUnique_layer196();
                case 2139438098:
                    return new TL_starGift_layer209();
                default:
                    return null;
            }
        }

        public TLRPC.Document getDocument() {
            TLRPC.Document document = this.sticker;
            if (document != null) {
                return document;
            }
            ArrayList<StarGiftAttribute> arrayList = this.attributes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof starGiftAttributeModel) {
                    return ((starGiftAttributeModel) starGiftAttribute2).document;
                }
            }
            return null;
        }

        public yf.a getResellAmount(yf.b bVar) {
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList<StarsAmount> arrayList2 = this.resell_amount;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    StarsAmount starsAmount = arrayList2.get(i10);
                    i10++;
                    StarsAmount starsAmount2 = starsAmount;
                    if (starsAmount2.getCurrency() == bVar) {
                        return yf.a.l(starsAmount2);
                    }
                }
                return yf.a.i(0L, bVar);
            }
            return yf.a.i(0L, bVar);
        }

        @Deprecated
        public long getResellStars() {
            yf.a resellAmount = getResellAmount(yf.b.f46928a);
            if (resellAmount != null) {
                return resellAmount.a();
            }
            return 0L;
        }
    }

    public static class StarGiftAttribute extends TLObject {
        public boolean crafted;
        public int flags;
        public String name;
        public StarGiftAttributeRarity rarity;

        public static StarGiftAttribute TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject stargiftattributebackdrop_layer202;
            switch (i10) {
                case -1809377438:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeBackdrop_layer202();
                    break;
                case -1624963868:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeBackdrop();
                    break;
                case -1070837941:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeOriginalDetails_layer197();
                    break;
                case -650279524:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeBackdrop_layer221();
                    break;
                case -524291476:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeOriginalDetails();
                    break;
                case 330104601:
                    stargiftattributebackdrop_layer202 = new starGiftAttributePattern_layer221();
                    break;
                case 970559507:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeModel_layer221();
                    break;
                case 1315997162:
                    stargiftattributebackdrop_layer202 = new starGiftAttributePattern();
                    break;
                case 1448235490:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeModel();
                    break;
                default:
                    stargiftattributebackdrop_layer202 = null;
                    break;
            }
            return (StarGiftAttribute) TLObject.TLdeserialize(StarGiftAttribute.class, stargiftattributebackdrop_layer202, inputSerializedData, i10, z10);
        }

        public int getRarityPermille() {
            StarGiftAttributeRarity starGiftAttributeRarity = this.rarity;
            if (starGiftAttributeRarity instanceof TL_starGiftAttributeRarity) {
                return ((TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            }
            return 0;
        }
    }

    public static class StarGiftAttributeId extends TLObject {
        public int backdrop_id;
        public long document_id;

        public static StarGiftAttributeId TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject stargiftattributeidbackdrop;
            if (i10 != 520210263) {
                if (i10 != 1219145276) {
                    if (i10 != 1242965043) {
                        stargiftattributeidbackdrop = null;
                    } else {
                        stargiftattributeidbackdrop = new starGiftAttributeIdPattern();
                    }
                } else {
                    stargiftattributeidbackdrop = new starGiftAttributeIdModel();
                }
            } else {
                stargiftattributeidbackdrop = new starGiftAttributeIdBackdrop();
            }
            return (StarGiftAttributeId) TLObject.TLdeserialize(StarGiftAttributeId.class, stargiftattributeidbackdrop, inputSerializedData, i10, z10);
        }
    }

    public static class StarGiftAttributeRarity extends TLObject {
        public static StarGiftAttributeRarity TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (StarGiftAttributeRarity) TLObject.TLdeserialize(StarGiftAttributeRarity.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static StarGiftAttributeRarity fromConstructor(int i10) {
            switch (i10) {
                case -822614104:
                    return new TL_starGiftAttributeRarityLegendary();
                case -607231095:
                    return new TL_starGiftAttributeRarityUncommon();
                case -259174037:
                    return new TL_starGiftAttributeRarityRare();
                case 910391095:
                    return new TL_starGiftAttributeRarity();
                case 2029777832:
                    return new TL_starGiftAttributeRarityEpic();
                default:
                    return null;
            }
        }
    }

    public static class StarGiftAuctionRound extends TLObject {
        public int current_window;
        public int duration;
        public int extend_top;
        public int num;

        public static StarGiftAuctionRound TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starGiftAuctionRoundExtendable;
            if (i10 != 178266597) {
                if (i10 != 984483112) {
                    tL_starGiftAuctionRoundExtendable = null;
                } else {
                    tL_starGiftAuctionRoundExtendable = new TL_starGiftAuctionRound();
                }
            } else {
                tL_starGiftAuctionRoundExtendable = new TL_starGiftAuctionRoundExtendable();
            }
            return (StarGiftAuctionRound) TLObject.TLdeserialize(StarGiftAuctionRound.class, tL_starGiftAuctionRoundExtendable, inputSerializedData, i10, z10);
        }
    }

    public static abstract class StarGiftAuctionState extends TLObject {
        public static StarGiftAuctionState TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (StarGiftAuctionState) TLObject.TLdeserialize(StarGiftAuctionState.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static StarGiftAuctionState fromConstructor(int i10) {
            if (i10 != -1758614593) {
                if (i10 != -30197422) {
                    if (i10 != 1998212710) {
                        return null;
                    }
                    return new TL_starGiftAuctionState();
                }
                return new TL_starGiftAuctionStateNotModified();
            }
            return new TL_starGiftAuctionStateFinished();
        }
    }

    public static class StarGiftCollections extends TLObject {
        public ArrayList<TL_starGiftCollection> collections = new ArrayList<>();

        public static StarGiftCollections TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starGiftCollections;
            if (i10 != -1977011469) {
                if (i10 != -1598402793) {
                    tL_starGiftCollections = null;
                } else {
                    tL_starGiftCollections = new TL_starGiftCollectionsNotModified();
                }
            } else {
                tL_starGiftCollections = new TL_starGiftCollections();
            }
            return (StarGiftCollections) TLObject.TLdeserialize(StarGiftCollections.class, tL_starGiftCollections, inputSerializedData, i10, z10);
        }
    }

    public static class StarGiftUpgradePrice extends TLObject {
        public static final int constructor = -1712704739;
        public int date;
        public long upgrade_stars;

        public static StarGiftUpgradePrice TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            StarGiftUpgradePrice starGiftUpgradePrice;
            if (-1712704739 != i10) {
                starGiftUpgradePrice = null;
            } else {
                starGiftUpgradePrice = new StarGiftUpgradePrice();
            }
            return (StarGiftUpgradePrice) TLObject.TLdeserialize(StarGiftUpgradePrice.class, starGiftUpgradePrice, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.date = inputSerializedData.readInt32(z10);
            this.upgrade_stars = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1712704739);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.upgrade_stars);
        }
    }

    public static class StarGifts extends TLObject {
        public static StarGifts TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starGiftsNotModified;
            if (i10 != -1551326360) {
                if (i10 != 785918357) {
                    tL_starGiftsNotModified = null;
                } else {
                    tL_starGiftsNotModified = new TL_starGifts();
                }
            } else {
                tL_starGiftsNotModified = new TL_starGiftsNotModified();
            }
            return (StarGifts) TLObject.TLdeserialize(StarGifts.class, tL_starGiftsNotModified, inputSerializedData, i10, z10);
        }
    }

    public static abstract class StarsAmount extends TLObject {
        public long amount;
        public int nanos;

        public static StarsAmount TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starsAmount;
            if (i10 != -1145654109) {
                if (i10 != 1957618656) {
                    tL_starsAmount = null;
                } else {
                    tL_starsAmount = new TL_starsTonAmount();
                }
            } else {
                tL_starsAmount = new TL_starsAmount();
            }
            return (StarsAmount) TLObject.TLdeserialize(StarsAmount.class, tL_starsAmount, inputSerializedData, i10, z10);
        }

        public static StarsAmount ofStars(long j3) {
            TL_starsAmount tL_starsAmount = new TL_starsAmount();
            tL_starsAmount.amount = j3;
            return tL_starsAmount;
        }

        public boolean equals(StarsAmount starsAmount) {
            if (starsAmount == null || this.amount != starsAmount.amount || this.nanos != starsAmount.nanos) {
                return false;
            }
            return true;
        }

        public abstract yf.b getCurrency();

        public boolean negative() {
            long j3 = this.amount;
            if (j3 == 0) {
                if (this.nanos >= 0) {
                    return false;
                }
                return true;
            } else if (j3 >= 0) {
                return false;
            } else {
                return true;
            }
        }

        public boolean positive() {
            long j3 = this.amount;
            if (j3 == 0) {
                if (this.nanos <= 0) {
                    return false;
                }
                return true;
            } else if (j3 <= 0) {
                return false;
            } else {
                return true;
            }
        }

        public double toDouble() {
            return (this.nanos / 1.0E9d) + this.amount;
        }
    }

    public static class StarsStatus extends TLObject {
        public int flags;
        public String next_offset;
        public long subscriptions_missing_balance;
        public String subscriptions_next_offset;
        public StarsAmount balance = StarsAmount.ofStars(0);
        public ArrayList<StarsSubscription> subscriptions = new ArrayList<>();
        public ArrayList<StarsTransaction> history = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static StarsStatus TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_payments_starsStatus_layer194;
            if (i10 != -1141231252) {
                if (i10 != 1822222573) {
                    tL_payments_starsStatus_layer194 = null;
                } else {
                    tL_payments_starsStatus_layer194 = new TL_payments_starsStatus();
                }
            } else {
                tL_payments_starsStatus_layer194 = new TL_payments_starsStatus_layer194();
            }
            return (StarsStatus) TLObject.TLdeserialize(StarsStatus.class, tL_payments_starsStatus_layer194, inputSerializedData, i10, z10);
        }
    }

    public static class StarsSubscription extends TLObject {
        public boolean bot_canceled;
        public boolean can_refulfill;
        public boolean canceled;
        public String chat_invite_hash;
        public int flags;
        public String f17426id;
        public String invoice_slug;
        public boolean missing_balance;
        public TLRPC.Peer peer;
        public TLRPC.WebDocument photo;
        public TL_starsSubscriptionPricing pricing;
        public String title;
        public int until_date;

        public static StarsSubscription TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starsSubscription_old;
            if (i10 != -797707802) {
                if (i10 != 779004698) {
                    if (i10 != 1401868056) {
                        tL_starsSubscription_old = null;
                    } else {
                        tL_starsSubscription_old = new TL_starsSubscription_layer193();
                    }
                } else {
                    tL_starsSubscription_old = new TL_starsSubscription();
                }
            } else {
                tL_starsSubscription_old = new TL_starsSubscription_old();
            }
            return (StarsSubscription) TLObject.TLdeserialize(StarsSubscription.class, tL_starsSubscription_old, inputSerializedData, i10, z10);
        }
    }

    public static class StarsTransaction extends TLObject {
        public int ads_proceeds_from_date;
        public int ads_proceeds_to_date;
        public byte[] bot_payload;
        public boolean business_transfer;
        public int date;
        public String description;
        public boolean failed;
        public int flags;
        public boolean floodskip;
        public int floodskip_number;
        public boolean gift;
        public int giveaway_post_id;
        public String f17427id;
        public int msg_id;
        public boolean offer;
        public boolean paid_message;
        public int paid_messages;
        public StarsTransactionPeer peer;
        public boolean pending;
        public boolean phonegroup_message;
        public TLRPC.WebDocument photo;
        public boolean posts_search;
        public boolean premium_gift;
        public int premium_gift_months;
        public boolean reaction;
        public TLRPC.Peer received_by;
        public boolean refund;
        public TLRPC.Peer sent_by;
        public StarGift stargift;
        public boolean stargift_auction_bid;
        public boolean stargift_drop_original_details;
        public boolean stargift_prepaid_upgrade;
        public boolean stargift_resale;
        public boolean stargift_upgrade;
        public StarsAmount starref_amount;
        public int starref_commission_permille;
        public TLRPC.Peer starref_peer;
        public boolean subscription;
        public int subscription_period;
        public String title;
        public int transaction_date;
        public String transaction_url;
        public StarsAmount amount = StarsAmount.ofStars(0);
        public ArrayList<TLRPC.MessageMedia> extended_media = new ArrayList<>();

        public static StarsTransaction TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (StarsTransaction) TLObject.TLdeserialize(StarsTransaction.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static StarsTransaction fromConstructor(int i10) {
            switch (i10) {
                case -1549805238:
                    return new TL_starsTransaction_layer205();
                case -1442789224:
                    return new TL_starsTransaction_layer182();
                case -865044046:
                    return new TL_starsTransaction_layer181();
                case -321582812:
                    return new TL_starsTransaction_layer199_2();
                case -294313259:
                    return new TL_starsTransaction_layer188();
                case 178185410:
                    return new TL_starsTransaction_layer191();
                case 325426864:
                    return new TL_starsTransaction();
                case 766853519:
                    return new TL_starsTransaction_layer185();
                case 903148150:
                    return new TL_starsTransaction_layer194();
                case 1127934763:
                    return new TL_starsTransaction_layer186();
                case 1692387622:
                    return new TL_starsTransaction_layer199();
                default:
                    return null;
            }
        }
    }

    public static class StarsTransactionPeer extends TLObject {
        public TLRPC.Peer peer;

        public static StarsTransactionPeer TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_starsTransactionPeerUnsupported;
            switch (i10) {
                case -1779253276:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerUnsupported();
                    break;
                case -1269320843:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerAppStore();
                    break;
                case -670195363:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeer();
                    break;
                case -382740222:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerFragment();
                    break;
                case -110658899:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerAPI();
                    break;
                case 621656824:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerPremiumBot();
                    break;
                case 1617438738:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerAds();
                    break;
                case 2069236235:
                    tL_starsTransactionPeerUnsupported = new TL_starsTransactionPeerPlayMarket();
                    break;
                default:
                    tL_starsTransactionPeerUnsupported = null;
                    break;
            }
            return (StarsTransactionPeer) TLObject.TLdeserialize(StarsTransactionPeer.class, tL_starsTransactionPeerUnsupported, inputSerializedData, i10, z10);
        }
    }

    public static class TL_AuctionBidLevel extends TLObject {
        public static final int constructor = 822231244;
        public long amount;
        public int date;
        public int pos;

        public static TL_AuctionBidLevel TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_AuctionBidLevel tL_AuctionBidLevel;
            if (822231244 != i10) {
                tL_AuctionBidLevel = null;
            } else {
                tL_AuctionBidLevel = new TL_AuctionBidLevel();
            }
            return (TL_AuctionBidLevel) TLObject.TLdeserialize(TL_AuctionBidLevel.class, tL_AuctionBidLevel, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.pos = inputSerializedData.readInt32(z10);
            this.amount = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(822231244);
            outputSerializedData.writeInt32(this.pos);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_StarGiftActiveAuctionState extends TLObject {
        public static final int constructor = -753154979;
        public StarGift gift;
        public StarGiftAuctionState state;
        public TL_StarGiftAuctionUserState user_state;

        public static TL_StarGiftActiveAuctionState TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState;
            if (-753154979 != i10) {
                tL_StarGiftActiveAuctionState = null;
            } else {
                tL_StarGiftActiveAuctionState = new TL_StarGiftActiveAuctionState();
            }
            return (TL_StarGiftActiveAuctionState) TLObject.TLdeserialize(TL_StarGiftActiveAuctionState.class, tL_StarGiftActiveAuctionState, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.state = StarGiftAuctionState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.user_state = TL_StarGiftAuctionUserState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-753154979);
            this.gift.serializeToStream(outputSerializedData);
            this.state.serializeToStream(outputSerializedData);
            this.user_state.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_StarGiftAuctionAcquiredGift extends TLObject {
        public static final int constructor = 1118831432;
        public long bid_amount;
        public int date;
        public int flags;
        public int gift_num;
        public TLRPC.TL_textWithEntities message;
        public boolean name_hidden;
        public TLRPC.Peer peer;
        public int pos;
        public int round;

        public static TL_StarGiftAuctionAcquiredGift TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift;
            if (1118831432 != i10) {
                tL_StarGiftAuctionAcquiredGift = null;
            } else {
                tL_StarGiftAuctionAcquiredGift = new TL_StarGiftAuctionAcquiredGift();
            }
            return (TL_StarGiftAuctionAcquiredGift) TLObject.TLdeserialize(TL_StarGiftAuctionAcquiredGift.class, tL_StarGiftAuctionAcquiredGift, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            this.bid_amount = inputSerializedData.readInt64(z10);
            this.round = inputSerializedData.readInt32(z10);
            this.pos = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.gift_num = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1118831432);
            boolean z10 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            if (this.message == null) {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.bid_amount);
            outputSerializedData.writeInt32(this.round);
            outputSerializedData.writeInt32(this.pos);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.gift_num);
            }
        }
    }

    public static class TL_StarGiftAuctionUserState extends TLObject {
        public static final int constructor = 787403204;
        public int acquired_count;
        public long bid_amount;
        public int bid_date;
        public int flags;
        public long min_bid_amount;
        public TLRPC.Peer peer;
        public boolean returned;

        public static TL_StarGiftAuctionUserState TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState;
            if (787403204 != i10) {
                tL_StarGiftAuctionUserState = null;
            } else {
                tL_StarGiftAuctionUserState = new TL_StarGiftAuctionUserState();
            }
            return (TL_StarGiftAuctionUserState) TLObject.TLdeserialize(TL_StarGiftAuctionUserState.class, tL_StarGiftAuctionUserState, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.returned = TLObject.hasFlag(readInt32, 2);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.bid_amount = inputSerializedData.readInt64(z10);
                this.bid_date = inputSerializedData.readInt32(z10);
                this.min_bid_amount = inputSerializedData.readInt64(z10);
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.acquired_count = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(787403204);
            int flag = TLObject.setFlag(this.flags, 2, this.returned);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.bid_amount);
                outputSerializedData.writeInt32(this.bid_date);
                outputSerializedData.writeInt64(this.min_bid_amount);
                this.peer.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.acquired_count);
        }
    }

    public static class TL_changeStarsSubscription extends TLObject {
        public static final int constructor = -948500360;
        public Boolean canceled;
        public int flags;
        public TLRPC.InputPeer peer;
        public String subscription_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-948500360);
            int i10 = this.flags;
            if (this.canceled != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.subscription_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.canceled.booleanValue());
            }
        }
    }

    public static class TL_fulfillStarsSubscription extends TLObject {
        public static final int constructor = -866391117;
        public TLRPC.InputPeer peer;
        public String subscription_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-866391117);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.subscription_id);
        }
    }

    public static class TL_getStarsSubscriptions extends TLObject {
        public static final int constructor = 52761285;
        public int flags;
        public boolean missing_balance;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StarsStatus.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(52761285);
            int flag = TLObject.setFlag(this.flags, 1, this.missing_balance);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
        }
    }

    public static final class TL_inputSavedStarGiftChat extends InputSavedStarGift {
        public static final int constructor = -251549057;
        public TLRPC.InputPeer peer;
        public long saved_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.peer = TLRPC.InputPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.saved_id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-251549057);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.saved_id);
        }
    }

    public static final class TL_inputSavedStarGiftSlug extends InputSavedStarGift {
        public static final int constructor = 545636920;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.slug = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(545636920);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static final class TL_inputSavedStarGiftUser extends InputSavedStarGift {
        public static final int constructor = 1764202389;
        public int msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.msg_id = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1764202389);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_inputStarGiftAuction extends InputStarGiftAuction {
        public static final int constructor = 48327832;
        public long gift_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.gift_id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(48327832);
            outputSerializedData.writeInt64(this.gift_id);
        }
    }

    public static class TL_inputStarGiftAuctionSlug extends InputStarGiftAuction {
        public static final int constructor = 2058715912;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.slug = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2058715912);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class TL_payments_getStarsGiftOptions extends TLObject {
        public static final int constructor = -741774392;
        public int flags;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new a(11));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-741774392);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_payments_getStarsGiveawayOptions extends TLObject {
        public static final int constructor = -1122042562;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new a(12));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1122042562);
        }
    }

    public static class TL_payments_getStarsStatus extends TLObject {
        public static final int constructor = 1319744447;
        public TLRPC.InputPeer peer;
        public boolean ton;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StarsStatus.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1319744447);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.ton));
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_payments_getStarsTopupOptions extends TLObject {
        public static final int constructor = -1072773165;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new a(13));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1072773165);
        }
    }

    public static class TL_payments_getStarsTransactions extends TLObject {
        public static final int constructor = 1775912279;
        public boolean ascending;
        public int flags;
        public boolean inbound;
        public int limit = 50;
        public String offset;
        public boolean outbound;
        public TLRPC.InputPeer peer;
        public String subscription_id;
        public boolean ton;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StarsStatus.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1775912279);
            boolean z10 = true;
            int flag = TLObject.setFlag(this.flags, 1, this.inbound);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.outbound);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.ascending);
            this.flags = flag3;
            if (this.subscription_id == null) {
                z10 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z10);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16, this.ton);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.subscription_id);
            }
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static final class TL_payments_savedStarGifts extends TLObject {
        public static final int constructor = -1779201615;
        public boolean chat_notifications_enabled;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<SavedStarGift> gifts = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_payments_savedStarGifts TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_payments_savedStarGifts tL_payments_savedStarGifts;
            if (-1779201615 != i10) {
                tL_payments_savedStarGifts = null;
            } else {
                tL_payments_savedStarGifts = new TL_payments_savedStarGifts();
            }
            return (TL_payments_savedStarGifts) TLObject.TLdeserialize(TL_payments_savedStarGifts.class, tL_payments_savedStarGifts, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.count = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.chat_notifications_enabled = inputSerializedData.readBool(z10);
            }
            this.gifts = Vector.deserialize(inputSerializedData, new a(14), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1779201615);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeBool(this.chat_notifications_enabled);
            }
            Vector.serialize(outputSerializedData, this.gifts);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_payments_sendStarsForm extends TLMethod<TLRPC.payments_PaymentResult> {
        public static final int constructor = 2040056084;
        public long form_id;
        public TLRPC.InputInvoice invoice;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2040056084);
            outputSerializedData.writeInt64(this.form_id);
            this.invoice.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.payments_PaymentResult deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.payments_PaymentResult.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_payments_starsStatus extends StarsStatus {
        public static final int constructor = 1822222573;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.balance = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.subscriptions = Vector.deserialize(inputSerializedData, new a(15), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.subscriptions_next_offset = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.subscriptions_missing_balance = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.history = Vector.deserialize(inputSerializedData, new a(16), z10);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1822222573);
            outputSerializedData.writeInt32(this.flags);
            this.balance.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.subscriptions);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.subscriptions_next_offset);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.subscriptions_missing_balance);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.history);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_payments_starsStatus_layer194 extends TL_payments_starsStatus {
        public static final int constructor = -1141231252;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.balance = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            if (TLObject.hasFlag(this.flags, 2)) {
                this.subscriptions = Vector.deserialize(inputSerializedData, new a(15), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.subscriptions_next_offset = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.subscriptions_missing_balance = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.history = Vector.deserialize(inputSerializedData, new a(16), z10);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1141231252);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.balance.amount);
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.subscriptions);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.subscriptions_next_offset);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.subscriptions_missing_balance);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.history);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static final class TL_payments_uniqueStarGift extends TLObject {
        public static final int constructor = 1097619176;
        public StarGift gift;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_payments_uniqueStarGift TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_payments_uniqueStarGift tL_payments_uniqueStarGift;
            if (1097619176 != i10) {
                tL_payments_uniqueStarGift = null;
            } else {
                tL_payments_uniqueStarGift = new TL_payments_uniqueStarGift();
            }
            return (TL_payments_uniqueStarGift) TLObject.TLdeserialize(TL_payments_uniqueStarGift.class, tL_payments_uniqueStarGift, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1097619176);
            this.gift.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_savedStarGift extends SavedStarGift {
        public static final int constructor = 1105150972;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            this.upgrade_separate = TLObject.hasFlag(this.flags, 131072);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.gift_num = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.can_craft_at = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1105150972);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 131072, this.upgrade_separate);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.gift_num);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                outputSerializedData.writeInt32(this.can_craft_at);
            }
        }
    }

    public static class TL_savedStarGift_layer202 extends TL_savedStarGift {
        public static final int constructor = 1616305061;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1616305061);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
        }
    }

    public static class TL_savedStarGift_layer209 extends TL_savedStarGift {
        public static final int constructor = -539360103;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-539360103);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
        }
    }

    public static class TL_savedStarGift_layer211 extends TL_savedStarGift {
        public static final int constructor = 514213599;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(514213599);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
        }
    }

    public static class TL_savedStarGift_layer214 extends TL_savedStarGift {
        public static final int constructor = 430552434;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            this.upgrade_separate = TLObject.hasFlag(this.flags, 131072);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(430552434);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 131072, this.upgrade_separate);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
        }
    }

    public static class TL_savedStarGift_layer219 extends TL_savedStarGift {
        public static final int constructor = -1987861422;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            this.upgrade_separate = TLObject.hasFlag(this.flags, 131072);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1987861422);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 131072, this.upgrade_separate);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
        }
    }

    public static class TL_savedStarGift_layer221 extends TL_savedStarGift {
        public static final int constructor = -355041186;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            this.upgrade_separate = TLObject.hasFlag(this.flags, 131072);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.gift_num = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-355041186);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 131072, this.upgrade_separate);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.gift_num);
            }
        }
    }

    public static class TL_savedStarGift_layer221_2 extends TL_savedStarGift {
        public static final int constructor = 949728281;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.unsaved = TLObject.hasFlag(this.flags, 32);
            this.refunded = TLObject.hasFlag(this.flags, 512);
            this.can_upgrade = TLObject.hasFlag(this.flags, 1024);
            this.pinned_to_top = TLObject.hasFlag(this.flags, 4096);
            this.upgrade_separate = TLObject.hasFlag(this.flags, 131072);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.date = inputSerializedData.readInt32(z10);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.saved_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.convert_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.can_export_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.transfer_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.can_transfer_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.can_resell_at = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.gift_num = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.can_craft_at = inputSerializedData.readInt32(z10);
                inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(949728281);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 32, this.unsaved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.refunded);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 4096, this.pinned_to_top);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 131072, this.upgrade_separate);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.message.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if (TLObject.hasFlag(this.flags, 262144)) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.gift_num);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                outputSerializedData.writeInt32(this.can_craft_at);
                outputSerializedData.writeInt32(0);
            }
        }
    }

    public static class TL_starGift extends StarGift {
        public static final int constructor = 825922887;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.require_premium = TLObject.hasFlag(this.flags, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.auction = TLObject.hasFlag(this.flags, 2048);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z10);
                this.per_user_remains = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.auction_slug = inputSerializedData.readString(z10);
                this.gifts_per_round = inputSerializedData.readInt32(z10);
                this.auction_start_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.upgrade_variants = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.background = TL_starGiftBackground.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(825922887);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 128, this.require_premium);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 256, this.limited_per_user);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 1024, this.peer_color_available);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2048, this.auction);
            this.flags = flag8;
            if (this.background != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag9 = TLObject.setFlag(flag8, 8192, z10);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.per_user_total);
                outputSerializedData.writeInt32(this.per_user_remains);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                outputSerializedData.writeInt32(this.locked_until_date);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeString(this.auction_slug);
                outputSerializedData.writeInt32(this.gifts_per_round);
                outputSerializedData.writeInt32(this.auction_start_date);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.upgrade_variants);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.background.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftAttributeRarity extends StarGiftAttributeRarity {
        public static final int constructor = 910391095;
        public int permille;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.permille = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(910391095);
            outputSerializedData.writeInt32(this.permille);
        }
    }

    public static class TL_starGiftAuctionRound extends StarGiftAuctionRound {
        public static final int constructor = 984483112;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.num = inputSerializedData.readInt32(z10);
            this.duration = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(984483112);
            outputSerializedData.writeInt32(this.num);
            outputSerializedData.writeInt32(this.duration);
        }
    }

    public static class TL_starGiftAuctionRoundExtendable extends StarGiftAuctionRound {
        public static final int constructor = 178266597;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.num = inputSerializedData.readInt32(z10);
            this.duration = inputSerializedData.readInt32(z10);
            this.extend_top = inputSerializedData.readInt32(z10);
            this.current_window = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(178266597);
            outputSerializedData.writeInt32(this.num);
            outputSerializedData.writeInt32(this.duration);
            outputSerializedData.writeInt32(this.extend_top);
            outputSerializedData.writeInt32(this.current_window);
        }
    }

    public static class TL_starGiftAuctionState extends StarGiftAuctionState {
        public static final int constructor = 1998212710;
        public int current_round;
        public int end_date;
        public int gifts_left;
        public int last_gift_num;
        public long min_bid_amount;
        public int next_round_at;
        public int start_date;
        public int total_rounds;
        public int version;
        public ArrayList<TL_AuctionBidLevel> bid_levels = new ArrayList<>();
        public ArrayList<Long> top_bidders = new ArrayList<>();
        public ArrayList<StarGiftAuctionRound> rounds = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.version = inputSerializedData.readInt32(z10);
            this.start_date = inputSerializedData.readInt32(z10);
            this.end_date = inputSerializedData.readInt32(z10);
            this.min_bid_amount = inputSerializedData.readInt64(z10);
            this.bid_levels = Vector.deserialize(inputSerializedData, new a(17), z10);
            this.top_bidders = Vector.deserializeLong(inputSerializedData, z10);
            this.next_round_at = inputSerializedData.readInt32(z10);
            this.last_gift_num = inputSerializedData.readInt32(z10);
            this.gifts_left = inputSerializedData.readInt32(z10);
            this.current_round = inputSerializedData.readInt32(z10);
            this.total_rounds = inputSerializedData.readInt32(z10);
            this.rounds = Vector.deserialize(inputSerializedData, new a(18), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1998212710);
            outputSerializedData.writeInt32(this.version);
            outputSerializedData.writeInt32(this.start_date);
            outputSerializedData.writeInt32(this.end_date);
            outputSerializedData.writeInt64(this.min_bid_amount);
            Vector.serialize(outputSerializedData, this.bid_levels);
            Vector.serializeLong(outputSerializedData, this.top_bidders);
            outputSerializedData.writeInt32(this.next_round_at);
            outputSerializedData.writeInt32(this.last_gift_num);
            outputSerializedData.writeInt32(this.gifts_left);
            outputSerializedData.writeInt32(this.current_round);
            outputSerializedData.writeInt32(this.total_rounds);
            Vector.serialize(outputSerializedData, this.rounds);
        }
    }

    public static class TL_starGiftAuctionStateFinished extends StarGiftAuctionState {
        public static final int constructor = -1758614593;
        public long average_price;
        public int end_date;
        public int flags;
        public int fragment_listed_count;
        public String fragment_listed_url;
        public int listed_count;
        public int start_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.start_date = inputSerializedData.readInt32(z10);
            this.end_date = inputSerializedData.readInt32(z10);
            this.average_price = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.listed_count = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.fragment_listed_count = inputSerializedData.readInt32(z10);
                this.fragment_listed_url = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1758614593);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.start_date);
            outputSerializedData.writeInt32(this.end_date);
            outputSerializedData.writeInt64(this.average_price);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.listed_count);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.fragment_listed_count);
                outputSerializedData.writeString(this.fragment_listed_url);
            }
        }
    }

    public static class TL_starGiftBackground extends TLObject {
        public static final int constructor = -1342872680;
        public int center_color;
        public int edge_color;
        public int text_color;

        public static TL_starGiftBackground TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starGiftBackground tL_starGiftBackground;
            if (-1342872680 != i10) {
                tL_starGiftBackground = null;
            } else {
                tL_starGiftBackground = new TL_starGiftBackground();
            }
            return (TL_starGiftBackground) TLObject.TLdeserialize(TL_starGiftBackground.class, tL_starGiftBackground, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.center_color = inputSerializedData.readInt32(z10);
            this.edge_color = inputSerializedData.readInt32(z10);
            this.text_color = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1342872680);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.text_color);
        }
    }

    public static class TL_starGiftCollection extends TLObject {
        public static final int constructor = -1653926992;
        public int collection_id;
        public int flags;
        public int gifts_count;
        public long hash;
        public TLRPC.Document icon;
        public String title;

        public static TL_starGiftCollection TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starGiftCollection tL_starGiftCollection;
            if (i10 == -1653926992) {
                tL_starGiftCollection = new TL_starGiftCollection();
            } else {
                tL_starGiftCollection = null;
            }
            return (TL_starGiftCollection) TLObject.TLdeserialize(TL_starGiftCollection.class, tL_starGiftCollection, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.collection_id = inputSerializedData.readInt32(z10);
            this.title = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.icon = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.gifts_count = inputSerializedData.readInt32(z10);
            this.hash = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1653926992);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.collection_id);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.icon.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.gifts_count);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class TL_starGiftCollections extends StarGiftCollections {
        public static final int constructor = -1977011469;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.collections = Vector.deserialize(inputSerializedData, new a(19), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1977011469);
            Vector.serialize(outputSerializedData, this.collections);
        }
    }

    public static class TL_starGiftCollectionsNotModified extends StarGiftCollections {
        public static final int constructor = -1598402793;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1598402793);
        }
    }

    public static class TL_starGiftUnique extends StarGift {
        public static final int constructor = -2047825459;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.burned = TLObject.hasFlag(this.flags, 16384);
            this.crafted = TLObject.hasFlag(this.flags, 32768);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
                this.value_usd_amount = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.offer_min_stars = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.craft_chance_permille = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-2047825459);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.burned);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 32768, this.crafted);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
                outputSerializedData.writeInt64(this.value_usd_amount);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.offer_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeInt32(this.craft_chance_permille);
            }
        }
    }

    public static class TL_starGiftUnique_layer196 extends TL_starGiftUnique {
        public static final int constructor = 1779697613;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.owner_id = tL_peerUser;
            tL_peerUser.user_id = inputSerializedData.readInt64(z10);
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1779697613);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeInt32(this.num);
            outputSerializedData.writeInt64(this.owner_id.user_id);
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGiftUnique_layer197 extends TL_starGiftUnique {
        public static final int constructor = 880997154;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.owner_id = tL_peerUser;
                tL_peerUser.user_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(880997154);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.owner_id.user_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGiftUnique_layer198 extends TL_starGiftUnique {
        public static final int constructor = -218202550;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-218202550);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGiftUnique_layer202 extends TL_starGiftUnique {
        public static final int constructor = 1549979985;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1549979985);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
        }
    }

    public static class TL_starGiftUnique_layer206 extends TL_starGiftUnique {
        public static final int constructor = 1678891913;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                ArrayList<StarsAmount> arrayList = new ArrayList<>();
                this.resell_amount = arrayList;
                arrayList.add(StarsAmount.ofStars(inputSerializedData.readInt64(z10)));
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1678891913);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(getResellStars());
            }
        }
    }

    public static class TL_starGiftUnique_layer210 extends TL_starGiftUnique {
        public static final int constructor = -164136786;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                ArrayList<StarsAmount> arrayList = new ArrayList<>();
                this.resell_amount = arrayList;
                arrayList.add(StarsAmount.ofStars(inputSerializedData.readInt64(z10)));
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-164136786);
            int flag = TLObject.setFlag(this.flags, 64, this.require_premium);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(getResellStars());
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer211 extends TL_starGiftUnique {
        public static final int constructor = 975654224;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(975654224);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer213 extends TL_starGiftUnique {
        public static final int constructor = 648369470;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(648369470);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
        }
    }

    public static class TL_starGiftUnique_layer214 extends TL_starGiftUnique {
        public static final int constructor = 468707429;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(468707429);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer215 extends TL_starGiftUnique {
        public static final int constructor = 973640632;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(973640632);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer219 extends TL_starGiftUnique {
        public static final int constructor = -1329630181;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1329630181);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer221 extends TL_starGiftUnique {
        public static final int constructor = 1453155529;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.gift_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
            this.slug = inputSerializedData.readString(z10);
            this.num = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.owner_name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.owner_address = inputSerializedData.readString(z10);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.availability_issued = inputSerializedData.readInt32(z10);
            this.availability_total = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.gift_address = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new a(21), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z10);
                this.value_currency = inputSerializedData.readString(z10);
                this.value_usd_amount = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.offer_min_stars = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1453155529);
            int i10 = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 16, z10);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.owner_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.gift_address);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
                outputSerializedData.writeInt64(this.value_usd_amount);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.offer_min_stars);
            }
        }
    }

    public static class TL_starGift_layer190 extends TL_starGift {
        public static final int constructor = -1365150482;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            boolean z11 = true;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            this.sold_out = (!this.limited || this.availability_remains > 0) ? false : false;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1365150482);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
        }
    }

    public static class TL_starGift_layer195 extends TL_starGift {
        public static final int constructor = 1237678029;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1237678029);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
        }
    }

    public static class TL_starGift_layer202 extends TL_starGift {
        public static final int constructor = 46953416;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(46953416);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
        }
    }

    public static class TL_starGift_layer206 extends TL_starGift {
        public static final int constructor = -970274264;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-970274264);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
        }
    }

    public static class TL_starGift_layer209 extends TL_starGift {
        public static final int constructor = 2139438098;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2139438098);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGift_layer212 extends TL_starGift {
        public static final int constructor = 12386139;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.require_premium = TLObject.hasFlag(this.flags, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z10);
                this.per_user_remains = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(12386139);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 128, this.require_premium);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 256, this.limited_per_user);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.per_user_total);
                outputSerializedData.writeInt32(this.per_user_remains);
            }
        }
    }

    public static class TL_starGift_layer217 extends TL_starGift {
        public static final int constructor = -2136190013;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.require_premium = TLObject.hasFlag(this.flags, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z10);
                this.per_user_remains = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2136190013);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 128, this.require_premium);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 256, this.limited_per_user);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 1024, this.peer_color_available);
            this.flags = flag7;
            outputSerializedData.writeInt32(flag7);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.per_user_total);
                outputSerializedData.writeInt32(this.per_user_remains);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                outputSerializedData.writeInt32(this.locked_until_date);
            }
        }
    }

    public static class TL_starGift_layer219 extends TL_starGift {
        public static final int constructor = 463097215;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.limited = TLObject.hasFlag(readInt32, 1);
            this.sold_out = TLObject.hasFlag(this.flags, 2);
            this.birthday = TLObject.hasFlag(this.flags, 4);
            this.can_upgrade = TLObject.hasFlag(this.flags, 8);
            this.require_premium = TLObject.hasFlag(this.flags, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.auction = TLObject.hasFlag(this.flags, 2048);
            this.f17425id = inputSerializedData.readInt64(z10);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.availability_remains = inputSerializedData.readInt32(z10);
                this.availability_total = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.availability_resale = inputSerializedData.readInt64(z10);
            }
            this.convert_stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.first_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.upgrade_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_min_stars = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z10);
                this.per_user_remains = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.auction_slug = inputSerializedData.readString(z10);
                this.gifts_per_round = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(463097215);
            int flag = TLObject.setFlag(this.flags, 1, this.limited);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.sold_out);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.birthday);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.can_upgrade);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 128, this.require_premium);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 256, this.limited_per_user);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 1024, this.peer_color_available);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2048, this.auction);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            outputSerializedData.writeInt64(this.f17425id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.per_user_total);
                outputSerializedData.writeInt32(this.per_user_remains);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                outputSerializedData.writeInt32(this.locked_until_date);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeString(this.auction_slug);
                outputSerializedData.writeInt32(this.gifts_per_round);
            }
        }
    }

    public static class TL_starGifts extends StarGifts {
        public static final int constructor = 785918357;
        public int hash;
        public ArrayList<StarGift> gifts = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt32(z10);
            this.gifts = Vector.deserialize(inputSerializedData, new a(22), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(785918357);
            outputSerializedData.writeInt32(this.hash);
            Vector.serialize(outputSerializedData, this.gifts);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_starsAmount extends StarsAmount {
        public static final int constructor = -1145654109;

        @Override
        public yf.b getCurrency() {
            return yf.b.f46928a;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.amount = inputSerializedData.readInt64(z10);
            this.nanos = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1145654109);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.nanos);
        }
    }

    public static class TL_starsGiftOption extends TLObject {
        public static final int constructor = 1577421297;
        public long amount;
        public String currency;
        public boolean extended;
        public int flags;
        public boolean loadingStorePrice;
        public boolean missingStorePrice;
        public long stars;
        public String store_product;

        public static TL_starsGiftOption TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starsGiftOption tL_starsGiftOption;
            if (1577421297 != i10) {
                tL_starsGiftOption = null;
            } else {
                tL_starsGiftOption = new TL_starsGiftOption();
            }
            return (TL_starsGiftOption) TLObject.TLdeserialize(TL_starsGiftOption.class, tL_starsGiftOption, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.extended = TLObject.hasFlag(readInt32, 2);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.store_product = inputSerializedData.readString(z10);
            }
            this.currency = inputSerializedData.readString(z10);
            this.amount = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1577421297);
            int flag = TLObject.setFlag(this.flags, 2, this.extended);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsGiveawayOption extends TLObject {
        public static final int constructor = -1798404822;
        public long amount;
        public String currency;
        public boolean extended;
        public int flags;
        public boolean isDefault;
        public boolean loadingStorePrice;
        public boolean missingStorePrice;
        public long stars;
        public String store_product;
        public ArrayList<TL_starsGiveawayWinnersOption> winners = new ArrayList<>();
        public int yearly_boosts;

        public static TL_starsGiveawayOption TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starsGiveawayOption tL_starsGiveawayOption;
            if (-1798404822 != i10) {
                tL_starsGiveawayOption = null;
            } else {
                tL_starsGiveawayOption = new TL_starsGiveawayOption();
            }
            return (TL_starsGiveawayOption) TLObject.TLdeserialize(TL_starsGiveawayOption.class, tL_starsGiveawayOption, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.extended = TLObject.hasFlag(readInt32, 1);
            this.isDefault = TLObject.hasFlag(this.flags, 2);
            this.stars = inputSerializedData.readInt64(z10);
            this.yearly_boosts = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.store_product = inputSerializedData.readString(z10);
            }
            this.currency = inputSerializedData.readString(z10);
            this.amount = inputSerializedData.readInt64(z10);
            this.winners = Vector.deserialize(inputSerializedData, new a(23), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1798404822);
            int flag = TLObject.setFlag(this.flags, 1, this.extended);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.isDefault);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.stars);
            outputSerializedData.writeInt32(this.yearly_boosts);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
            Vector.serialize(outputSerializedData, this.winners);
        }
    }

    public static class TL_starsGiveawayWinnersOption extends TLObject {
        public static final int constructor = 1411605001;
        public int flags;
        public boolean isDefault;
        public long per_user_stars;
        public int users;

        public static TL_starsGiveawayWinnersOption TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption;
            if (1411605001 != i10) {
                tL_starsGiveawayWinnersOption = null;
            } else {
                tL_starsGiveawayWinnersOption = new TL_starsGiveawayWinnersOption();
            }
            return (TL_starsGiveawayWinnersOption) TLObject.TLdeserialize(TL_starsGiveawayWinnersOption.class, tL_starsGiveawayWinnersOption, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.isDefault = TLObject.hasFlag(readInt32, 1);
            this.users = inputSerializedData.readInt32(z10);
            this.per_user_stars = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1411605001);
            int flag = TLObject.setFlag(this.flags, 1, this.isDefault);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.users);
            outputSerializedData.writeInt64(this.per_user_stars);
        }
    }

    public static class TL_starsSubscription extends StarsSubscription {
        public static final int constructor = 779004698;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.canceled = TLObject.hasFlag(readInt32, 1);
            this.can_refulfill = TLObject.hasFlag(this.flags, 2);
            this.missing_balance = TLObject.hasFlag(this.flags, 4);
            this.bot_canceled = TLObject.hasFlag(this.flags, 128);
            this.f17426id = inputSerializedData.readString(z10);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.until_date = inputSerializedData.readInt32(z10);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.chat_invite_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.invoice_slug = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(779004698);
            int flag = TLObject.setFlag(this.flags, 1, this.canceled);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.can_refulfill);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.missing_balance);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 128, this.bot_canceled);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeString(this.f17426id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.chat_invite_hash);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeString(this.invoice_slug);
            }
        }
    }

    public static class TL_starsSubscriptionPricing extends TLObject {
        public static final int constructor = 88173912;
        public long amount;
        public int period;

        public static TL_starsSubscriptionPricing TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
            if (88173912 != i10) {
                tL_starsSubscriptionPricing = null;
            } else {
                tL_starsSubscriptionPricing = new TL_starsSubscriptionPricing();
            }
            return (TL_starsSubscriptionPricing) TLObject.TLdeserialize(TL_starsSubscriptionPricing.class, tL_starsSubscriptionPricing, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.period = inputSerializedData.readInt32(z10);
            this.amount = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(88173912);
            outputSerializedData.writeInt32(this.period);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsSubscription_layer193 extends StarsSubscription {
        public static final int constructor = 1401868056;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.canceled = TLObject.hasFlag(readInt32, 1);
            this.can_refulfill = TLObject.hasFlag(this.flags, 2);
            this.missing_balance = TLObject.hasFlag(this.flags, 4);
            this.f17426id = inputSerializedData.readString(z10);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.until_date = inputSerializedData.readInt32(z10);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.chat_invite_hash = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1401868056);
            int flag = TLObject.setFlag(this.flags, 1, this.canceled);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.can_refulfill);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.missing_balance);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.f17426id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.chat_invite_hash);
            }
        }
    }

    public static class TL_starsSubscription_old extends TL_starsSubscription {
        public static final int constructor = -797707802;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.canceled = TLObject.hasFlag(readInt32, 1);
            this.can_refulfill = TLObject.hasFlag(this.flags, 2);
            this.missing_balance = TLObject.hasFlag(this.flags, 4);
            this.f17426id = inputSerializedData.readString(z10);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.until_date = inputSerializedData.readInt32(z10);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-797707802);
            int flag = TLObject.setFlag(this.flags, 1, this.canceled);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.can_refulfill);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.missing_balance);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.f17426id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_starsTonAmount extends StarsAmount {
        public static final int constructor = 1957618656;

        @Override
        public yf.b getCurrency() {
            return yf.b.f46929b;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.amount = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1957618656);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsTopupOption extends TLObject {
        public static final int constructor = 198776256;
        public long amount;
        public String currency;
        public boolean extended;
        public int flags;
        public boolean loadingStorePrice;
        public boolean missingStorePrice;
        public long stars;
        public String store_product;

        public static TL_starsTopupOption TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_starsTopupOption tL_starsTopupOption;
            if (198776256 != i10) {
                tL_starsTopupOption = null;
            } else {
                tL_starsTopupOption = new TL_starsTopupOption();
            }
            return (TL_starsTopupOption) TLObject.TLdeserialize(TL_starsTopupOption.class, tL_starsTopupOption, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.extended = TLObject.hasFlag(readInt32, 2);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.store_product = inputSerializedData.readString(z10);
            }
            this.currency = inputSerializedData.readString(z10);
            this.amount = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(198776256);
            int flag = TLObject.setFlag(this.flags, 2, this.extended);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsTransaction extends StarsTransaction {
        public static final int constructor = 325426864;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.floodskip = TLObject.hasFlag(this.flags, 32768);
            this.stargift_upgrade = TLObject.hasFlag(this.flags, 262144);
            this.paid_message = TLObject.hasFlag(this.flags, 524288);
            this.premium_gift = TLObject.hasFlag(this.flags, 1048576);
            this.business_transfer = TLObject.hasFlag(this.flags, 2097152);
            this.stargift_resale = TLObject.hasFlag(this.flags, 4194304);
            this.posts_search = TLObject.hasFlag(this.flags, 16777216);
            this.stargift_prepaid_upgrade = TLObject.hasFlag(this.flags, 33554432);
            this.stargift_drop_original_details = TLObject.hasFlag(this.flags, 67108864);
            this.phonegroup_message = TLObject.hasFlag(this.flags, 134217728);
            this.stargift_auction_bid = TLObject.hasFlag(this.flags, 268435456);
            this.offer = TLObject.hasFlag(this.flags, 536870912);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.floodskip_number = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.starref_commission_permille = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.paid_messages = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.premium_gift_months = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.ads_proceeds_from_date = inputSerializedData.readInt32(z10);
                this.ads_proceeds_to_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(325426864);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 32768, this.floodskip);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 262144, this.stargift_upgrade);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 524288, this.paid_message);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 1048576, this.premium_gift);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 2097152, this.business_transfer);
            this.flags = flag11;
            int flag12 = TLObject.setFlag(flag11, 4194304, this.stargift_resale);
            this.flags = flag12;
            int flag13 = TLObject.setFlag(flag12, 16777216, this.posts_search);
            this.flags = flag13;
            int flag14 = TLObject.setFlag(flag13, 33554432, this.stargift_prepaid_upgrade);
            this.flags = flag14;
            int flag15 = TLObject.setFlag(flag14, 67108864, this.stargift_drop_original_details);
            this.flags = flag15;
            int flag16 = TLObject.setFlag(flag15, 134217728, this.phonegroup_message);
            this.flags = flag16;
            int flag17 = TLObject.setFlag(flag16, 268435456, this.stargift_auction_bid);
            this.flags = flag17;
            int flag18 = TLObject.setFlag(flag17, 536870912, this.offer);
            this.flags = flag18;
            outputSerializedData.writeInt32(flag18);
            outputSerializedData.writeString(this.f17427id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                outputSerializedData.writeInt32(this.premium_gift_months);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                outputSerializedData.writeInt32(this.ads_proceeds_from_date);
                outputSerializedData.writeInt32(this.ads_proceeds_to_date);
            }
        }
    }

    public static class TL_starsTransactionPeer extends StarsTransactionPeer {
        public static final int constructor = -670195363;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-670195363);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_starsTransaction_layer181 extends StarsTransaction {
        public static final int constructor = -865044046;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-865044046);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer182 extends TL_starsTransaction {
        public static final int constructor = -1442789224;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1442789224);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
        }
    }

    public static class TL_starsTransaction_layer185 extends TL_starsTransaction {
        public static final int constructor = 766853519;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(766853519);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
        }
    }

    public static class TL_starsTransaction_layer186 extends TL_starsTransaction {
        public static final int constructor = 1127934763;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1127934763);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
        }
    }

    public static class TL_starsTransaction_layer188 extends TL_starsTransaction {
        public static final int constructor = -294313259;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-294313259);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
        }
    }

    public static class TL_starsTransaction_layer191 extends TL_starsTransaction {
        public static final int constructor = 178185410;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(178185410);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            outputSerializedData.writeInt32(flag6);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer194 extends TL_starsTransaction {
        public static final int constructor = 903148150;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.floodskip = TLObject.hasFlag(this.flags, 32768);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z10));
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.floodskip_number = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(903148150);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 32768, this.floodskip);
            this.flags = flag7;
            outputSerializedData.writeInt32(flag7);
            outputSerializedData.writeString(this.f17427id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
        }
    }

    public static class TL_starsTransaction_layer199 extends TL_starsTransaction {
        public static final int constructor = 1692387622;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.floodskip = TLObject.hasFlag(this.flags, 32768);
            this.stargift_upgrade = TLObject.hasFlag(this.flags, 262144);
            this.paid_message = TLObject.hasFlag(this.flags, 524288);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.floodskip_number = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.starref_commission_permille = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1692387622);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 32768, this.floodskip);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 262144, this.stargift_upgrade);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 524288, this.paid_message);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeString(this.f17427id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer199_2 extends TL_starsTransaction {
        public static final int constructor = -321582812;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.floodskip = TLObject.hasFlag(this.flags, 32768);
            this.stargift_upgrade = TLObject.hasFlag(this.flags, 262144);
            this.paid_message = TLObject.hasFlag(this.flags, 524288);
            this.premium_gift = TLObject.hasFlag(this.flags, 1048576);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.floodskip_number = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.starref_commission_permille = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.paid_messages = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-321582812);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 32768, this.floodskip);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 262144, this.stargift_upgrade);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 524288, this.paid_message);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 1048576, this.premium_gift);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeString(this.f17427id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
        }
    }

    public static class TL_starsTransaction_layer205 extends TL_starsTransaction {
        public static final int constructor = -1549805238;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.refund = TLObject.hasFlag(readInt32, 8);
            this.pending = TLObject.hasFlag(this.flags, 16);
            this.failed = TLObject.hasFlag(this.flags, 64);
            this.gift = TLObject.hasFlag(this.flags, 1024);
            this.reaction = TLObject.hasFlag(this.flags, 2048);
            this.subscription = TLObject.hasFlag(this.flags, 4096);
            this.floodskip = TLObject.hasFlag(this.flags, 32768);
            this.stargift_upgrade = TLObject.hasFlag(this.flags, 262144);
            this.paid_message = TLObject.hasFlag(this.flags, 524288);
            this.premium_gift = TLObject.hasFlag(this.flags, 1048576);
            this.stargift_resale = TLObject.hasFlag(this.flags, 4194304);
            this.f17427id = inputSerializedData.readString(z10);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.title = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.bot_payload = inputSerializedData.readByteArray(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.msg_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.extended_media = Vector.deserialize(inputSerializedData, new a(24), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.subscription_period = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.giveaway_post_id = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.floodskip_number = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.starref_commission_permille = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.paid_messages = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.premium_gift_months = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1549805238);
            int flag = TLObject.setFlag(this.flags, 8, this.refund);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.pending);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.failed);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.gift);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 2048, this.reaction);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 4096, this.subscription);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 32768, this.floodskip);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 262144, this.stargift_upgrade);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 524288, this.paid_message);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 1048576, this.premium_gift);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 4194304, this.stargift_resale);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            outputSerializedData.writeString(this.f17427id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                outputSerializedData.writeInt32(this.premium_gift_months);
            }
        }
    }

    public static class Tl_starsRating extends TLObject {
        public static final int constructor = 453922567;
        public long current_level_stars;
        public int flags;
        public int level;
        public long next_level_stars;
        public long stars;

        public static Tl_starsRating TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            Tl_starsRating tl_starsRating;
            if (453922567 != i10) {
                tl_starsRating = null;
            } else {
                tl_starsRating = new Tl_starsRating();
            }
            return (Tl_starsRating) TLObject.TLdeserialize(Tl_starsRating.class, tl_starsRating, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.level = inputSerializedData.readInt32(z10);
            this.current_level_stars = inputSerializedData.readInt64(z10);
            this.stars = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_level_stars = inputSerializedData.readInt64(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(453922567);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.level);
            outputSerializedData.writeInt64(this.current_level_stars);
            outputSerializedData.writeInt64(this.stars);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.next_level_stars);
            }
        }
    }

    public static class UniqueStarGiftValueInfo extends TLObject {
        public static final int constructor = 1362093126;
        public long average_price;
        public String currency;
        public int flags;
        public long floor_price;
        public int fragment_listed_count;
        public String fragment_listed_url;
        public int initial_sale_date;
        public long initial_sale_price;
        public long initial_sale_stars;
        public int last_sale_date;
        public boolean last_sale_on_fragment;
        public long last_sale_price;
        public int listed_count;
        public long value;
        public boolean value_is_average;

        public static UniqueStarGiftValueInfo TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            UniqueStarGiftValueInfo uniqueStarGiftValueInfo;
            if (i10 == 1362093126) {
                uniqueStarGiftValueInfo = new UniqueStarGiftValueInfo();
            } else {
                uniqueStarGiftValueInfo = null;
            }
            return (UniqueStarGiftValueInfo) TLObject.TLdeserialize(UniqueStarGiftValueInfo.class, uniqueStarGiftValueInfo, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.last_sale_on_fragment = TLObject.hasFlag(readInt32, 2);
            this.value_is_average = TLObject.hasFlag(this.flags, 64);
            this.currency = inputSerializedData.readString(z10);
            this.value = inputSerializedData.readInt64(z10);
            this.initial_sale_date = inputSerializedData.readInt32(z10);
            this.initial_sale_stars = inputSerializedData.readInt64(z10);
            this.initial_sale_price = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.last_sale_date = inputSerializedData.readInt32(z10);
                this.last_sale_price = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.floor_price = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.average_price = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.listed_count = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.fragment_listed_count = inputSerializedData.readInt32(z10);
                this.fragment_listed_url = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1362093126);
            int flag = TLObject.setFlag(this.flags, 2, this.last_sale_on_fragment);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.value_is_average);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.value);
            outputSerializedData.writeInt32(this.initial_sale_date);
            outputSerializedData.writeInt64(this.initial_sale_stars);
            outputSerializedData.writeInt64(this.initial_sale_price);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.last_sale_date);
                outputSerializedData.writeInt64(this.last_sale_price);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt64(this.floor_price);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.average_price);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt32(this.listed_count);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.fragment_listed_count);
                outputSerializedData.writeString(this.fragment_listed_url);
            }
        }
    }

    public static class checkCanSendGift extends TLObject {
        public static final int constructor = -1060835895;
        public long gift_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return CheckCanSendGiftResult.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1060835895);
            outputSerializedData.writeInt64(this.gift_id);
        }
    }

    public static class checkCanSendGiftResultFail extends CheckCanSendGiftResult {
        public static final int constructor = -706379148;
        public TLRPC.TL_textWithEntities reason;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.reason = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-706379148);
            this.reason.serializeToStream(outputSerializedData);
        }
    }

    public static class checkCanSendGiftResultOk extends CheckCanSendGiftResult {
        public static final int constructor = 927967149;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(927967149);
        }
    }

    public static class convertStarGift extends TLObject {
        public static final int constructor = 1958676331;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1958676331);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class craftStarGift extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1325832113;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1325832113);
            Vector.serialize(outputSerializedData, this.stargift);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class createStarGiftCollection extends TLObject {
        public static final int constructor = 524947079;
        public TLRPC.InputPeer peer;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_starGiftCollection.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(524947079);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            Vector.serialize(outputSerializedData, this.stargift);
        }
    }

    public static class deleteStarGiftCollection extends TLObject {
        public static final int constructor = -1386854168;
        public int collection_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1386854168);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.collection_id);
        }
    }

    public static class getCraftStarGifts extends TLMethod<TL_payments_savedStarGifts> {
        public static final int constructor = -49947392;
        public long gift_id;
        public int limit;
        public String offset;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-49947392);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public TL_payments_savedStarGifts deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_payments_savedStarGifts.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getResaleStarGifts extends TLObject {
        public static final int constructor = 2053087798;
        public ArrayList<StarGiftAttributeId> attributes = new ArrayList<>();
        public long attributes_hash;
        public int flags;
        public boolean for_craft;
        public long gift_id;
        public int limit;
        public String offset;
        public boolean sort_by_num;
        public boolean sort_by_price;
        public boolean stars_only;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return resaleStarGifts.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2053087798);
            int flag = TLObject.setFlag(this.flags, 2, this.sort_by_price);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.sort_by_num);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 16, this.for_craft);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 32, this.stars_only);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.attributes_hash);
            }
            outputSerializedData.writeInt64(this.gift_id);
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.attributes);
            }
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getSavedStarGift extends TLObject {
        public static final int constructor = -1269456634;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_payments_savedStarGifts.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1269456634);
            Vector.serialize(outputSerializedData, this.stargift);
        }
    }

    public static class getSavedStarGifts extends TLMethod<TL_payments_savedStarGifts> {
        public static final int constructor = -1558583959;
        public int collection_id;
        public boolean exclude_saved;
        public boolean exclude_unique;
        public boolean exclude_unlimited;
        public boolean exclude_unsaved;
        public boolean exclude_unupgradable;
        public boolean exclude_upgradable;
        public int flags;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;
        public boolean peer_color_available;
        public boolean sort_by_value;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1558583959);
            int flag = TLObject.setFlag(this.flags, 1, this.exclude_unsaved);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.exclude_saved);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.exclude_unlimited);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 16, this.exclude_unique);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 32, this.sort_by_value);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 128, this.exclude_upgradable);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 256, this.exclude_unupgradable);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 512, this.peer_color_available);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt32(this.collection_id);
            }
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public TL_payments_savedStarGifts deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_payments_savedStarGifts.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getStarGiftCollections extends TLObject {
        public static final int constructor = -1743023651;
        public long hash;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StarGiftCollections.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1743023651);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getStarGiftUpgradeAttributes extends TLMethod<starGiftUpgradeAttributes> {
        public static final int constructor = 1828948824;
        public long gift_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1828948824);
            outputSerializedData.writeInt64(this.gift_id);
        }

        @Override
        public starGiftUpgradeAttributes deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return starGiftUpgradeAttributes.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getStarGiftUpgradePreview extends TLObject {
        public static final int constructor = -1667580751;
        public long gift_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return starGiftUpgradePreview.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1667580751);
            outputSerializedData.writeInt64(this.gift_id);
        }
    }

    public static final class getStarGiftWithdrawalUrl extends TLObject {
        public static final int constructor = -798059608;
        public TLRPC.InputCheckPasswordSRP password;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return starGiftWithdrawalUrl.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-798059608);
            this.stargift.serializeToStream(outputSerializedData);
            this.password.serializeToStream(outputSerializedData);
        }
    }

    public static class getStarGifts extends TLObject {
        public static final int constructor = -1000983152;
        public int hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StarGifts.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1000983152);
            outputSerializedData.writeInt32(this.hash);
        }
    }

    public static final class getUniqueStarGift extends TLObject {
        public static final int constructor = -1583919758;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_payments_uniqueStarGift.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1583919758);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class getUniqueStarGiftValueInfo extends TLObject {
        public static final int constructor = 1130737515;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return UniqueStarGiftValueInfo.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1130737515);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class paidReactionPrivacyAnonymous extends PaidReactionPrivacy {
        public static final int constructor = 520887001;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(520887001);
        }
    }

    public static class paidReactionPrivacyDefault extends PaidReactionPrivacy {
        public static final int constructor = 543872158;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(543872158);
        }
    }

    public static class paidReactionPrivacyPeer extends PaidReactionPrivacy {
        public static final int constructor = -596837136;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.peer = TLRPC.InputPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-596837136);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class reorderStarGiftCollections extends TLObject {
        public static final int constructor = -1020594996;
        public ArrayList<Integer> order = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1020594996);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.order);
        }
    }

    public static class resaleStarGifts extends TLObject {
        public static final int constructor = -1803939105;
        public long attributes_hash;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<StarGift> gifts = new ArrayList<>();
        public ArrayList<StarGiftAttribute> attributes = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<starGiftAttributeCounter> counters = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static resaleStarGifts TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            resaleStarGifts resalestargifts;
            if (-1803939105 != i10) {
                resalestargifts = null;
            } else {
                resalestargifts = new resaleStarGifts();
            }
            return (resaleStarGifts) TLObject.TLdeserialize(resaleStarGifts.class, resalestargifts, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.count = inputSerializedData.readInt32(z10);
            this.gifts = Vector.deserialize(inputSerializedData, new a(22), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
                this.attributes_hash = inputSerializedData.readInt64(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.counters = Vector.deserialize(inputSerializedData, new a(25), z10);
            }
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1803939105);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.gifts);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.attributes);
                outputSerializedData.writeInt64(this.attributes_hash);
            }
            Vector.serialize(outputSerializedData, this.chats);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.counters);
            }
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class saveStarGift extends TLObject {
        public static final int constructor = 707422588;
        public int flags;
        public InputSavedStarGift stargift;
        public boolean unsave;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(707422588);
            int flag = TLObject.setFlag(this.flags, 1, this.unsave);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class starGiftAttributeBackdrop extends StarGiftAttribute {
        public static final int constructor = -1624963868;
        public int backdrop_id;
        public int center_color;
        public int edge_color;
        public int pattern_color;
        public int text_color;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.backdrop_id = inputSerializedData.readInt32(z10);
            this.center_color = inputSerializedData.readInt32(z10);
            this.edge_color = inputSerializedData.readInt32(z10);
            this.pattern_color = inputSerializedData.readInt32(z10);
            this.text_color = inputSerializedData.readInt32(z10);
            this.rarity = StarGiftAttributeRarity.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1624963868);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.backdrop_id);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.pattern_color);
            outputSerializedData.writeInt32(this.text_color);
            this.rarity.serializeToStream(outputSerializedData);
        }
    }

    public static class starGiftAttributeBackdrop_layer202 extends starGiftAttributeBackdrop {
        public static final int constructor = -1809377438;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.center_color = inputSerializedData.readInt32(z10);
            this.edge_color = inputSerializedData.readInt32(z10);
            this.pattern_color = inputSerializedData.readInt32(z10);
            this.text_color = inputSerializedData.readInt32(z10);
            TL_starGiftAttributeRarity tL_starGiftAttributeRarity = new TL_starGiftAttributeRarity();
            this.rarity = tL_starGiftAttributeRarity;
            tL_starGiftAttributeRarity.permille = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1809377438);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.pattern_color);
            outputSerializedData.writeInt32(this.text_color);
            StarGiftAttributeRarity starGiftAttributeRarity = this.rarity;
            if (starGiftAttributeRarity instanceof TL_starGiftAttributeRarity) {
                outputSerializedData.writeInt32(((TL_starGiftAttributeRarity) starGiftAttributeRarity).permille);
            } else {
                outputSerializedData.writeInt32(0);
            }
        }
    }

    public static class starGiftAttributeBackdrop_layer221 extends starGiftAttributeBackdrop {
        public static final int constructor = -650279524;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.backdrop_id = inputSerializedData.readInt32(z10);
            this.center_color = inputSerializedData.readInt32(z10);
            this.edge_color = inputSerializedData.readInt32(z10);
            this.pattern_color = inputSerializedData.readInt32(z10);
            this.text_color = inputSerializedData.readInt32(z10);
            TL_starGiftAttributeRarity tL_starGiftAttributeRarity = new TL_starGiftAttributeRarity();
            this.rarity = tL_starGiftAttributeRarity;
            tL_starGiftAttributeRarity.permille = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-650279524);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.backdrop_id);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.pattern_color);
            outputSerializedData.writeInt32(this.text_color);
            StarGiftAttributeRarity starGiftAttributeRarity = this.rarity;
            if (starGiftAttributeRarity instanceof TL_starGiftAttributeRarity) {
                outputSerializedData.writeInt32(((TL_starGiftAttributeRarity) starGiftAttributeRarity).permille);
            } else {
                outputSerializedData.writeInt32(0);
            }
        }
    }

    public static class starGiftAttributeCounter extends TLObject {
        public static int constructor = 783398488;
        public StarGiftAttributeId attribute;
        public int count;

        public static starGiftAttributeCounter TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            starGiftAttributeCounter stargiftattributecounter;
            if (constructor != i10) {
                stargiftattributecounter = null;
            } else {
                stargiftattributecounter = new starGiftAttributeCounter();
            }
            return (starGiftAttributeCounter) TLObject.TLdeserialize(starGiftAttributeCounter.class, stargiftattributecounter, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.attribute = StarGiftAttributeId.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.count = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.attribute.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.count);
        }
    }

    public static class starGiftAttributeIdBackdrop extends StarGiftAttributeId {
        public static final int constructor = 520210263;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.backdrop_id = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(520210263);
            outputSerializedData.writeInt32(this.backdrop_id);
        }
    }

    public static class starGiftAttributeIdModel extends StarGiftAttributeId {
        public static final int constructor = 1219145276;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.document_id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1219145276);
            outputSerializedData.writeInt64(this.document_id);
        }
    }

    public static class starGiftAttributeIdPattern extends StarGiftAttributeId {
        public static final int constructor = 1242965043;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.document_id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1242965043);
            outputSerializedData.writeInt64(this.document_id);
        }
    }

    public static class starGiftAttributeModel extends StarGiftAttribute {
        public static final int constructor = 1448235490;
        public TLRPC.Document document;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = TLObject.setFlag(this.flags, 1, this.crafted);
            this.flags = inputSerializedData.readInt32(z10);
            this.name = inputSerializedData.readString(z10);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.rarity = StarGiftAttributeRarity.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1448235490);
            outputSerializedData.writeInt32(this.flags);
            this.crafted = TLObject.hasFlag(this.flags, 1);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            this.rarity.serializeToStream(outputSerializedData);
        }
    }

    public static class starGiftAttributeModel_layer221 extends starGiftAttributeModel {
        public static final int constructor = 970559507;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            TL_starGiftAttributeRarity tL_starGiftAttributeRarity = new TL_starGiftAttributeRarity();
            this.rarity = tL_starGiftAttributeRarity;
            tL_starGiftAttributeRarity.permille = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(970559507);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            StarGiftAttributeRarity starGiftAttributeRarity = this.rarity;
            if (starGiftAttributeRarity instanceof TL_starGiftAttributeRarity) {
                outputSerializedData.writeInt32(((TL_starGiftAttributeRarity) starGiftAttributeRarity).permille);
            } else {
                outputSerializedData.writeInt32(0);
            }
        }
    }

    public static class starGiftAttributeOriginalDetails extends StarGiftAttribute {
        public static final int constructor = -524291476;
        public int date;
        public int flags;
        public TLRPC.TL_textWithEntities message;
        public TLRPC.Peer recipient_id;
        public TLRPC.Peer sender_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.sender_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.recipient_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.date = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-524291476);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sender_id.serializeToStream(outputSerializedData);
            }
            this.recipient_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class starGiftAttributeOriginalDetails_layer197 extends starGiftAttributeOriginalDetails {
        public static final int constructor = -1070837941;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            ((starGiftAttributeOriginalDetails) this).flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.sender_id = tL_peerUser;
                tL_peerUser.user_id = inputSerializedData.readInt64(z10);
            }
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.recipient_id = tL_peerUser2;
            tL_peerUser2.user_id = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(((starGiftAttributeOriginalDetails) this).flags, 2)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1070837941);
            outputSerializedData.writeInt32(((starGiftAttributeOriginalDetails) this).flags);
            if (TLObject.hasFlag(((starGiftAttributeOriginalDetails) this).flags, 1)) {
                outputSerializedData.writeInt64(this.sender_id.user_id);
            }
            outputSerializedData.writeInt64(this.recipient_id.user_id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(((starGiftAttributeOriginalDetails) this).flags, 2)) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class starGiftAttributePattern extends StarGiftAttribute {
        public static final int constructor = 1315997162;
        public TLRPC.Document document;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.rarity = StarGiftAttributeRarity.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1315997162);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            this.rarity.serializeToStream(outputSerializedData);
        }
    }

    public static class starGiftAttributePattern_layer221 extends starGiftAttributePattern {
        public static final int constructor = 330104601;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.name = inputSerializedData.readString(z10);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            TL_starGiftAttributeRarity tL_starGiftAttributeRarity = new TL_starGiftAttributeRarity();
            this.rarity = tL_starGiftAttributeRarity;
            tL_starGiftAttributeRarity.permille = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(330104601);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            StarGiftAttributeRarity starGiftAttributeRarity = this.rarity;
            if (starGiftAttributeRarity instanceof TL_starGiftAttributeRarity) {
                outputSerializedData.writeInt32(((TL_starGiftAttributeRarity) starGiftAttributeRarity).permille);
            } else {
                outputSerializedData.writeInt32(0);
            }
        }
    }

    public static class starGiftUpgradeAttributes extends TLObject {
        public static final int constructor = 1187439471;
        public ArrayList<StarGiftAttribute> attributes = new ArrayList<>();

        public static starGiftUpgradeAttributes TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            starGiftUpgradeAttributes stargiftupgradeattributes;
            if (1187439471 != i10) {
                stargiftupgradeattributes = null;
            } else {
                stargiftupgradeattributes = new starGiftUpgradeAttributes();
            }
            return (starGiftUpgradeAttributes) TLObject.TLdeserialize(starGiftUpgradeAttributes.class, stargiftupgradeattributes, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.attributes = Vector.deserialize(inputSerializedData, (Vector.TLDeserializer) new a(20), false);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1187439471);
            Vector.serialize(outputSerializedData, this.attributes);
        }
    }

    public static class starGiftUpgradePreview extends TLObject {
        public static final int constructor = 1038213101;
        public ArrayList<StarGiftAttribute> sample_attributes = new ArrayList<>();
        public ArrayList<StarGiftUpgradePrice> prices = new ArrayList<>();
        public ArrayList<StarGiftUpgradePrice> next_prices = new ArrayList<>();

        public static starGiftUpgradePreview TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            starGiftUpgradePreview stargiftupgradepreview;
            if (1038213101 != i10) {
                stargiftupgradepreview = null;
            } else {
                stargiftupgradepreview = new starGiftUpgradePreview();
            }
            return (starGiftUpgradePreview) TLObject.TLdeserialize(starGiftUpgradePreview.class, stargiftupgradepreview, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.sample_attributes = Vector.deserialize(inputSerializedData, new a(20), z10);
            this.prices = Vector.deserialize(inputSerializedData, new a(26), z10);
            this.next_prices = Vector.deserialize(inputSerializedData, new a(26), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1038213101);
            Vector.serialize(outputSerializedData, this.sample_attributes);
            Vector.serialize(outputSerializedData, this.prices);
            Vector.serialize(outputSerializedData, this.next_prices);
        }
    }

    public static final class starGiftWithdrawalUrl extends TLObject {
        public static final int constructor = -2069218660;
        public String url;

        public static starGiftWithdrawalUrl TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            starGiftWithdrawalUrl stargiftwithdrawalurl;
            if (-2069218660 != i10) {
                stargiftwithdrawalurl = null;
            } else {
                stargiftwithdrawalurl = new starGiftWithdrawalUrl();
            }
            return (starGiftWithdrawalUrl) TLObject.TLdeserialize(starGiftWithdrawalUrl.class, stargiftwithdrawalurl, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.url = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2069218660);
            outputSerializedData.writeString(this.url);
        }
    }

    public static final class toggleChatStarGiftNotifications extends TLObject {
        public static final int constructor = 1626009505;
        public boolean enabled;
        public int flags;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1626009505);
            int flag = TLObject.setFlag(this.flags, 1, this.enabled);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class toggleStarGiftsPinnedToTop extends TLObject {
        public static final int constructor = 353626032;
        public TLRPC.InputPeer peer;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(353626032);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.stargift);
        }
    }

    public static class transferStarGift extends TLObject {
        public static final int constructor = 2132285290;
        public InputSavedStarGift stargift;
        public TLRPC.InputPeer to_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2132285290);
            this.stargift.serializeToStream(outputSerializedData);
            this.to_id.serializeToStream(outputSerializedData);
        }
    }

    public static class updatePaidMessagesPrice extends TLObject {
        public static final int constructor = 1259483771;
        public TLRPC.InputChannel channel;
        public int flags;
        public long send_paid_messages_stars;
        public boolean suggestions_allowed;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1259483771);
            int flag = TLObject.setFlag(this.flags, 1, this.suggestions_allowed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.send_paid_messages_stars);
        }
    }

    public static class updateStarGiftCollection extends TLObject {
        public static final int constructor = 1339932391;
        public int collection_id;
        public int flags;
        public TLRPC.InputPeer peer;
        public String title;
        public ArrayList<InputSavedStarGift> delete_stargift = new ArrayList<>();
        public ArrayList<InputSavedStarGift> add_stargift = new ArrayList<>();
        public ArrayList<InputSavedStarGift> order = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_starGiftCollection.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1339932391);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.collection_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.delete_stargift);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.add_stargift);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.order);
            }
        }
    }

    public static class updateStarGiftPrice extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -306287413;
        public StarsAmount resell_amount;
        public InputSavedStarGift stargift;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-306287413);
            this.stargift.serializeToStream(outputSerializedData);
            this.resell_amount.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class upgradeStarGift extends TLObject {
        public static final int constructor = -1361648395;
        public int flags;
        public boolean keep_original_details;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1361648395);
            int flag = TLObject.setFlag(this.flags, 1, this.keep_original_details);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_starGiftAttributeRarityEpic extends StarGiftAttributeRarity {
        public static final int constructor = 2029777832;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2029777832);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starGiftAttributeRarityLegendary extends StarGiftAttributeRarity {
        public static final int constructor = -822614104;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-822614104);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starGiftAttributeRarityRare extends StarGiftAttributeRarity {
        public static final int constructor = -259174037;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-259174037);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starGiftAttributeRarityUncommon extends StarGiftAttributeRarity {
        public static final int constructor = -607231095;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-607231095);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starGiftAuctionStateNotModified extends StarGiftAuctionState {
        public static final int constructor = -30197422;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-30197422);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starGiftsNotModified extends StarGifts {
        public static final int constructor = -1551326360;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1551326360);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerAPI extends StarsTransactionPeer {
        public static final int constructor = -110658899;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-110658899);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerAds extends StarsTransactionPeer {
        public static final int constructor = 1617438738;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1617438738);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerAppStore extends StarsTransactionPeer {
        public static final int constructor = -1269320843;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1269320843);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerFragment extends StarsTransactionPeer {
        public static final int constructor = -382740222;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-382740222);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerPlayMarket extends StarsTransactionPeer {
        public static final int constructor = 2069236235;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2069236235);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerPremiumBot extends StarsTransactionPeer {
        public static final int constructor = 621656824;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(621656824);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }

    public static class TL_starsTransactionPeerUnsupported extends StarsTransactionPeer {
        public static final int constructor = -1779253276;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1779253276);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }
}
