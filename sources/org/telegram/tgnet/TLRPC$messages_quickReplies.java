package org.telegram.tgnet;

public abstract class TLRPC$messages_quickReplies extends TLObject {
    public static TLRPC$messages_quickReplies TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_quickReplies tLRPC$TL_messages_quickReplies = i != -963811691 ? i != 1603398491 ? null : new TLRPC$messages_quickReplies() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1603398491);
            }
        } : new TLRPC$TL_messages_quickReplies();
        if (tLRPC$TL_messages_quickReplies == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_quickReplies", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_quickReplies != null) {
            tLRPC$TL_messages_quickReplies.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_quickReplies;
    }
}
