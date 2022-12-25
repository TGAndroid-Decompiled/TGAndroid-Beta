package org.telegram.tgnet;

public class TLRPC$TL_messages_affectedMessages extends TLObject {
    public static int constructor = -2066640507;
    public int pts;
    public int pts_count;

    public static TLRPC$TL_messages_affectedMessages TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_affectedMessages", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = new TLRPC$TL_messages_affectedMessages();
        tLRPC$TL_messages_affectedMessages.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_affectedMessages;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.pts = abstractSerializedData.readInt32(z);
        this.pts_count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.pts);
        abstractSerializedData.writeInt32(this.pts_count);
    }
}
