package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$channels_ChannelParticipants extends TLObject {
    public TLRPC$channels_ChannelParticipants() {
        new ArrayList();
        new ArrayList();
    }

    public static TLRPC$channels_ChannelParticipants TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$channels_ChannelParticipants tLRPC$channels_ChannelParticipants;
        if (i != -1699676497) {
            tLRPC$channels_ChannelParticipants = i != -266911767 ? null : new TLRPC$channels_ChannelParticipants() {
                public static int constructor = -266911767;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$channels_ChannelParticipants = new TLRPC$TL_channels_channelParticipants();
        }
        if (tLRPC$channels_ChannelParticipants != null || !z) {
            if (tLRPC$channels_ChannelParticipants != null) {
                tLRPC$channels_ChannelParticipants.readParams(abstractSerializedData, z);
            }
            return tLRPC$channels_ChannelParticipants;
        }
        throw new RuntimeException(String.format("can't parse magic %x in channels_ChannelParticipants", Integer.valueOf(i)));
    }
}
