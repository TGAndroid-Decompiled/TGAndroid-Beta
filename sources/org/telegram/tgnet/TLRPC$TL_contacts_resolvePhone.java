package org.telegram.tgnet;
public class TLRPC$TL_contacts_resolvePhone extends TLObject {
    public static int constructor = -1963375804;
    public String phone;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_contacts_resolvedPeer.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone);
    }
}
