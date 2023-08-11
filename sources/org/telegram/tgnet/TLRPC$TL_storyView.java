package org.telegram.tgnet;
public class TLRPC$TL_storyView extends TLObject {
    public static int constructor = -1329730875;
    public boolean blocked;
    public boolean blocked_my_stories_from;
    public int date;
    public int flags;
    public TLRPC$Reaction reaction;
    public long user_id;

    public static TLRPC$TL_storyView TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_storyView", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_storyView tLRPC$TL_storyView = new TLRPC$TL_storyView();
        tLRPC$TL_storyView.readParams(abstractSerializedData, z);
        return tLRPC$TL_storyView;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.blocked = (readInt32 & 1) != 0;
        this.blocked_my_stories_from = (readInt32 & 2) != 0;
        this.user_id = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.reaction = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.blocked ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.blocked_my_stories_from ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 4) != 0) {
            this.reaction.serializeToStream(abstractSerializedData);
        }
    }
}
