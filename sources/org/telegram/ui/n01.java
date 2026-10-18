package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class n01 {
    public final String f39274a;
    public final Runnable f39275b;
    public final String f39276c;
    public final String[] d;
    public final int e;
    public final int f39277f;
    public int f39278g;
    public String h;

    public n01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n01) && this.f39277f == ((n01) obj).f39277f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f39278g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f39277f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public n01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f39277f = i10;
        this.f39274a = str;
        this.f39276c = str2;
        this.f39275b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
