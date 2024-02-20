package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stories$TL_mediaAreaChannelPost extends TL_stories$MediaArea {
    public long channel_id;
    public int msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.coordinates = TL_stories$TL_mediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.channel_id = abstractSerializedData.readInt64(z);
        this.msg_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1996756655);
        this.coordinates.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.msg_id);
    }
}
