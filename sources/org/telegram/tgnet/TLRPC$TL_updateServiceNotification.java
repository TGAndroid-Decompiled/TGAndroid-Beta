package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_updateServiceNotification extends TLRPC$Update {
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public int inbox_date;
    public boolean invert_media;
    public TLRPC$MessageMedia media;
    public String message;
    public boolean popup;
    public String type;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.popup = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            this.inbox_date = abstractSerializedData.readInt32(z);
        }
        this.invert_media = (this.flags & 4) != 0;
        this.type = abstractSerializedData.readString(z);
        this.message = abstractSerializedData.readString(z);
        this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.entities.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-337352679);
        int i = this.popup ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.invert_media ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.inbox_date);
        }
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeString(this.message);
        this.media.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.entities.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.entities.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
