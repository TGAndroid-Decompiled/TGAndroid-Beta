package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20537a;
    public final OutputSerializedData f20538b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20537a = i10;
        this.f20538b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20537a) {
            case 0:
                this.f20538b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20538b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20538b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20538b.writeString((String) obj);
                return;
        }
    }
}
