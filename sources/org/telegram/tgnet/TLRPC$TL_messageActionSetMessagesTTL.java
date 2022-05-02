package org.telegram.tgnet;

public class TLRPC$TL_messageActionSetMessagesTTL extends TLRPC$MessageAction {
    public static int constructor = -1441072131;
    public int period;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.period);
    }
}
