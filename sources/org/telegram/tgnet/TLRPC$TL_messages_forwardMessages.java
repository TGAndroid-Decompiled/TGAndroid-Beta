package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_forwardMessages extends TLObject {
    public static int constructor = -869258997;
    public boolean background;
    public boolean drop_author;
    public boolean drop_media_captions;
    public int flags;
    public TLRPC$InputPeer from_peer;
    public ArrayList<Integer> id = new ArrayList<>();
    public ArrayList<Long> random_id = new ArrayList<>();
    public int schedule_date;
    public TLRPC$InputPeer send_as;
    public boolean silent;
    public TLRPC$InputPeer to_peer;
    public boolean with_my_score;

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
        int i3 = this.with_my_score ? i2 | 256 : i2 & (-257);
        this.flags = i3;
        int i4 = this.drop_author ? i3 | 2048 : i3 & (-2049);
        this.flags = i4;
        int i5 = this.drop_media_captions ? i4 | 4096 : i4 & (-4097);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        this.from_peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i6 = 0; i6 < size; i6++) {
            abstractSerializedData.writeInt32(this.id.get(i6).intValue());
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.random_id.size();
        abstractSerializedData.writeInt32(size2);
        for (int i7 = 0; i7 < size2; i7++) {
            abstractSerializedData.writeInt64(this.random_id.get(i7).longValue());
        }
        this.to_peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.schedule_date);
        }
        if ((this.flags & 8192) != 0) {
            this.send_as.serializeToStream(abstractSerializedData);
        }
    }
}
