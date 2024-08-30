package org.telegram.tgnet;

public abstract class TLRPC$auth_Authorization extends TLObject {
    public static TLRPC$auth_Authorization TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_Authorization tLRPC$TL_auth_authorizationSignUpRequired = i != 782418132 ? i != 872119224 ? i != 1148485274 ? null : new TLRPC$TL_auth_authorizationSignUpRequired() : new TLRPC$TL_auth_authorization() : new TLRPC$TL_auth_authorization();
        if (tLRPC$TL_auth_authorizationSignUpRequired == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_Authorization", Integer.valueOf(i)));
        }
        if (tLRPC$TL_auth_authorizationSignUpRequired != null) {
            tLRPC$TL_auth_authorizationSignUpRequired.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_auth_authorizationSignUpRequired;
    }
}
