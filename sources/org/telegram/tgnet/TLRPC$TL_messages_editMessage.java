package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_editMessage extends TLObject {
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public int id;
    public boolean invert_media;
    public TLRPC$InputMedia media;
    public String message;
    public boolean no_webpage;
    public TLRPC$InputPeer peer;
    public int quick_reply_shortcut_id;
    public TLRPC$ReplyMarkup reply_markup;
    public int schedule_date;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-539934715);
        int i = this.no_webpage ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.invert_media ? i | 65536 : i & (-65537);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 2048) != 0) {
            abstractSerializedData.writeString(this.message);
        }
        if ((this.flags & 16384) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            this.reply_markup.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.entities.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 32768) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt32(this.quick_reply_shortcut_id);
        }
    }
}
