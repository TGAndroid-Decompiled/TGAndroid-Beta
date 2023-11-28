package org.telegram.tgnet;
public class TLRPC$TL_updateChannelViewForumAsMessages extends TLRPC$Update {
    public long channel_id;
    public boolean enabled;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
        this.enabled = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(129403168);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeBool(this.enabled);
    }
}
