package org.telegram.tgnet;
public class TLRPC$TL_readParticipantDate extends TLObject {
    public static int constructor = 1246753138;
    public int date;
    public long user_id;

    public static TLRPC$TL_readParticipantDate TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_readParticipantDate", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_readParticipantDate tLRPC$TL_readParticipantDate = new TLRPC$TL_readParticipantDate();
        tLRPC$TL_readParticipantDate.readParams(abstractSerializedData, z);
        return tLRPC$TL_readParticipantDate;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.date);
    }
}
