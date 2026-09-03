package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f21105a;
    public final OutputSerializedData f21106b;

    public u(OutputSerializedData outputSerializedData, int i10) {
        this.f21105a = i10;
        this.f21106b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21105a) {
            case 0:
                this.f21106b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f21106b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f21106b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f21106b.writeString((String) obj);
                return;
        }
    }
}
