package org.telegram.tgnet;

public class TLRPC$TL_messages_stickerSet extends TLRPC$messages_StickerSet {
    @Override
    public void readParams(org.telegram.tgnet.AbstractSerializedData r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.TLRPC$TL_messages_stickerSet.readParams(org.telegram.tgnet.AbstractSerializedData, boolean):void");
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1846886166);
        this.set.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.packs.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.packs.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.keywords.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.keywords.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.documents.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.documents.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
