package org.telegram.tgnet;

public class TLRPC$TL_missingInvitee extends TLObject {
    public int flags;
    public boolean premium_required_for_pm;
    public boolean premium_would_allow_invite;
    public long user_id;

    public static TLRPC$TL_missingInvitee TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 1653379620) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_missingInvitee", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_missingInvitee tLRPC$TL_missingInvitee = new TLRPC$TL_missingInvitee();
        tLRPC$TL_missingInvitee.readParams(abstractSerializedData, z);
        return tLRPC$TL_missingInvitee;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.premium_would_allow_invite = (readInt32 & 1) != 0;
        this.premium_required_for_pm = (readInt32 & 2) != 0;
        this.user_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1653379620);
        int i = this.premium_would_allow_invite ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.premium_required_for_pm ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.user_id);
    }
}
