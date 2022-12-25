package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_help_appUpdate extends TLRPC$help_AppUpdate {
    public static int constructor = -860107216;
    public boolean can_not_skip;
    public TLRPC$Document document;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public int f914id;
    public TLRPC$Document sticker;
    public String text;
    public String url;
    public String version;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_not_skip = (readInt32 & 1) != 0;
        this.f914id = abstractSerializedData.readInt32(z);
        this.version = abstractSerializedData.readString(z);
        this.text = abstractSerializedData.readString(z);
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
        if ((this.flags & 2) != 0) {
            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.url = abstractSerializedData.readString(z);
        }
        if ((this.flags & 8) != 0) {
            this.sticker = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_not_skip ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.f914id);
        abstractSerializedData.writeString(this.version);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeInt32(481674261);
        int size = this.entities.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.entities.get(i2).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.url);
        }
        if ((this.flags & 8) != 0) {
            this.sticker.serializeToStream(abstractSerializedData);
        }
    }
}
