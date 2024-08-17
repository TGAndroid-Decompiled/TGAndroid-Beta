package org.telegram.tgnet;

public class TLRPC$TL_reactionPaid extends TLRPC$Reaction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1379771627);
    }
}
