package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18588a;
    public final InputSerializedData f18589b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18588a = i10;
        this.f18589b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18588a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18589b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18589b.readInt32(booleanValue));
            case 2:
                return this.f18589b.readString(booleanValue);
            default:
                return this.f18589b.readByteArray(booleanValue);
        }
    }
}
