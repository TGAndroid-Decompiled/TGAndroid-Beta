package org.telegram.tgnet;
public class TLRPC$TL_help_getDeepLinkInfo extends TLObject {
    public static int constructor = 1072547679;
    public String path;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$help_DeepLinkInfo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.path);
    }
}
