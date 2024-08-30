package org.telegram.tgnet;

public abstract class TLRPC$SecureRequiredType extends TLObject {
    public static TLRPC$SecureRequiredType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureRequiredType tLRPC$TL_secureRequiredTypeOneOf = i != -2103600678 ? i != 41187252 ? null : new TLRPC$TL_secureRequiredTypeOneOf() : new TLRPC$TL_secureRequiredType();
        if (tLRPC$TL_secureRequiredTypeOneOf == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecureRequiredType", Integer.valueOf(i)));
        }
        if (tLRPC$TL_secureRequiredTypeOneOf != null) {
            tLRPC$TL_secureRequiredTypeOneOf.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_secureRequiredTypeOneOf;
    }
}
