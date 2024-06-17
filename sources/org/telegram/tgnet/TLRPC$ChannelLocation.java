package org.telegram.tgnet;

public abstract class TLRPC$ChannelLocation extends TLObject {
    public static TLRPC$ChannelLocation TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChannelLocation tLRPC$ChannelLocation;
        if (i == -1078612597) {
            tLRPC$ChannelLocation = new TLRPC$ChannelLocation() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1078612597);
                }
            };
        } else {
            tLRPC$ChannelLocation = i != 547062491 ? null : new TLRPC$TL_channelLocation();
        }
        if (tLRPC$ChannelLocation == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChannelLocation", Integer.valueOf(i)));
        }
        if (tLRPC$ChannelLocation != null) {
            tLRPC$ChannelLocation.readParams(abstractSerializedData, z);
        }
        return tLRPC$ChannelLocation;
    }
}
