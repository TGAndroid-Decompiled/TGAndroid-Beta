package org.telegram.tgnet;

public abstract class TLRPC$PasswordKdfAlgo extends TLObject {
    public static TLRPC$PasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PasswordKdfAlgo tLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = i != -732254058 ? i != 982592842 ? null : new TLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow() : new TLRPC$TL_passwordKdfAlgoUnknown();
        if (tLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PasswordKdfAlgo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow != null) {
            tLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
    }
}
