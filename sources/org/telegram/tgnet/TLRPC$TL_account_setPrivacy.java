package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_account_setPrivacy extends TLObject {
    public TLRPC$InputPrivacyKey key;
    public ArrayList<TLRPC$InputPrivacyRule> rules = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_privacyRules.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-906486552);
        this.key.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.rules.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.rules.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
