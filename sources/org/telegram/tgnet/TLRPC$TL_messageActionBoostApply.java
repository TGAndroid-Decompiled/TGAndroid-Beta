package org.telegram.tgnet;

public class TLRPC$TL_messageActionBoostApply extends TLRPC$MessageAction {
    public int boosts;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.boosts = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-872240531);
        abstractSerializedData.writeInt32(this.boosts);
    }
}
