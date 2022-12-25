package org.telegram.tgnet;

public class TLRPC$TL_chatReactionsNone extends TLRPC$ChatReactions {
    public static int constructor = -352570692;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
