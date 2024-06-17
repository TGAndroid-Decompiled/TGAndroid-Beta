package org.telegram.tgnet;

public class TLRPC$TL_savedReactionTag extends TLObject {
    public int count;
    public int flags;
    public TLRPC$Reaction reaction;
    public String title;

    public static TLRPC$TL_savedReactionTag TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-881854424 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_savedReactionTag", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag = new TLRPC$TL_savedReactionTag();
        tLRPC$TL_savedReactionTag.readParams(abstractSerializedData, z);
        return tLRPC$TL_savedReactionTag;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.reaction = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-881854424);
        abstractSerializedData.writeInt32(this.flags);
        this.reaction.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        abstractSerializedData.writeInt32(this.count);
    }
}
