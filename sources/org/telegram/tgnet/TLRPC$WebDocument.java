package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$WebDocument extends TLObject {
    public long access_hash;
    public ArrayList attributes = new ArrayList();
    public String mime_type;
    public int size;
    public String url;

    public static TLRPC$WebDocument TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$WebDocument tLRPC$TL_webDocument = i != -971322408 ? i != -104284986 ? i != 475467473 ? null : new TLRPC$TL_webDocument() : new TLRPC$WebDocument() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.url = abstractSerializedData2.readString(z2);
                this.size = abstractSerializedData2.readInt32(z2);
                this.mime_type = abstractSerializedData2.readString(z2);
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                    return;
                }
                int readInt322 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt322; i2++) {
                    TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.attributes.add(TLdeserialize);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-104284986);
                abstractSerializedData2.writeString(this.url);
                abstractSerializedData2.writeInt32(this.size);
                abstractSerializedData2.writeString(this.mime_type);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.attributes.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    ((TLRPC$DocumentAttribute) this.attributes.get(i2)).serializeToStream(abstractSerializedData2);
                }
            }
        } : new TLRPC$TL_webDocument() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.url = abstractSerializedData2.readString(z2);
                this.access_hash = abstractSerializedData2.readInt64(z2);
                this.size = abstractSerializedData2.readInt32(z2);
                this.mime_type = abstractSerializedData2.readString(z2);
                int readInt32 = abstractSerializedData2.readInt32(z2);
                if (readInt32 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                    }
                    return;
                }
                int readInt322 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt322; i2++) {
                    TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.attributes.add(TLdeserialize);
                }
                abstractSerializedData2.readInt32(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-971322408);
                abstractSerializedData2.writeString(this.url);
                abstractSerializedData2.writeInt64(this.access_hash);
                abstractSerializedData2.writeInt32(this.size);
                abstractSerializedData2.writeString(this.mime_type);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.attributes.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    ((TLRPC$DocumentAttribute) this.attributes.get(i2)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(0);
            }
        };
        if (tLRPC$TL_webDocument == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in WebDocument", Integer.valueOf(i)));
        }
        if (tLRPC$TL_webDocument != null) {
            tLRPC$TL_webDocument.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_webDocument;
    }
}
