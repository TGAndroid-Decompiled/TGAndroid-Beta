package org.telegram.tgnet;

public class TLRPC$TL_updateTranscribedAudio extends TLRPC$Update {
    public static int constructor = 8703322;
    public int flags;
    public int msg_id;
    public TLRPC$Peer peer;
    public boolean pending;
    public String text;
    public long transcription_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        boolean z2 = true;
        if ((readInt32 & 1) == 0) {
            z2 = false;
        }
        this.pending = z2;
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.msg_id = abstractSerializedData.readInt32(z);
        this.transcription_id = abstractSerializedData.readInt64(z);
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.pending ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt64(this.transcription_id);
        abstractSerializedData.writeString(this.text);
    }
}
