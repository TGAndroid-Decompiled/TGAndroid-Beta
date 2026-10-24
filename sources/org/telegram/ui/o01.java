package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class o01 {
    public final String f40050a;
    public final Runnable f40051b;
    public final String f40052c;
    public final String[] d;
    public final int e;
    public final int f40053f;
    public int f40054g;
    public String h;

    public o01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o01) && this.f40053f == ((o01) obj).f40053f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f40054g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f40053f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public o01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public o01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public o01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f40053f = i10;
        this.f40050a = str;
        this.f40052c = str2;
        this.f40051b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
