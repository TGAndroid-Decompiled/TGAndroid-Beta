package org.telegram.tgnet;

public class TLRPC$TL_messages_historyImportParsed extends TLObject {
    public static int constructor = 1578088377;
    public int flags;
    public boolean group;
    public boolean pm;
    public String title;

    public static TLRPC$TL_messages_historyImportParsed TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_messages_historyImportParsed tLRPC$TL_messages_historyImportParsed = new TLRPC$TL_messages_historyImportParsed();
            tLRPC$TL_messages_historyImportParsed.readParams(abstractSerializedData, z);
            return tLRPC$TL_messages_historyImportParsed;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_messages_historyImportParsed", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = false;
        this.pm = (readInt32 & 1) != 0;
        if ((readInt32 & 2) != 0) {
            z2 = true;
        }
        this.group = z2;
        if ((readInt32 & 4) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
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
