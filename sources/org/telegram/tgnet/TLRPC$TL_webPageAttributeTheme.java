package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_webPageAttributeTheme extends TLRPC$WebPageAttribute {
    public ArrayList documents = new ArrayList();
    public TLRPC$ThemeSettings settings;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.documents.add(TLdeserialize);
            }
        }
        if ((this.flags & 2) != 0) {
            this.settings = TLRPC$ThemeSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1421174295);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.documents.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                ((TLRPC$Document) this.documents.get(i)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2) != 0) {
            this.settings.serializeToStream(abstractSerializedData);
        }
    }
}
