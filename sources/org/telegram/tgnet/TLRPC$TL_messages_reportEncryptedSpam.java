package org.telegram.tgnet;
public class TLRPC$TL_messages_reportEncryptedSpam extends TLObject {
    public TLRPC$TL_inputEncryptedChat peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1259113487);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
