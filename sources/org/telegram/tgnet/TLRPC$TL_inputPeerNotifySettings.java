package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_inputPeerNotifySettings extends TLObject {
    public int flags;
    public int mute_until;
    public boolean show_previews;
    public boolean silent;
    public TLRPC$NotificationSound sound;
    public boolean stories_hide_sender;
    public boolean stories_muted;
    public TLRPC$NotificationSound stories_sound;

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
        if ((this.flags & 64) != 0) {
            this.stories_muted = abstractSerializedData.readBool(z);
        }
        if ((this.flags & 128) != 0) {
            this.stories_hide_sender = abstractSerializedData.readBool(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.stories_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-892638494);
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
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeBool(this.stories_muted);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeBool(this.stories_hide_sender);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.stories_sound.serializeToStream(abstractSerializedData);
        }
    }
}
