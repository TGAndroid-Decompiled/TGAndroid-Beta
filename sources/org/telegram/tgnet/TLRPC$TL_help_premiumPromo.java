package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_help_premiumPromo extends TLObject {
    public static int constructor = -533328101;
    public String currency;
    public long monthly_amount;
    public String status_text;
    public ArrayList<TLRPC$MessageEntity> status_entities = new ArrayList<>();
    public ArrayList<String> video_sections = new ArrayList<>();
    public ArrayList<TLRPC$Document> videos = new ArrayList<>();

    public static TLRPC$TL_help_premiumPromo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo = new TLRPC$TL_help_premiumPromo();
            tLRPC$TL_help_premiumPromo.readParams(abstractSerializedData, z);
            return tLRPC$TL_help_premiumPromo;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_help_premiumPromo", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.status_text = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 == 481674261) {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize != null) {
                    this.status_entities.add(TLdeserialize);
                } else {
                    return;
                }
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 == 481674261) {
                int readInt324 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt324; i2++) {
                    this.video_sections.add(abstractSerializedData.readString(z));
                }
                int readInt325 = abstractSerializedData.readInt32(z);
                if (readInt325 == 481674261) {
                    int readInt326 = abstractSerializedData.readInt32(z);
                    for (int i3 = 0; i3 < readInt326; i3++) {
                        TLRPC$Document TLdeserialize2 = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                        if (TLdeserialize2 != null) {
                            this.videos.add(TLdeserialize2);
                        } else {
                            return;
                        }
                    }
                    this.currency = abstractSerializedData.readString(z);
                    this.monthly_amount = abstractSerializedData.readInt64(z);
                } else if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.status_text);
        abstractSerializedData.writeInt32(481674261);
        int size = this.status_entities.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.status_entities.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.video_sections.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeString(this.video_sections.get(i2));
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.videos.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.videos.get(i3).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.monthly_amount);
    }
}
