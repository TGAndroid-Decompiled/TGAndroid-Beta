package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

public final class t implements Utilities.CallbackReturn {

    public final int f22583a;

    public final InputSerializedData f22584b;

    public t(InputSerializedData inputSerializedData, int i10) {
        this.f22583a = i10;
        this.f22584b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f22583a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f22584b.readInt64(zBooleanValue));
            case 1:
                return Integer.valueOf(this.f22584b.readInt32(zBooleanValue));
            case 2:
                return this.f22584b.readString(zBooleanValue);
            default:
                return this.f22584b.readByteArray(zBooleanValue);
        }
    }
}
