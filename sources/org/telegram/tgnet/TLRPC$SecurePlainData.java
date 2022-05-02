package org.telegram.tgnet;

public abstract class TLRPC$SecurePlainData extends TLObject {
    public static TLRPC$SecurePlainData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePlainData tLRPC$SecurePlainData;
        if (i != 569137759) {
            tLRPC$SecurePlainData = i != 2103482845 ? null : new TLRPC$TL_securePlainPhone();
        } else {
            tLRPC$SecurePlainData = new TLRPC$TL_securePlainEmail();
        }
        if (tLRPC$SecurePlainData != null || !z) {
            if (tLRPC$SecurePlainData != null) {
                tLRPC$SecurePlainData.readParams(abstractSerializedData, z);
            }
            return tLRPC$SecurePlainData;
        }
        throw new RuntimeException(String.format("can't parse magic %x in SecurePlainData", Integer.valueOf(i)));
    }
}
