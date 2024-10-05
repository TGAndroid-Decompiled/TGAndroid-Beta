package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stories$MediaAreaCoordinates extends TLObject {
    public int flags;
    public double h;
    public double radius;
    public double rotation;
    public double w;
    public double x;
    public double y;

    public static TL_stories$MediaAreaCoordinates TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$MediaAreaCoordinates tL_stories$TL_mediaAreaCoordinates = i != -808853502 ? i != 64088654 ? null : new TL_stories$MediaAreaCoordinates() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.x = abstractSerializedData2.readDouble(z2);
                this.y = abstractSerializedData2.readDouble(z2);
                this.w = abstractSerializedData2.readDouble(z2);
                this.h = abstractSerializedData2.readDouble(z2);
                this.rotation = abstractSerializedData2.readDouble(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(64088654);
                abstractSerializedData2.writeDouble(this.x);
                abstractSerializedData2.writeDouble(this.y);
                abstractSerializedData2.writeDouble(this.w);
                abstractSerializedData2.writeDouble(this.h);
                abstractSerializedData2.writeDouble(this.rotation);
            }
        } : new TL_stories$TL_mediaAreaCoordinates();
        if (tL_stories$TL_mediaAreaCoordinates == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MediaAreaCoordinates", Integer.valueOf(i)));
        }
        if (tL_stories$TL_mediaAreaCoordinates != null) {
            tL_stories$TL_mediaAreaCoordinates.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_mediaAreaCoordinates;
    }
}
