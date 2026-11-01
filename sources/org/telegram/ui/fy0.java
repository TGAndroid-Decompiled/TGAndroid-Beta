package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class fy0 {
    public final String f37255a;
    public final Runnable f37256b;
    public final String f37257c;
    public final String[] d;
    public final int e;
    public final int f37258f;
    public int f37259g;
    public String h;

    public fy0(int i10, String str, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fy0) && this.f37258f == ((fy0) obj).f37258f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37259g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37258f);
        return Utilities.f(serializedData.toByteArray());
    }

    public fy0(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public fy0(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public fy0(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37258f = i10;
        this.f37255a = str;
        this.f37257c = str2;
        this.f37256b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
