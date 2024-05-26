package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public class TLRPC$TL_messages_sendMessage extends TLObject {
    public boolean background;
    public boolean clear_draft;
    public long effect;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public boolean invert_media;
    public String message;
    public boolean no_webpage;
    public boolean noforwards;
    public TLRPC$InputPeer peer;
    public TLRPC$InputQuickReplyShortcut quick_reply_shortcut;
    public long random_id;
    public TLRPC$ReplyMarkup reply_markup;
    public TLRPC$InputReplyTo reply_to;
    public int schedule_date;
    public TLRPC$InputPeer send_as;
    public boolean silent;
    public boolean update_stickersets_order;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1740662971);
        int i = this.no_webpage ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.silent ? i | 32 : i & (-33);
        this.flags = i2;
        int i3 = this.background ? i2 | 64 : i2 & (-65);
        this.flags = i3;
        int i4 = this.clear_draft ? i3 | 128 : i3 & (-129);
        this.flags = i4;
        int i5 = this.noforwards ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i4 & (-16385);
        this.flags = i5;
        int i6 = this.update_stickersets_order ? i5 | LiteMode.FLAG_CHAT_SCALE : i5 & (-32769);
        this.flags = i6;
        int i7 = this.invert_media ? i6 | 65536 : i6 & (-65537);
        this.flags = i7;
        abstractSerializedData.writeInt32(i7);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.message);
        abstractSerializedData.writeInt64(this.random_id);
        if ((this.flags & 4) != 0) {
            this.reply_markup.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.entities.get(i8).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 131072) != 0) {
            this.quick_reply_shortcut.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 262144) != 0) {
            abstractSerializedData.writeInt64(this.effect);
        }
    }
}
