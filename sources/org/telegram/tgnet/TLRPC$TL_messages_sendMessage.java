package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendMessage extends TLObject {
    public static int constructor = 482476935;
    public boolean background;
    public boolean clear_draft;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String message;
    public boolean no_webpage;
    public boolean noforwards;
    public TLRPC$InputPeer peer;
    public long random_id;
    public TLRPC$ReplyMarkup reply_markup;
    public int reply_to_msg_id;
    public int schedule_date;
    public TLRPC$InputPeer send_as;
    public boolean silent;
    public int top_msg_id;
    public boolean update_stickersets_order;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.no_webpage ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.silent ? i | 32 : i & (-33);
        this.flags = i2;
        int i3 = this.background ? i2 | 64 : i2 & (-65);
        this.flags = i3;
        int i4 = this.clear_draft ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
        this.flags = i4;
        int i5 = this.noforwards ? i4 | 16384 : i4 & (-16385);
        this.flags = i5;
        int i6 = this.update_stickersets_order ? i5 | 32768 : i5 & (-32769);
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.reply_to_msg_id);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
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
            for (int i7 = 0; i7 < size; i7++) {
                this.entities.get(i7).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & 8192) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
