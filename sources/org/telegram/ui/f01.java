package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class f01 {
    public final String f37943a;
    public final Runnable f37944b;
    public final String f37945c;
    public final String[] d;
    public final int f37946e;
    public final int f37947f;
    public int f37948g;
    public String h;

    public f01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f01) && this.f37947f == ((f01) obj).f37947f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37948g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37947f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public f01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public f01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public f01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37947f = i10;
        this.f37943a = str;
        this.f37945c = str2;
        this.f37944b = runnable;
        this.f37946e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
