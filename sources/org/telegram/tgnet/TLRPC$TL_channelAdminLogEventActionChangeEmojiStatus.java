package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionChangeEmojiStatus extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$EmojiStatus new_value;
    public TLRPC$EmojiStatus prev_value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_value = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_value = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1051328177);
        this.prev_value.serializeToStream(abstractSerializedData);
        this.new_value.serializeToStream(abstractSerializedData);
    }
}
