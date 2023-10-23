package org.telegram.tgnet;
public class TLRPC$TL_messages_getPinnedDialogs extends TLObject {
    public int folder_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_peerDialogs.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-692498958);
        abstractSerializedData.writeInt32(this.folder_id);
    }
}
