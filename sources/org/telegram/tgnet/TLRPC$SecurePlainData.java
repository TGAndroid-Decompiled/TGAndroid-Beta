package org.telegram.tgnet;

public abstract class TLRPC$SecurePlainData extends TLObject {
    public static TLRPC$SecurePlainData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePlainData tLRPC$TL_securePlainPhone = i != 569137759 ? i != 2103482845 ? null : new TLRPC$TL_securePlainPhone() : new TLRPC$TL_securePlainEmail();
        if (tLRPC$TL_securePlainPhone == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecurePlainData", Integer.valueOf(i)));
        }
        if (tLRPC$TL_securePlainPhone != null) {
            tLRPC$TL_securePlainPhone.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_securePlainPhone;
    }
}
