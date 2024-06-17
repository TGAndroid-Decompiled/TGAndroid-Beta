package org.telegram.tgnet;

public class TLRPC$TL_messages_deleteQuickReplyShortcut extends TLObject {
    public int shortcut_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1019234112);
        abstractSerializedData.writeInt32(this.shortcut_id);
    }
}
