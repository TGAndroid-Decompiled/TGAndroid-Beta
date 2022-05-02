package org.telegram.tgnet;

public class TLRPC$TL_messageMediaDice extends TLRPC$MessageMedia {
    public static int constructor = 1065280907;
    public String emoticon;
    public int value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.value = abstractSerializedData.readInt32(z);
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.value);
        abstractSerializedData.writeString(this.emoticon);
    }
}
