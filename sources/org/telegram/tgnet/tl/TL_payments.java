package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

public class TL_payments {

    public static class connectedBotStarRef extends TLObject {
        public static final int constructor = 429997937;
        public long bot_id;
        public int commission_permille;
        public int date;
        public int duration_months;
        public int flags;
        public long participants;
        public long revenue;
        public boolean revoked;
        public String url;

        public static connectedBotStarRef TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (connectedBotStarRef) TLObject.TLdeserialize(connectedBotStarRef.class, 429997937 != i ? null : new connectedBotStarRef(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.revoked = (int32 & 2) != 0;
            this.url = inputSerializedData.readString(z);
            this.date = inputSerializedData.readInt32(z);
            this.bot_id = inputSerializedData.readInt64(z);
            this.commission_permille = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.duration_months = inputSerializedData.readInt32(z);
            }
            this.participants = inputSerializedData.readInt64(z);
            this.revenue = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(429997937);
            int i = this.revoked ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeInt32(this.commission_permille);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.duration_months);
            }
            outputSerializedData.writeInt64(this.participants);
            outputSerializedData.writeInt64(this.revenue);
        }
    }

    public static class connectedStarRefBots extends TLObject {
        public static final int constructor = -1730811363;
        public int count;
        public ArrayList<connectedBotStarRef> connected_bots = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static connectedStarRefBots TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (connectedStarRefBots) TLObject.TLdeserialize(connectedStarRefBots.class, -1730811363 != i ? null : new connectedStarRefBots(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.count = inputSerializedData.readInt32(z);
            this.connected_bots = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_payments.connectedBotStarRef.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1730811363);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.connected_bots);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class suggestedStarRefBots extends TLObject {
        public static final int constructor = -1261053863;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<starRefProgram> suggested_bots = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static suggestedStarRefBots TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (suggestedStarRefBots) TLObject.TLdeserialize(suggestedStarRefBots.class, -1261053863 != i ? null : new suggestedStarRefBots(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.suggested_bots = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_payments.starRefProgram.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if ((this.flags & 1) != 0) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1261053863);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.suggested_bots);
            Vector.serialize(outputSerializedData, this.users);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    public static class starRefProgram extends TLObject {
        public static final int constructor = -586389774;
        public long bot_id;
        public int commission_permille;
        public TL_stars.StarsAmount daily_revenue_per_user = TL_stars.StarsAmount.ofStars(0);
        public int duration_months;
        public int end_date;
        public int flags;

        public static starRefProgram TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (starRefProgram) TLObject.TLdeserialize(starRefProgram.class, -586389774 != i ? null : new starRefProgram(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.bot_id = inputSerializedData.readInt64(z);
            this.commission_permille = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.duration_months = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2) != 0) {
                this.end_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 4) != 0) {
                this.daily_revenue_per_user = TL_stars.StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-586389774);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeInt32(this.commission_permille);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.duration_months);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.end_date);
            }
            if ((this.flags & 4) != 0) {
                this.daily_revenue_per_user.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class connectStarRefBot extends TLObject {
        public static final int constructor = 2127901834;
        public TLRPC.InputUser bot;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return connectedStarRefBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2127901834);
            this.peer.serializeToStream(outputSerializedData);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class getSuggestedStarRefBots extends TLObject {
        public static final int constructor = 225134839;
        public int flags;
        public int limit;
        public String offset;
        public boolean order_by_date;
        public boolean order_by_revenue;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return suggestedStarRefBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(225134839);
            int i = this.order_by_revenue ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.order_by_date ? i | 2 : i & (-3);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getConnectedStarRefBots extends TLObject {
        public static final int constructor = 1483318611;
        public int flags;
        public int limit;
        public int offset_date;
        public String offset_link;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return connectedStarRefBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1483318611);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeInt32(this.offset_date);
                outputSerializedData.writeString(this.offset_link);
            }
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getConnectedStarRefBot extends TLObject {
        public static final int constructor = -1210476304;
        public TLRPC.InputUser bot;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return connectedStarRefBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1210476304);
            this.peer.serializeToStream(outputSerializedData);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class editConnectedStarRefBot extends TLObject {
        public static final int constructor = -453204829;
        public int flags;
        public String link;
        public TLRPC.InputPeer peer;
        public boolean revoked;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return connectedStarRefBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-453204829);
            int i = this.revoked ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.link);
        }
    }

    public static abstract class StarGiftActiveAuctions extends TLObject {
        private static StarGiftActiveAuctions fromConstructor(int i) {
            if (i == -1359565892) {
                return new TL_starGiftActiveAuctions();
            }
            if (i != -617358640) {
                return null;
            }
            return new TL_starGiftActiveAuctionsNotModified();
        }

        public static StarGiftActiveAuctions TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StarGiftActiveAuctions) TLObject.TLdeserialize(StarGiftActiveAuctions.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_starGiftActiveAuctionsNotModified extends StarGiftActiveAuctions {
        public static final int constructor = -617358640;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-617358640);
        }
    }

    public static class TL_starGiftActiveAuctions extends StarGiftActiveAuctions {
        public static final int constructor = -1359565892;
        public ArrayList<TL_stars.TL_StarGiftActiveAuctionState> auctions = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1359565892);
            Vector.serialize(outputSerializedData, this.auctions);
            Vector.serialize(outputSerializedData, this.users);
            Vector.serialize(outputSerializedData, this.chats);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.auctions = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.TL_StarGiftActiveAuctionState.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
        }
    }

    public static class TL_StarGiftAuctionAcquiredGifts extends TLObject {
        public static final int constructor = 2103169520;
        public ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> gifts = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2103169520);
            Vector.serialize(outputSerializedData, this.gifts);
            Vector.serialize(outputSerializedData, this.users);
            Vector.serialize(outputSerializedData, this.chats);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.gifts = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.TL_StarGiftAuctionAcquiredGift.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
        }

        public static TL_StarGiftAuctionAcquiredGifts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_StarGiftAuctionAcquiredGifts) TLObject.TLdeserialize(TL_StarGiftAuctionAcquiredGifts.class, 2103169520 != i ? null : new TL_StarGiftAuctionAcquiredGifts(), inputSerializedData, i, z);
        }
    }

    public static class TL_StarGiftAuctionState extends TLObject {
        public static final int constructor = 1798960364;
        public ArrayList<TLRPC.Chat> chats;
        public TL_stars.StarGift gift;
        public TL_stars.StarGiftAuctionState state;
        public int timeout;
        public TL_stars.TL_StarGiftAuctionUserState user_state;
        public ArrayList<TLRPC.User> users;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1798960364);
            this.gift.serializeToStream(outputSerializedData);
            this.state.serializeToStream(outputSerializedData);
            this.user_state.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.timeout);
            Vector.serialize(outputSerializedData, this.users);
            Vector.serialize(outputSerializedData, this.chats);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.gift = TL_stars.StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.state = TL_stars.StarGiftAuctionState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.user_state = TL_stars.TL_StarGiftAuctionUserState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.timeout = inputSerializedData.readInt32(z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
        }

        public static TL_StarGiftAuctionState TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_StarGiftAuctionState) TLObject.TLdeserialize(TL_StarGiftAuctionState.class, 1798960364 != i ? null : new TL_StarGiftAuctionState(), inputSerializedData, i, z);
        }
    }

    public static class TL_getStarGiftAuctionState extends TLMethod<TL_StarGiftAuctionState> {
        public static final int constructor = 1553986774;
        public TL_stars.InputStarGiftAuction auction;
        public int version;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1553986774);
            this.auction.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.version);
        }

        @Override
        public TL_StarGiftAuctionState deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_StarGiftAuctionState.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_getStarGiftAuctionAcquiredGifts extends TLMethod<TL_StarGiftAuctionAcquiredGifts> {
        public static final int constructor = 1805831148;
        public long gift_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1805831148);
            outputSerializedData.writeInt64(this.gift_id);
        }

        @Override
        public TL_StarGiftAuctionAcquiredGifts deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_StarGiftAuctionAcquiredGifts.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_getStarGiftActiveAuctions extends TLMethod<StarGiftActiveAuctions> {
        public static final int constructor = -1513074355;
        public long hash;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1513074355);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public StarGiftActiveAuctions deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarGiftActiveAuctions.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_resolveStarGiftOffer extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -372344804;
        public boolean decline;
        public int offer_msg_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-372344804);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.decline));
            outputSerializedData.writeInt32(this.offer_msg_id);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_sendStarGiftOffer extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1883739327;
        public long allow_paid_stars;
        public int duration;
        public int flags;
        public TLRPC.InputPeer peer;
        public TL_stars.StarsAmount price;
        public long random_id;
        public String slug;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1883739327);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.slug);
            this.price.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.duration);
            outputSerializedData.writeInt64(this.random_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.allow_paid_stars);
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
