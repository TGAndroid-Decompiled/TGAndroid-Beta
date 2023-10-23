package org.telegram.tgnet;
public class TLRPC$TL_messages_editChatAbout extends TLObject {
    public String about;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-554301545);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.about);
    }
}
