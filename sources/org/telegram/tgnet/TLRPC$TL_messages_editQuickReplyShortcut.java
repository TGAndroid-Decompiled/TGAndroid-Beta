package org.telegram.tgnet;

public class TLRPC$TL_messages_editQuickReplyShortcut extends TLObject {
    public String shortcut;
    public int shortcut_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1543519471);
        abstractSerializedData.writeInt32(this.shortcut_id);
        abstractSerializedData.writeString(this.shortcut);
    }
}
