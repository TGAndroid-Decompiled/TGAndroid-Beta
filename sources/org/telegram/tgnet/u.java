package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f22652a;
    public final OutputSerializedData f22653b;

    public u(OutputSerializedData outputSerializedData, int i10) {
        this.f22652a = i10;
        this.f22653b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22652a) {
            case 0:
                this.f22653b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f22653b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f22653b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f22653b.writeString((String) obj);
                return;
        }
    }
}
