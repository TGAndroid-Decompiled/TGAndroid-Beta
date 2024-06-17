package org.telegram.tgnet;

public class TLRPC$TL_phone_exportedGroupCallInvite extends TLObject {
    public String link;

    public static TLRPC$TL_phone_exportedGroupCallInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (541839704 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_phone_exportedGroupCallInvite", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_phone_exportedGroupCallInvite tLRPC$TL_phone_exportedGroupCallInvite = new TLRPC$TL_phone_exportedGroupCallInvite();
        tLRPC$TL_phone_exportedGroupCallInvite.readParams(abstractSerializedData, z);
        return tLRPC$TL_phone_exportedGroupCallInvite;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.link = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(541839704);
        abstractSerializedData.writeString(this.link);
    }
}
