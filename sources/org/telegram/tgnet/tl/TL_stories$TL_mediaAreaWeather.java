package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stories$TL_mediaAreaWeather extends TL_stories$MediaArea {
    public int color;
    public String emoji;
    public double temperature_c;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.coordinates = TL_stories$MediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.emoji = abstractSerializedData.readString(z);
        this.temperature_c = abstractSerializedData.readDouble(z);
        this.color = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1235637404);
        this.coordinates.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.emoji);
        abstractSerializedData.writeDouble(this.temperature_c);
        abstractSerializedData.writeInt32(this.color);
    }
}
