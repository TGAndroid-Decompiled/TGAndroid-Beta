package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_updateMessageExtendedMedia extends TLRPC$Update {
    public ArrayList<TLRPC$MessageExtendedMedia> extended_media = new ArrayList<>();
    public int msg_id;
    public TLRPC$Peer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.msg_id = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$MessageExtendedMedia TLdeserialize = TLRPC$MessageExtendedMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.extended_media.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-710666460);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.extended_media.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.extended_media.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
