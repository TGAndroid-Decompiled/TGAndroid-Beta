package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class n01 {
    public final String f39315a;
    public final Runnable f39316b;
    public final String f39317c;
    public final String[] d;
    public final int e;
    public final int f39318f;
    public int f39319g;
    public String h;

    public n01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n01) && this.f39318f == ((n01) obj).f39318f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f39319g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f39318f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public n01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public n01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f39318f = i10;
        this.f39315a = str;
        this.f39317c = str2;
        this.f39316b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
