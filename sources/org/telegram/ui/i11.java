package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class i11 {
    public final String f34339a;
    public final Runnable f34340b;
    public final String f34341c;
    public final String[] d;
    public final int e;
    public final int f34342f;
    public int f34343g;
    public String h;

    public i11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i11) && this.f34342f == ((i11) obj).f34342f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f34343g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f34342f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public i11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public i11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public i11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f34342f = i10;
        this.f34339a = str;
        this.f34341c = str2;
        this.f34340b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
