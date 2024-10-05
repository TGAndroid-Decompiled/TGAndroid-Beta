package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_inputMediaPoll extends TLRPC$InputMedia {
    public TLRPC$Poll poll;
    public String solution;
    public ArrayList correct_answers = new ArrayList();
    public ArrayList solution_entities = new ArrayList();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.poll = TLRPC$Poll.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            } else {
                int readInt322 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt322; i++) {
                    this.correct_answers.add(abstractSerializedData.readByteArray(z));
                }
            }
        }
        if ((this.flags & 2) != 0) {
            this.solution = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.solution_entities.add(TLdeserialize);
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(261416433);
        abstractSerializedData.writeInt32(this.flags);
        this.poll.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.correct_answers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                abstractSerializedData.writeByteArray((byte[]) this.correct_answers.get(i));
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.solution);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.solution_entities.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                ((TLRPC$MessageEntity) this.solution_entities.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
    }
}
