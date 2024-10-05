package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_getAdminLog extends TLObject {
    public ArrayList admins = new ArrayList();
    public TLRPC$InputChannel channel;
    public TLRPC$TL_channelAdminLogEventsFilter events_filter;
    public int flags;
    public int limit;
    public long max_id;
    public long min_id;
    public String q;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_channels_adminLogResults.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(870184064);
        abstractSerializedData.writeInt32(this.flags);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.q);
        if ((this.flags & 1) != 0) {
            this.events_filter.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.admins.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                ((TLRPC$InputUser) this.admins.get(i)).serializeToStream(abstractSerializedData);
            }
        }
        abstractSerializedData.writeInt64(this.max_id);
        abstractSerializedData.writeInt64(this.min_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
