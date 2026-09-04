package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f20130a;
    public final InputSerializedData f20131b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f20130a = i10;
        this.f20131b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f20130a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f20131b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f20131b.readInt32(booleanValue));
            case 2:
                return this.f20131b.readString(booleanValue);
            default:
                return this.f20131b.readByteArray(booleanValue);
        }
    }
}
