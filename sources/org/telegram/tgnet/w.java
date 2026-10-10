package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20312a;
    public final OutputSerializedData f20313b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20312a = i10;
        this.f20313b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20312a) {
            case 0:
                this.f20313b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20313b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20313b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20313b.writeString((String) obj);
                return;
        }
    }
}
