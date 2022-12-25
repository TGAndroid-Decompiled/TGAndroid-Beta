package org.telegram.tgnet;

public class TLRPC$TL_messageMediaDocument extends TLRPC$MessageMedia {
    public static int constructor = -1666158377;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.nopremium = (readInt32 & 8) != 0;
        if ((readInt32 & 1) != 0) {
            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        } else {
            this.document = new TLRPC$TL_documentEmpty();
        }
        if ((this.flags & 4) != 0) {
            this.ttl_seconds = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.nopremium ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.document != null ? i | 1 : i & (-2);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 1) != 0) {
            this.document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.ttl_seconds);
        }
    }
}
