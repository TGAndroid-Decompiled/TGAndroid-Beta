package org.telegram.tgnet;

public class TLRPC$TL_messages_initHistoryImport extends TLObject {
    public static int constructor = 873008187;
    public TLRPC$InputFile file;
    public int media_count;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_historyImport.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        this.file.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.media_count);
    }
}
