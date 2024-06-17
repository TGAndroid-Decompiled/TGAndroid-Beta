package org.telegram.tgnet;

public class TLRPC$TL_messages_uploadImportedMedia extends TLObject {
    public String file_name;
    public long import_id;
    public TLRPC$InputMedia media;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(713433234);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.import_id);
        abstractSerializedData.writeString(this.file_name);
        this.media.serializeToStream(abstractSerializedData);
    }
}
