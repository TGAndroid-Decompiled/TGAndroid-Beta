package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionChangeAvailableReactions extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = -1102180616;
    public TLRPC$ChatReactions new_value;
    public TLRPC$ChatReactions prev_value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_value = TLRPC$ChatReactions.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_value = TLRPC$ChatReactions.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.prev_value.serializeToStream(abstractSerializedData);
        this.new_value.serializeToStream(abstractSerializedData);
    }
}
