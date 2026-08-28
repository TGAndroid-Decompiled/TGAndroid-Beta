package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class t implements Utilities.CallbackReturn {
    public final int f22583a;
    public final InputSerializedData f22584b;

    public t(InputSerializedData inputSerializedData, int i9) {
        this.f22583a = i9;
        this.f22584b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i9 = this.f22583a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i9) {
            case 0:
                return Long.valueOf(this.f22584b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f22584b.readInt32(booleanValue));
            case 2:
                return this.f22584b.readString(booleanValue);
            default:
                return this.f22584b.readByteArray(booleanValue);
        }
    }
}
