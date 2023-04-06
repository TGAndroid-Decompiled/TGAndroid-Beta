package org.telegram.tgnet;
public class TLRPC$TL_messageActionSuggestProfilePhoto extends TLRPC$MessageAction {
    public static int constructor = 1474192222;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.photo.serializeToStream(abstractSerializedData);
    }
}
