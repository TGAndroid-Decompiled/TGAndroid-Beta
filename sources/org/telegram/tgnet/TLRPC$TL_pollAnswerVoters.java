package org.telegram.tgnet;
public class TLRPC$TL_pollAnswerVoters extends TLObject {
    public static int constructor = 997055186;
    public boolean chosen;
    public boolean correct;
    public int flags;
    public byte[] option;
    public int voters;

    public static TLRPC$TL_pollAnswerVoters TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_pollAnswerVoters", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_pollAnswerVoters tLRPC$TL_pollAnswerVoters = new TLRPC$TL_pollAnswerVoters();
        tLRPC$TL_pollAnswerVoters.readParams(abstractSerializedData, z);
        return tLRPC$TL_pollAnswerVoters;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.chosen = (readInt32 & 1) != 0;
        this.correct = (readInt32 & 2) != 0;
        this.option = abstractSerializedData.readByteArray(z);
        this.voters = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.chosen ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.correct ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeByteArray(this.option);
        abstractSerializedData.writeInt32(this.voters);
    }
}
