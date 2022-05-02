package org.telegram.tgnet;

public abstract class TLRPC$PasswordKdfAlgo extends TLObject {
    public static TLRPC$PasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo;
        if (i != -732254058) {
            tLRPC$PasswordKdfAlgo = i != 982592842 ? null : new TLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow();
        } else {
            tLRPC$PasswordKdfAlgo = new TLRPC$TL_passwordKdfAlgoUnknown();
        }
        if (tLRPC$PasswordKdfAlgo != null || !z) {
            if (tLRPC$PasswordKdfAlgo != null) {
                tLRPC$PasswordKdfAlgo.readParams(abstractSerializedData, z);
            }
            return tLRPC$PasswordKdfAlgo;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PasswordKdfAlgo", Integer.valueOf(i)));
    }
}
