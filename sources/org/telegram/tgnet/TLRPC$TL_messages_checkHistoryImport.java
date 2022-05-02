package org.telegram.tgnet;

public class TLRPC$TL_messages_checkHistoryImport extends TLObject {
    public static int constructor = 1140726259;
    public String import_head;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_historyImportParsed.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.import_head);
    }
}
