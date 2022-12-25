package org.telegram.tgnet;

public class TLRPC$TL_chatInviteImporter extends TLObject {
    public static int constructor = -1940201511;
    public String about;
    public long approved_by;
    public int date;
    public int flags;
    public boolean requested;
    public long user_id;

    public static TLRPC$TL_chatInviteImporter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatInviteImporter", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter = new TLRPC$TL_chatInviteImporter();
        tLRPC$TL_chatInviteImporter.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatInviteImporter;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.requested = (readInt32 & 1) != 0;
        this.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.about = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.approved_by = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.requested ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.about);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt64(this.approved_by);
        }
    }
}
