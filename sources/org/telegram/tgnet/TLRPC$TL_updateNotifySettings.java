package org.telegram.tgnet;

public class TLRPC$TL_updateNotifySettings extends TLRPC$Update {
    public TLRPC$PeerNotifySettings notify_settings;
    public TLRPC$NotifyPeer peer;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$NotifyPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1094555409);
        this.peer.serializeToStream(abstractSerializedData);
        this.notify_settings.serializeToStream(abstractSerializedData);
    }
}
