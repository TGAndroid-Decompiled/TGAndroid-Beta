package org.telegram.tgnet;
public class TLRPC$TL_updateDeleteQuickReply extends TLRPC$Update {
    public int shortcut_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1407644140);
        abstractSerializedData.writeInt32(this.shortcut_id);
    }
}
