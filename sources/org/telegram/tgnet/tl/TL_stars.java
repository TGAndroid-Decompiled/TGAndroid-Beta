package org.telegram.tgnet.tl;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

public class TL_stars {

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
        public boolean can_upgrade;
        public long convert_stars;
        public int first_sale_date;
        public int flags;
        public String gift_address;
        public long gift_id;
        public int gifts_per_round;
        public TLRPC.Peer host_id;
        public long id;
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

        public AmountUtils$Amount getResellAmount(AmountUtils$Currency amountUtils$Currency) {
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            if (arrayList == null || arrayList.isEmpty()) {
                return AmountUtils$Amount.fromNano(0L, amountUtils$Currency);
            }
            Iterator<StarsAmount> it = this.resell_amount.iterator();
            while (it.hasNext()) {
                StarsAmount next = it.next();
                if (next.getCurrency() == amountUtils$Currency) {
                    return AmountUtils$Amount.of(next);
                }
            }
            return AmountUtils$Amount.fromNano(0L, amountUtils$Currency);
        }

        @Deprecated
        public long getResellStars() {
            AmountUtils$Amount resellAmount = getResellAmount(AmountUtils$Currency.STARS);
            if (resellAmount != null) {
                return resellAmount.asDecimal();
            }
            return 0L;
        }

        private static StarGift fromConstructor(int i) {
            switch (i) {
                case -2136190013:
                    return new TL_starGift_layer217();
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
                    return new TL_starGiftUnique();
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

        public static StarGift TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StarGift) TLObject.TLdeserialize(StarGift.class, fromConstructor(i), inputSerializedData, i, z);
        }

        public TLRPC.Document getDocument() {
            TLRPC.Document document = this.sticker;
            if (document != null) {
                return document;
            }
            Iterator<StarGiftAttribute> it = this.attributes.iterator();
            while (it.hasNext()) {
                StarGiftAttribute next = it.next();
                if (next instanceof starGiftAttributeModel) {
                    return ((starGiftAttributeModel) next).document;
                }
            }
            return null;
        }
    }

    public static class TL_starGiftUnique extends StarGift {
        public static final int constructor = 1453155529;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.id = inputSerializedData.readInt64(z);
            this.gift_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.value_amount = inputSerializedData.readInt64(z);
                this.value_currency = inputSerializedData.readString(z);
                this.value_usd_amount = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.offer_min_stars = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1453155529);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
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

    public static class TL_starGiftUnique_layer219 extends TL_starGiftUnique {
        public static final int constructor = -1329630181;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.id = inputSerializedData.readInt64(z);
            this.gift_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 256) != 0) {
                this.value_amount = inputSerializedData.readInt64(z);
                this.value_currency = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.host_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1329630181);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 256) != 0) {
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

    public static class TL_starGiftUnique_layer215 extends TL_starGiftUnique {
        public static final int constructor = 973640632;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.id = inputSerializedData.readInt64(z);
            this.gift_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 256) != 0) {
                this.value_amount = inputSerializedData.readInt64(z);
                this.value_currency = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.peer_color = TLRPC.PeerColor.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(973640632);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 256) != 0) {
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

    public static class TL_starGiftUnique_layer214 extends TL_starGiftUnique {
        public static final int constructor = 468707429;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.theme_available = TLObject.hasFlag(this.flags, 512);
            this.id = inputSerializedData.readInt64(z);
            this.gift_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 256) != 0) {
                this.value_amount = inputSerializedData.readInt64(z);
                this.value_currency = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(468707429);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.theme_available);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.theme_peer.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer213 extends TL_starGiftUnique {
        public static final int constructor = 648369470;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.id = inputSerializedData.readInt64(z);
            this.gift_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 256) != 0) {
                this.value_amount = inputSerializedData.readInt64(z);
                this.value_currency = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(648369470);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.gift_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.value_amount);
                outputSerializedData.writeString(this.value_currency);
            }
        }
    }

    public static class TL_starGiftUnique_layer211 extends TL_starGiftUnique {
        public static final int constructor = 975654224;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.resale_ton_only = TLObject.hasFlag(this.flags, 128);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.resell_amount = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(975654224);
            int i = this.flags;
            ArrayList<StarsAmount> arrayList = this.resell_amount;
            int flag = TLObject.setFlag(i, 16, (arrayList == null || arrayList.isEmpty()) ? false : true);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.require_premium);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.resale_ton_only);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.resell_amount);
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer210 extends TL_starGiftUnique {
        public static final int constructor = -164136786;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.require_premium = TLObject.hasFlag(readInt32, 64);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                ArrayList<StarsAmount> arrayList = new ArrayList<>();
                this.resell_amount = arrayList;
                arrayList.add(StarsAmount.ofStars(inputSerializedData.readInt64(z)));
            }
            if ((this.flags & 32) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-164136786);
            int flag = TLObject.setFlag(this.flags, 64, this.require_premium);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(getResellStars());
            }
            if ((this.flags & 32) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starGiftUnique_layer206 extends TL_starGiftUnique {
        public static final int constructor = 1678891913;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                ArrayList<StarsAmount> arrayList = new ArrayList<>();
                this.resell_amount = arrayList;
                arrayList.add(StarsAmount.ofStars(inputSerializedData.readInt64(z)));
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1678891913);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(getResellStars());
            }
        }
    }

    public static class TL_starGiftUnique_layer202 extends TL_starGiftUnique {
        public static final int constructor = 1549979985;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
            if ((this.flags & 8) != 0) {
                this.gift_address = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1549979985);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.gift_address);
            }
        }
    }

    public static class TL_starGiftUnique_layer198 extends TL_starGiftUnique {
        public static final int constructor = -218202550;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.owner_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.owner_address = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-218202550);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                this.owner_id.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.owner_address);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGiftUnique_layer197 extends TL_starGiftUnique {
        public static final int constructor = 880997154;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.slug = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.owner_id = tL_peerUser;
                tL_peerUser.user_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 2) != 0) {
                this.owner_name = inputSerializedData.readString(z);
            }
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(880997154);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeInt32(this.num);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt64(this.owner_id.user_id);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.owner_name);
            }
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGiftUnique_layer196 extends TL_starGiftUnique {
        public static final int constructor = 1779697613;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
            this.num = inputSerializedData.readInt32(z);
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.owner_id = tL_peerUser;
            tL_peerUser.user_id = inputSerializedData.readInt64(z);
            this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.availability_issued = inputSerializedData.readInt32(z);
            this.availability_total = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1779697613);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeInt32(this.num);
            outputSerializedData.writeInt64(this.owner_id.user_id);
            Vector.serialize(outputSerializedData, this.attributes);
            outputSerializedData.writeInt32(this.availability_issued);
            outputSerializedData.writeInt32(this.availability_total);
        }
    }

    public static class TL_starGift extends StarGift {
        public static final int constructor = 825922887;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(825922887);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int flag = TLObject.setFlag(i4, 128, this.require_premium);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 256, this.limited_per_user);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 1024, this.peer_color_available);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 2048, this.auction);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 8192, this.background != null);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 64) != 0) {
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.require_premium = TLObject.hasFlag(readInt32, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.auction = TLObject.hasFlag(this.flags, 2048);
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 64) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z);
                this.per_user_remains = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.auction_slug = inputSerializedData.readString(z);
                this.gifts_per_round = inputSerializedData.readInt32(z);
                this.auction_start_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.upgrade_variants = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.background = TL_starGiftBackground.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }
    }

    public static class TL_starGift_layer219 extends TL_starGift {
        public static final int constructor = 463097215;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(463097215);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int flag = TLObject.setFlag(i4, 128, this.require_premium);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 256, this.limited_per_user);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 1024, this.peer_color_available);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 2048, this.auction);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 64) != 0) {
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.require_premium = TLObject.hasFlag(readInt32, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.auction = TLObject.hasFlag(this.flags, 2048);
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 64) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z);
                this.per_user_remains = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.auction_slug = inputSerializedData.readString(z);
                this.gifts_per_round = inputSerializedData.readInt32(z);
            }
        }
    }

    public static class TL_starGift_layer217 extends TL_starGift {
        public static final int constructor = -2136190013;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2136190013);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int flag = TLObject.setFlag(i4, 128, this.require_premium);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 256, this.limited_per_user);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 1024, this.peer_color_available);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 64) != 0) {
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.require_premium = TLObject.hasFlag(readInt32, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.peer_color_available = TLObject.hasFlag(this.flags, 1024);
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 64) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z);
                this.per_user_remains = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.locked_until_date = inputSerializedData.readInt32(z);
            }
        }
    }

    public static class TL_starGift_layer212 extends TL_starGift {
        public static final int constructor = 12386139;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(12386139);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int flag = TLObject.setFlag(i4, 128, this.require_premium);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 256, this.limited_per_user);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 64) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32(this.per_user_total);
                outputSerializedData.writeInt32(this.per_user_remains);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.require_premium = TLObject.hasFlag(readInt32, 128);
            this.limited_per_user = TLObject.hasFlag(this.flags, 256);
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 64) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.per_user_total = inputSerializedData.readInt32(z);
                this.per_user_remains = inputSerializedData.readInt32(z);
            }
        }
    }

    public static class TL_starGift_layer209 extends TL_starGift {
        public static final int constructor = 2139438098;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2139438098);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            outputSerializedData.writeInt32(i4);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 64) != 0) {
                this.released_by.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 64) != 0) {
                this.released_by = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }
    }

    public static class TL_starGift_layer206 extends TL_starGift {
        public static final int constructor = -970274264;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-970274264);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            outputSerializedData.writeInt32(i4);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.availability_resale);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.resell_min_stars);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeString(this.title);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16) != 0) {
                this.availability_resale = inputSerializedData.readInt64(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.resell_min_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 32) != 0) {
                this.title = inputSerializedData.readString(z);
            }
        }
    }

    public static class TL_starGift_layer202 extends TL_starGift {
        public static final int constructor = 46953416;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(46953416);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            outputSerializedData.writeInt32(i4);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.can_upgrade = (readInt32 & 8) != 0;
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
        }
    }

    public static class TL_starGift_layer195 extends TL_starGift {
        public static final int constructor = 1237678029;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1237678029);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sold_out ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.birthday ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeInt32(this.first_sale_date);
                outputSerializedData.writeInt32(this.last_sale_date);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.sold_out = (readInt32 & 2) != 0;
            this.birthday = (readInt32 & 4) != 0;
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            if ((this.flags & 2) != 0) {
                this.first_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_date = inputSerializedData.readInt32(z);
            }
        }
    }

    public static class TL_starGift_layer190 extends TL_starGift {
        public static final int constructor = -1365150482;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1365150482);
            int i = this.limited ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt64(this.id);
            this.sticker.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.availability_remains);
                outputSerializedData.writeInt32(this.availability_total);
            }
            outputSerializedData.writeInt64(this.convert_stars);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.limited = (readInt32 & 1) != 0;
            this.id = inputSerializedData.readInt64(z);
            this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.availability_remains = inputSerializedData.readInt32(z);
                this.availability_total = inputSerializedData.readInt32(z);
            }
            this.convert_stars = inputSerializedData.readInt64(z);
            this.sold_out = this.limited && this.availability_remains <= 0;
        }
    }

    public static class StarGifts extends TLObject {
        public static StarGifts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starGiftsNotModified;
            if (i != -1551326360) {
                tL_starGiftsNotModified = i != 785918357 ? null : new TL_starGifts();
            } else {
                tL_starGiftsNotModified = new TL_starGiftsNotModified();
            }
            return (StarGifts) TLObject.TLdeserialize(StarGifts.class, tL_starGiftsNotModified, inputSerializedData, i, z);
        }
    }

    public static class TL_starGifts extends StarGifts {
        public static final int constructor = 785918357;
        public int hash;
        public ArrayList<StarGift> gifts = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(785918357);
            outputSerializedData.writeInt32(this.hash);
            Vector.serialize(outputSerializedData, this.gifts);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt32(z);
            this.gifts = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGifts$$ExternalSyntheticLambda0(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }
    }

    public static class TL_starGiftsNotModified extends StarGifts {
        public static final int constructor = -1551326360;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1551326360);
        }
    }

    public static class getStarGifts extends TLObject {
        public static final int constructor = -1000983152;
        public int hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarGifts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1000983152);
            outputSerializedData.writeInt32(this.hash);
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
        public TL_payments_savedStarGifts deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_payments_savedStarGifts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1558583959);
            int i = this.exclude_unsaved ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.exclude_saved ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.exclude_unlimited ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.exclude_unique ? i3 | 16 : i3 & (-17);
            this.flags = i4;
            int i5 = this.sort_by_value ? i4 | 32 : i4 & (-33);
            this.flags = i5;
            int flag = TLObject.setFlag(i5, 128, this.exclude_upgradable);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 256, this.exclude_unupgradable);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 512, this.peer_color_available);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt32(this.collection_id);
            }
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getSavedStarGift extends TLObject {
        public static final int constructor = -1269456634;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_payments_savedStarGifts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1269456634);
            Vector.serialize(outputSerializedData, this.stargift);
        }
    }

    public static class saveStarGift extends TLObject {
        public static final int constructor = 707422588;
        public int flags;
        public InputSavedStarGift stargift;
        public boolean unsave;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(707422588);
            int i = this.unsave ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class convertStarGift extends TLObject {
        public static final int constructor = 1958676331;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1958676331);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class upgradeStarGift extends TLObject {
        public static final int constructor = -1361648395;
        public int flags;
        public boolean keep_original_details;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1361648395);
            int i = this.keep_original_details ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.stargift.serializeToStream(outputSerializedData);
        }
    }

    public static class transferStarGift extends TLObject {
        public static final int constructor = 2132285290;
        public InputSavedStarGift stargift;
        public TLRPC.InputPeer to_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2132285290);
            this.stargift.serializeToStream(outputSerializedData);
            this.to_id.serializeToStream(outputSerializedData);
        }
    }

    public static class StarGiftUpgradePrice extends TLObject {
        public static final int constructor = -1712704739;
        public int date;
        public long upgrade_stars;

        public static StarGiftUpgradePrice TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StarGiftUpgradePrice) TLObject.TLdeserialize(StarGiftUpgradePrice.class, -1712704739 != i ? null : new StarGiftUpgradePrice(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1712704739);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.upgrade_stars);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.date = inputSerializedData.readInt32(z);
            this.upgrade_stars = inputSerializedData.readInt64(z);
        }
    }

    public static class starGiftUpgradePreview extends TLObject {
        public static final int constructor = 1038213101;
        public ArrayList<StarGiftAttribute> sample_attributes = new ArrayList<>();
        public ArrayList<StarGiftUpgradePrice> prices = new ArrayList<>();
        public ArrayList<StarGiftUpgradePrice> next_prices = new ArrayList<>();

        public static starGiftUpgradePreview TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (starGiftUpgradePreview) TLObject.TLdeserialize(starGiftUpgradePreview.class, 1038213101 != i ? null : new starGiftUpgradePreview(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1038213101);
            Vector.serialize(outputSerializedData, this.sample_attributes);
            Vector.serialize(outputSerializedData, this.prices);
            Vector.serialize(outputSerializedData, this.next_prices);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.sample_attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
            this.prices = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.StarGiftUpgradePrice.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.next_prices = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.StarGiftUpgradePrice.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }
    }

    public static class getStarGiftUpgradePreview extends TLObject {
        public static final int constructor = -1667580751;
        public long gift_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return starGiftUpgradePreview.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1667580751);
            outputSerializedData.writeInt64(this.gift_id);
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

        public static TL_starsTopupOption TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starsTopupOption) TLObject.TLdeserialize(TL_starsTopupOption.class, 198776256 != i ? null : new TL_starsTopupOption(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.extended = (readInt32 & 2) != 0;
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.store_product = inputSerializedData.readString(z);
            }
            this.currency = inputSerializedData.readString(z);
            this.amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(198776256);
            int i = this.extended ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
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

        public static TL_starsGiftOption TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starsGiftOption) TLObject.TLdeserialize(TL_starsGiftOption.class, 1577421297 != i ? null : new TL_starsGiftOption(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.extended = (readInt32 & 2) != 0;
            this.stars = inputSerializedData.readInt64(z);
            if ((this.flags & 1) != 0) {
                this.store_product = inputSerializedData.readString(z);
            }
            this.currency = inputSerializedData.readString(z);
            this.amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1577421297);
            int i = this.extended ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt64(this.stars);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsGiveawayWinnersOption extends TLObject {
        public static final int constructor = 1411605001;
        public int flags;
        public boolean isDefault;
        public long per_user_stars;
        public int users;

        public static TL_starsGiveawayWinnersOption TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starsGiveawayWinnersOption) TLObject.TLdeserialize(TL_starsGiveawayWinnersOption.class, 1411605001 != i ? null : new TL_starsGiveawayWinnersOption(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.isDefault = (readInt32 & 1) != 0;
            this.users = inputSerializedData.readInt32(z);
            this.per_user_stars = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1411605001);
            int i = this.isDefault ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt32(this.users);
            outputSerializedData.writeInt64(this.per_user_stars);
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

        public static TL_starsGiveawayOption TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starsGiveawayOption) TLObject.TLdeserialize(TL_starsGiveawayOption.class, -1798404822 != i ? null : new TL_starsGiveawayOption(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.extended = (readInt32 & 1) != 0;
            this.isDefault = (readInt32 & 2) != 0;
            this.stars = inputSerializedData.readInt64(z);
            this.yearly_boosts = inputSerializedData.readInt32(z);
            if ((this.flags & 4) != 0) {
                this.store_product = inputSerializedData.readString(z);
            }
            this.currency = inputSerializedData.readString(z);
            this.amount = inputSerializedData.readInt64(z);
            this.winners = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.TL_starsGiveawayWinnersOption.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1798404822);
            int i = this.extended ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.isDefault ? i | 2 : i & (-3);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            outputSerializedData.writeInt64(this.stars);
            outputSerializedData.writeInt32(this.yearly_boosts);
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.store_product);
            }
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
            Vector.serialize(outputSerializedData, this.winners);
        }
    }

    public static class StarsTransactionPeer extends TLObject {
        public TLRPC.Peer peer;

        public static StarsTransactionPeer TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starsTransactionPeerUnsupported;
            switch (i) {
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
            return (StarsTransactionPeer) TLObject.TLdeserialize(StarsTransactionPeer.class, tL_starsTransactionPeerUnsupported, inputSerializedData, i, z);
        }
    }

    public static class TL_starsTransactionPeer extends StarsTransactionPeer {
        public static final int constructor = -670195363;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-670195363);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_starsTransactionPeerAppStore extends StarsTransactionPeer {
        public static final int constructor = -1269320843;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1269320843);
        }
    }

    public static class TL_starsTransactionPeerPlayMarket extends StarsTransactionPeer {
        public static final int constructor = 2069236235;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2069236235);
        }
    }

    public static class TL_starsTransactionPeerFragment extends StarsTransactionPeer {
        public static final int constructor = -382740222;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-382740222);
        }
    }

    public static class TL_starsTransactionPeerPremiumBot extends StarsTransactionPeer {
        public static final int constructor = 621656824;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(621656824);
        }
    }

    public static class TL_starsTransactionPeerUnsupported extends StarsTransactionPeer {
        public static final int constructor = -1779253276;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1779253276);
        }
    }

    public static class TL_starsTransactionPeerAds extends StarsTransactionPeer {
        public static final int constructor = 1617438738;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1617438738);
        }
    }

    public static class TL_starsTransactionPeerAPI extends StarsTransactionPeer {
        public static final int constructor = -110658899;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-110658899);
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
        public String id;
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

        private static StarsTransaction fromConstructor(int i) {
            switch (i) {
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

        public static StarsTransaction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StarsTransaction) TLObject.TLdeserialize(StarsTransaction.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_starsTransaction_layer181 extends StarsTransaction {
        public static final int constructor = -865044046;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-865044046);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer182 extends TL_starsTransaction {
        public static final int constructor = -1442789224;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1442789224);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
        }
    }

    public static abstract class StarsAmount extends TLObject {
        public long amount;
        public int nanos;

        public abstract AmountUtils$Currency getCurrency();

        public static StarsAmount TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starsAmount;
            if (i == -1145654109) {
                tL_starsAmount = new TL_starsAmount();
            } else {
                tL_starsAmount = i != 1957618656 ? null : new TL_starsTonAmount();
            }
            return (StarsAmount) TLObject.TLdeserialize(StarsAmount.class, tL_starsAmount, inputSerializedData, i, z);
        }

        public static StarsAmount ofStars(long j) {
            TL_starsAmount tL_starsAmount = new TL_starsAmount();
            tL_starsAmount.amount = j;
            return tL_starsAmount;
        }

        public boolean equals(StarsAmount starsAmount) {
            return starsAmount != null && this.amount == starsAmount.amount && this.nanos == starsAmount.nanos;
        }

        public double toDouble() {
            return this.amount + (this.nanos / 1.0E9d);
        }

        public boolean positive() {
            long j = this.amount;
            return j != 0 ? j > 0 : this.nanos > 0;
        }

        public boolean negative() {
            long j = this.amount;
            return j != 0 ? j < 0 : this.nanos < 0;
        }
    }

    public static class TL_starsTonAmount extends StarsAmount {
        public static final int constructor = 1957618656;

        @Override
        public AmountUtils$Currency getCurrency() {
            return AmountUtils$Currency.TON;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1957618656);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_starsAmount extends StarsAmount {
        public static final int constructor = -1145654109;

        @Override
        public AmountUtils$Currency getCurrency() {
            return AmountUtils$Currency.STARS;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.amount = inputSerializedData.readInt64(z);
            this.nanos = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1145654109);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.nanos);
        }
    }

    public static class TL_starsTransaction extends StarsTransaction {
        public static final int constructor = 325426864;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.floodskip = (readInt32 & 32768) != 0;
            this.stargift_upgrade = (262144 & readInt32) != 0;
            this.paid_message = (readInt32 & 524288) != 0;
            this.premium_gift = (readInt32 & 1048576) != 0;
            this.business_transfer = (2097152 & readInt32) != 0;
            this.stargift_resale = (4194304 & readInt32) != 0;
            this.posts_search = (16777216 & readInt32) != 0;
            this.stargift_prepaid_upgrade = (33554432 & readInt32) != 0;
            this.stargift_drop_original_details = (67108864 & readInt32) != 0;
            this.phonegroup_message = TLObject.hasFlag(readInt32, 134217728);
            this.stargift_auction_bid = TLObject.hasFlag(this.flags, 268435456);
            this.offer = TLObject.hasFlag(this.flags, 536870912);
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32768) != 0) {
                this.floodskip_number = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 65536) != 0) {
                this.starref_commission_permille = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 524288) != 0) {
                this.paid_messages = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 1048576) != 0) {
                this.premium_gift_months = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.ads_proceeds_from_date = inputSerializedData.readInt32(z);
                this.ads_proceeds_to_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(325426864);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            int i7 = this.floodskip ? i6 | 32768 : i6 & (-32769);
            this.flags = i7;
            int i8 = this.stargift_upgrade ? i7 | 262144 : i7 & (-262145);
            this.flags = i8;
            int i9 = this.paid_message ? i8 | 524288 : i8 & (-524289);
            this.flags = i9;
            int i10 = this.premium_gift ? i9 | 1048576 : i9 & (-1048577);
            this.flags = i10;
            int i11 = this.business_transfer ? i10 | 2097152 : i10 & (-2097153);
            this.flags = i11;
            int i12 = this.stargift_resale ? i11 | 4194304 : i11 & (-4194305);
            this.flags = i12;
            int i13 = this.posts_search ? i12 | 16777216 : i12 & (-16777217);
            this.flags = i13;
            int i14 = this.stargift_prepaid_upgrade ? i13 | 33554432 : i13 & (-33554433);
            this.flags = i14;
            int i15 = this.stargift_drop_original_details ? i14 | 67108864 : i14 & (-67108865);
            this.flags = i15;
            int flag = TLObject.setFlag(i15, 134217728, this.phonegroup_message);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 268435456, this.stargift_auction_bid);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 536870912, this.offer);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32768) != 0) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 524288) != 0) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
            if ((this.flags & 1048576) != 0) {
                outputSerializedData.writeInt32(this.premium_gift_months);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                outputSerializedData.writeInt32(this.ads_proceeds_from_date);
                outputSerializedData.writeInt32(this.ads_proceeds_to_date);
            }
        }
    }

    public static class TL_starsTransaction_layer205 extends TL_starsTransaction {
        public static final int constructor = -1549805238;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.floodskip = (readInt32 & 32768) != 0;
            this.stargift_upgrade = (262144 & readInt32) != 0;
            this.paid_message = (readInt32 & 524288) != 0;
            this.premium_gift = (readInt32 & 1048576) != 0;
            this.stargift_resale = (readInt32 & 4194304) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32768) != 0) {
                this.floodskip_number = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 65536) != 0) {
                this.starref_commission_permille = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 524288) != 0) {
                this.paid_messages = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 1048576) != 0) {
                this.premium_gift_months = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1549805238);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            int i7 = this.floodskip ? i6 | 32768 : i6 & (-32769);
            this.flags = i7;
            int i8 = this.stargift_upgrade ? i7 | 262144 : i7 & (-262145);
            this.flags = i8;
            int i9 = this.paid_message ? i8 | 524288 : i8 & (-524289);
            this.flags = i9;
            int i10 = this.premium_gift ? i9 | 1048576 : i9 & (-1048577);
            this.flags = i10;
            int i11 = this.stargift_resale ? i10 | 4194304 : i10 & (-4194305);
            this.flags = i11;
            outputSerializedData.writeInt32(i11);
            outputSerializedData.writeString(this.id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32768) != 0) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 524288) != 0) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
            if ((this.flags & 1048576) != 0) {
                outputSerializedData.writeInt32(this.premium_gift_months);
            }
        }
    }

    public static class TL_starsTransaction_layer199_2 extends TL_starsTransaction {
        public static final int constructor = -321582812;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.floodskip = (readInt32 & 32768) != 0;
            this.stargift_upgrade = (262144 & readInt32) != 0;
            this.paid_message = (readInt32 & 524288) != 0;
            this.premium_gift = (readInt32 & 1048576) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32768) != 0) {
                this.floodskip_number = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 65536) != 0) {
                this.starref_commission_permille = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 524288) != 0) {
                this.paid_messages = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-321582812);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            int i7 = this.floodskip ? i6 | 32768 : i6 & (-32769);
            this.flags = i7;
            int i8 = this.stargift_upgrade ? i7 | 262144 : i7 & (-262145);
            this.flags = i8;
            int i9 = this.paid_message ? i8 | 524288 : i8 & (-524289);
            this.flags = i9;
            int i10 = this.premium_gift ? i9 | 1048576 : i9 & (-1048577);
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeString(this.id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32768) != 0) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 524288) != 0) {
                outputSerializedData.writeInt32(this.paid_messages);
            }
        }
    }

    public static class TL_starsTransaction_layer199 extends TL_starsTransaction {
        public static final int constructor = 1692387622;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.floodskip = (readInt32 & 32768) != 0;
            this.stargift_upgrade = (262144 & readInt32) != 0;
            this.paid_message = (readInt32 & 524288) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32768) != 0) {
                this.floodskip_number = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 65536) != 0) {
                this.starref_commission_permille = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.starref_amount = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1692387622);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            int i7 = this.floodskip ? i6 | 32768 : i6 & (-32769);
            this.flags = i7;
            int i8 = this.stargift_upgrade ? i7 | 262144 : i7 & (-262145);
            this.flags = i8;
            int i9 = this.paid_message ? i8 | 524288 : i8 & (-524289);
            this.flags = i9;
            outputSerializedData.writeInt32(i9);
            outputSerializedData.writeString(this.id);
            this.amount.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32768) != 0) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeInt32(this.starref_commission_permille);
            }
            if ((this.flags & 131072) != 0) {
                this.starref_peer.serializeToStream(outputSerializedData);
                this.starref_amount.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer194 extends TL_starsTransaction {
        public static final int constructor = 903148150;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.floodskip = (readInt32 & 32768) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32768) != 0) {
                this.floodskip_number = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(903148150);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            int i7 = this.floodskip ? i6 | 32768 : i6 & (-32769);
            this.flags = i7;
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32768) != 0) {
                outputSerializedData.writeInt32(this.floodskip_number);
            }
        }
    }

    public static class TL_starsTransaction_layer191 extends TL_starsTransaction {
        public static final int constructor = 178185410;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(178185410);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
            if ((this.flags & 16384) != 0) {
                this.stargift.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_starsTransaction_layer188 extends TL_starsTransaction {
        public static final int constructor = -294313259;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 8192) != 0) {
                this.giveaway_post_id = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-294313259);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.giveaway_post_id);
            }
        }
    }

    public static class TL_starsTransaction_layer186 extends TL_starsTransaction {
        public static final int constructor = 1127934763;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.reaction = (readInt32 & 2048) != 0;
            this.subscription = (readInt32 & 4096) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4096) != 0) {
                this.subscription_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1127934763);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
            this.flags = i5;
            int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
            if ((this.flags & 4096) != 0) {
                outputSerializedData.writeInt32(this.subscription_period);
            }
        }
    }

    public static class TL_starsTransaction_layer185 extends TL_starsTransaction {
        public static final int constructor = 766853519;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.refund = (readInt32 & 8) != 0;
            this.pending = (readInt32 & 16) != 0;
            this.failed = (readInt32 & 64) != 0;
            this.gift = (readInt32 & 1024) != 0;
            this.id = inputSerializedData.readString(z);
            this.amount = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            this.date = inputSerializedData.readInt32(z);
            this.peer = StarsTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 1) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.description = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
            if ((this.flags & 128) != 0) {
                this.bot_payload = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 256) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 512) != 0) {
                this.extended_media = Vector.deserialize(inputSerializedData, new TL_stars$TL_starsTransaction$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(766853519);
            int i = this.refund ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            int i2 = this.pending ? i | 16 : i & (-17);
            this.flags = i2;
            int i3 = this.failed ? i2 | 64 : i2 & (-65);
            this.flags = i3;
            int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            outputSerializedData.writeInt32(i4);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount.amount);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.description);
            }
            if ((this.flags & 4) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeByteArray(this.bot_payload);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 512) != 0) {
                Vector.serialize(outputSerializedData, this.extended_media);
            }
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

        public static StarsStatus TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_payments_starsStatus_layer194;
            if (i == -1141231252) {
                tL_payments_starsStatus_layer194 = new TL_payments_starsStatus_layer194();
            } else {
                tL_payments_starsStatus_layer194 = i != 1822222573 ? null : new TL_payments_starsStatus();
            }
            return (StarsStatus) TLObject.TLdeserialize(StarsStatus.class, tL_payments_starsStatus_layer194, inputSerializedData, i, z);
        }
    }

    public static class TL_payments_starsStatus extends StarsStatus {
        public static final int constructor = 1822222573;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.balance = StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 2) != 0) {
                this.subscriptions = Vector.deserialize(inputSerializedData, new TL_stars$TL_payments_starsStatus$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4) != 0) {
                this.subscriptions_next_offset = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.subscriptions_missing_balance = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8) != 0) {
                this.history = Vector.deserialize(inputSerializedData, new TL_stars$TL_payments_starsStatus$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 1) != 0) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1822222573);
            outputSerializedData.writeInt32(this.flags);
            this.balance.serializeToStream(outputSerializedData);
            if ((this.flags & 2) != 0) {
                Vector.serialize(outputSerializedData, this.subscriptions);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.subscriptions_next_offset);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.subscriptions_missing_balance);
            }
            if ((this.flags & 8) != 0) {
                Vector.serialize(outputSerializedData, this.history);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_payments_starsStatus_layer194 extends TL_payments_starsStatus {
        public static final int constructor = -1141231252;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.balance = StarsAmount.ofStars(inputSerializedData.readInt64(z));
            if ((this.flags & 2) != 0) {
                this.subscriptions = Vector.deserialize(inputSerializedData, new TL_stars$TL_payments_starsStatus$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 4) != 0) {
                this.subscriptions_next_offset = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.subscriptions_missing_balance = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8) != 0) {
                this.history = Vector.deserialize(inputSerializedData, new TL_stars$TL_payments_starsStatus$$ExternalSyntheticLambda1(), z);
            }
            if ((this.flags & 1) != 0) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1141231252);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.balance.amount);
            if ((this.flags & 2) != 0) {
                Vector.serialize(outputSerializedData, this.subscriptions);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.subscriptions_next_offset);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.subscriptions_missing_balance);
            }
            if ((this.flags & 8) != 0) {
                Vector.serialize(outputSerializedData, this.history);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_payments_getStarsTopupOptions extends TLObject {
        public static final int constructor = -1072773165;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i2, boolean z2) {
                    return TL_stars.TL_starsTopupOption.TLdeserialize(inputSerializedData2, i2, z2);
                }
            });
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1072773165);
        }
    }

    public static class TL_payments_getStarsGiftOptions extends TLObject {
        public static final int constructor = -741774392;
        public int flags;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i2, boolean z2) {
                    return TL_stars.TL_starsGiftOption.TLdeserialize(inputSerializedData2, i2, z2);
                }
            });
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-741774392);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.user_id.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_payments_getStarsGiveawayOptions extends TLObject {
        public static final int constructor = -1122042562;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i2, boolean z2) {
                    return TL_stars.TL_starsGiveawayOption.TLdeserialize(inputSerializedData2, i2, z2);
                }
            });
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarsStatus.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1319744447);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.ton));
            this.peer.serializeToStream(outputSerializedData);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarsStatus.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1775912279);
            int flag = TLObject.setFlag(this.flags, 1, this.inbound);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.outbound);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.ascending);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.subscription_id != null);
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

    public static class TL_payments_sendStarsForm extends TLMethod<TLRPC.payments_PaymentResult> {
        public static final int constructor = 2040056084;
        public long form_id;
        public TLRPC.InputInvoice invoice;

        @Override
        public TLRPC.payments_PaymentResult deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.payments_PaymentResult.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2040056084);
            outputSerializedData.writeInt64(this.form_id);
            this.invoice.serializeToStream(outputSerializedData);
        }
    }

    public static class StarsSubscription extends TLObject {
        public boolean bot_canceled;
        public boolean can_refulfill;
        public boolean canceled;
        public String chat_invite_hash;
        public int flags;
        public String id;
        public String invoice_slug;
        public boolean missing_balance;
        public TLRPC.Peer peer;
        public TLRPC.WebDocument photo;
        public TL_starsSubscriptionPricing pricing;
        public String title;
        public int until_date;

        public static StarsSubscription TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starsSubscription_old;
            if (i == -797707802) {
                tL_starsSubscription_old = new TL_starsSubscription_old();
            } else if (i == 779004698) {
                tL_starsSubscription_old = new TL_starsSubscription();
            } else {
                tL_starsSubscription_old = i != 1401868056 ? null : new TL_starsSubscription_layer193();
            }
            return (StarsSubscription) TLObject.TLdeserialize(StarsSubscription.class, tL_starsSubscription_old, inputSerializedData, i, z);
        }
    }

    public static class TL_starsSubscription extends StarsSubscription {
        public static final int constructor = 779004698;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.canceled = (readInt32 & 1) != 0;
            this.can_refulfill = (readInt32 & 2) != 0;
            this.missing_balance = (readInt32 & 4) != 0;
            this.bot_canceled = (readInt32 & 128) != 0;
            this.id = inputSerializedData.readString(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.until_date = inputSerializedData.readInt32(z);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 8) != 0) {
                this.chat_invite_hash = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            if ((this.flags & 32) != 0) {
                this.photo = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 64) != 0) {
                this.invoice_slug = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(779004698);
            int i = this.canceled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.can_refulfill ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.missing_balance ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.bot_canceled ? i3 | 128 : i3 & (-129);
            this.flags = i4;
            outputSerializedData.writeInt32(i4);
            outputSerializedData.writeString(this.id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.chat_invite_hash);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 32) != 0) {
                this.photo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeString(this.invoice_slug);
            }
        }
    }

    public static class TL_starsSubscription_layer193 extends StarsSubscription {
        public static final int constructor = 1401868056;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.canceled = (readInt32 & 1) != 0;
            this.can_refulfill = (readInt32 & 2) != 0;
            this.missing_balance = (readInt32 & 4) != 0;
            this.id = inputSerializedData.readString(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.until_date = inputSerializedData.readInt32(z);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 8) != 0) {
                this.chat_invite_hash = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1401868056);
            int i = this.canceled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.can_refulfill ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.missing_balance ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeString(this.id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.chat_invite_hash);
            }
        }
    }

    public static class TL_starsSubscription_old extends TL_starsSubscription {
        public static final int constructor = -797707802;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.canceled = (readInt32 & 1) != 0;
            this.can_refulfill = (readInt32 & 2) != 0;
            this.missing_balance = (readInt32 & 4) != 0;
            this.id = inputSerializedData.readString(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.until_date = inputSerializedData.readInt32(z);
            this.pricing = TL_starsSubscriptionPricing.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-797707802);
            int i = this.canceled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.can_refulfill ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.missing_balance ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeString(this.id);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.until_date);
            this.pricing.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_starsSubscriptionPricing extends TLObject {
        public static final int constructor = 88173912;
        public long amount;
        public int period;

        public static TL_starsSubscriptionPricing TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starsSubscriptionPricing) TLObject.TLdeserialize(TL_starsSubscriptionPricing.class, 88173912 != i ? null : new TL_starsSubscriptionPricing(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.period = inputSerializedData.readInt32(z);
            this.amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(88173912);
            outputSerializedData.writeInt32(this.period);
            outputSerializedData.writeInt64(this.amount);
        }
    }

    public static class TL_getStarsSubscriptions extends TLObject {
        public static final int constructor = 52761285;
        public int flags;
        public boolean missing_balance;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarsStatus.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(52761285);
            int i = this.missing_balance ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
        }
    }

    public static class TL_changeStarsSubscription extends TLObject {
        public static final int constructor = -948500360;
        public Boolean canceled;
        public int flags;
        public TLRPC.InputPeer peer;
        public String subscription_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-948500360);
            int i = this.canceled != null ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.subscription_id);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeBool(this.canceled.booleanValue());
            }
        }
    }

    public static class TL_fulfillStarsSubscription extends TLObject {
        public static final int constructor = -866391117;
        public TLRPC.InputPeer peer;
        public String subscription_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-866391117);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.subscription_id);
        }
    }

    public static class starGiftAttributeCounter extends TLObject {
        public static int constructor = 783398488;
        public StarGiftAttributeId attribute;
        public int count;

        public static starGiftAttributeCounter TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (starGiftAttributeCounter) TLObject.TLdeserialize(starGiftAttributeCounter.class, constructor != i ? null : new starGiftAttributeCounter(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.attribute = StarGiftAttributeId.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.count = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.attribute.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.count);
        }
    }

    public static class StarGiftAttributeId extends TLObject {
        public int backdrop_id;
        public long document_id;

        public static StarGiftAttributeId TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject stargiftattributeidbackdrop;
            if (i == 520210263) {
                stargiftattributeidbackdrop = new starGiftAttributeIdBackdrop();
            } else if (i == 1219145276) {
                stargiftattributeidbackdrop = new starGiftAttributeIdModel();
            } else {
                stargiftattributeidbackdrop = i != 1242965043 ? null : new starGiftAttributeIdPattern();
            }
            return (StarGiftAttributeId) TLObject.TLdeserialize(StarGiftAttributeId.class, stargiftattributeidbackdrop, inputSerializedData, i, z);
        }
    }

    public static class starGiftAttributeIdModel extends StarGiftAttributeId {
        public static final int constructor = 1219145276;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.document_id = inputSerializedData.readInt64(z);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.document_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1242965043);
            outputSerializedData.writeInt64(this.document_id);
        }
    }

    public static class starGiftAttributeIdBackdrop extends StarGiftAttributeId {
        public static final int constructor = 520210263;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.backdrop_id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(520210263);
            outputSerializedData.writeInt32(this.backdrop_id);
        }
    }

    public static class StarGiftAttribute extends TLObject {
        public String name;
        public int rarity_permille;

        public static StarGiftAttribute TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject stargiftattributebackdrop_layer202;
            switch (i) {
                case -1809377438:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeBackdrop_layer202();
                    break;
                case -1070837941:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeOriginalDetails_layer197();
                    break;
                case -650279524:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeBackdrop();
                    break;
                case -524291476:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeOriginalDetails();
                    break;
                case 330104601:
                    stargiftattributebackdrop_layer202 = new starGiftAttributePattern();
                    break;
                case 970559507:
                    stargiftattributebackdrop_layer202 = new starGiftAttributeModel();
                    break;
                default:
                    stargiftattributebackdrop_layer202 = null;
                    break;
            }
            return (StarGiftAttribute) TLObject.TLdeserialize(StarGiftAttribute.class, stargiftattributebackdrop_layer202, inputSerializedData, i, z);
        }
    }

    public static class starGiftAttributeModel extends StarGiftAttribute {
        public static final int constructor = 970559507;
        public TLRPC.Document document;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(970559507);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.rarity_permille);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.name = inputSerializedData.readString(z);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.rarity_permille = inputSerializedData.readInt32(z);
        }
    }

    public static class starGiftAttributePattern extends StarGiftAttribute {
        public static final int constructor = 330104601;
        public TLRPC.Document document;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(330104601);
            outputSerializedData.writeString(this.name);
            this.document.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.rarity_permille);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.name = inputSerializedData.readString(z);
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.rarity_permille = inputSerializedData.readInt32(z);
        }
    }

    public static class starGiftAttributeBackdrop extends StarGiftAttribute {
        public static final int constructor = -650279524;
        public int backdrop_id;
        public int center_color;
        public int edge_color;
        public int pattern_color;
        public int text_color;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-650279524);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.backdrop_id);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.pattern_color);
            outputSerializedData.writeInt32(this.text_color);
            outputSerializedData.writeInt32(this.rarity_permille);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.name = inputSerializedData.readString(z);
            this.backdrop_id = inputSerializedData.readInt32(z);
            this.center_color = inputSerializedData.readInt32(z);
            this.edge_color = inputSerializedData.readInt32(z);
            this.pattern_color = inputSerializedData.readInt32(z);
            this.text_color = inputSerializedData.readInt32(z);
            this.rarity_permille = inputSerializedData.readInt32(z);
        }
    }

    public static class starGiftAttributeBackdrop_layer202 extends starGiftAttributeBackdrop {
        public static final int constructor = -1809377438;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1809377438);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.pattern_color);
            outputSerializedData.writeInt32(this.text_color);
            outputSerializedData.writeInt32(this.rarity_permille);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.name = inputSerializedData.readString(z);
            this.center_color = inputSerializedData.readInt32(z);
            this.edge_color = inputSerializedData.readInt32(z);
            this.pattern_color = inputSerializedData.readInt32(z);
            this.text_color = inputSerializedData.readInt32(z);
            this.rarity_permille = inputSerializedData.readInt32(z);
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
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-524291476);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.sender_id.serializeToStream(outputSerializedData);
            }
            this.recipient_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            if ((this.flags & 2) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                this.sender_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.recipient_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            if ((this.flags & 2) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }
    }

    public static class starGiftAttributeOriginalDetails_layer197 extends starGiftAttributeOriginalDetails {
        public static final int constructor = -1070837941;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1070837941);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt64(this.sender_id.user_id);
            }
            outputSerializedData.writeInt64(this.recipient_id.user_id);
            outputSerializedData.writeInt32(this.date);
            if ((this.flags & 2) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.sender_id = tL_peerUser;
                tL_peerUser.user_id = inputSerializedData.readInt64(z);
            }
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.recipient_id = tL_peerUser2;
            tL_peerUser2.user_id = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
            if ((this.flags & 2) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }
    }

    public static final class TL_payments_uniqueStarGift extends TLObject {
        public static final int constructor = 1097619176;
        public StarGift gift;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_payments_uniqueStarGift TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_payments_uniqueStarGift) TLObject.TLdeserialize(TL_payments_uniqueStarGift.class, 1097619176 != i ? null : new TL_payments_uniqueStarGift(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1097619176);
            this.gift.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static final class getUniqueStarGift extends TLObject {
        public static final int constructor = -1583919758;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_payments_uniqueStarGift.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1583919758);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class SavedStarGift extends TLObject {
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

        public static SavedStarGift TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_savedStarGift_layer219;
            switch (i) {
                case -1987861422:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer219();
                    break;
                case -539360103:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer209();
                    break;
                case -355041186:
                    tL_savedStarGift_layer219 = new TL_savedStarGift();
                    break;
                case 430552434:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer214();
                    break;
                case 514213599:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer211();
                    break;
                case 1616305061:
                    tL_savedStarGift_layer219 = new TL_savedStarGift_layer202();
                    break;
                default:
                    tL_savedStarGift_layer219 = null;
                    break;
            }
            return (SavedStarGift) TLObject.TLdeserialize(SavedStarGift.class, tL_savedStarGift_layer219, inputSerializedData, i, z);
        }
    }

    public static class TL_savedStarGift extends SavedStarGift {
        public static final int constructor = -355041186;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            this.upgrade_separate = (131072 & readInt32) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8192) != 0) {
                this.can_transfer_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.can_resell_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 32768) != 0) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z);
            }
            if ((this.flags & 65536) != 0) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z);
            }
            if ((this.flags & 262144) != 0) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.gift_num = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-355041186);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            int i6 = this.upgrade_separate ? i5 | 131072 : i5 & (-131073);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if ((this.flags & 16384) != 0) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if ((this.flags & 32768) != 0) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if ((this.flags & 262144) != 0) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                outputSerializedData.writeInt32(this.gift_num);
            }
        }
    }

    public static class TL_savedStarGift_layer219 extends TL_savedStarGift {
        public static final int constructor = -1987861422;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            this.upgrade_separate = (131072 & readInt32) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8192) != 0) {
                this.can_transfer_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.can_resell_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 32768) != 0) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z);
            }
            if ((this.flags & 65536) != 0) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z);
            }
            if ((this.flags & 262144) != 0) {
                this.drop_original_details_stars = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1987861422);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            int i6 = this.upgrade_separate ? i5 | 131072 : i5 & (-131073);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if ((this.flags & 16384) != 0) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if ((this.flags & 32768) != 0) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
            if ((this.flags & 262144) != 0) {
                outputSerializedData.writeInt64(this.drop_original_details_stars);
            }
        }
    }

    public static class TL_savedStarGift_layer214 extends TL_savedStarGift {
        public static final int constructor = 430552434;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            this.upgrade_separate = (131072 & readInt32) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8192) != 0) {
                this.can_transfer_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.can_resell_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 32768) != 0) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z);
            }
            if ((this.flags & 65536) != 0) {
                this.prepaid_upgrade_hash = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(430552434);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            int i6 = this.upgrade_separate ? i5 | 131072 : i5 & (-131073);
            this.flags = i6;
            outputSerializedData.writeInt32(i6);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if ((this.flags & 16384) != 0) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if ((this.flags & 32768) != 0) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
            if ((this.flags & 65536) != 0) {
                outputSerializedData.writeString(this.prepaid_upgrade_hash);
            }
        }
    }

    public static class TL_savedStarGift_layer211 extends TL_savedStarGift {
        public static final int constructor = 514213599;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8192) != 0) {
                this.can_transfer_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.can_resell_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 32768) != 0) {
                this.collection_id = Vector.deserializeInt(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(514213599);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if ((this.flags & 16384) != 0) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
            if ((this.flags & 32768) != 0) {
                Vector.serializeInt(outputSerializedData, this.collection_id);
            }
        }
    }

    public static class TL_savedStarGift_layer209 extends TL_savedStarGift {
        public static final int constructor = -539360103;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8192) != 0) {
                this.can_transfer_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 16384) != 0) {
                this.can_resell_at = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-539360103);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
            if ((this.flags & 8192) != 0) {
                outputSerializedData.writeInt32(this.can_transfer_at);
            }
            if ((this.flags & 16384) != 0) {
                outputSerializedData.writeInt32(this.can_resell_at);
            }
        }
    }

    public static class TL_savedStarGift_layer202 extends TL_savedStarGift {
        public static final int constructor = 1616305061;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = (readInt32 & 1) != 0;
            this.unsaved = (readInt32 & 32) != 0;
            this.refunded = (readInt32 & 512) != 0;
            this.can_upgrade = (readInt32 & 1024) != 0;
            this.pinned_to_top = (readInt32 & 4096) != 0;
            if ((readInt32 & 2) != 0) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if ((this.flags & 4) != 0) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.msg_id = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 2048) != 0) {
                this.saved_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 16) != 0) {
                this.convert_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 64) != 0) {
                this.upgrade_stars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.can_export_at = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 256) != 0) {
                this.transfer_stars = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1616305061);
            int i = this.name_hidden ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.unsaved ? i | 32 : i & (-33);
            this.flags = i2;
            int i3 = this.refunded ? i2 | 512 : i2 & (-513);
            this.flags = i3;
            int i4 = this.can_upgrade ? i3 | 1024 : i3 & (-1025);
            this.flags = i4;
            int i5 = this.pinned_to_top ? i4 | 4096 : i4 & (-4097);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 2) != 0) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            this.gift.serializeToStream(outputSerializedData);
            if ((this.flags & 4) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeInt32(this.msg_id);
            }
            if ((this.flags & 2048) != 0) {
                outputSerializedData.writeInt64(this.saved_id);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeInt64(this.convert_stars);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.upgrade_stars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt32(this.can_export_at);
            }
            if ((this.flags & 256) != 0) {
                outputSerializedData.writeInt64(this.transfer_stars);
            }
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

        public static TL_payments_savedStarGifts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_payments_savedStarGifts) TLObject.TLdeserialize(TL_payments_savedStarGifts.class, -1779201615 != i ? null : new TL_payments_savedStarGifts(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            if ((this.flags & 2) != 0) {
                this.chat_notifications_enabled = inputSerializedData.readBool(z);
            }
            this.gifts = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.SavedStarGift.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            if ((this.flags & 1) != 0) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1779201615);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeBool(this.chat_notifications_enabled);
            }
            Vector.serialize(outputSerializedData, this.gifts);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class InputSavedStarGift extends TLObject {
        public static InputSavedStarGift TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_inputSavedStarGiftChat;
            if (i == -251549057) {
                tL_inputSavedStarGiftChat = new TL_inputSavedStarGiftChat();
            } else if (i != 545636920) {
                tL_inputSavedStarGiftChat = i != 1764202389 ? null : new TL_inputSavedStarGiftUser();
            } else {
                tL_inputSavedStarGiftChat = new TL_inputSavedStarGiftSlug();
            }
            return (InputSavedStarGift) TLObject.TLdeserialize(InputSavedStarGift.class, tL_inputSavedStarGiftChat, inputSerializedData, i, z);
        }
    }

    public static final class TL_inputSavedStarGiftUser extends InputSavedStarGift {
        public static final int constructor = 1764202389;
        public int msg_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1764202389);
            outputSerializedData.writeInt32(this.msg_id);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.msg_id = inputSerializedData.readInt32(z);
        }
    }

    public static final class TL_inputSavedStarGiftSlug extends InputSavedStarGift {
        public static final int constructor = 545636920;
        public String slug;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(545636920);
            outputSerializedData.writeString(this.slug);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.slug = inputSerializedData.readString(z);
        }
    }

    public static final class TL_inputSavedStarGiftChat extends InputSavedStarGift {
        public static final int constructor = -251549057;
        public TLRPC.InputPeer peer;
        public long saved_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-251549057);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.saved_id);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.InputPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.saved_id = inputSerializedData.readInt64(z);
        }
    }

    public static final class toggleChatStarGiftNotifications extends TLObject {
        public static final int constructor = 1626009505;
        public boolean enabled;
        public int flags;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1626009505);
            int i = this.enabled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static final class starGiftWithdrawalUrl extends TLObject {
        public static final int constructor = -2069218660;
        public String url;

        public static starGiftWithdrawalUrl TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (starGiftWithdrawalUrl) TLObject.TLdeserialize(starGiftWithdrawalUrl.class, -2069218660 != i ? null : new starGiftWithdrawalUrl(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2069218660);
            outputSerializedData.writeString(this.url);
        }
    }

    public static final class getStarGiftWithdrawalUrl extends TLObject {
        public static final int constructor = -798059608;
        public TLRPC.InputCheckPasswordSRP password;
        public InputSavedStarGift stargift;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return starGiftWithdrawalUrl.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-798059608);
            this.stargift.serializeToStream(outputSerializedData);
            this.password.serializeToStream(outputSerializedData);
        }
    }

    public static class PaidReactionPrivacy extends TLObject {
        public TLRPC.InputPeer peer;

        public static PaidReactionPrivacy TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject paidreactionprivacypeer;
            if (i == -596837136) {
                paidreactionprivacypeer = new paidReactionPrivacyPeer();
            } else if (i != 520887001) {
                paidreactionprivacypeer = i != 543872158 ? null : new paidReactionPrivacyDefault();
            } else {
                paidreactionprivacypeer = new paidReactionPrivacyAnonymous();
            }
            return (PaidReactionPrivacy) TLObject.TLdeserialize(PaidReactionPrivacy.class, paidreactionprivacypeer, inputSerializedData, i, z);
        }

        public long getDialogId() {
            if (this instanceof paidReactionPrivacyDefault) {
                return 0L;
            }
            if (this instanceof paidReactionPrivacyAnonymous) {
                return 2666000L;
            }
            if (this instanceof paidReactionPrivacyPeer) {
                return DialogObject.getPeerDialogId(this.peer);
            }
            return 0L;
        }
    }

    public static class paidReactionPrivacyDefault extends PaidReactionPrivacy {
        public static final int constructor = 543872158;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(543872158);
        }
    }

    public static class paidReactionPrivacyAnonymous extends PaidReactionPrivacy {
        public static final int constructor = 520887001;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(520887001);
        }
    }

    public static class paidReactionPrivacyPeer extends PaidReactionPrivacy {
        public static final int constructor = -596837136;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.InputPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-596837136);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class updatePaidMessagesPrice extends TLObject {
        public static final int constructor = 1259483771;
        public TLRPC.InputChannel channel;
        public int flags;
        public long send_paid_messages_stars;
        public boolean suggestions_allowed;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1259483771);
            int i = this.suggestions_allowed ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.send_paid_messages_stars);
        }
    }

    public static class toggleStarGiftsPinnedToTop extends TLObject {
        public static final int constructor = 353626032;
        public TLRPC.InputPeer peer;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(353626032);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.stargift);
        }
    }

    public static class updateStarGiftPrice extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -306287413;
        public StarsAmount resell_amount;
        public InputSavedStarGift stargift;

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-306287413);
            this.stargift.serializeToStream(outputSerializedData);
            this.resell_amount.serializeToStream(outputSerializedData);
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

        public static resaleStarGifts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (resaleStarGifts) TLObject.TLdeserialize(resaleStarGifts.class, -1803939105 != i ? null : new resaleStarGifts(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.gifts = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGifts$$ExternalSyntheticLambda0(), z);
            if ((this.flags & 1) != 0) {
                this.next_offset = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.attributes = Vector.deserialize(inputSerializedData, new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), z);
                this.attributes_hash = inputSerializedData.readInt64(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            if ((this.flags & 4) != 0) {
                this.counters = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                    @Override
                    public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                        return TL_stars.starGiftAttributeCounter.TLdeserialize(inputSerializedData2, i, z2);
                    }
                }, z);
            }
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1803939105);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.gifts);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.next_offset);
            }
            if ((this.flags & 2) != 0) {
                Vector.serialize(outputSerializedData, this.attributes);
                outputSerializedData.writeInt64(this.attributes_hash);
            }
            Vector.serialize(outputSerializedData, this.chats);
            if ((this.flags & 4) != 0) {
                Vector.serialize(outputSerializedData, this.counters);
            }
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class getResaleStarGifts extends TLObject {
        public static final int constructor = 2053087798;
        public ArrayList<StarGiftAttributeId> attributes = new ArrayList<>();
        public long attributes_hash;
        public int flags;
        public long gift_id;
        public int limit;
        public String offset;
        public boolean sort_by_num;
        public boolean sort_by_price;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return resaleStarGifts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2053087798);
            int i = this.sort_by_price ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = this.sort_by_num ? i | 4 : i & (-5);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt64(this.attributes_hash);
            }
            outputSerializedData.writeInt64(this.gift_id);
            if ((this.flags & 8) != 0) {
                Vector.serialize(outputSerializedData, this.attributes);
            }
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class Tl_starsRating extends TLObject {
        public static final int constructor = 453922567;
        public long current_level_stars;
        public int flags;
        public int level;
        public long next_level_stars;
        public long stars;

        public static Tl_starsRating TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (Tl_starsRating) TLObject.TLdeserialize(Tl_starsRating.class, 453922567 != i ? null : new Tl_starsRating(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.level = inputSerializedData.readInt32(z);
            this.current_level_stars = inputSerializedData.readInt64(z);
            this.stars = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_level_stars = inputSerializedData.readInt64(z);
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

    public static class TL_starGiftCollection extends TLObject {
        public static final int constructor = -1653926992;
        public int collection_id;
        public int flags;
        public int gifts_count;
        public long hash;
        public TLRPC.Document icon;
        public String title;

        public static TL_starGiftCollection TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starGiftCollection) TLObject.TLdeserialize(TL_starGiftCollection.class, i == -1653926992 ? new TL_starGiftCollection() : null, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.collection_id = inputSerializedData.readInt32(z);
            this.title = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.icon = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.gifts_count = inputSerializedData.readInt32(z);
            this.hash = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1653926992);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.collection_id);
            outputSerializedData.writeString(this.title);
            if ((this.flags & 1) != 0) {
                this.icon.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.gifts_count);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class StarGiftCollections extends TLObject {
        public ArrayList<TL_starGiftCollection> collections = new ArrayList<>();

        public static StarGiftCollections TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starGiftCollections;
            if (i != -1977011469) {
                tL_starGiftCollections = i != -1598402793 ? null : new TL_starGiftCollectionsNotModified();
            } else {
                tL_starGiftCollections = new TL_starGiftCollections();
            }
            return (StarGiftCollections) TLObject.TLdeserialize(StarGiftCollections.class, tL_starGiftCollections, inputSerializedData, i, z);
        }
    }

    public static class TL_starGiftCollectionsNotModified extends StarGiftCollections {
        public static final int constructor = -1598402793;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1598402793);
        }
    }

    public static class TL_starGiftCollections extends StarGiftCollections {
        public static final int constructor = -1977011469;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1977011469);
            Vector.serialize(outputSerializedData, this.collections);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.collections = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.TL_starGiftCollection.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }
    }

    public static class createStarGiftCollection extends TLObject {
        public static final int constructor = 524947079;
        public TLRPC.InputPeer peer;
        public ArrayList<InputSavedStarGift> stargift = new ArrayList<>();
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_starGiftCollection.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(524947079);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            Vector.serialize(outputSerializedData, this.stargift);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_starGiftCollection.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1339932391);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.collection_id);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 2) != 0) {
                Vector.serialize(outputSerializedData, this.delete_stargift);
            }
            if ((this.flags & 4) != 0) {
                Vector.serialize(outputSerializedData, this.add_stargift);
            }
            if ((this.flags & 8) != 0) {
                Vector.serialize(outputSerializedData, this.order);
            }
        }
    }

    public static class reorderStarGiftCollections extends TLObject {
        public static final int constructor = -1020594996;
        public ArrayList<Integer> order = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1020594996);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.order);
        }
    }

    public static class deleteStarGiftCollection extends TLObject {
        public static final int constructor = -1386854168;
        public int collection_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1386854168);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.collection_id);
        }
    }

    public static class getStarGiftCollections extends TLObject {
        public static final int constructor = -1743023651;
        public long hash;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StarGiftCollections.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1743023651);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.hash);
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

        public static UniqueStarGiftValueInfo TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (UniqueStarGiftValueInfo) TLObject.TLdeserialize(UniqueStarGiftValueInfo.class, i == 1362093126 ? new UniqueStarGiftValueInfo() : null, inputSerializedData, i, z);
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.last_sale_on_fragment = TLObject.hasFlag(readInt32, 2);
            this.value_is_average = TLObject.hasFlag(this.flags, 64);
            this.currency = inputSerializedData.readString(z);
            this.value = inputSerializedData.readInt64(z);
            this.initial_sale_date = inputSerializedData.readInt32(z);
            this.initial_sale_stars = inputSerializedData.readInt64(z);
            this.initial_sale_price = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.last_sale_date = inputSerializedData.readInt32(z);
                this.last_sale_price = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.floor_price = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.average_price = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.listed_count = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.fragment_listed_count = inputSerializedData.readInt32(z);
                this.fragment_listed_url = inputSerializedData.readString(z);
            }
        }
    }

    public static class getUniqueStarGiftValueInfo extends TLObject {
        public static final int constructor = 1130737515;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return UniqueStarGiftValueInfo.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1130737515);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class CheckCanSendGiftResult extends TLObject {
        public static CheckCanSendGiftResult TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject checkcansendgiftresultfail;
            if (i != -706379148) {
                checkcansendgiftresultfail = i != 927967149 ? null : new checkCanSendGiftResultOk();
            } else {
                checkcansendgiftresultfail = new checkCanSendGiftResultFail();
            }
            return (CheckCanSendGiftResult) TLObject.TLdeserialize(CheckCanSendGiftResult.class, checkcansendgiftresultfail, inputSerializedData, i, z);
        }
    }

    public static class checkCanSendGiftResultOk extends CheckCanSendGiftResult {
        public static final int constructor = 927967149;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(927967149);
        }
    }

    public static class checkCanSendGiftResultFail extends CheckCanSendGiftResult {
        public static final int constructor = -706379148;
        public TLRPC.TL_textWithEntities reason;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.reason = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-706379148);
            this.reason.serializeToStream(outputSerializedData);
        }
    }

    public static class checkCanSendGift extends TLObject {
        public static final int constructor = -1060835895;
        public long gift_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return CheckCanSendGiftResult.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1060835895);
            outputSerializedData.writeInt64(this.gift_id);
        }
    }

    public static abstract class StarGiftAuctionState extends TLObject {
        private static StarGiftAuctionState fromConstructor(int i) {
            if (i == -1758614593) {
                return new TL_starGiftAuctionStateFinished();
            }
            if (i == -30197422) {
                return new TL_starGiftAuctionStateNotModified();
            }
            if (i != 1998212710) {
                return null;
            }
            return new TL_starGiftAuctionState();
        }

        public static StarGiftAuctionState TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StarGiftAuctionState) TLObject.TLdeserialize(StarGiftAuctionState.class, fromConstructor(i), inputSerializedData, i, z);
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.version = inputSerializedData.readInt32(z);
            this.start_date = inputSerializedData.readInt32(z);
            this.end_date = inputSerializedData.readInt32(z);
            this.min_bid_amount = inputSerializedData.readInt64(z);
            this.bid_levels = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.TL_AuctionBidLevel.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.top_bidders = Vector.deserializeLong(inputSerializedData, z);
            this.next_round_at = inputSerializedData.readInt32(z);
            this.last_gift_num = inputSerializedData.readInt32(z);
            this.gifts_left = inputSerializedData.readInt32(z);
            this.current_round = inputSerializedData.readInt32(z);
            this.total_rounds = inputSerializedData.readInt32(z);
            this.rounds = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stars.StarGiftAuctionRound.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }
    }

    public static class StarGiftAuctionRound extends TLObject {
        public int current_window;
        public int duration;
        public int extend_top;
        public int num;

        public static StarGiftAuctionRound TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_starGiftAuctionRoundExtendable;
            if (i != 178266597) {
                tL_starGiftAuctionRoundExtendable = i != 984483112 ? null : new TL_starGiftAuctionRound();
            } else {
                tL_starGiftAuctionRoundExtendable = new TL_starGiftAuctionRoundExtendable();
            }
            return (StarGiftAuctionRound) TLObject.TLdeserialize(StarGiftAuctionRound.class, tL_starGiftAuctionRoundExtendable, inputSerializedData, i, z);
        }
    }

    public static class TL_starGiftAuctionRound extends StarGiftAuctionRound {
        public static final int constructor = 984483112;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.num = inputSerializedData.readInt32(z);
            this.duration = inputSerializedData.readInt32(z);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.num = inputSerializedData.readInt32(z);
            this.duration = inputSerializedData.readInt32(z);
            this.extend_top = inputSerializedData.readInt32(z);
            this.current_window = inputSerializedData.readInt32(z);
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

    public static class TL_starGiftAuctionStateNotModified extends StarGiftAuctionState {
        public static final int constructor = -30197422;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-30197422);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.start_date = inputSerializedData.readInt32(z);
            this.end_date = inputSerializedData.readInt32(z);
            this.average_price = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.listed_count = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.fragment_listed_count = inputSerializedData.readInt32(z);
                this.fragment_listed_url = inputSerializedData.readString(z);
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

    public static class TL_StarGiftAuctionUserState extends TLObject {
        public static final int constructor = 787403204;
        public int acquired_count;
        public long bid_amount;
        public int bid_date;
        public int flags;
        public long min_bid_amount;
        public TLRPC.Peer peer;
        public boolean returned;

        public static TL_StarGiftAuctionUserState TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_StarGiftAuctionUserState) TLObject.TLdeserialize(TL_StarGiftAuctionUserState.class, 787403204 != i ? null : new TL_StarGiftAuctionUserState(), inputSerializedData, i, z);
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.returned = TLObject.hasFlag(readInt32, 2);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.bid_amount = inputSerializedData.readInt64(z);
                this.bid_date = inputSerializedData.readInt32(z);
                this.min_bid_amount = inputSerializedData.readInt64(z);
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.acquired_count = inputSerializedData.readInt32(z);
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

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1118831432);
            int flag = TLObject.setFlag(this.flags, 1, this.name_hidden);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.message != null);
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

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.name_hidden = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.bid_amount = inputSerializedData.readInt64(z);
            this.round = inputSerializedData.readInt32(z);
            this.pos = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.message = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.gift_num = inputSerializedData.readInt32(z);
            }
        }

        public static TL_StarGiftAuctionAcquiredGift TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_StarGiftAuctionAcquiredGift) TLObject.TLdeserialize(TL_StarGiftAuctionAcquiredGift.class, 1118831432 != i ? null : new TL_StarGiftAuctionAcquiredGift(), inputSerializedData, i, z);
        }
    }

    public static class TL_StarGiftActiveAuctionState extends TLObject {
        public static final int constructor = -753154979;
        public StarGift gift;
        public StarGiftAuctionState state;
        public TL_StarGiftAuctionUserState user_state;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-753154979);
            this.gift.serializeToStream(outputSerializedData);
            this.state.serializeToStream(outputSerializedData);
            this.user_state.serializeToStream(outputSerializedData);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.gift = StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.state = StarGiftAuctionState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.user_state = TL_StarGiftAuctionUserState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        public static TL_StarGiftActiveAuctionState TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_StarGiftActiveAuctionState) TLObject.TLdeserialize(TL_StarGiftActiveAuctionState.class, -753154979 != i ? null : new TL_StarGiftActiveAuctionState(), inputSerializedData, i, z);
        }
    }

    public static abstract class InputStarGiftAuction extends TLObject {
        private static InputStarGiftAuction fromConstructor(int i) {
            if (i == 48327832) {
                return new TL_inputStarGiftAuction();
            }
            if (i != 2058715912) {
                return null;
            }
            return new TL_inputStarGiftAuctionSlug();
        }

        public static InputStarGiftAuction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (InputStarGiftAuction) TLObject.TLdeserialize(InputStarGiftAuction.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_inputStarGiftAuction extends InputStarGiftAuction {
        public static final int constructor = 48327832;
        public long gift_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(48327832);
            outputSerializedData.writeInt64(this.gift_id);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.gift_id = inputSerializedData.readInt64(z);
        }
    }

    public static class TL_inputStarGiftAuctionSlug extends InputStarGiftAuction {
        public static final int constructor = 2058715912;
        public String slug;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2058715912);
            outputSerializedData.writeString(this.slug);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.slug = inputSerializedData.readString(z);
        }
    }

    public static class TL_AuctionBidLevel extends TLObject {
        public static final int constructor = 822231244;
        public long amount;
        public int date;
        public int pos;

        public static TL_AuctionBidLevel TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_AuctionBidLevel) TLObject.TLdeserialize(TL_AuctionBidLevel.class, 822231244 != i ? null : new TL_AuctionBidLevel(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(822231244);
            outputSerializedData.writeInt32(this.pos);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.date);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.pos = inputSerializedData.readInt32(z);
            this.amount = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
        }
    }

    public static class TL_starGiftBackground extends TLObject {
        public static final int constructor = -1342872680;
        public int center_color;
        public int edge_color;
        public int text_color;

        public static TL_starGiftBackground TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_starGiftBackground) TLObject.TLdeserialize(TL_starGiftBackground.class, -1342872680 != i ? null : new TL_starGiftBackground(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1342872680);
            outputSerializedData.writeInt32(this.center_color);
            outputSerializedData.writeInt32(this.edge_color);
            outputSerializedData.writeInt32(this.text_color);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.center_color = inputSerializedData.readInt32(z);
            this.edge_color = inputSerializedData.readInt32(z);
            this.text_color = inputSerializedData.readInt32(z);
        }
    }

    public static class starGiftUpgradeAttributes extends TLObject {
        public static final int constructor = 1187439471;
        public ArrayList<StarGiftAttribute> attributes = new ArrayList<>();

        public static starGiftUpgradeAttributes TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (starGiftUpgradeAttributes) TLObject.TLdeserialize(starGiftUpgradeAttributes.class, 1187439471 != i ? null : new starGiftUpgradeAttributes(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1187439471);
            Vector.serialize(outputSerializedData, this.attributes);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.attributes = Vector.deserialize(inputSerializedData, (Vector.TLDeserializer) new TL_stars$TL_starGiftUnique$$ExternalSyntheticLambda0(), false);
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
        public starGiftUpgradeAttributes deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return starGiftUpgradeAttributes.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
