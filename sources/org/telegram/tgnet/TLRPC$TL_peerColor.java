package org.telegram.tgnet;
public class TLRPC$TL_peerColor extends TLObject {
    public long background_emoji_id;
    public int color;
    public int flags;

    public static TLRPC$TL_peerColor TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1253352753 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_peerColor", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_peerColor tLRPC$TL_peerColor = new TLRPC$TL_peerColor();
        tLRPC$TL_peerColor.readParams(abstractSerializedData, z);
        return tLRPC$TL_peerColor;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.color = (readInt32 & 1) != 0 ? abstractSerializedData.readInt32(z) : -1;
        if ((this.flags & 2) != 0) {
            this.background_emoji_id = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1253352753);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.color);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt64(this.background_emoji_id);
        }
    }
}
