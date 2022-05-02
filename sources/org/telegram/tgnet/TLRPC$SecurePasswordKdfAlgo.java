package org.telegram.tgnet;

public abstract class TLRPC$SecurePasswordKdfAlgo extends TLObject {
    public static TLRPC$SecurePasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecurePasswordKdfAlgo tLRPC$SecurePasswordKdfAlgo;
        if (i == -2042159726) {
            tLRPC$SecurePasswordKdfAlgo = new TLRPC$TL_securePasswordKdfAlgoSHA512();
        } else if (i != -1141711456) {
            tLRPC$SecurePasswordKdfAlgo = i != 4883767 ? null : new TLRPC$TL_securePasswordKdfAlgoUnknown();
        } else {
            tLRPC$SecurePasswordKdfAlgo = new TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000();
        }
        if (tLRPC$SecurePasswordKdfAlgo != null || !z) {
            if (tLRPC$SecurePasswordKdfAlgo != null) {
                tLRPC$SecurePasswordKdfAlgo.readParams(abstractSerializedData, z);
            }
            return tLRPC$SecurePasswordKdfAlgo;
        }
        throw new RuntimeException(String.format("can't parse magic %x in SecurePasswordKdfAlgo", Integer.valueOf(i)));
    }
}
