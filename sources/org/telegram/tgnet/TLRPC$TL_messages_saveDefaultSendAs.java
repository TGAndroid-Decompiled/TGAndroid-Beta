package org.telegram.tgnet;

public class TLRPC$TL_messages_saveDefaultSendAs extends TLObject {
    public static int constructor = -855777386;
    public TLRPC$InputPeer peer;
    public TLRPC$InputPeer send_as;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        this.send_as.serializeToStream(abstractSerializedData);
    }
}
