package org.telegram.tgnet;

public class TLRPC$TL_messageActionSetMessagesTTL extends TLRPC$MessageAction {
    public static int constructor = 1007897979;
    public long auto_setting_from;
    public int period;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.period = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.auto_setting_from = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.period);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.auto_setting_from);
        }
    }
}
