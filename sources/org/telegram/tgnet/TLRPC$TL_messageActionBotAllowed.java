package org.telegram.tgnet;

public class TLRPC$TL_messageActionBotAllowed extends TLRPC$MessageAction {
    public static int constructor = -1410748418;
    public String domain;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.domain = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.domain);
    }
}
