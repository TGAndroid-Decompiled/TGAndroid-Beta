package org.telegram.tgnet;
public class TLRPC$TL_inputPeerNotifySettings extends TLObject {
    public static int constructor = -551616469;
    public int flags;
    public int mute_until;
    public boolean show_previews;
    public boolean silent;
    public TLRPC$NotificationSound sound;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.show_previews = abstractSerializedData.readBool(z);
        }
        if ((this.flags & 2) != 0) {
            this.silent = abstractSerializedData.readBool(z);
        }
        if ((this.flags & 4) != 0) {
            this.mute_until = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            this.sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeBool(this.show_previews);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeBool(this.silent);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.mute_until);
        }
        if ((this.flags & 8) != 0) {
            this.sound.serializeToStream(abstractSerializedData);
        }
    }
}
