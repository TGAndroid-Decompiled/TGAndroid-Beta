package org.telegram.tgnet;
public class TLRPC$TL_messages_getExportedChatInvite extends TLObject {
    public String link;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_ExportedChatInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1937010524);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.link);
    }
}
