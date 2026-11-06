package org.telegram.tgnet;

import org.telegram.messenger.d20;
public final class u implements d20 {
    public final int f27220a;
    public final InputSerializedData f27221b;

    public u(InputSerializedData inputSerializedData, int i7) {
        this.f27220a = i7;
        this.f27221b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f27220a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.f27221b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.f27221b.readInt32(booleanValue));
            case 2:
                return this.f27221b.readString(booleanValue);
            default:
                return this.f27221b.readByteArray(booleanValue);
        }
    }
}
