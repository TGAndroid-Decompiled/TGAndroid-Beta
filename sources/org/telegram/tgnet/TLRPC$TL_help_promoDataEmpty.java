package org.telegram.tgnet;
public class TLRPC$TL_help_promoDataEmpty extends TLRPC$help_PromoData {
    public static int constructor = -1728664459;
    public int expires;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.expires = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.expires);
    }
}
