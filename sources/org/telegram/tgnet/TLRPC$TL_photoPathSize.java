package org.telegram.tgnet;

import android.graphics.Path;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SvgHelper;
public class TLRPC$TL_photoPathSize extends TLRPC$PhotoSize {
    public Path svgPath;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        byte[] readByteArray = abstractSerializedData.readByteArray(z);
        this.bytes = readByteArray;
        this.h = LiteMode.FLAG_CALLS_ANIMATIONS;
        this.w = LiteMode.FLAG_CALLS_ANIMATIONS;
        this.svgPath = SvgHelper.doPath(SvgHelper.decompress(readByteArray));
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-668906175);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeByteArray(this.bytes);
    }
}
