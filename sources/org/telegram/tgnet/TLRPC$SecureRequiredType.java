package org.telegram.tgnet;

public abstract class TLRPC$SecureRequiredType extends TLObject {
    public static TLRPC$SecureRequiredType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureRequiredType tLRPC$TL_secureRequiredType;
        if (i == -2103600678) {
            tLRPC$TL_secureRequiredType = new TLRPC$TL_secureRequiredType();
        } else {
            tLRPC$TL_secureRequiredType = i != 41187252 ? null : new TLRPC$TL_secureRequiredTypeOneOf();
        }
        if (tLRPC$TL_secureRequiredType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecureRequiredType", Integer.valueOf(i)));
        }
        if (tLRPC$TL_secureRequiredType != null) {
            tLRPC$TL_secureRequiredType.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_secureRequiredType;
    }
}
