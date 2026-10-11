package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f20300a;
    public final InputSerializedData f20301b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f20300a = i10;
        this.f20301b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20300a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20301b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20301b.readInt32(booleanValue));
            case 2:
                return this.f20301b.readString(booleanValue);
            default:
                return this.f20301b.readByteArray(booleanValue);
        }
    }
}
