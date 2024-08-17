package org.telegram.tgnet;

public class TLRPC$TL_messages_startHistoryImport extends TLObject {
    public long import_id;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1271008444);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.import_id);
    }
}
