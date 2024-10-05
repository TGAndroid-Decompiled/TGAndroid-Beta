package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_inviteToChannel extends TLObject {
    public TLRPC$InputChannel channel;
    public ArrayList users = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_invitedUsers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(429865580);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$InputUser) this.users.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
