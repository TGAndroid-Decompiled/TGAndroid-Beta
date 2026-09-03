package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f19417a;
    public final OutputSerializedData f19418b;

    public u(OutputSerializedData outputSerializedData, int i10) {
        this.f19417a = i10;
        this.f19418b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19417a) {
            case 0:
                this.f19418b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f19418b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f19418b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f19418b.writeString((String) obj);
                return;
        }
    }
}
