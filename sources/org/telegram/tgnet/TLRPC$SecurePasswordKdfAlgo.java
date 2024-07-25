package org.telegram.tgnet;
public abstract class TLRPC$SecurePasswordKdfAlgo extends TLObject {
    public static TLRPC$SecurePasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePasswordKdfAlgo tLRPC$TL_securePasswordKdfAlgoSHA512;
        if (i == -2042159726) {
            tLRPC$TL_securePasswordKdfAlgoSHA512 = new TLRPC$TL_securePasswordKdfAlgoSHA512();
        } else if (i == -1141711456) {
            tLRPC$TL_securePasswordKdfAlgoSHA512 = new TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000();
        } else {
            tLRPC$TL_securePasswordKdfAlgoSHA512 = i != 4883767 ? null : new TLRPC$TL_securePasswordKdfAlgoUnknown();
        }
        if (tLRPC$TL_securePasswordKdfAlgoSHA512 == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in SecurePasswordKdfAlgo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_securePasswordKdfAlgoSHA512 != null) {
            tLRPC$TL_securePasswordKdfAlgoSHA512.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_securePasswordKdfAlgoSHA512;
    }
}
