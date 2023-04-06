package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$PhoneCall extends TLObject {
    public long access_hash;
    public long admin_id;
    public ArrayList<TLRPC$PhoneConnection> connections = new ArrayList<>();
    public int date;
    public int duration;
    public int flags;
    public byte[] g_a_hash;
    public byte[] g_a_or_b;
    public byte[] g_b;
    public long id;
    public long key_fingerprint;
    public boolean need_debug;
    public boolean need_rating;
    public boolean p2p_allowed;
    public long participant_id;
    public TLRPC$PhoneCallProtocol protocol;
    public TLRPC$PhoneCallDiscardReason reason;
    public int receive_date;
    public int start_date;
    public boolean video;

    public static TLRPC$PhoneCall TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PhoneCall tLRPC$PhoneCall;
        switch (i) {
            case -1770029977:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = -1770029977;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.p2p_allowed = (readInt32 & 32) != 0;
                        this.video = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt64(z2);
                        this.participant_id = abstractSerializedData2.readInt64(z2);
                        this.g_a_or_b = abstractSerializedData2.readByteArray(z2);
                        this.key_fingerprint = abstractSerializedData2.readInt64(z2);
                        this.protocol = TLRPC$PhoneCallProtocol.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$PhoneConnection TLdeserialize = TLRPC$PhoneConnection.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.connections.add(TLdeserialize);
                        }
                        this.start_date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.p2p_allowed ? this.flags | 32 : this.flags & (-33);
                        this.flags = i2;
                        int i3 = this.video ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt64(this.admin_id);
                        abstractSerializedData2.writeInt64(this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a_or_b);
                        abstractSerializedData2.writeInt64(this.key_fingerprint);
                        this.protocol.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.connections.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            this.connections.get(i4).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.start_date);
                    }
                };
                break;
            case -987599081:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = -987599081;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.video = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt64(z2);
                        this.participant_id = abstractSerializedData2.readInt64(z2);
                        this.protocol = TLRPC$PhoneCallProtocol.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.receive_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.video ? this.flags | 64 : this.flags & (-65);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt64(this.admin_id);
                        abstractSerializedData2.writeInt64(this.participant_id);
                        this.protocol.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.receive_date);
                        }
                    }
                };
                break;
            case 347139340:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = 347139340;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.video = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt64(z2);
                        this.participant_id = abstractSerializedData2.readInt64(z2);
                        this.g_a_hash = abstractSerializedData2.readByteArray(z2);
                        this.protocol = TLRPC$PhoneCallProtocol.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.video ? this.flags | 64 : this.flags & (-65);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt64(this.admin_id);
                        abstractSerializedData2.writeInt64(this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_a_hash);
                        this.protocol.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 912311057:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = 912311057;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.video = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt64(z2);
                        this.participant_id = abstractSerializedData2.readInt64(z2);
                        this.g_b = abstractSerializedData2.readByteArray(z2);
                        this.protocol = TLRPC$PhoneCallProtocol.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.video ? this.flags | 64 : this.flags & (-65);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt64(this.admin_id);
                        abstractSerializedData2.writeInt64(this.participant_id);
                        abstractSerializedData2.writeByteArray(this.g_b);
                        this.protocol.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1355435489:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = 1355435489;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.need_rating = (readInt32 & 4) != 0;
                        this.need_debug = (readInt32 & 8) != 0;
                        this.video = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 1) != 0) {
                            this.reason = TLRPC$PhoneCallDiscardReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.need_rating ? this.flags | 4 : this.flags & (-5);
                        this.flags = i2;
                        int i3 = this.need_debug ? i2 | 8 : i2 & (-9);
                        this.flags = i3;
                        int i4 = this.video ? i3 | 64 : i3 & (-65);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 1) != 0) {
                            this.reason.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                    }
                };
                break;
            case 1399245077:
                tLRPC$PhoneCall = new TLRPC$PhoneCall() {
                    public static int constructor = 1399245077;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.id);
                    }
                };
                break;
            default:
                tLRPC$PhoneCall = null;
                break;
        }
        if (tLRPC$PhoneCall == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PhoneCall", Integer.valueOf(i)));
        }
        if (tLRPC$PhoneCall != null) {
            tLRPC$PhoneCall.readParams(abstractSerializedData, z);
        }
        return tLRPC$PhoneCall;
    }
}
