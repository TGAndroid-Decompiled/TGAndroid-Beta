package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

public final class f01 {

    public final String f37891a;

    public final Runnable f37892b;

    public final String f37893c;
    public final String[] d;

    public final int f37894e;

    public final int f37895f;

    public int f37896g;
    public String h;

    public f01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f01) && this.f37895f == ((f01) obj).f37895f;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37896g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37895f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public f01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public f01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public f01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37895f = i10;
        this.f37891a = str;
        this.f37893c = str2;
        this.f37892b = runnable;
        this.f37894e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
