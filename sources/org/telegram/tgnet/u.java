package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.CallbackReturn {
    public final int f22296a;
    public final InputSerializedData f22297b;

    public u(int i10, InputSerializedData inputSerializedData) {
        this.f22296a = i10;
        this.f22297b = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f22296a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                return Long.valueOf(this.f22297b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f22297b.readInt32(booleanValue));
            case 2:
                return this.f22297b.readString(booleanValue);
            default:
                return this.f22297b.readByteArray(booleanValue);
        }
    }
}
