package org.telegram.tgnet;
public class TLRPC$TL_account_setReactionsNotifySettings extends TLObject {
    public TLRPC$TL_reactionsNotifySettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_reactionsNotifySettings.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(829220168);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
