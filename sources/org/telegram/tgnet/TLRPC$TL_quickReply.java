package org.telegram.tgnet;

public class TLRPC$TL_quickReply extends TLObject {
    public int count;
    public String shortcut;
    public int shortcut_id;
    public int top_message;

    public static TLRPC$TL_quickReply TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 110563371) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_quickReply", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_quickReply tLRPC$TL_quickReply = new TLRPC$TL_quickReply();
        tLRPC$TL_quickReply.readParams(abstractSerializedData, z);
        return tLRPC$TL_quickReply;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut_id = abstractSerializedData.readInt32(z);
        this.shortcut = abstractSerializedData.readString(z);
        this.top_message = abstractSerializedData.readInt32(z);
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(110563371);
        abstractSerializedData.writeInt32(this.shortcut_id);
        abstractSerializedData.writeString(this.shortcut);
        abstractSerializedData.writeInt32(this.top_message);
        abstractSerializedData.writeInt32(this.count);
    }
}
