package org.telegram.tgnet;

public class TLRPC$TL_inputQuickReplyShortcutId extends TLRPC$InputQuickReplyShortcut {
    public int shortcut_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(18418929);
        abstractSerializedData.writeInt32(this.shortcut_id);
    }
}
