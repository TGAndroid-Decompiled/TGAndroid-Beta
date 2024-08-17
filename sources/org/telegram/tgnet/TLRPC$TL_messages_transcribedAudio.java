package org.telegram.tgnet;

public class TLRPC$TL_messages_transcribedAudio extends TLObject {
    public int flags;
    public boolean pending;
    public String text;
    public long transcription_id;
    public int trial_remains_num;
    public int trial_remains_until_date;

    public static TLRPC$TL_messages_transcribedAudio TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-809903785 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_transcribedAudio", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_transcribedAudio tLRPC$TL_messages_transcribedAudio = new TLRPC$TL_messages_transcribedAudio();
        tLRPC$TL_messages_transcribedAudio.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_transcribedAudio;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pending = (readInt32 & 1) != 0;
        this.transcription_id = abstractSerializedData.readInt64(z);
        this.text = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            this.trial_remains_num = abstractSerializedData.readInt32(z);
            this.trial_remains_until_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-809903785);
        int i = this.pending ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.transcription_id);
        abstractSerializedData.writeString(this.text);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.trial_remains_num);
            abstractSerializedData.writeInt32(this.trial_remains_until_date);
        }
    }
}
