package org.telegram.tgnet;
public class TLRPC$TL_contacts_resolveUsername extends TLObject {
    public String username;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_contacts_resolvedPeer.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-113456221);
        abstractSerializedData.writeString(this.username);
    }
}
