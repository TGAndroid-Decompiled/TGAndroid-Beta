package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.CallbackReturn {
    public final int f19482a;
    public final InputSerializedData f19483b;

    public v(int i10, InputSerializedData inputSerializedData) {
        this.f19482a = i10;
        this.f19483b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f19482a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f19483b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f19483b.readInt32(booleanValue));
            case 2:
                return this.f19483b.readString(booleanValue);
            default:
                return this.f19483b.readByteArray(booleanValue);
        }
    }
}
