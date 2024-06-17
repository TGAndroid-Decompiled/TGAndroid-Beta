package org.telegram.tgnet;

public class TLRPC$TL_inputQuickReplyShortcut extends TLRPC$InputQuickReplyShortcut {
    public String shortcut;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.shortcut = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(609840449);
        abstractSerializedData.writeString(this.shortcut);
    }
}
