package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.CallbackReturn {
    public final int f21048a;
    public final InputSerializedData f21049b;

    public t(int i10, InputSerializedData inputSerializedData) {
        this.f21048a = i10;
        this.f21049b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f21048a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f21049b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f21049b.readInt32(booleanValue));
            case 2:
                return this.f21049b.readString(booleanValue);
            default:
                return this.f21049b.readByteArray(booleanValue);
        }
    }
}
