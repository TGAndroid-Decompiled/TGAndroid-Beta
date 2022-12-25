package org.telegram.tgnet;

public class TLRPC$TL_messages_historyImport extends TLObject {
    public static int constructor = 375566091;
    public long f944id;

    public static TLRPC$TL_messages_historyImport TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_historyImport", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_historyImport tLRPC$TL_messages_historyImport = new TLRPC$TL_messages_historyImport();
        tLRPC$TL_messages_historyImport.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_historyImport;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f944id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f944id);
    }
}
