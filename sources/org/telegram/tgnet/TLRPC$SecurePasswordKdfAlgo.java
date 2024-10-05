package org.telegram.tgnet;

public abstract class TLRPC$SecurePasswordKdfAlgo extends TLObject {
    public static TLRPC$SecurePasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePasswordKdfAlgo tLRPC$TL_securePasswordKdfAlgoUnknown = i != -2042159726 ? i != -1141711456 ? i != 4883767 ? null : new TLRPC$TL_securePasswordKdfAlgoUnknown() : new TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000() : new TLRPC$TL_securePasswordKdfAlgoSHA512();
        if (tLRPC$TL_securePasswordKdfAlgoUnknown == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecurePasswordKdfAlgo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_securePasswordKdfAlgoUnknown != null) {
            tLRPC$TL_securePasswordKdfAlgoUnknown.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_securePasswordKdfAlgoUnknown;
    }
}
