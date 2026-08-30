package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class u implements Utilities.Callback {
    public final int f19442a;
    public final OutputSerializedData f19443b;

    public u(OutputSerializedData outputSerializedData, int i10) {
        this.f19442a = i10;
        this.f19443b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19442a) {
            case 0:
                this.f19443b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f19443b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f19443b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f19443b.writeString((String) obj);
                return;
        }
    }
}
