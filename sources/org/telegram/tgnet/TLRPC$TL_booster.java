package org.telegram.tgnet;
public class TLRPC$TL_booster extends TLObject {
    public static int constructor = 245261184;
    public int expires;
    public long user_id;

    public static TLRPC$TL_booster TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_booster", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_booster tLRPC$TL_booster = new TLRPC$TL_booster();
        tLRPC$TL_booster.readParams(abstractSerializedData, z);
        return tLRPC$TL_booster;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.expires = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.expires);
    }
}
