package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stories$TL_mediaAreaCoordinates extends TL_stories$MediaAreaCoordinates {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.x = abstractSerializedData.readDouble(z);
        this.y = abstractSerializedData.readDouble(z);
        this.w = abstractSerializedData.readDouble(z);
        this.h = abstractSerializedData.readDouble(z);
        this.rotation = abstractSerializedData.readDouble(z);
        if ((this.flags & 1) != 0) {
            this.radius = abstractSerializedData.readDouble(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-808853502);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeDouble(this.x);
        abstractSerializedData.writeDouble(this.y);
        abstractSerializedData.writeDouble(this.w);
        abstractSerializedData.writeDouble(this.h);
        abstractSerializedData.writeDouble(this.rotation);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeDouble(this.radius);
        }
    }
}
