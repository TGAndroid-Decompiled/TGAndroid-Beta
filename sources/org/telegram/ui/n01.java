package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class n01 {
    public final String f39289a;
    public final Runnable f39290b;
    public final String f39291c;
    public final String[] d;
    public final int e;
    public final int f39292f;
    public int f39293g;
    public String h;

    public n01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n01) && this.f39292f == ((n01) obj).f39292f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f39293g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f39292f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public n01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f39292f = i10;
        this.f39289a = str;
        this.f39291c = str2;
        this.f39290b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
