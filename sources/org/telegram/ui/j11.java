package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class j11 {
    public final String f39075a;
    public final Runnable f39076b;
    public final String f39077c;
    public final String[] d;
    public final int f39078e;
    public final int f39079f;
    public int f39080g;
    public String h;

    public j11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j11) && this.f39079f == ((j11) obj).f39079f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f39080g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f39079f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public j11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public j11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public j11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f39079f = i10;
        this.f39075a = str;
        this.f39077c = str2;
        this.f39076b = runnable;
        this.f39078e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
