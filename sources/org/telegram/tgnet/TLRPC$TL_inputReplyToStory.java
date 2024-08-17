package org.telegram.tgnet;

public class TLRPC$TL_inputReplyToStory extends TLRPC$InputReplyTo {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.story_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1484862010);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.story_id);
    }
}
