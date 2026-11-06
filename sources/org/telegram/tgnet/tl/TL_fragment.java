package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_fragment {

    public static class InputCollectible extends TLObject {
        public static InputCollectible TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            TLObject tL_inputCollectiblePhone;
            if (i7 != -1562241884) {
                if (i7 != -476815191) {
                    tL_inputCollectiblePhone = null;
                } else {
                    tL_inputCollectiblePhone = new TL_inputCollectibleUsername();
                }
            } else {
                tL_inputCollectiblePhone = new TL_inputCollectiblePhone();
            }
            return (InputCollectible) TLObject.TLdeserialize(InputCollectible.class, tL_inputCollectiblePhone, inputSerializedData, i7, z9);
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

        public static TL_collectibleInfo TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            TL_collectibleInfo tL_collectibleInfo;
            if (1857945489 != i7) {
                tL_collectibleInfo = null;
            } else {
                tL_collectibleInfo = new TL_collectibleInfo();
            }
            return (TL_collectibleInfo) TLObject.TLdeserialize(TL_collectibleInfo.class, tL_collectibleInfo, inputSerializedData, i7, z9);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.purchase_date = inputSerializedData.readInt32(z9);
            this.currency = inputSerializedData.readString(z9);
            this.amount = inputSerializedData.readInt64(z9);
            this.crypto_currency = inputSerializedData.readString(z9);
            this.crypto_amount = inputSerializedData.readInt64(z9);
            this.url = inputSerializedData.readString(z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1857945489);
            outputSerializedData.writeInt32(this.purchase_date);
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeInt64(this.crypto_amount);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_getCollectibleInfo extends TLObject {
        public static final int constructor = -1105295942;
        public InputCollectible collectible;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return TL_collectibleInfo.TLdeserialize(inputSerializedData, i7, z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1105295942);
            this.collectible.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_inputCollectiblePhone extends InputCollectible {
        public static final int constructor = -1562241884;
        public String phone;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.phone = inputSerializedData.readString(z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1562241884);
            outputSerializedData.writeString(this.phone);
        }
    }

    public static class TL_inputCollectibleUsername extends InputCollectible {
        public static final int constructor = -476815191;
        public String username;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.username = inputSerializedData.readString(z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-476815191);
            outputSerializedData.writeString(this.username);
        }
    }
}
