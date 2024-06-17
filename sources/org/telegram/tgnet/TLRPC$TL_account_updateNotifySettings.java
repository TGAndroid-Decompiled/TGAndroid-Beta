package org.telegram.tgnet;

public class TLRPC$TL_account_updateNotifySettings extends TLObject {
    public TLRPC$InputNotifyPeer peer;
    public TLRPC$TL_inputPeerNotifySettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2067899501);
        this.peer.serializeToStream(abstractSerializedData);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
