package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class g11 {
    public final String f37843a;
    public final Runnable f37844b;
    public final String f37845c;
    public final String[] d;
    public final int f37846e;
    public final int f37847f;
    public int f37848g;
    public String h;

    public g11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof g11) && this.f37847f == ((g11) obj).f37847f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37848g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37847f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public g11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public g11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public g11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37847f = i10;
        this.f37843a = str;
        this.f37845c = str2;
        this.f37844b = runnable;
        this.f37846e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
