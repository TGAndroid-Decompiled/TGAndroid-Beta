package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$ChatParticipants extends TLObject {
    public long admin_id;
    public long chat_id;
    public int flags;
    public ArrayList<TLRPC$ChatParticipant> participants = new ArrayList<>();
    public TLRPC$ChatParticipant self_participant;
    public int version;

    public static TLRPC$ChatParticipants TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        switch (i) {
            case -2023500831:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipantsForbidden();
                break;
            case -57668565:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipantsForbidden() {
                    public static int constructor = -57668565;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.chat_id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.self_participant = TLRPC$ChatParticipant.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32((int) this.chat_id);
                        if ((this.flags & 1) != 0) {
                            this.self_participant.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 265468810:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipantsForbidden() {
                    public static int constructor = 265468810;

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
            case 1018991608:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipants();
                break;
            case 1061556205:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipants() {
                    public static int constructor = 1061556205;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.chat_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$ChatParticipant TLdeserialize = TLRPC$ChatParticipant.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.participants.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            this.version = abstractSerializedData2.readInt32(z2);
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.chat_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.participants.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.participants.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.version);
                    }
                };
                break;
            case 2017571861:
                tLRPC$ChatParticipants = new TLRPC$TL_chatParticipants() {
                    public static int constructor = 2017571861;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.chat_id = abstractSerializedData2.readInt32(z2);
                        this.admin_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$ChatParticipant TLdeserialize = TLRPC$ChatParticipant.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.participants.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            this.version = abstractSerializedData2.readInt32(z2);
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.chat_id);
                        abstractSerializedData2.writeInt32((int) this.admin_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.participants.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.participants.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.version);
                    }
                };
                break;
            default:
                tLRPC$ChatParticipants = null;
                break;
        }
        if (tLRPC$ChatParticipants != null || !z) {
            if (tLRPC$ChatParticipants != null) {
                tLRPC$ChatParticipants.readParams(abstractSerializedData, z);
            }
            return tLRPC$ChatParticipants;
        }
        throw new RuntimeException(String.format("can't parse magic %x in ChatParticipants", Integer.valueOf(i)));
    }
}
