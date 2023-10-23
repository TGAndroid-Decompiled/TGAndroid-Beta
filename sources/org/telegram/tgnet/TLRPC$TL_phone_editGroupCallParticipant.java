package org.telegram.tgnet;
public class TLRPC$TL_phone_editGroupCallParticipant extends TLObject {
    public TLRPC$TL_inputGroupCall call;
    public int flags;
    public boolean muted;
    public TLRPC$InputPeer participant;
    public boolean presentation_paused;
    public boolean raise_hand;
    public boolean video_paused;
    public boolean video_stopped;
    public int volume;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1524155713);
        abstractSerializedData.writeInt32(this.flags);
        this.call.serializeToStream(abstractSerializedData);
        this.participant.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeBool(this.muted);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.volume);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeBool(this.raise_hand);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeBool(this.video_stopped);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeBool(this.video_paused);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeBool(this.presentation_paused);
        }
    }
}
