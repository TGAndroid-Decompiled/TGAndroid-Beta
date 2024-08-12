package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionToggleSignatureProfiles extends TLRPC$ChannelAdminLogEventAction {
    public boolean value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.value = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1621597305);
        abstractSerializedData.writeBool(this.value);
    }
}
