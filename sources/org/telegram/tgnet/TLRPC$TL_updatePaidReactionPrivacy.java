package org.telegram.tgnet;

public class TLRPC$TL_updatePaidReactionPrivacy extends TLRPC$Update {
    public boolean isPrivate;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.isPrivate = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1372224236);
        abstractSerializedData.writeBool(this.isPrivate);
    }
}
