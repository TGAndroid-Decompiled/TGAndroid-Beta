package org.telegram.tgnet;

public abstract class TLRPC$InputPeer extends TLObject {
    public long access_hash;
    public long channel_id;
    public long chat_id;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public long user_id;

    public static TLRPC$InputPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputPeer tLRPC$InputPeer;
        switch (i) {
            case -1667893317:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChannelFromMessage() {
                    public static int constructor = -1667893317;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.msg_id = abstractSerializedData2.readInt32(z2);
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.peer.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.msg_id);
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                    }
                };
                break;
            case -1468331492:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerUserFromMessage();
                break;
            case -1121318848:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChannelFromMessage();
                break;
            case -571955892:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerUser();
                break;
            case 396093539:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChat() {
                    public static int constructor = 396093539;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.chat_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.chat_id);
                    }
                };
                break;
            case 398123750:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerUserFromMessage() {
                    public static int constructor = 398123750;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.msg_id = abstractSerializedData2.readInt32(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.peer.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.msg_id);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case 548253432:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChannel() {
                    public static int constructor = 548253432;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                    }
                };
                break;
            case 666680316:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChannel();
                break;
            case 900291769:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerChat();
                break;
            case 2072935910:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerUser() {
                    public static int constructor = 2072935910;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                    }
                };
                break;
            case 2107670217:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerSelf();
                break;
            case 2134579434:
                tLRPC$InputPeer = new TLRPC$TL_inputPeerEmpty();
                break;
            default:
                tLRPC$InputPeer = null;
                break;
        }
        if (tLRPC$InputPeer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputPeer", Integer.valueOf(i)));
        }
        if (tLRPC$InputPeer != null) {
            tLRPC$InputPeer.readParams(abstractSerializedData, z);
        }
        return tLRPC$InputPeer;
    }
}
