package org.telegram.tgnet;

public class TLRPC$TL_messages_getEmojiURL extends TLObject {
    public String lang_code;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_emojiURL.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-709817306);
        abstractSerializedData.writeString(this.lang_code);
    }
}
