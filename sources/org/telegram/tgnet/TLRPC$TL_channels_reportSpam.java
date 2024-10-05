package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_reportSpam extends TLObject {
    public TLRPC$InputChannel channel;
    public ArrayList id = new ArrayList();
    public TLRPC$InputPeer participant;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-196443371);
        this.channel.serializeToStream(abstractSerializedData);
        this.participant.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(((Integer) this.id.get(i)).intValue());
        }
    }
}
