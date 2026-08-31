package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f21103a;
    public final OutputSerializedData f21104b;

    public u(OutputSerializedData outputSerializedData, int i10) {
        this.f21103a = i10;
        this.f21104b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21103a) {
            case 0:
                this.f21104b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f21104b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f21104b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f21104b.writeString((String) obj);
                return;
        }
    }
}
