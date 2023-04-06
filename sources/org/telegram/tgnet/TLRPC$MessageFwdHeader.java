package org.telegram.tgnet;
public abstract class TLRPC$MessageFwdHeader extends TLObject {
    public int channel_post;
    public int date;
    public int flags;
    public TLRPC$Peer from_id;
    public String from_name;
    public boolean imported;
    public String post_author;
    public String psa_type;
    public int saved_from_msg_id;
    public TLRPC$Peer saved_from_peer;

    public static TLRPC$MessageFwdHeader TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader;
        switch (i) {
            case -947462709:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader() {
                    public static int constructor = -947462709;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel;
                            tLRPC$TL_peerChannel.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel2 = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel2;
                            tLRPC$TL_peerChannel2.channel_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.channel_post = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.channel_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.channel_post);
                        }
                    }
                };
                break;
            case -332168592:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader() {
                    public static int constructor = -332168592;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.from_name = abstractSerializedData2.readString(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel;
                            tLRPC$TL_peerChannel.channel_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.channel_post = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.from_name);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.channel_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.channel_post);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.saved_from_msg_id);
                        }
                    }
                };
                break;
            case -85986132:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader() {
                    public static int constructor = -85986132;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel;
                            tLRPC$TL_peerChannel.channel_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.channel_post = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.channel_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.channel_post);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                    }
                };
                break;
            case 893020267:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader() {
                    public static int constructor = 893020267;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.from_name = abstractSerializedData2.readString(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel;
                            tLRPC$TL_peerChannel.channel_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.channel_post = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.psa_type = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeString(this.from_name);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.channel_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.channel_post);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.saved_from_msg_id);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.psa_type);
                        }
                    }
                };
                break;
            case 1436466797:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader() {
                    public static int constructor = 1436466797;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2) != 0) {
                            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                            this.from_id = tLRPC$TL_peerChannel;
                            tLRPC$TL_peerChannel.channel_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.channel_post = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.channel_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.channel_post);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 16) != 0) {
                            this.saved_from_peer.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.saved_from_msg_id);
                        }
                    }
                };
                break;
            case 1601666510:
                tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                break;
            default:
                tLRPC$TL_messageFwdHeader = null;
                break;
        }
        if (tLRPC$TL_messageFwdHeader == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageFwdHeader", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messageFwdHeader != null) {
            tLRPC$TL_messageFwdHeader.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messageFwdHeader;
    }
}
