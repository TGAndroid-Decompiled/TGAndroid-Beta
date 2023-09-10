package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public abstract class TLRPC$StoryItem extends TLObject {
    public String attachPath;
    public String caption;
    public boolean close_friends;
    public boolean contacts;
    public int date;
    public String detectedLng;
    public long dialogId;
    public boolean edited;
    public int expire_date;
    public int fileReference;
    public String firstFramePath;
    public int flags;
    public int id;
    public boolean isPublic;
    public boolean justUploaded;
    public long lastUpdateTime;
    public TLRPC$MessageMedia media;
    public int messageId;
    public int messageType;
    public boolean min;
    public boolean noforwards;
    public StoryPrivacyBottomSheet.StoryPrivacy parsedPrivacy;
    public boolean pinned;
    public boolean selected_contacts;
    public TLRPC$Reaction sent_reaction;
    public boolean translated;
    public String translatedLng;
    public TLRPC$TL_textWithEntities translatedText;
    public TLRPC$StoryViews views;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public ArrayList<TLRPC$MediaArea> media_areas = new ArrayList<>();
    public ArrayList<TLRPC$PrivacyRule> privacy = new ArrayList<>();

    public static TLRPC$StoryItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StoryItem tLRPC$StoryItem;
        switch (i) {
            case -5388013:
                tLRPC$StoryItem = new TLRPC$StoryItem() {
                    public static int constructor = -5388013;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.close_friends = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.expire_date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.close_friends ? this.flags | LiteMode.FLAG_CHAT_BLUR : this.flags & (-257);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.expire_date);
                    }
                };
                break;
            case 1153718222:
                tLRPC$StoryItem = new TLRPC$TL_storyItem();
                break;
            case 1374088783:
                tLRPC$StoryItem = new TLRPC$TL_storyItemDeleted();
                break;
            case 1445635639:
                tLRPC$StoryItem = new TLRPC$TL_storyItem() {
                    public static int constructor = 1445635639;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.pinned = (readInt32 & 32) != 0;
                        this.isPublic = (readInt32 & 128) != 0;
                        this.close_friends = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.noforwards = (readInt32 & 1024) != 0;
                        this.edited = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.contacts = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.selected_contacts = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.expire_date = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.caption = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize);
                            }
                        }
                        this.media = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$PrivacyRule TLdeserialize2 = TLRPC$PrivacyRule.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.privacy.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & 8) != 0) {
                            this.views = TLRPC$StoryViews.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.pinned ? this.flags | 32 : this.flags & (-33);
                        this.flags = i2;
                        int i3 = this.isPublic ? i2 | 128 : i2 & (-129);
                        this.flags = i3;
                        int i4 = this.close_friends ? i3 | LiteMode.FLAG_CHAT_BLUR : i3 & (-257);
                        this.flags = i4;
                        int i5 = this.min ? i4 | LiteMode.FLAG_CALLS_ANIMATIONS : i4 & (-513);
                        this.flags = i5;
                        int i6 = this.noforwards ? i5 | 1024 : i5 & (-1025);
                        this.flags = i6;
                        int i7 = this.edited ? i6 | LiteMode.FLAG_AUTOPLAY_GIFS : i6 & (-2049);
                        this.flags = i7;
                        int i8 = this.contacts ? i7 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i7 & (-4097);
                        this.flags = i8;
                        int i9 = this.selected_contacts ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i8 & (-8193);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.expire_date);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.caption);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                this.entities.get(i10).serializeToStream(abstractSerializedData2);
                            }
                        }
                        this.media.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.privacy.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                this.privacy.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 8) != 0) {
                            this.views.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            default:
                tLRPC$StoryItem = null;
                break;
        }
        if (tLRPC$StoryItem == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StoryItem", Integer.valueOf(i)));
        }
        if (tLRPC$StoryItem != null) {
            tLRPC$StoryItem.readParams(abstractSerializedData, z);
        }
        return tLRPC$StoryItem;
    }
}
