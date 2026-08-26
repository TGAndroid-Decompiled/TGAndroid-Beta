package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

public final class Vector$$ExternalSyntheticLambda0 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final InputSerializedData f$0;

    public Vector$$ExternalSyntheticLambda0(InputSerializedData inputSerializedData, int i) {
        this.$r8$classId = i;
        this.f$0 = inputSerializedData;
    }

    @Override
    public final Object run(Object obj) {
        int i = this.$r8$classId;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                return Long.valueOf(this.f$0.readInt64(zBooleanValue));
            case 1:
                return Integer.valueOf(this.f$0.readInt32(zBooleanValue));
            case 2:
                return this.f$0.readString(zBooleanValue);
            default:
                return this.f$0.readByteArray(zBooleanValue);
        }
    }
}
