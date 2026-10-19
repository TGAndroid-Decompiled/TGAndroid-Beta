package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class l01 {
    public final String f38706a;
    public final Runnable f38707b;
    public final String f38708c;
    public final String[] d;
    public final int e;
    public final int f38709f;
    public int f38710g;
    public String h;

    public l01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l01) && this.f38709f == ((l01) obj).f38709f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f38710g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f38709f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public l01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public l01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public l01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f38709f = i10;
        this.f38706a = str;
        this.f38708c = str2;
        this.f38707b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
