package org.telegram.tgnet;
public class TLRPC$TL_account_setGlobalPrivacySettings extends TLObject {
    public TLRPC$TL_globalPrivacySettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_globalPrivacySettings.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(517647042);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
