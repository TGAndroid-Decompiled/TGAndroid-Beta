package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_mediaAreaCoordinates extends TLObject {
    public double h;
    public double rotation;
    public double w;
    public double x;
    public double y;

    public static TL_stories$TL_mediaAreaCoordinates TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (64088654 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_mediaAreaCoordinates", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_mediaAreaCoordinates tL_stories$TL_mediaAreaCoordinates = new TL_stories$TL_mediaAreaCoordinates();
        tL_stories$TL_mediaAreaCoordinates.readParams(abstractSerializedData, z);
        return tL_stories$TL_mediaAreaCoordinates;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.x = abstractSerializedData.readDouble(z);
        this.y = abstractSerializedData.readDouble(z);
        this.w = abstractSerializedData.readDouble(z);
        this.h = abstractSerializedData.readDouble(z);
        this.rotation = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(64088654);
        abstractSerializedData.writeDouble(this.x);
        abstractSerializedData.writeDouble(this.y);
        abstractSerializedData.writeDouble(this.w);
        abstractSerializedData.writeDouble(this.h);
        abstractSerializedData.writeDouble(this.rotation);
    }
}
