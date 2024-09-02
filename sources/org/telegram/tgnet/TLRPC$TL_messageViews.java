package org.telegram.tgnet;

public class TLRPC$TL_messageViews extends TLObject {
    public int flags;
    public int forwards;
    public TLRPC$MessageReplies replies;
    public int views;

    public static TLRPC$TL_messageViews TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1163625789 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messageViews", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messageViews tLRPC$TL_messageViews = new TLRPC$TL_messageViews();
        tLRPC$TL_messageViews.readParams(abstractSerializedData, z);
        return tLRPC$TL_messageViews;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.views = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.forwards = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.replies = TLRPC$MessageReplies.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1163625789);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.views);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.forwards);
        }
        if ((this.flags & 4) != 0) {
            this.replies.serializeToStream(abstractSerializedData);
        }
    }
}
