package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$Poll extends TLObject {
    public int close_date;
    public int close_period;
    public boolean closed;
    public int flags;
    public long id;
    public boolean multiple_choice;
    public boolean public_voters;
    public boolean quiz;
    public TLRPC$TL_textWithEntities question = new TLRPC$TL_textWithEntities();
    public ArrayList<TLRPC$PollAnswer> answers = new ArrayList<>();

    public static TLRPC$Poll TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_poll tLRPC$TL_poll;
        switch (i) {
            case -2032041631:
                tLRPC$TL_poll = new TLRPC$TL_poll() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.closed = (readInt32 & 1) != 0;
                        this.public_voters = (readInt32 & 2) != 0;
                        this.multiple_choice = (readInt32 & 4) != 0;
                        this.quiz = (readInt32 & 8) != 0;
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                        this.question = tLRPC$TL_textWithEntities;
                        tLRPC$TL_textWithEntities.text = abstractSerializedData2.readString(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$PollAnswer TLdeserialize = TLRPC$PollAnswer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.answers.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.close_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.close_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2032041631);
                        abstractSerializedData2.writeInt64(this.id);
                        int i2 = this.closed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.public_voters ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.multiple_choice ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.quiz ? i4 | 8 : i4 & (-9);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = this.question;
                        abstractSerializedData2.writeString(tLRPC$TL_textWithEntities == null ? "" : tLRPC$TL_textWithEntities.text);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.answers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            this.answers.get(i6).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.close_period);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.close_date);
                        }
                    }
                };
                break;
            case -1351325818:
                tLRPC$TL_poll = new TLRPC$TL_poll() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.closed = (readInt32 & 1) != 0;
                        this.public_voters = (readInt32 & 2) != 0;
                        this.multiple_choice = (readInt32 & 4) != 0;
                        this.quiz = (readInt32 & 8) != 0;
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                        this.question = tLRPC$TL_textWithEntities;
                        tLRPC$TL_textWithEntities.text = abstractSerializedData2.readString(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$PollAnswer TLdeserialize = TLRPC$PollAnswer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.answers.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.close_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1351325818);
                        abstractSerializedData2.writeInt64(this.id);
                        int i2 = this.closed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.public_voters ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.multiple_choice ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.quiz ? i4 | 8 : i4 & (-9);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = this.question;
                        abstractSerializedData2.writeString(tLRPC$TL_textWithEntities == null ? "" : tLRPC$TL_textWithEntities.text);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.answers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            this.answers.get(i6).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.close_date);
                        }
                    }
                };
                break;
            case -716006138:
                tLRPC$TL_poll = new TLRPC$TL_poll() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.closed = (readInt32 & 1) != 0;
                        this.public_voters = (readInt32 & 2) != 0;
                        this.multiple_choice = (readInt32 & 4) != 0;
                        this.quiz = (readInt32 & 8) != 0;
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                        this.question = tLRPC$TL_textWithEntities;
                        tLRPC$TL_textWithEntities.text = abstractSerializedData2.readString(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$PollAnswer TLdeserialize = TLRPC$PollAnswer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.answers.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-716006138);
                        abstractSerializedData2.writeInt64(this.id);
                        int i2 = this.closed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.public_voters ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.multiple_choice ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.quiz ? i4 | 8 : i4 & (-9);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = this.question;
                        abstractSerializedData2.writeString(tLRPC$TL_textWithEntities == null ? "" : tLRPC$TL_textWithEntities.text);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.answers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            this.answers.get(i6).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1484026161:
                tLRPC$TL_poll = new TLRPC$TL_poll();
                break;
            default:
                tLRPC$TL_poll = null;
                break;
        }
        if (tLRPC$TL_poll == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Poll", Integer.valueOf(i)));
        }
        if (tLRPC$TL_poll != null) {
            tLRPC$TL_poll.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_poll;
    }
}
