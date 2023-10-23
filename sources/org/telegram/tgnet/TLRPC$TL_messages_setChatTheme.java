package org.telegram.tgnet;
public class TLRPC$TL_messages_setChatTheme extends TLObject {
    public String emoticon;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-432283329);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.emoticon);
    }
}
