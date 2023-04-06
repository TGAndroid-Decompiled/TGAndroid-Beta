package org.telegram.tgnet;
public class TLRPC$TL_account_savedRingtoneConverted extends TLRPC$account_SavedRingtone {
    public static int constructor = 523271863;
    public TLRPC$Document document;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.document.serializeToStream(abstractSerializedData);
    }
}
