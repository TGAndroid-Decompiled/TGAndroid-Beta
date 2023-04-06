package org.telegram.tgnet;
public abstract class TLRPC$EncryptedChat extends TLObject {
    public byte[] a_or_b;
    public long access_hash;
    public long admin_id;
    public byte[] auth_key;
    public int date;
    public long exchange_id;
    public int flags;
    public int folder_id;
    public byte[] future_auth_key;
    public long future_key_fingerprint;
    public byte[] g_a;
    public byte[] g_a_or_b;
    public boolean history_deleted;
    public int id;
    public int in_seq_no;
    public int key_create_date;
    public long key_fingerprint;
    public byte[] key_hash;
    public short key_use_count_in;
    public short key_use_count_out;
    public int layer;
    public int mtproto_seq;
    public byte[] nonce;
    public long participant_id;
    public int seq_in;
    public int seq_out;
    public int ttl;
    public long user_id;

    public static TLRPC$EncryptedChat TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        switch (i) {
            case -1417756512:
                tLRPC$EncryptedChat = new TLRPC$EncryptedChat() {
                    public static int constructor = -1417756512;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                    }
                };
                break;
            case -931638658:
                tLRPC$EncryptedChat = new TLRPC$EncryptedChat() {
                    public static int constructor = -931638658;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                        this.g_a = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a);
                    }
                };
                break;
            case -94974410:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat() {
                    public static int constructor = -94974410;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                        this.g_a_or_b = abstractSerializedData2.readByteArray(z2);
                        this.key_fingerprint = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a_or_b);
                        abstractSerializedData2.writeInt64(this.key_fingerprint);
                    }
                };
                break;
            case -39213129:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested() {
                    public static int constructor = -39213129;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                        this.g_a = abstractSerializedData2.readByteArray(z2);
                        this.nonce = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a);
                        abstractSerializedData2.writeByteArray(this.nonce);
                    }
                };
                break;
            case 332848423:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatDiscarded() {
                    public static int constructor = 332848423;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                    }
                };
                break;
            case 505183301:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatDiscarded();
                break;
            case 1006044124:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatWaiting() {
                    public static int constructor = 1006044124;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                    }
                };
                break;
            case 1223809356:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested();
                break;
            case 1643173063:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat();
                break;
            case 1651608194:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatRequested() {
                    public static int constructor = 1651608194;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                        this.g_a = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a);
                    }
                };
                break;
            case 1711395151:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChat() {
                    public static int constructor = 1711395151;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        this.participant_id = abstractSerializedData2.readInt32(z2);
                        this.g_a_or_b = abstractSerializedData2.readByteArray(z2);
                        this.nonce = abstractSerializedData2.readByteArray(z2);
                        this.key_fingerprint = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32((int) this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a_or_b);
                        abstractSerializedData2.writeByteArray(this.nonce);
                        abstractSerializedData2.writeInt64(this.key_fingerprint);
                    }
                };
                break;
            case 1722964307:
                tLRPC$EncryptedChat = new TLRPC$TL_encryptedChatWaiting();
                break;
            default:
                tLRPC$EncryptedChat = null;
                break;
        }
        if (tLRPC$EncryptedChat == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EncryptedChat", Integer.valueOf(i)));
        }
        if (tLRPC$EncryptedChat != null) {
            tLRPC$EncryptedChat.readParams(abstractSerializedData, z);
        }
        return tLRPC$EncryptedChat;
    }
}
