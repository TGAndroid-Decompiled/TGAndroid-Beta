package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f18380a;
    public final InputSerializedData f18381b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f18380a = i10;
        this.f18381b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f18380a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f18381b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f18381b.readInt32(booleanValue));
            case 2:
                return this.f18381b.readString(booleanValue);
            default:
                return this.f18381b.readByteArray(booleanValue);
        }
    }
}
