package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class e01 {
    public final String f37776a;
    public final Runnable f37777b;
    public final String f37778c;
    public final String[] d;
    public final int f37779e;
    public final int f37780f;
    public int f37781g;
    public String h;

    public e01(String str, int i9, int i10, Runnable runnable) {
        this(i9, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e01) && this.f37780f == ((e01) obj).f37780f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37781g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37780f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public e01(int i9, String str, String str2, int i10, Runnable runnable) {
        this(i9, str, null, str2, null, i10, runnable);
    }

    public e01(int i9, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i9, str, str2, str3, null, i10, runnable);
    }

    public e01(int i9, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f37780f = i9;
        this.f37776a = str;
        this.f37778c = str2;
        this.f37777b = runnable;
        this.f37779e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
