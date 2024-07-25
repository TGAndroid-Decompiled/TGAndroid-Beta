package org.telegram.tgnet;
public class TLRPC$TL_messageActionSetChatTheme extends TLRPC$MessageAction {
    public String emoticon;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1434950843);
        abstractSerializedData.writeString(this.emoticon);
    }
}
