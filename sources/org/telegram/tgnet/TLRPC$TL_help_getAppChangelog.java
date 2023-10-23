package org.telegram.tgnet;
public class TLRPC$TL_help_getAppChangelog extends TLObject {
    public String prev_app_version;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1877938321);
        abstractSerializedData.writeString(this.prev_app_version);
    }
}
