package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_textWithEntities extends TLObject {
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public String text;

    public static TLRPC$TL_textWithEntities TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1964978502 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_textWithEntities", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
        tLRPC$TL_textWithEntities.readParams(abstractSerializedData, z);
        return tLRPC$TL_textWithEntities;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
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

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1964978502);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeInt32(481674261);
        int size = this.entities.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.entities.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
