package org.telegram.tgnet;
public class TLRPC$TL_reactionEmpty extends TLRPC$Reaction {
    public static int constructor = 2046153753;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
