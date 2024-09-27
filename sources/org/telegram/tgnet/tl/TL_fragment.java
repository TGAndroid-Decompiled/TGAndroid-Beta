package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_fragment {

    public static class InputCollectible extends TLObject {
        public static InputCollectible TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            InputCollectible tL_inputCollectibleUsername = i != -1562241884 ? i != -476815191 ? null : new TL_inputCollectibleUsername() : new TL_inputCollectiblePhone();
            if (tL_inputCollectibleUsername == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in InputCollectible", Integer.valueOf(i)));
            }
            if (tL_inputCollectibleUsername != null) {
                tL_inputCollectibleUsername.readParams(abstractSerializedData, z);
            }
            return tL_inputCollectibleUsername;
        }
    }

    public static class TL_collectibleInfo extends TLObject {
        public static final int constructor = 1857945489;
        public long amount;
        public long crypto_amount;
        public String crypto_currency;
        public String currency;
        public int purchase_date;
        public String url;

        public static TL_collectibleInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (1857945489 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_collectibleInfo", Integer.valueOf(i)));
                }
                return null;
            }
            TL_collectibleInfo tL_collectibleInfo = new TL_collectibleInfo();
            tL_collectibleInfo.readParams(abstractSerializedData, z);
            return tL_collectibleInfo;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.purchase_date = abstractSerializedData.readInt32(z);
            this.currency = abstractSerializedData.readString(z);
            this.amount = abstractSerializedData.readInt64(z);
            this.crypto_currency = abstractSerializedData.readString(z);
            this.crypto_amount = abstractSerializedData.readInt64(z);
            this.url = abstractSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1857945489);
            abstractSerializedData.writeInt32(this.purchase_date);
            abstractSerializedData.writeString(this.currency);
            abstractSerializedData.writeInt64(this.amount);
            abstractSerializedData.writeString(this.crypto_currency);
            abstractSerializedData.writeInt64(this.crypto_amount);
            abstractSerializedData.writeString(this.url);
        }
    }

    public static class TL_getCollectibleInfo extends TLObject {
        public static final int constructor = -1105295942;
        public InputCollectible collectible;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TL_collectibleInfo.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1105295942);
            this.collectible.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_inputCollectiblePhone extends InputCollectible {
        public static final int constructor = -1562241884;
        public String phone;

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.phone = abstractSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1562241884);
            abstractSerializedData.writeString(this.phone);
        }
    }

    public static class TL_inputCollectibleUsername extends InputCollectible {
        public static final int constructor = -476815191;
        public String username;

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.username = abstractSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-476815191);
            abstractSerializedData.writeString(this.username);
        }
    }
}
