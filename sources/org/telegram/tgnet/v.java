package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18556a;
    public final InputSerializedData f18557b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18556a = i10;
        this.f18557b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18556a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18557b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18557b.readInt32(booleanValue));
            case 2:
                return this.f18557b.readString(booleanValue);
            default:
                return this.f18557b.readByteArray(booleanValue);
        }
    }
}
