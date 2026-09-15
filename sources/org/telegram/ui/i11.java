package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class i11 {
    public final String f34385a;
    public final Runnable f34386b;
    public final String f34387c;
    public final String[] d;
    public final int e;
    public final int f34388f;
    public int f34389g;
    public String h;

    public i11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i11) && this.f34388f == ((i11) obj).f34388f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f34389g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f34388f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public i11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public i11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public i11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f34388f = i10;
        this.f34385a = str;
        this.f34387c = str2;
        this.f34386b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
