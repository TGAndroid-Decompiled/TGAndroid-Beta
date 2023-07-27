package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_storyItem extends TLRPC$StoryItem {
    public static int constructor = 1445635639;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pinned = (readInt32 & 32) != 0;
        this.isPublic = (readInt32 & 128) != 0;
        this.close_friends = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
        this.min = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
        this.noforwards = (readInt32 & 1024) != 0;
        this.edited = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
        this.contacts = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
        this.selected_contacts = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
        this.id = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.expire_date = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.caption = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
        this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                TLRPC$PrivacyRule TLdeserialize2 = TLRPC$PrivacyRule.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.privacy.add(TLdeserialize2);
            }
        }
        if ((this.flags & 8) != 0) {
            this.views = TLRPC$TL_storyViews.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.pinned ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.isPublic ? i | 128 : i & (-129);
        this.flags = i2;
        int i3 = this.close_friends ? i2 | LiteMode.FLAG_CHAT_BLUR : i2 & (-257);
        this.flags = i3;
        int i4 = this.min ? i3 | LiteMode.FLAG_CALLS_ANIMATIONS : i3 & (-513);
        this.flags = i4;
        int i5 = this.noforwards ? i4 | 1024 : i4 & (-1025);
        this.flags = i5;
        int i6 = this.edited ? i5 | LiteMode.FLAG_AUTOPLAY_GIFS : i5 & (-2049);
        this.flags = i6;
        int i7 = this.contacts ? i6 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i6 & (-4097);
        this.flags = i7;
        int i8 = this.selected_contacts ? i7 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i7 & (-8193);
        this.flags = i8;
        abstractSerializedData.writeInt32(i8);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.expire_date);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.caption);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i9 = 0; i9 < size; i9++) {
                this.entities.get(i9).serializeToStream(abstractSerializedData);
            }
        }
        this.media.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.privacy.size();
            abstractSerializedData.writeInt32(size2);
            for (int i10 = 0; i10 < size2; i10++) {
                this.privacy.get(i10).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 8) != 0) {
            this.views.serializeToStream(abstractSerializedData);
        }
    }
}
