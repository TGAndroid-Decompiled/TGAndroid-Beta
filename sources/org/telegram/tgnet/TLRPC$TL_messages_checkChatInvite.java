package org.telegram.tgnet;

public class TLRPC$TL_messages_checkChatInvite extends TLObject {
    public String hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$ChatInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1051570619);
        abstractSerializedData.writeString(this.hash);
    }
}
