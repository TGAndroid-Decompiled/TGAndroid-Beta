package org.telegram.tgnet;
public class TLRPC$TL_account_resolveBusinessChatLink extends TLObject {
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_resolvedBusinessChatLinks.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1418913262);
        abstractSerializedData.writeString(this.slug);
    }
}
