package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_peerNotifySettings extends TLRPC$PeerNotifySettings {
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
            this.ios_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16) != 0) {
            this.android_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 32) != 0) {
            this.other_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 64) != 0) {
            this.stories_muted = abstractSerializedData.readBool(z);
        }
        if ((this.flags & 128) != 0) {
            this.stories_hide_sender = abstractSerializedData.readBool(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.stories_ios_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.stories_android_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 1024) != 0) {
            this.stories_other_sound = TLRPC$NotificationSound.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1721619444);
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
            this.ios_sound.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16) != 0) {
            this.android_sound.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 32) != 0) {
            this.other_sound.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeBool(this.stories_muted);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeBool(this.stories_hide_sender);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.stories_ios_sound.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.stories_android_sound.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1024) != 0) {
            this.stories_other_sound.serializeToStream(abstractSerializedData);
        }
    }
}
