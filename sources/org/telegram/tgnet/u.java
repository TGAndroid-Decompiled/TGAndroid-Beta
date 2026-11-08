package org.telegram.tgnet;

import org.telegram.messenger.d20;
public final class u implements d20 {
    public final int f27223a;
    public final InputSerializedData f27224b;

    public u(InputSerializedData inputSerializedData, int i7) {
        this.f27223a = i7;
        this.f27224b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f27223a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f27224b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f27224b.readInt32(booleanValue));
            case 2:
                return this.f27224b.readString(booleanValue);
            default:
                return this.f27224b.readByteArray(booleanValue);
        }
    }
}
