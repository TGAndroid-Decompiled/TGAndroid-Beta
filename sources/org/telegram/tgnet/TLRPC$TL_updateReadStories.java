package org.telegram.tgnet;
public class TLRPC$TL_updateReadStories extends TLRPC$Update {
    public static int constructor = -21679014;
    public int max_id;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.max_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.max_id);
    }
}
