package org.telegram.tgnet;

public class TLRPC$TL_businessIntro extends TLObject {
    public static int constructor = 1510606445;
    public String description;
    public int flags;
    public TLRPC$Document sticker;
    public String title;

    public static TLRPC$TL_businessIntro TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != constructor) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessIntro", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessIntro tLRPC$TL_businessIntro = new TLRPC$TL_businessIntro();
        tLRPC$TL_businessIntro.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessIntro;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
        this.description = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.sticker = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.description);
        if ((this.flags & 1) != 0) {
            this.sticker.serializeToStream(abstractSerializedData);
        }
    }
}
