package org.telegram.tgnet;

public class TLRPC$TL_help_getRecentMeUrls extends TLObject {
    public String referer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_help_recentMeUrls.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1036054804);
        abstractSerializedData.writeString(this.referer);
    }
}
