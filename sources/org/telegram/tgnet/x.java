package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class x implements Utilities.CallbackReturn {
    public final int f17462a;
    public final InputSerializedData f17463b;

    public x(int i10, InputSerializedData inputSerializedData) {
        this.f17462a = i10;
        this.f17463b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f17462a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f17463b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f17463b.readInt32(booleanValue));
            case 2:
                return this.f17463b.readString(booleanValue);
            default:
                return this.f17463b.readByteArray(booleanValue);
        }
    }
}
