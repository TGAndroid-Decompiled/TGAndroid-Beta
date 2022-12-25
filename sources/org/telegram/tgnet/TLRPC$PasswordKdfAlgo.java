package org.telegram.tgnet;

public abstract class TLRPC$PasswordKdfAlgo extends TLObject {
    public static TLRPC$PasswordKdfAlgo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PasswordKdfAlgo tLRPC$TL_passwordKdfAlgoUnknown;
        if (i == -732254058) {
            tLRPC$TL_passwordKdfAlgoUnknown = new TLRPC$TL_passwordKdfAlgoUnknown();
        } else {
            tLRPC$TL_passwordKdfAlgoUnknown = i != 982592842 ? null : new C1132x72c667f();
        }
        if (tLRPC$TL_passwordKdfAlgoUnknown == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PasswordKdfAlgo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_passwordKdfAlgoUnknown != null) {
            tLRPC$TL_passwordKdfAlgoUnknown.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_passwordKdfAlgoUnknown;
    }
}
