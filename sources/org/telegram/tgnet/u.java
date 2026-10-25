package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f22294a;
    public final InputSerializedData f22295b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f22294a = i10;
        this.f22295b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f22294a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f22295b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f22295b.readInt32(booleanValue));
            case 2:
                return this.f22295b.readString(booleanValue);
            default:
                return this.f22295b.readByteArray(booleanValue);
        }
    }
}
