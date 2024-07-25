package org.telegram.tgnet;
public abstract class TLRPC$SecurePlainData extends TLObject {
    public static TLRPC$SecurePlainData TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePlainData tLRPC$TL_securePlainEmail;
        if (i == 569137759) {
            tLRPC$TL_securePlainEmail = new TLRPC$TL_securePlainEmail();
        } else {
            tLRPC$TL_securePlainEmail = i != 2103482845 ? null : new TLRPC$TL_securePlainPhone();
        }
        if (tLRPC$TL_securePlainEmail == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecurePlainData", Integer.valueOf(i)));
        }
        if (tLRPC$TL_securePlainEmail != null) {
            tLRPC$TL_securePlainEmail.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_securePlainEmail;
    }
}
