package org.telegram.tgnet;

public class TLRPC$TL_reactionEmpty extends TLRPC$Reaction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2046153753);
    }
}
