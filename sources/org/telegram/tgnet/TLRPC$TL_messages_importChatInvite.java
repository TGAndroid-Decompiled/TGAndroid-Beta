package org.telegram.tgnet;

public class TLRPC$TL_messages_importChatInvite extends TLObject {
    public String hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1817183516);
        abstractSerializedData.writeString(this.hash);
    }
}
