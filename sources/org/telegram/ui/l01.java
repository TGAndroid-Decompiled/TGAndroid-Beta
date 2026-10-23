package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class l01 {
    public final String f38717a;
    public final Runnable f38718b;
    public final String f38719c;
    public final String[] d;
    public final int e;
    public final int f38720f;
    public int f38721g;
    public String h;

    public l01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l01) && this.f38720f == ((l01) obj).f38720f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f38721g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f38720f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public l01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public l01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public l01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f38720f = i10;
        this.f38717a = str;
        this.f38719c = str2;
        this.f38718b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
