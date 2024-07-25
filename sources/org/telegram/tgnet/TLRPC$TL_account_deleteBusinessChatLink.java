package org.telegram.tgnet;
public class TLRPC$TL_account_deleteBusinessChatLink extends TLObject {
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1611085428);
        abstractSerializedData.writeString(this.slug);
    }
}
