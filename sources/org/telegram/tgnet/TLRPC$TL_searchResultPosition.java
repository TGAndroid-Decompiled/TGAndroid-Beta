package org.telegram.tgnet;

public class TLRPC$TL_searchResultPosition extends TLObject {
    public int date;
    public int msg_id;
    public int offset;

    public static TLRPC$TL_searchResultPosition TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (2137295719 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_searchResultPosition", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_searchResultPosition tLRPC$TL_searchResultPosition = new TLRPC$TL_searchResultPosition();
        tLRPC$TL_searchResultPosition.readParams(abstractSerializedData, z);
        return tLRPC$TL_searchResultPosition;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.msg_id = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.offset = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2137295719);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.offset);
    }
}
