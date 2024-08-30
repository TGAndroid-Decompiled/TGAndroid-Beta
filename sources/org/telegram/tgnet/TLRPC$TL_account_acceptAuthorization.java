package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_account_acceptAuthorization extends TLObject {
    public long bot_id;
    public TLRPC$TL_secureCredentialsEncrypted credentials;
    public String public_key;
    public String scope;
    public ArrayList value_hashes = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-202552205);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.scope);
        abstractSerializedData.writeString(this.public_key);
        abstractSerializedData.writeInt32(481674261);
        int size = this.value_hashes.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$TL_secureValueHash) this.value_hashes.get(i)).serializeToStream(abstractSerializedData);
        }
        this.credentials.serializeToStream(abstractSerializedData);
    }
}
