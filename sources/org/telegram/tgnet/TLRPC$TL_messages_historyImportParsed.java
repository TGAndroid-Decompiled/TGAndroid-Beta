package org.telegram.tgnet;

public class TLRPC$TL_messages_historyImportParsed extends TLObject {
    public int flags;
    public boolean group;
    public boolean pm;
    public String title;

    public static TLRPC$TL_messages_historyImportParsed TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1578088377 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_historyImportParsed", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_historyImportParsed tLRPC$TL_messages_historyImportParsed = new TLRPC$TL_messages_historyImportParsed();
        tLRPC$TL_messages_historyImportParsed.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_historyImportParsed;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pm = (readInt32 & 1) != 0;
        this.group = (readInt32 & 2) != 0;
        if ((readInt32 & 4) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1578088377);
        int i = this.pm ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.group ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.title);
        }
    }
}
