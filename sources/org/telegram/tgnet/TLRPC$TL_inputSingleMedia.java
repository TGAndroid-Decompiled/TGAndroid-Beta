package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_inputSingleMedia extends TLObject {
    public ArrayList entities = new ArrayList();
    public int flags;
    public TLRPC$InputMedia media;
    public String message;
    public long random_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.media = TLRPC$InputMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.random_id = abstractSerializedData.readInt64(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(482797855);
        abstractSerializedData.writeInt32(this.flags);
        this.media.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                ((TLRPC$MessageEntity) this.entities.get(i)).serializeToStream(abstractSerializedData);
            }
        }
    }
}
