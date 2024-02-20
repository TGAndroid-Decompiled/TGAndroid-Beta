package org.telegram.tgnet;
public abstract class TLRPC$auth_Authorization extends TLObject {
    public static TLRPC$auth_Authorization TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_Authorization tLRPC$TL_auth_authorization;
        if (i == 782418132) {
            tLRPC$TL_auth_authorization = new TLRPC$TL_auth_authorization();
        } else if (i != 872119224) {
            tLRPC$TL_auth_authorization = i != 1148485274 ? null : new TLRPC$TL_auth_authorizationSignUpRequired();
        } else {
            tLRPC$TL_auth_authorization = new TLRPC$TL_auth_authorization();
        }
        if (tLRPC$TL_auth_authorization == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_Authorization", Integer.valueOf(i)));
        }
        if (tLRPC$TL_auth_authorization != null) {
            tLRPC$TL_auth_authorization.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_auth_authorization;
    }
}
