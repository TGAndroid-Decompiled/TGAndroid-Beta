package org.telegram.tgnet;
public class TLRPC$TL_messageActionRequestedPeer extends TLRPC$MessageAction {
    public static int constructor = -25742243;
    public int button_id;
    public TLRPC$Peer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.button_id = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.button_id);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
