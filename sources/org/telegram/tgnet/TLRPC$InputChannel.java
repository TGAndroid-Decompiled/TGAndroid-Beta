package org.telegram.tgnet;
public abstract class TLRPC$InputChannel extends TLObject {
    public long access_hash;
    public long channel_id;

    public static TLRPC$InputChannel TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputChannel tLRPC$InputChannel;
        switch (i) {
            case -1343524562:
                tLRPC$InputChannel = new TLRPC$TL_inputChannel() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1343524562);
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                    }
                };
                break;
            case -292807034:
                tLRPC$InputChannel = new TLRPC$TL_inputChannelEmpty();
                break;
            case -212145112:
                tLRPC$InputChannel = new TLRPC$TL_inputChannel();
                break;
            case 707290417:
                tLRPC$InputChannel = new TLRPC$TL_inputChannelFromMessage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.msg_id = abstractSerializedData2.readInt32(z2);
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(707290417);
                        this.peer.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.msg_id);
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                    }
                };
                break;
            case 1536380829:
                tLRPC$InputChannel = new TLRPC$TL_inputChannelFromMessage();
                break;
            default:
                tLRPC$InputChannel = null;
                break;
        }
        if (tLRPC$InputChannel == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputChannel", Integer.valueOf(i)));
        }
        if (tLRPC$InputChannel != null) {
            tLRPC$InputChannel.readParams(abstractSerializedData, z);
        }
        return tLRPC$InputChannel;
    }
}
