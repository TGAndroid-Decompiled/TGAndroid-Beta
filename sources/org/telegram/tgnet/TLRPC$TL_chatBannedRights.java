package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_chatBannedRights extends TLObject {
    public static int constructor = -1626209256;
    public boolean change_info;
    public boolean embed_links;
    public int flags;
    public boolean invite_users;
    public boolean manage_topics;
    public boolean pin_messages;
    public boolean send_audios;
    public boolean send_docs;
    public boolean send_games;
    public boolean send_gifs;
    public boolean send_inline;
    public boolean send_media;
    public boolean send_messages;
    public boolean send_photos;
    public boolean send_plain;
    public boolean send_polls;
    public boolean send_roundvideos;
    public boolean send_stickers;
    public boolean send_videos;
    public boolean send_voices;
    public int until_date;
    public boolean view_messages;

    public static TLRPC$TL_chatBannedRights TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_chatBannedRights", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = new TLRPC$TL_chatBannedRights();
        tLRPC$TL_chatBannedRights.readParams(abstractSerializedData, z);
        return tLRPC$TL_chatBannedRights;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.view_messages = (readInt32 & 1) != 0;
        this.send_messages = (readInt32 & 2) != 0;
        boolean z2 = (readInt32 & 4) != 0;
        this.send_media = z2;
        this.send_stickers = (readInt32 & 8) != 0;
        this.send_gifs = (readInt32 & 16) != 0;
        this.send_games = (readInt32 & 32) != 0;
        this.send_inline = (readInt32 & 64) != 0;
        this.embed_links = (readInt32 & 128) != 0;
        this.send_polls = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
        this.change_info = (readInt32 & 1024) != 0;
        this.invite_users = (32768 & readInt32) != 0;
        this.pin_messages = (131072 & readInt32) != 0;
        this.manage_topics = (262144 & readInt32) != 0;
        this.send_photos = (524288 & readInt32) != 0;
        this.send_videos = (1048576 & readInt32) != 0;
        this.send_roundvideos = (2097152 & readInt32) != 0;
        this.send_audios = (4194304 & readInt32) != 0;
        this.send_voices = (8388608 & readInt32) != 0;
        this.send_docs = (16777216 & readInt32) != 0;
        this.send_plain = (readInt32 & ConnectionsManager.FileTypeVideo) != 0;
        if (z2) {
            this.send_photos = true;
            this.send_videos = true;
            this.send_roundvideos = true;
            this.send_audios = true;
            this.send_voices = true;
            this.send_docs = true;
        }
        this.until_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        boolean z = this.send_photos;
        if (z && this.send_videos && this.send_roundvideos && this.send_audios && this.send_voices && this.send_docs) {
            this.send_media = true;
        } else {
            this.send_media = false;
        }
        boolean z2 = this.send_plain;
        if (z2 && this.send_media) {
            this.send_messages = true;
        } else {
            this.send_messages = false;
        }
        int i = this.view_messages ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.send_messages ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.send_media ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.send_stickers ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.send_gifs ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.send_games ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.send_inline ? i6 | 64 : i6 & (-65);
        this.flags = i7;
        int i8 = this.embed_links ? i7 | 128 : i7 & (-129);
        this.flags = i8;
        int i9 = this.send_polls ? i8 | LiteMode.FLAG_CHAT_BLUR : i8 & (-257);
        this.flags = i9;
        int i10 = this.change_info ? i9 | 1024 : i9 & (-1025);
        this.flags = i10;
        int i11 = this.invite_users ? i10 | LiteMode.FLAG_CHAT_SCALE : i10 & (-32769);
        this.flags = i11;
        int i12 = this.pin_messages ? i11 | 131072 : i11 & (-131073);
        this.flags = i12;
        int i13 = this.manage_topics ? i12 | 262144 : i12 & (-262145);
        this.flags = i13;
        int i14 = z ? 524288 | i13 : (-524289) & i13;
        this.flags = i14;
        int i15 = this.send_videos ? i14 | 1048576 : i14 & (-1048577);
        this.flags = i15;
        int i16 = this.send_roundvideos ? i15 | 2097152 : i15 & (-2097153);
        this.flags = i16;
        int i17 = this.send_audios ? i16 | 4194304 : i16 & (-4194305);
        this.flags = i17;
        int i18 = this.send_voices ? i17 | 8388608 : i17 & (-8388609);
        this.flags = i18;
        int i19 = this.send_docs ? i18 | ConnectionsManager.FileTypePhoto : i18 & (-16777217);
        this.flags = i19;
        int i20 = z2 ? i19 | ConnectionsManager.FileTypeVideo : i19 & (-33554433);
        this.flags = i20;
        abstractSerializedData.writeInt32(i20);
        abstractSerializedData.writeInt32(this.until_date);
    }
}
