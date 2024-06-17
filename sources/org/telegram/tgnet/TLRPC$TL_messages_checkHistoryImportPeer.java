package org.telegram.tgnet;

public class TLRPC$TL_messages_checkHistoryImportPeer extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_checkedHistoryImportPeer.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1573261059);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
