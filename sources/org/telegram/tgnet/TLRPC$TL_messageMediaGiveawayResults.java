package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messageMediaGiveawayResults extends TLRPC$MessageMedia {
    public int additional_peers_count;
    public long channel_id;
    public int launch_msg_id;
    public int months;
    public boolean only_new_subscribers;
    public String prize_description;
    public boolean refunded;
    public int unclaimed_count;
    public int until_date;
    public ArrayList<Long> winners = new ArrayList<>();
    public int winners_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.only_new_subscribers = (readInt32 & 1) != 0;
        this.refunded = (readInt32 & 4) != 0;
        this.channel_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 8) != 0) {
            this.additional_peers_count = abstractSerializedData.readInt32(z);
        }
        this.launch_msg_id = abstractSerializedData.readInt32(z);
        this.winners_count = abstractSerializedData.readInt32(z);
        this.unclaimed_count = abstractSerializedData.readInt32(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            this.winners.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
        this.months = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.prize_description = abstractSerializedData.readString(z);
        }
        this.until_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-963047320);
        int i = this.only_new_subscribers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.refunded ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.channel_id);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(this.additional_peers_count);
        }
        abstractSerializedData.writeInt32(this.launch_msg_id);
        abstractSerializedData.writeInt32(this.winners_count);
        abstractSerializedData.writeInt32(this.unclaimed_count);
        abstractSerializedData.writeInt32(481674261);
        int size = this.winners.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            abstractSerializedData.writeInt64(this.winners.get(i3).longValue());
        }
        abstractSerializedData.writeInt32(this.months);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.prize_description);
        }
        abstractSerializedData.writeInt32(this.until_date);
    }
}
