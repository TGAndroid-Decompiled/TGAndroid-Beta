package org.telegram.tgnet;
public class TLRPC$TL_messages_setEncryptedTyping extends TLObject {
    public TLRPC$TL_inputEncryptedChat peer;
    public boolean typing;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2031374829);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.typing);
    }
}
