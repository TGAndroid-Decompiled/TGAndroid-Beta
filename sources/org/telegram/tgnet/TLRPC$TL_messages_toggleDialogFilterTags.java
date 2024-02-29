package org.telegram.tgnet;
public class TLRPC$TL_messages_toggleDialogFilterTags extends TLObject {
    public boolean enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-47326647);
        abstractSerializedData.writeBool(this.enabled);
    }
}
