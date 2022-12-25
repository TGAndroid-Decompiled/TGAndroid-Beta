package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_sendMultiMedia extends TLObject {
    public static int constructor = -1225713124;
    public boolean background;
    public boolean clear_draft;
    public int flags;
    public ArrayList<TLRPC$TL_inputSingleMedia> multi_media = new ArrayList<>();
    public boolean noforwards;
    public TLRPC$InputPeer peer;
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
        int i = this.silent ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.background ? i | 64 : i & (-65);
        this.flags = i2;
        int i3 = this.clear_draft ? i2 | ConnectionsManager.RequestFlagNeedQuickAck : i2 & (-129);
        this.flags = i3;
        int i4 = this.noforwards ? i3 | 16384 : i3 & (-16385);
        this.flags = i4;
        int i5 = this.update_stickersets_order ? i4 | 32768 : i4 & (-32769);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.reply_to_msg_id);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.multi_media.size();
        abstractSerializedData.writeInt32(size);
        for (int i6 = 0; i6 < size; i6++) {
            this.multi_media.get(i6).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & 8192) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
