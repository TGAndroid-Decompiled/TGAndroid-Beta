package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f18597a;
    public final InputSerializedData f18598b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f18597a = i10;
        this.f18598b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18597a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18598b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18598b.readInt32(booleanValue));
            case 2:
                return this.f18598b.readString(booleanValue);
            default:
                return this.f18598b.readByteArray(booleanValue);
        }
    }
}
