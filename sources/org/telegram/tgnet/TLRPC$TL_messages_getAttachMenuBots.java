package org.telegram.tgnet;
public class TLRPC$TL_messages_getAttachMenuBots extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$AttachMenuBots.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(385663691);
        abstractSerializedData.writeInt64(this.hash);
    }
}
