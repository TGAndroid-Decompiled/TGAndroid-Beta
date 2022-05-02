package org.telegram.tgnet;

public class TLRPC$TL_statsGroupTopInviter extends TLObject {
    public static int constructor = 1398765469;
    public int invitations;
    public long user_id;

    public static TLRPC$TL_statsGroupTopInviter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_statsGroupTopInviter tLRPC$TL_statsGroupTopInviter = new TLRPC$TL_statsGroupTopInviter();
            tLRPC$TL_statsGroupTopInviter.readParams(abstractSerializedData, z);
            return tLRPC$TL_statsGroupTopInviter;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_statsGroupTopInviter", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.invitations = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.invitations);
    }
}
