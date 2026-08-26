package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

public final class Vector$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final OutputSerializedData f$0;

    public Vector$$ExternalSyntheticLambda2(OutputSerializedData outputSerializedData, int i) {
        this.$r8$classId = i;
        this.f$0 = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.writeInt64(((Long) obj).longValue());
                break;
            case 1:
                this.f$0.writeInt32(((Integer) obj).intValue());
                break;
            case 2:
                this.f$0.writeByteArray((byte[]) obj);
                break;
            default:
                this.f$0.writeString((String) obj);
                break;
        }
    }
}
