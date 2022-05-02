package org.telegram.tgnet;

public class TLRPC$TL_reactionCount extends TLObject {
    public static int constructor = 1873957073;
    public boolean chosen;
    public int count;
    public int flags;
    public String reaction;

    public static TLRPC$TL_reactionCount TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_reactionCount tLRPC$TL_reactionCount = new TLRPC$TL_reactionCount();
            tLRPC$TL_reactionCount.readParams(abstractSerializedData, z);
            return tLRPC$TL_reactionCount;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_reactionCount", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.chosen = z2;
        this.reaction = abstractSerializedData.readString(z);
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.chosen ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeString(this.reaction);
        abstractSerializedData.writeInt32(this.count);
    }
}
